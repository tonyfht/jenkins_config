package es.iam.check.analisisDespliegues.business.chequeos.reglas;

import es.iam.check.analisisDespliegues.business.ficheros.Fichero;


/**
 * Interface que aplica a todas las reglas y marca el cumplimiento de la misma.
 * @author SSA005
 */
public interface IRegla {

	/**
	 * Metodo para interrogar si cumple o no la regla.
	 * @param fichero fichero a analizar.
	 * @return si se cumple la regla o no.
	 */
	Boolean seCumple(Fichero fichero);

	/**
	 * Metodo que retorna el tipo de comprobación.
	 * @return el tipo de comprobación
	 */
	TipoComprobacion getTipoComprobacion();

	/**
	 * Metodo que retorna una cadena de Ejemplo.
	 * @return la cadena de ejemplo.
	 */
	String getEjemplo();

}
