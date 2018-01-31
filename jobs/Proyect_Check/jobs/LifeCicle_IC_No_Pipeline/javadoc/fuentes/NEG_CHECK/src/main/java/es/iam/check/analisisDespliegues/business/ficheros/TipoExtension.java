package es.iam.check.analisisDespliegues.business.ficheros;

/**
 * Extensiones.
 * @author SSA005
 */
public enum TipoExtension {

	/**
	 * INSTANCIAS.
	 */
	EAR(".ear"),
	WAR(".war"),
	JAR(".jar"),
	ZIP(".zip"),
	JAVA(".java"),
	CLASS(".class"),
	XML(".xml"),
	PROPERTIES(".properties"),
	NINGUNO(""),
	CUALQUIERA(".*");
	
	/**
	 * La extension de los ficheros.
	 */
	private String extension;
	
	/**
	 * Metodo conversor de cadena a tipo.
	 * @param name el nombre de la extension como cadena.
	 * @return el tipo instanciado.
	 */
	public static TipoExtension extension(String name) {
		TipoExtension tipoExtension = TipoExtension.CUALQUIERA;
		
		if(name.endsWith(EAR.getExtension())){
			tipoExtension = EAR;
		}
		if(name.endsWith(WAR.getExtension())){
			tipoExtension = WAR;
		}
		if(name.endsWith(JAR.getExtension())){
			tipoExtension = JAR;
		}
		if(name.endsWith(ZIP.getExtension())){
			tipoExtension = ZIP;
		}
		if(name.endsWith(JAVA.getExtension())){
			tipoExtension = JAVA;
		}
		if(name.endsWith(CLASS.getExtension())){
			tipoExtension = CLASS;
		}
		if(name.endsWith(XML.getExtension())){
			tipoExtension = CLASS;
		}
		if(name.endsWith(PROPERTIES.getExtension())){
			tipoExtension = PROPERTIES;
		}
		if(!name.contains(".")){
			tipoExtension = NINGUNO;
		}
		return tipoExtension;
	}
	
	
	/**
	 * getter.
	 * @return the extension
	 */
	public String getExtension() {
		return extension;
	}

	/**
	 * Constructor por defecto de las entidades.
	 * @param extension la extension como cadena.
	 */
	private TipoExtension(String extension){
		this.extension = extension;
	}

	
}
