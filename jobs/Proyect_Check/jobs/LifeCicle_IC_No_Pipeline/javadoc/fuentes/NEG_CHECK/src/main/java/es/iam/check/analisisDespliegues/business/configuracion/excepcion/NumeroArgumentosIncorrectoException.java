package es.iam.check.analisisDespliegues.business.configuracion.excepcion;

/**
 * Excepcion que indica que el numero de argumentos
 * es incorrecto.
 * @author SSA005
 */
public class NumeroArgumentosIncorrectoException extends Exception{

	/**
	 * id para la serializacion.
	 */
	private static final long serialVersionUID = -9045382774515400759L;
	
	/**
	 * Constructor de la excepcion.
	 * @param lineaComandos : los argumentos con los que se invoca al launcher
	 */
	public NumeroArgumentosIncorrectoException(String lineaComandos){
		super(lineaComandos);
	}

}
