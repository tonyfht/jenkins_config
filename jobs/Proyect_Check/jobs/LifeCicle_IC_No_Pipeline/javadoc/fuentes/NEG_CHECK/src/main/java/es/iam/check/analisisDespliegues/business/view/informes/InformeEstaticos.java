package es.iam.check.analisisDespliegues.business.view.informes;


/**
 * Clase que indica los nombres de los informes de estaticos.
 * @author SSA005
 * @author ARD021
 */

public class InformeEstaticos extends AbstractHtmlInforme{
	
	/**
	 * Nombre de lo informes de estaticos.
	 */
	public final static String NOMBRE = "InformeEstaticos.html";

	/**
	 * Constructor por defecto.
	 */
	public InformeEstaticos(){
		setNombre(NOMBRE);
	}
}
