package es.iam.check.analisisDespliegues.business.chequeos;

/**
 * Valoraciones a establecer sobre los chequeos.
 * @author SSA005
 */
public enum Valoracion {

	//INSTANCIAS

	CORRECTO("correcto"),
	INCORRECTO("incorrecto"),
	AVISO("aviso"),
	NINGUNO("no valorado");

	/**
	 * descripcion de la valoracion del chequeo.
	 */
	private String descripcion;

	/**
	 * getter.
	 * @return la descripción.
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * setter.
	 * @param descripcion la descripción.
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	/**
	 * Constructor privado de las instancias.
	 * @param descripcion la descripcion.
	 */
	private Valoracion(String descripcion){
		this.descripcion = descripcion;
	}

}
