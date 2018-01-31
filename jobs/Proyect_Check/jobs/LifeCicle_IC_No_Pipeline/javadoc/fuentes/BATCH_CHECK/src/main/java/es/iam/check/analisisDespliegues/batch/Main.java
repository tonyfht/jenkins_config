package es.iam.check.analisisDespliegues.batch;

import es.iam.check.analisisDespliegues.business.configuracion.excepcion.NumeroArgumentosIncorrectoException;
import es.iam.check.analisisDespliegues.business.main.Launcher;



/**
 * Dada una ruta a un archivo comprimido de extension conocida,
 * realiza las comprobaciones previas al despliegue.
 */
public class Main {

	/**
	 * lanzador de la aplicación y punto de inicio de la misma.
	 */
	private static Launcher launcher = new Launcher();


	/**
	 * Metodo de entrada a la aplicacion.
	 * @param args los argumentos pasados.
	 * @throws NumeroArgumentosIncorrectoException 
	 */
	public static void main(String[] args){
			launcher.run(args);	
	}
}
