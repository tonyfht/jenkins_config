package es.iam.check.analisisDespliegues.business.configuracion;

import java.io.File;
import java.util.Collection;
import java.util.Map;
import es.iam.check.analisisDespliegues.business.analizadores.AnalizadorArtefacto;
import es.iam.check.analisisDespliegues.business.analizadores.AnalizadorEstaticos;
import es.iam.check.analisisDespliegues.business.analizadores.AnalizadorRecursos;
import es.iam.check.analisisDespliegues.business.chequeos.IChequeo;
import es.iam.check.analisisDespliegues.business.chequeos.RepositorioChequeos;
import es.iam.check.analisisDespliegues.business.chequeos.model.TipoNombreChequeos;
import es.iam.check.analisisDespliegues.business.ficheros.Fichero;
import es.iam.check.analisisDespliegues.business.ficheros.TipoFichero;

/**
 * Configuracion del proyecto check. Recoge los elementos pasados en la linea de comandos.
 * @author SSA005
 * @author ARD021
 */
public final class Configuracion {

	/**
	 * Directorio donde se genera el informe.
	 */
	private Fichero directorioInformes;

	/**
	 * Fichero que se analizará. FIXME: Esto es una chapuza que debe ser eliminada en la siguiente versión.
	 * Se ha puesto publica como mal menor.
	 */
	private static Fichero ficheroAnalizar;
	
	/**
	 * El acronimo del proyecto.
	 */
	private String proyecto;

	/**
	 * El repositorio con los chequeos importados de la configuración xml.
	 */
	private RepositorioChequeos repositorioChequeos;

	/**
	 * Tipo de servidor sobre el que se aplican los chequeos.
	 */
	private TipoServidor tipoServidor;
	
	/**
	 * Filtro para los chequeos a sacar en el informe por TipoNombreChequeos.
	 */
	private TipoNombreChequeos filtroTipoNombreChequeos;
	
	/**
	 * Indica si el fichero a analizar es de estaticos.
	 */
	private File ficheroEstaticos;
	
	/**
	 * Indica si el fichero a analizar es de recursos.
	 */
	private File ficheroRecursos;
	
	/**
	 * Indica si el fichero a analizar es un ear.
	 */
	private File ficheroArtefacto;
	
	
	/**
	 * Constructor de la configuración.
	 * @param argumentos pasados por linea de comandos. 
	 */
	public Configuracion(Map<Argumentos, Object> argumentos) {
		
		this.tipoServidor =  TipoServidor.valueOf((String)argumentos.get(Argumentos.TIPO_SERVIDOR));
		this.repositorioChequeos = new RepositorioChequeos();
		this.repositorioChequeos.init(tipoServidor);
		this.proyecto = argumentos.get(Argumentos.PROYECTO).toString();
		this.directorioInformes = argumentos.containsKey(Argumentos.DIRECTORIO_INFORMES)? new Fichero (argumentos.get(Argumentos.DIRECTORIO_INFORMES).toString()):new Fichero (System.getProperty("user.dir"));
		
		//Este parametro no está documentado porque para el usuario en linea de comandos no tiene interes.
		//Es una manera de controlar los test unitarios y facilitar el testing. Por eso su no existencia
		//indica que se deben coger todos los chequeos en el informe.
		String filtroInforme = (String)argumentos.get(Argumentos.FILTRO_INFORME);
		
		if (filtroInforme==null){
			this.filtroTipoNombreChequeos = TipoNombreChequeos.Todos;
		}else{
			this.filtroTipoNombreChequeos = TipoNombreChequeos.valueOf(filtroInforme);	
		}
		
		if (argumentos.containsKey(Argumentos.ARTEFACTO)){
			this.ficheroArtefacto = new File((String) argumentos.get(Argumentos.ARTEFACTO));
		}
		
		if (argumentos.containsKey(Argumentos.FICHERO_ESTATICOS)){
			this.ficheroEstaticos = new File((String) argumentos.get(Argumentos.FICHERO_ESTATICOS));
		}
		
		if (argumentos.containsKey(Argumentos.FICHERO_RECURSOS)){
			this.ficheroRecursos = new File((String) argumentos.get(Argumentos.FICHERO_RECURSOS));
		}	
		
	}

	/**
	 * Devuelve los chequeos a aplicar para cada tipo de analisis que se puede realizar.
	 * @param tipoAnalizador el tipo de analizador a aplicar.
	 * @return el conjunto de chequeo a aplicar.
	 */
	public Collection<IChequeo> resuelveChequeosPorAnalizador(TipoFichero tipoAnalizador) {
		Collection<IChequeo> chequeos = null;
		if (tipoAnalizador.equals(TipoFichero.RECURSOS)) {
			chequeos = repositorioChequeos.resuelveChequeosPorAnalizador(AnalizadorRecursos.class);
		}
		if (tipoAnalizador.equals(TipoFichero.ESTATICOS)) {
			chequeos = repositorioChequeos.resuelveChequeosPorAnalizador(AnalizadorEstaticos.class);
		}
		if (tipoAnalizador.equals(TipoFichero.APLICACION)) {
			chequeos = repositorioChequeos.resuelveChequeosPorAnalizador(AnalizadorArtefacto.class);
		}
		return chequeos;
	}

	/**
	 * getter.
	 * @return el repositorio de chequeos.
	 */
	public RepositorioChequeos getRepositorioChequeos() {
		return repositorioChequeos;
	}

	/**
	 * getter.
	 * @return the directorioInformes el directorio donde se ubican los informes.
	 */
	public Fichero getDirectorioInformes() {
		return directorioInformes;
	}

	/**
	 * getter.
	 * @return el filtro a aplicar al informe de chequeos.
	 */
	public TipoNombreChequeos getFiltroTipoNombreChequeos() {
		return filtroTipoNombreChequeos;
	}

	/**
	 * getter.
	 * @return el fichero de estaticos a analizar.
	 */
	public File getFicheroEstaticos() {
		return ficheroEstaticos;
	}

	/**
	 * getter.
	 * @return el fichero de recursos a analizar.
	 */
	public File getFicheroRecursos() {
		return ficheroRecursos;
	}

	/**
	 * getter.
	 * @return el fichero ear sujeto de analisis.
	 */
	public File getFicheroArtefacto() {
		return ficheroArtefacto;
	}

	/**
	 * getter.
	 * @return el proyecto analizado.
	 */
	public String getProyecto() {
		return proyecto;
	}

	/**
	 * getter.
	 * @return el ficheroAnalizar
	 */
	public static Fichero getFicheroAnalizar() {
		return ficheroAnalizar;
	}

	/**
	 * setter.
	 * @param ficheroAnalizar el ficheroAnalizar a establecer
	 */
	public static void setFicheroAnalizar(Fichero ficheroAnalizar) {
		Configuracion.ficheroAnalizar = ficheroAnalizar;
	}

}
