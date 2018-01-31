package es.iam.check.analisisDespliegues.business.configuracion;

import java.util.HashMap;
import java.util.Map;

import es.iam.check.analisisDespliegues.business.configuracion.excepcion.NumeroArgumentosIncorrectoException;


/**
 * Se listan todas las posibles opciones con los
 * que se lanza el programa.
 * @author SSA005
 */
public enum Argumentos {

	FICHERO_CONFIGURACION("-c", "--configuracion"),
	DIRECTORIO_INFORMES("-i", "--informe"),
	FICHERO_RECURSOS("-r", "--recursos"),
	FICHERO_ESTATICOS("-e", "--estaticos"),
	ARTEFACTO("-a", "--artefacto"),
	DIRECTORIO_SUBSISTEMA("-s", "--subsistema"),
	DIRECTORIO_DESPLIEGUE("-d", "--despliegues"),
	PROYECTO("-p", "--proyecto"),
	TIPO_SERVIDOR("-t", "--tipoServidor"),
	FILTRO_INFORME("-f", "--filtroTiposChequeos");


	/**
	 * Construye los argumentos a partir de la linea de comandos.
	 * @param lineaComandos la linea de comandos que escribe el usuario.
	 * @throws NumeroArgumentosIncorrectoException : si no se especifica el numero de argumentos correctos se lanza esta excepcion
	 * @return un mapa de argumentos con los objetos parseados e instanciados.
	 */
	public static Map<Argumentos, Object> parsearLineaComandos(String[] lineaComandos) throws NumeroArgumentosIncorrectoException{
		Map<Argumentos, Object> argumentos = new HashMap<Argumentos, Object>();
		int numeroArgumentos = lineaComandos.length;

		switch (numeroArgumentos) {
			case 0:
			case 1:
			case 2:
			case 3:
				throw new NumeroArgumentosIncorrectoException("Se debe especificar al menos el fichero a analizar y el acrónimo del proyecto");
			case 5:
			case 7:
				throw new NumeroArgumentosIncorrectoException("No se puede parsear los argumentos recibidos");
			case 4:
			case 6:
			case 8:
			case 10:
			case 12:
			{
				agregarOpciones(lineaComandos, argumentos);
				break;
			}
			default:{
				throw new NumeroArgumentosIncorrectoException("Se han especificado mas argumentos de los permitidos");
			}
		}
		comprobarArgumentosObligatorios(argumentos);
		return argumentos;
	}

	/**
	 * Se comprueba que se ha especificado el nombre del proyecto y un fichero o directorio que analizar. 
	 * Validaciones a realizar a la linea de comandos.
	 * @param argumentos un mapa de argumentos con los objetos parseados e instanciados.
	 */
	private static void comprobarArgumentosObligatorios(Map<Argumentos, Object> argumentos) throws NumeroArgumentosIncorrectoException {
		if(!argumentos.containsKey(PROYECTO)){
			throw new NumeroArgumentosIncorrectoException("Se debe especificar el acrónimo del proyecto");
		}
		if(!argumentos.containsKey(ARTEFACTO)&&!argumentos.containsKey(FICHERO_ESTATICOS)&&!argumentos.containsKey(FICHERO_RECURSOS)){
			throw new NumeroArgumentosIncorrectoException("Se debe especificar el fichero o directorio a analizar");
		}
		if(!argumentos.containsKey(TIPO_SERVIDOR)){
			throw new NumeroArgumentosIncorrectoException("Se debe especificar el tipo de servidor");
		}else
		{
			String tipoServidorStr = (String)argumentos.get(TIPO_SERVIDOR);
			if (!(tipoServidorStr.equals(TipoServidor.WAS61.toString()) || tipoServidorStr.equals(TipoServidor.WAS85.toString()) || tipoServidorStr.equals(TipoServidor.JBOSS.toString()))){
				throw new NumeroArgumentosIncorrectoException("Se debe especificar que el tipo de servidor sea WAS61, WAS85 o JBOSS");
			}

		}
	}


	/**
	 * Devuelve la opcion de linea de comando correspondiente
	 * al argumento.
	 * @return las opciones
	 */
	public String[] getOpciones() {
		return opciones;
	}

	/**
	 * Busca las opciones y sus valores en la linea de comandos.
	 * @param lineaComandos la linea de comandos como array de cadenas.
	 * @param argumentos un mapa de argumentos con los objetos parseados e instanciados.
	 */
	private static void agregarOpciones(String[] lineaComandos, Map<Argumentos, Object> argumentos) {
		int numeroArgumentos = lineaComandos.length;

		for(int i= 0; i < numeroArgumentos; i++){
			if (esOpcion(lineaComandos[i])){
				establecerArgumento(lineaComandos[i], argumentos);
				establecerValorArgumento(lineaComandos[i], lineaComandos[i+1], argumentos);
			}			
		}		
	}

	/**
	 * ??.
	 * @param opcion  la opcion que se está analizando.
	 * @param valor
	 * @param argumentos  un mapa de argumentos con los objetos parseados e instanciados.
	 */
	private static void establecerValorArgumento(String opcion, String valor, Map<Argumentos, Object> argumentos) {
		Argumentos argumento = getOpcionPorNombre(opcion);
		Object valorOpcion = argumentos.get(argumento);
		if (valorOpcion == null && argumento != null){
			argumentos.put(argumento, valor);
		}
	}

	/**
	 * Estable el argumento a partir de la opcion pasada.
	 * @param opcion la opcion que se está analizando.
	 * @param argumentos  un mapa de argumentos con los objetos parseados e instanciados.
	 */
	private static void establecerArgumento(String opcion, Map<Argumentos, Object> argumentos) {
		Argumentos argumento = getOpcionPorNombre(opcion);
		argumentos.put(argumento, null);
	}


	/**
	 * Devuelve el argumento segun su valor.
	 * @param valorOpcion el valor de la opcion
	 * @return el argumento instanciado.
	 */ 
	private static Argumentos getOpcionPorNombre(String valorOpcion) {
		Argumentos argumentoCoincidente = null;
		for (Argumentos argumento : values()) {
			String[] opciones = argumento.getOpciones();
			if (opciones[0].equals(valorOpcion) || opciones[1].equals(valorOpcion)){
				argumentoCoincidente =  argumento;
			}
		}
		return argumentoCoincidente;
	}


	/**
	 * comprueba si el argumento es una opcion. 
	 * @param valorOpcion el valor de la opcion.
	 * @return si es o no opcion
	 */
	private static Boolean esOpcion(String valorOpcion) {
		Boolean esOpcion = false;
		for (Argumentos argumento : values()) {
			String[] opciones = argumento.getOpciones();
			if (opciones[0].equals(valorOpcion) || opciones[1].equals(valorOpcion)){
				esOpcion = true;
			}
		}
		return esOpcion;
	}


	/**
	 * La opcion de comando. 
	 */
	private String[] opciones;

	/**
	 * Constructor privado de las instancias.
	 */
	private Argumentos(String... opciones){
		this.opciones = opciones;
	}

}
