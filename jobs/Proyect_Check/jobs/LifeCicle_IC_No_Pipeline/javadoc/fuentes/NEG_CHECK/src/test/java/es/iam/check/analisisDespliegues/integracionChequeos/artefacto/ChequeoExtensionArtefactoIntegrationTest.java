package es.iam.check.analisisDespliegues.integracionChequeos.artefacto;

import org.junit.Test;

import es.iam.check.analisisDespliegues.business.chequeos.model.TipoNombreChequeos;
import es.iam.check.analisisDespliegues.business.configuracion.TipoServidor;
import es.iam.check.analisisDespliegues.integracionChequeos.Artefacto;
import es.iam.check.analisisDespliegues.integracionChequeos.ChequeosIntegrationTest;



/**
 * @author SSA005
 * @author ARD021
 */

public class ChequeoExtensionArtefactoIntegrationTest extends ChequeosIntegrationTest{
	
	@Test
	public void detectarErrorExtensionEAAR_WAS85(){
		Artefacto artefacto = crearArtefactoEAR("XXXXX", "eaar");
		
		lanzarTestArtefacto(artefacto, 1, 0, 0, TipoServidor.WAS85, TipoNombreChequeos.CHEQUEO_EXTENSION_ARTEFACTO);
	}
	
	@Test
	public void detectarCorrectoExtensionEAR_WAS85(){
		Artefacto artefacto = crearArtefactoEAR("XXXXX", "ear");
		
		lanzarTestArtefacto(artefacto, 0, 1, 0, TipoServidor.WAS85, TipoNombreChequeos.CHEQUEO_EXTENSION_ARTEFACTO);
	}
	
	@Test
	public void detectarErrorExtensionEAAR_JBOSS(){
		Artefacto artefacto = crearArtefactoEAR("XXXXX", "eaar");
		
		lanzarTestArtefacto(artefacto, 1, 0, 0, TipoServidor.JBOSS, TipoNombreChequeos.CHEQUEO_EXTENSION_ARTEFACTO);
	}
	
	@Test
	public void detectarCorrectoExtensionEAR_JBOSS(){
		Artefacto artefacto = crearArtefactoEAR("XXXXX", "ear");
		
		lanzarTestArtefacto(artefacto, 0, 1, 0, TipoServidor.JBOSS, TipoNombreChequeos.CHEQUEO_EXTENSION_ARTEFACTO);
	}
	
	@Test
	public void detectarErrorExtensionEAAR_WAS61(){
		Artefacto artefacto = crearArtefactoEAR("XXXXX", "eaar");
		
		lanzarTestArtefacto(artefacto, 1, 0, 0, TipoServidor.WAS61, TipoNombreChequeos.CHEQUEO_EXTENSION_ARTEFACTO);
	}
	
	@Test
	public void detectarCorrectoExtensionEAR_WAS61(){
		Artefacto artefacto = crearArtefactoEAR("XXXXX", "ear");
		
		lanzarTestArtefacto(artefacto, 0, 1, 0, TipoServidor.WAS61, TipoNombreChequeos.CHEQUEO_EXTENSION_ARTEFACTO);
	}

}
