package es.iam.check.analisisDespliegues.business.main;

import java.io.BufferedWriter;
import java.io.Console;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.util.Collection;
import java.util.LinkedHashSet;

/**
 * Clase que muestra el uso de la aplicación CHECK.
 * @author SSA005
 * @author ARD021
 */
public class Uso {
	
	/**
	 * Contiene el texto explicativo del uso de la aplicacion.
	 */
	private final static Collection<String> USO = new LinkedHashSet<String>();
	
	static{
		USO.add("uso: check -p <cadena> [opciones] ");
		USO.add("");
		USO.add("Opciones: ");
		USO.add("-p,--proyecto <cadena>:\t\tDonde <cadena> es el acronimo del proyecto a desplegar");
		
		USO.add("-i,--informe <directorio>:\tDonde <directorio> es direcotrio donde se quiere dejar el informe");
		USO.add("-e,--estaticos <archivo>:\tDonde <archivo> es fichero de estaticos del proyecto a desplegar");
		USO.add("-r,--recursos <archivo>:\tDonde <archivo> es fichero de recursos del proyecto a desplegar");
		USO.add("-a,--artefacto <archivo>:\tDonde <archivo> es el fichero ear del proyecto a desplegar");
		
		USO.add("-t,--tipoServidor WAS61|WAS85|JBOSS");
	}
	
	/**
	 * Muestra los comandos para usar la aplicacion.
	 */
	public static void mostrar(){
		Console console = System.console();
		if(console != null){
			mostrarUso(console);
		}else{
			mostrarUso(System.out);
		}
	}
	
	/**
	 * Muestra un mensaje en consola. 
	 * @param msg el mensaje a mostrar.
	 */
	public static void mostrar(String msg){
		Console console = System.console();
		if(console != null && msg==null){
			mostrarUso(console);
		}else{
			mostrarMensaje(System.out,msg);
		}
	}
	
	/**
	 * Muestra el uso de la aplicación en la consola.
	 * @param consolaComandos consola donde se escribe.
	 */
	private static void mostrarUso(Console consolaComandos){
		for (String lineaTexto : USO) {
			consolaComandos.writer().println(lineaTexto);
		}		
	}
	
	/**
	 * Metodo que muestra el uso del programa en la salida estandar.
	 * @param out stream de salida.
	 */
	private static void mostrarUso(PrintStream out){
		BufferedWriter log = new BufferedWriter(new OutputStreamWriter(out));
		try {
			for (String lineaTexto : USO) {
				log.write(lineaTexto);
				log.newLine();
				log.flush();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Metodo que muestra un mensaje en la salida estandar. 
	 * @param out stream de salida.
	 * @param msg mensaje a sacar.
	 */
	private static void mostrarMensaje(PrintStream out,String msg){
		BufferedWriter log = new BufferedWriter(new OutputStreamWriter(out));
		try {
				log.write(msg);
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	

}
