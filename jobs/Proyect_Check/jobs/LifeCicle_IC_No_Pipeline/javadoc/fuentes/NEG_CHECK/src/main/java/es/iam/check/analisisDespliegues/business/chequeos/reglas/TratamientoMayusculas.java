package es.iam.check.analisisDespliegues.business.chequeos.reglas;

/**
 * Enumerado para indicar el tratamiento a las mayusculas en las Reglas.
 * @author SSA005
 */
public enum TratamientoMayusculas {
	
	//Instancias
	IGNORAR(2),
	ESTRICTO(0);
	
	/**
	 * valor del enumerado.
	 */
	private int valor;
	
	/**
	 * getter.
	 * @return the valor de TratamientoMayusculas.
	 */
	public int getValor() {
		return valor;
	}

	/**
	 * Constructor bajo entero.
	 * @param valor el valor de TratamientoMayusculas.
	 */
	private TratamientoMayusculas(int valor){
		this.valor = valor;
	}
	
	
}
