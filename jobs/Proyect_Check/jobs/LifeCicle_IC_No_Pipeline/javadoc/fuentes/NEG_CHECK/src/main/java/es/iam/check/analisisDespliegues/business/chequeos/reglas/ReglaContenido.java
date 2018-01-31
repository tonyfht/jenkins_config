package es.iam.check.analisisDespliegues.business.chequeos.reglas;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import es.iam.check.analisisDespliegues.business.ficheros.Fichero;


/**
 * Regla que configura la busqueda de contenido en un fichero
 * especifico.
 * @author SSA005
 */
public class ReglaContenido implements IRegla{

	/**
	 * La cadena que se busca dentro del archivo.
	 */
	private String cadena;

	/**
	 * El nombre de un ejemplo sin patron.
	 */
	private String ejemplo;

	/**
	 * Tipo de comprobacion que se realizara sobre el archivo:
	 * - deberia existir 
	 * - no deberia existir
	 * - se avisa de su existencia.
	 */
	private TipoComprobacion tipoComprobacion;

	/**
	 * Constructor para las reglas de tipo contenido.
	 * @param ejemplo el ejemplo de dicha regla.
	 * @param cadena la cadena donde se busca.
	 * @param tipoComprobacion el tipo de comprobación a realizar.
	 */
	public ReglaContenido(String ejemplo, String cadena, TipoComprobacion tipoComprobacion){
		this.ejemplo = ejemplo;
		this.cadena = cadena;
		this.tipoComprobacion = tipoComprobacion;
	}

	/**
	 * Metodo para interrogar si cumple o no la regla.
	 * @param fichero fichero a analizar.
	 * @return si se cumple la regla o no.
	 */
	public Boolean seCumple(Fichero fichero) {
		String contenido = fichero.getContenido();
		return seEncuentraCadena(contenido);
	}

	/**
	 * getter.
	 * @return the ejemplo el ejemplo de la regla.
	 */
	public String getEjemplo() {
		return ejemplo;
	}

	/**
	 * getter.
	 * @return the tipoComprobacion El tipo de comprobacion a realizar.
	 */
	public TipoComprobacion getTipoComprobacion() {
		return tipoComprobacion;
	}

	/**
	 * getter.
	 * @return the cadena la cadena donde se busca.
	 */
	public String getCadena() {
		return cadena;
	}
	
	/**
	 * Busca la cadena dentro del contenido usando expresiones regulares.
	 * @param contenido contiendo para buscar cadenas en el.
	 * @return el indicador de haberse encontrado la cadena.
	 */
	private Boolean seEncuentraCadena(String contenido) {
		Pattern pattern = Pattern.compile(cadena, TratamientoMayusculas.ESTRICTO.getValor());
		Matcher matcher = pattern.matcher(contenido);
		return matcher.find();
	}

}
