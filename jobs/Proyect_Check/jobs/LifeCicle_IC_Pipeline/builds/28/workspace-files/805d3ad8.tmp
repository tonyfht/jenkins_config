package es.iam.check.analisisDespliegues.business.chequeos.incidencias;

/**
 * Muestra los datos de una incidencia desde el punto de vista
 * de un chequeo durante un analisis.
 *  
 * @author SSA005
 */
public class IncidenciaChequeo {

	/**
	 * Niveles disponibles para una incidencia.
	 */
	public static enum NivelIncidencia {
		ERROR,
		ADVERTENCIA
	};

	/**
	 * La ruta analizada que ha causado una incidencia.
	 */
	private String rutaIncidencia;

	/**
	 * Un comentario explicativo de porque se considera una incidencia.
	 */
	private String comentario;

	/**
	 * El nivel de la incidencia.
	 */
	private NivelIncidencia nivelIncidencia;	

	/**
	 * Constructor de la {@link IncidenciaChequeo}.
	 * @param nivelIncidencia nivel de la incidencia.
	 * @param rutaIncidencia la ruta.
	 * @param comentario el comentario.
	 */
	public IncidenciaChequeo(NivelIncidencia nivelIncidencia, String rutaIncidencia, String comentario) {
		this.nivelIncidencia = nivelIncidencia;
		this.rutaIncidencia = rutaIncidencia;
		this.comentario = comentario;
	}

	/**
	 * getter.
	 * @return the rutaIncidencia
	 */
	public String getRutaIncidencia() {
		return rutaIncidencia;
	}

	/**
	 * getter.
	 * @return the comentario
	 */
	public String getComentario() {
		return comentario;
	}

	/**
	 * getter.
	 * @return the nivelIncidencia
	 */
	public NivelIncidencia getNivelIncidencia() {
		return nivelIncidencia;
	}
}
