package es.iam.check.analisisDespliegues.business.chequeos.exception;

/**
 * Problemas detectados en la instalación del check que repercuten en el
 * funcionamiento. Mayormente, son problemas relacionados con los ficheros
 * xml de configuración (existencia, validaciones,etc).
 * @author ARD021
 */
public class InstalacionException extends RuntimeException {


	/**
	 * id para la serializacion.
	 */
	private static final long serialVersionUID = -8143534125175878240L;
	
	/**
	 * Constructor con la excepcion a elevar.
	 * @param exc excepcion capturada.
	 */
	public InstalacionException(Exception exc) {
		super(exc);
	}

}
