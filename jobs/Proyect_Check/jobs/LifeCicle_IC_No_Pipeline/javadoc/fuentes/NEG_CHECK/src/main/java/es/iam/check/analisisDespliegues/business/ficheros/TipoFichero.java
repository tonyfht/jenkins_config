package es.iam.check.analisisDespliegues.business.ficheros;

/**
 * Tipo de fichero que se puede analizar.
 * @author SSA005
 */
public enum TipoFichero {
	
	RECURSOS("ACRONIMO_SUB_recursos", TipoExtension.ZIP),
	ESTATICOS("ACRONIMO_SUB_estaticos", TipoExtension.ZIP),
	APLICACION("ACRONIMO_SUB", TipoExtension.EAR),
	FUENTE("java", TipoExtension.JAVA),
	BINARIO("binario", TipoExtension.CLASS),
	DIRECTORIO("directorio", TipoExtension.NINGUNO),
	XML("xml", TipoExtension.XML),
	PROPERTIES("propiedades", TipoExtension.PROPERTIES),
	INDETERMINADO("", TipoExtension.CUALQUIERA);
	
	
	/**
	 * Dice si el {@link Fichero} cumple con el nombre de
	 * plantilla que debe presentar.
	 * @param fichero El fichero a verificar.
	 * @return si cumple con la plantilla el fichero.
	 */
	public Boolean cumplePlantillaNombre(Fichero fichero){
		return false;
	}
	
	/**
	 * Dice si el {@link Fichero} cumple con el tipo
	 * de extension que debe presentar.
	 * @param fichero el fichero a verificar.
	 * @return si cumple o no con la extensión.
	 */
	public Boolean cumpleTipoExtension(Fichero fichero){
		return false;
	}
	
	/**
	 * La plantilla que han de cumplir los ficheros que
	 * sean del tipo indicado.
	 */
	private String plantillaNombre;
	
	/**
	 * La extension que deben tener los ficheros
	 * que sean del tipo indicado.
	 */
	private TipoExtension tipoExtension;
	
	/**
	 * Constructor por defecto de las instancias.
	 */
	private TipoFichero(String plantillaNombre, TipoExtension tipoExtension){
		this.plantillaNombre = plantillaNombre;
		this.tipoExtension = tipoExtension;
	}

}
