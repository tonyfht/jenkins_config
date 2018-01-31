package es.iam.check.analisisDespliegues.business.chequeos;

import java.util.Collection;
import java.util.HashSet;
import es.iam.check.analisisDespliegues.business.chequeos.incidencias.IncidenciaChequeo;
import es.iam.check.analisisDespliegues.business.chequeos.incidencias.IncidenciaChequeo.NivelIncidencia;
import es.iam.check.analisisDespliegues.business.chequeos.reglas.IRegla;
import es.iam.check.analisisDespliegues.business.chequeos.reglas.ReglaArchivo;
import es.iam.check.analisisDespliegues.business.chequeos.reglas.TipoComprobacion;
import es.iam.check.analisisDespliegues.business.ficheros.Fichero;


/**
 * Chequeos que se aplican para ver la existencia de ficheros.
 * @author SSA005
 */
public class ChequeoExistenciaFicheros extends AbstractChequeo{

	/**
	 * Estos ficheros deberian haber sido encontrados en el analisis.
	 */
	private Collection<ReglaArchivo> reglasFichObligatNoEncontrados = new HashSet<ReglaArchivo>();

	/**
	 * Constructor conveniente del chequeo.
	 * @param nombre : nombre identificativo del chequeo
	 * @param descripcion : texto que explica el chequeo
	 * @param mensajeIncorrecto : mensaje que notifica que el chequeo ha sido valorado como incorrecto
	 * @param mensajeCorrecto : mensaje que notifica que el chequeo ha sido valorado como correcto
	 * @param mensajeAviso : mensaje que notifica que el chequeo ha sido valorado con una advertencia 
	 */
	public ChequeoExistenciaFicheros(String nombre, String descripcion,String mensajeIncorrecto, String mensajeCorrecto, String mensajeAviso) {
		super(nombre, descripcion, mensajeIncorrecto, mensajeCorrecto, mensajeAviso);
	}

	/** {@inheritDoc} */
	@Override
	public void agregarRegla(IRegla regla) {
		super.agregarRegla(regla);
		ReglaArchivo reglaArchivo = (ReglaArchivo)regla;
		if (reglaArchivo.getTipoComprobacion() == TipoComprobacion.OBLIGATORIEDAD){
			reglasFichObligatNoEncontrados.add(reglaArchivo);
		}
	}
	
	/** {@inheritDoc} */
	@Override
	protected void valorar() {
		for (IRegla regla : reglasFichObligatNoEncontrados) {
			ReglaArchivo reglaArchivo = (ReglaArchivo)regla;
			NivelIncidencia nivelIncidencia = reglaArchivo.getTipoComprobacion() == TipoComprobacion.EXISTENCIA?NivelIncidencia.ADVERTENCIA:NivelIncidencia.ERROR;
			registraIncidenciaChequeo(nivelIncidencia, reglaArchivo.getEjemplo(), " ");
		}
		super.valorar();
	}

	/** {@inheritDoc} */
	@Override
	protected void chequea(Fichero fichero) {
		for (IRegla regla : getReglas()) {
			if (regla.seCumple(fichero)){
				registrar(regla, fichero);
			}
		}
	}


	/**
	 * Registra el evento de cumplimiento de forma distinta dependiendo del tipo de comprobacion
	 * se que efectuaba sobre el fichero.
	 * @param regla la regla a tratar.
	 * @param fichero el fichero sobre el que aplicar la regla.
	 */
	protected void registrar(IRegla regla, Fichero fichero){
		ReglaArchivo reglaArchivo = (ReglaArchivo)regla;
		TipoComprobacion tipoComprobacionArchivo = reglaArchivo.getTipoComprobacion();

		switch (tipoComprobacionArchivo) {
		case PROHIBIDO:{
			registraIncidenciaChequeo(IncidenciaChequeo.NivelIncidencia.ERROR, fichero.rutaRelativa(), " " + reglaArchivo.getEjemplo());
			break;	
		}
		case EXISTENCIA:{
			registraIncidenciaChequeo(IncidenciaChequeo.NivelIncidencia.ADVERTENCIA, fichero.rutaRelativa(), " " + reglaArchivo.getEjemplo());
			break;	
		}
		case OBLIGATORIEDAD:{
			marcarFicheroObligatorioEncontrado(regla);
			break;
		}
		}		
	}

	/**
	 * Marca el contenido obligatorio como encontrado.
	 * @param regla la regla a tratar.
	 */
	private void marcarFicheroObligatorioEncontrado(IRegla regla) {
		ReglaArchivo reglaArchivo = (ReglaArchivo)regla;
		reglasFichObligatNoEncontrados.remove(reglaArchivo);
	}




}
