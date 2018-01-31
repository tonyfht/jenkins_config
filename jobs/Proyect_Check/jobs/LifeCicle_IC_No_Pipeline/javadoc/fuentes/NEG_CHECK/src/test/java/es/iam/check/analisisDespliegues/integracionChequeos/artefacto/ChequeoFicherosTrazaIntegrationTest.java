package es.iam.check.analisisDespliegues.integracionChequeos.artefacto;

import org.junit.Test;

import es.iam.check.analisisDespliegues.business.chequeos.model.TipoNombreChequeos;
import es.iam.check.analisisDespliegues.business.configuracion.TipoServidor;
import es.iam.check.analisisDespliegues.integracionChequeos.Artefacto;
import es.iam.check.analisisDespliegues.integracionChequeos.ChequeosIntegrationTest;



/**
 * @author SSA005
 * @author ARD021
 * 
 */

public class ChequeoFicherosTrazaIntegrationTest extends ChequeosIntegrationTest{

	@Test
	public void detectarErrorExistenciaLog4jXML_WAS85(){
		Artefacto artefacto = crearArtefactoEAR("prueba");
		artefacto.agregarArchivo("log4j.xml", null);
		
		lanzarTestArtefacto(artefacto, 1, 0, 0, TipoServidor.WAS85, es.iam.check.analisisDespliegues.business.chequeos.model.TipoNombreChequeos.CHEQUEOS_FICHEROS_TRAZA);
	}
	
	@Test
	public void detectarErrorExistenciaLog4jProperties_WAS85(){
		Artefacto artefacto = crearArtefactoEAR("prueba");
		artefacto.agregarArchivo("log4j.properties", null);
		
		lanzarTestArtefacto(artefacto, 1, 0, 0, TipoServidor.WAS85, TipoNombreChequeos.CHEQUEOS_FICHEROS_TRAZA);
	}
	
	@Test
	public void detectarErrorExistenciaLog4jXML_JBOSS(){
		Artefacto artefacto = crearArtefactoEAR("prueba");
		artefacto.agregarArchivo("log4j.xml", null);
		
		lanzarTestArtefacto(artefacto, 1, 0, 0, TipoServidor.JBOSS, TipoNombreChequeos.CHEQUEOS_FICHEROS_TRAZA);
	}
	
	@Test
	public void detectarErrorExistenciaLog4jProperties_JBOSS(){
		Artefacto artefacto = crearArtefactoEAR("prueba");
		artefacto.agregarArchivo("log4j.properties", null);
		
		lanzarTestArtefacto(artefacto, 1, 0, 0, TipoServidor.JBOSS, TipoNombreChequeos.CHEQUEOS_FICHEROS_TRAZA);
	}
	
	@Test
	public void detectarErrorExistenciaLog4jXML_WAS61(){
		Artefacto artefacto = crearArtefactoEAR("prueba");
		artefacto.agregarArchivo("log4j.xml", null);
		
		lanzarTestArtefacto(artefacto, 1, 0, 0, TipoServidor.WAS85, TipoNombreChequeos.CHEQUEOS_FICHEROS_TRAZA);
	}
	
	@Test
	public void detectarErrorExistenciaLog4jProperties_WAS61(){
		Artefacto artefacto = crearArtefactoEAR("prueba");
		artefacto.agregarArchivo("log4j.properties", null);
		
		lanzarTestArtefacto(artefacto, 1, 0, 0, TipoServidor.WAS85, TipoNombreChequeos.CHEQUEOS_FICHEROS_TRAZA);
	}

}
