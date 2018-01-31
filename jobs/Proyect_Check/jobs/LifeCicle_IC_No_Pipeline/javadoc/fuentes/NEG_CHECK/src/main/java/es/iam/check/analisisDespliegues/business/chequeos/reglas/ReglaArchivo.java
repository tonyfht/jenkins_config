package es.iam.check.analisisDespliegues.business.chequeos.reglas;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import es.iam.check.analisisDespliegues.business.ficheros.Fichero;

/**
 * Regla que configura comprobaciones sobre un archivo existente.
 * @author SSA005
 */
public class ReglaArchivo implements IRegla{

	/**
	 * Nombre del archivo que se busca, pude contener metacaracteres
	 * o referirse a rutas relativas.
	 */
	private String patron;
	
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
	 * Dice si el patron de busqueda tiene que ser sensible o no
	 * a las masyusculas y minusculas.
	 * Por defecto es {@link TratamientoMayusculas#ESTRICTO}
	 */
	private TratamientoMayusculas tratamientoMayusculas = TratamientoMayusculas.ESTRICTO;

	
	/**
	 * Constructor de la Regla.
	 * @param ejemplo ejemplo de cumplimiento de la regla.
	 * @param patron patron a aplicar en la regla.
	 * @param tipoComprobacion tipo de comprobación que se realizara.
	 */
	public ReglaArchivo(String ejemplo, String patron, TipoComprobacion tipoComprobacion){
		this.ejemplo = ejemplo;
		this.patron = patron;
		this.tipoComprobacion = tipoComprobacion;
	}

	/**
	 * Constructor de la Regla.
	 * @param ejemplo ejemplo de cumplimiento de la regla.
	 * @param patron patron a aplicar en la regla.
	 * @param tipoComprobacion  tipo de comprobación que se realizara.
	 * @param tratamientoMayusculas tipo de tratamiento a realizar a las mayusculas.
	 */
	public ReglaArchivo(String ejemplo,String patron, TipoComprobacion tipoComprobacion, TratamientoMayusculas tratamientoMayusculas){
		this(ejemplo, patron, tipoComprobacion);
		this.tratamientoMayusculas = tratamientoMayusculas;
	}
	
	/**
	 * Dice si el nombre del archivo coincide con el patron de la Regla.
	 * @param fichero el fichero a revisar contra la regla.
	 * @return el booleano con el resultado del cumplimiento de la regl sobre un fichero.
	 */
	public Boolean seCumple(Fichero fichero){
		Pattern pattern = Pattern.compile(patron, tratamientoMayusculas.getValor());
		Matcher matcher = pattern.matcher(fichero.rutaRelativa());
		return matcher.matches();		
	}

	/**
	 * getter.
	 * @return the patron
	 */
	public String getPatron() {
		return patron;
	}

	/**
	 * getter.
	 * @return the tipoComprobacion
	 */
	public TipoComprobacion getTipoComprobacion() {
		return tipoComprobacion;
	}	

	/**
	 * getter.
	 * @return the ejemplo
	 */
	public String getEjemplo() {
		return ejemplo;
	}
}
