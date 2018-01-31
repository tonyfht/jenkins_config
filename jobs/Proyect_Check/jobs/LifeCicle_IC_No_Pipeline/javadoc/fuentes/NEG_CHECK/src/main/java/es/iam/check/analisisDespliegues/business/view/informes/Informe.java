package es.iam.check.analisisDespliegues.business.view.informes;

import java.util.Collection;
import es.iam.check.analisisDespliegues.business.chequeos.IChequeo;
import es.iam.check.analisisDespliegues.business.chequeos.model.TipoNombreChequeos;
import es.iam.check.analisisDespliegues.business.configuracion.Configuracion;


/**
 * Un informe agrupa a un cojunto de chequeos
 * de forma semantica y que presenta similitudes
 * a la hora de presentar la informacion.
 * @author SSA005
 * @author ARD021
 */
public interface Informe {

	/**
	 * Compone un informe con los datos de los chequeos realizados.
	 * @param chequeos chequeos realizados.
	 * @param conf configuración del proyecto.
	 */
	 void componer( Collection<IChequeo> chequeos, Configuracion conf);
	 
	 /**
	  * Pone un filtro a los chequeos a imprimir.
	  * @param filtro filtro que se pone al informe.
	  */
	void setFiltro( TipoNombreChequeos filtro );
	
}
