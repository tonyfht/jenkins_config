package es.iam.check.analisisDespliegues.business.analizadores.exception;

/**
 * Excepcion a lanzar en casos de problemas al analizar.
 * @author SSA005
 * @author ARD021
 */
public class AnalisisIndeterminadoException extends RuntimeException {


	/**
	 * id para la serializacion.
	 */
	private static final long serialVersionUID = -8143534125175878240L;
	
	/**
	 * Constructor pasandole excepciones.
	 * @param exc excepcion a subir en la jerarquia.
	 */
	public AnalisisIndeterminadoException(Exception exc) {
		super(exc);
	}

}
