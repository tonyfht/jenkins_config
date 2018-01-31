package es.iam.check.analisisDespliegues.business.chequeos;

import java.util.Collection;
import java.util.HashSet;
import es.iam.check.analisisDespliegues.business.chequeos.incidencias.IncidenciaChequeo;
import es.iam.check.analisisDespliegues.business.chequeos.reglas.IRegla;
import es.iam.check.analisisDespliegues.business.ficheros.Fichero;

/**
 * Clase base con las funcionalidades comunes a todos los tipos de Chequeos contemplados.
 * @author SSA005
 */
public abstract class AbstractChequeo implements IChequeo{

	/**
	 * Nombre del chequeo.
	 */
	private String nombre;

	/**
	 * la descripcion del chequeo.
	 */
	private String descripcion;

	/**
	 * la valoracion del resultado del chequeo.
	 */
	private Valoracion valoracion;

	/**
	 * El mensaje a mostrar cuando el chequeo es incorrecto.
	 */
	private String mensajeIncorrecto;

	/**
	 * El mensaje a mostrar cuando el chequeo es correcto.
	 */
	private String mensajeCorrecto;

	/**
	 * El mensaje a mostrar de aviso.
	 */
	private String mensajeAviso;

	/**
	 * Las reglas de las que se compone el chequeo.
	 */
	private Collection<IRegla> reglas = new HashSet<IRegla>();


	/**
	 * Las incidencias que ha encontrado el chequeo.
	 */
	private Collection<IncidenciaChequeo> incidenciasChequeo = new HashSet<IncidenciaChequeo>();
	
	/**
	 * Reglas adicionales que se han de cumplir previas a que se compruebe las reglas de negocio del chequeo.
	 */
	private Collection<IRegla> reglasPrevia = new HashSet<IRegla>();


	/**
	 * Constructor de la clase abstracta.
	 * @param nombre nombre del chequeo.
	 * @param descripcion descripcion del chequeo.
	 * @param mensajeIncorrecto : mensaje que notifica que el chequeo ha sido valorado como incorrecto
	 * @param mensajeCorrecto : mensaje que notifica que el chequeo ha sido valorado como correcto
	 * @param mensajeAviso : mensaje que notifica que el chequeo ha sido valorado con una advertencia 
	 */
	public AbstractChequeo(String nombre, String descripcion, String mensajeIncorrecto, String mensajeCorrecto, String mensajeAviso){
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.mensajeIncorrecto = mensajeIncorrecto;
		this.mensajeCorrecto = mensajeCorrecto;
		this.mensajeAviso = mensajeAviso;
	}

	
	/** {@inheritDoc} */
	public void agregarRegla(IRegla regla){
		reglas.add(regla);
	}
	
	/** {@inheritDoc} */
	public void agregarReglaPrevia(IRegla reglaPrevia) {
		reglasPrevia.add(reglaPrevia);
	}

	/** {@inheritDoc} */
	public void ejecutar(Collection<Fichero> contenido) {
		comprobarFicheros(contenido);
		valorar();
	}


	/** {@inheritDoc} */
	public String getMensaje(Valoracion valoracion) {
		String mensaje = "";
		switch (valoracion) {
			case CORRECTO:
				mensaje = getMensajeCorrecto();
				break;
			case INCORRECTO:
				mensaje = getMensajeIncorrecto();
				break;
			case AVISO:
				mensaje = getMensajeAviso();
				break;
			default:
				break;
		}
		return mensaje;
	}

	/**
	 * Ejecuta la logica del chequeo contra un fichero.
	 * @param fichero el fichero a chequear.
	 */
	protected void chequea(Fichero fichero){
		if(seCumplenChequeosPrevios(fichero)){
			for (IRegla regla : getReglas()) {
				if (regla.seCumple(fichero)){
					registrar(regla, fichero);
				}
			}
		}
	}

	/**
	 * comprobación sobre una serie de ficheros de los chequeos.
	 * @param contenido la colección de ficheros a verificar.
	 */
	protected void comprobarFicheros(Collection<Fichero> contenido) {
		for (Fichero fichero : contenido) {
			chequea(fichero);
		}
	}
	
	/**
	 * Registro de incidencias sobre los chequeos.
	 * @param nivelIncidencia nivel de las incidencias.
	 * @param rutaAfectada ruta donde se produce la incidencia.
	 * @param comentario comentario realizado sobre la incidencia.
	 */
	protected void registraIncidenciaChequeo(IncidenciaChequeo.NivelIncidencia nivelIncidencia, String rutaAfectada, String comentario) {
		getIncidenciasChequeo().add(new IncidenciaChequeo(nivelIncidencia, rutaAfectada, comentario));
	}
	
	/**
	 * Metodo abstracto que registra una regla a aplicar a un fichero.
	 * @param regla regla a aplicar.
	 * @param fichero fichero sobre el que se aplicará.
	 */
	protected abstract void registrar(IRegla regla, Fichero fichero);

	/**
	 * getter.
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * getter.
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * getter.
	 * @return the mensajeIncorrecto
	 */
	public String getMensajeIncorrecto() {
		return mensajeIncorrecto;
	}

	/**
	 * getter.
	 * @return the mensajeCorrecto
	 */
	public String getMensajeCorrecto() {
		return mensajeCorrecto;  
	}

	/**
	 * getter.
	 * @return the mensajeAviso
	 */
	public String getMensajeAviso() {
		return mensajeAviso;
	}

	/**
	 * getter.
	 * @return the reglas
	 */
	public Collection<IRegla> getReglas() {
		return reglas;
	}

	/**
	 * getter.
	 * @return the valoracion
	 */
	public Valoracion getValoracion() {
		return valoracion;
	}

	/** {@inheritDoc} */
	public Collection<IncidenciaChequeo> getIncidenciasChequeo() {
		return incidenciasChequeo;
	}

	/**
	 * setter.
	 * @param incidenciasChequeos the incidenciasChequeo to set
	 */
	public void setIncidenciasChequeo(Collection<IncidenciaChequeo> incidenciasChequeos) {
		this.incidenciasChequeo = incidenciasChequeos;
	}
	
	/**
	 * Indicador de si se cumplen los chequeos previos.
	 * @param fichero fichero sobre el que se realizan los chequeos.
	 * @return el resultado de la evaluacion.
	 */
	private boolean seCumplenChequeosPrevios(Fichero fichero) {
		boolean cumplimiento = true;
		for (IRegla regla : reglasPrevia) {
			if(!regla.seCumple(fichero)){
				cumplimiento = false;
				break;
			}
		}
		return cumplimiento;
	}

	/**
	 * Determina la valoración de los chequeos.
	 */
	protected void valorar(){
		if (getIncidenciasChequeo().isEmpty()){
			valoracion = Valoracion.CORRECTO;
		}else{
			if(existeNivelIncidenciaError()){
				valoracion = Valoracion.INCORRECTO;
			}else{
				valoracion = Valoracion.AVISO;
			}
		}	
	}

	/**
	 * Comprueba si existe un nivel de incidencia Error.
	 * @return si cumple la pregunta.
	 */
	private boolean existeNivelIncidenciaError() {
		boolean nivelError = false;
		for (IncidenciaChequeo incidenciaChequeo : getIncidenciasChequeo()) {
			if(incidenciaChequeo.getNivelIncidencia() == IncidenciaChequeo.NivelIncidencia.ERROR){
				nivelError = true;
			}
		}
		return nivelError;
	}

}
