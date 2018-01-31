package es.iam.check.analisisDespliegues.business.analizadores;
import es.iam.check.analisisDespliegues.business.chequeos.model.TipoNombreChequeos;
import es.iam.check.analisisDespliegues.business.configuracion.Configuracion;
import es.iam.check.analisisDespliegues.business.view.informes.Informe;

/**
 * Metodos que posee cualquier artefacto analizable.
 * @author SSA005
 * @author ARD021
 */
public interface IAnalizador {

	/**
	 * Punto de entrada al analizador.
	 */
	void iniciarAnalisis();
	
	/**
	 *Genera el informe basada en la configuracion de ejecución. 
	 * @param conf configuracion que se solicta en linea de comandos.
	 * @return el Informe generado con los resultados de los análisis.
	 */
	Informe generarInforme(Configuracion conf);
	
	/**
	 * Filtro para los chequeos que se generan en el informe. 
	 * @param filtro Tipos de chequeos que se mostraran en el 
	 * informe.
	 */
	void setFiltro(TipoNombreChequeos filtro);

}
