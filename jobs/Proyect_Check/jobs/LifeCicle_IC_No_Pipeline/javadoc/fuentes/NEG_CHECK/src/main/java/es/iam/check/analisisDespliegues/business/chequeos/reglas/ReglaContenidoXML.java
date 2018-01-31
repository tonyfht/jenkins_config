package es.iam.check.analisisDespliegues.business.chequeos.reglas;

import java.io.StringReader;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.xml.sax.InputSource;

import es.iam.check.analisisDespliegues.business.ficheros.Fichero;


/**
 * Regla que configura la busqueda de contenido en un fichero
 * especifico.
 * @author SSA005
 */
public class ReglaContenidoXML implements IRegla{

	/**
	 * La cadena que se busca dentro del archivo.
	 */
	private String cadena;

	/**
	 * El nombre de un ejemplo sin patron.
	 */
	private String ejemplo;
	
	private final static String ISO_ENCODING = "ISO-8859-1";
    private final static int UTF8_BOM_LENGTH = 3;

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
	public ReglaContenidoXML(String ejemplo, String cadena, TipoComprobacion tipoComprobacion){
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
		try {
			String contenido =  fichero.getContenido();
			final byte[] bytes = fichero.getContenido().getBytes(ISO_ENCODING);
			if (isUTF8(bytes)) {
				int length = bytes.length - UTF8_BOM_LENGTH;
		        byte[] barray = new byte[length];
		        System.arraycopy(bytes, UTF8_BOM_LENGTH, barray, 0, barray.length);
		        contenido = new String(barray, ISO_ENCODING);
			}
			return seEncuentraCadena(contenido);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
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
	private Boolean seEncuentraCadena(String contenido) throws Exception {
		
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document doc =  builder.parse(new InputSource(new StringReader(contenido))); 
		XPathFactory xPathfactory = XPathFactory.newInstance();
		XPath xpath = xPathfactory.newXPath();
		XPathExpression expr = xpath.compile(cadena);
		return (Boolean) expr.evaluate(doc, XPathConstants.BOOLEAN);
	}

	
	private static boolean isUTF8(byte[] bytes) {
	    if ((bytes[0] & 0xFF) == 0xEF && (bytes[1] & 0xFF) == 0xBB && (bytes[2] & 0xFF) == 0xBF) {
	        return true;
	    }
	    return false;
	}
}
