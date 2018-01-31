package es.iam.check.analisisDespliegues.integracionChequeos.artefacto;

import java.io.File;
import java.net.URL;

import org.junit.Test;


import es.iam.check.analisisDespliegues.business.chequeos.model.TipoNombreChequeos;
import es.iam.check.analisisDespliegues.business.configuracion.TipoServidor;
import es.iam.check.analisisDespliegues.integracionChequeos.Artefacto;
import es.iam.check.analisisDespliegues.integracionChequeos.ChequeosIntegrationTest;



/**
 * @author SSA005
 * @author ARD021
 */
public class ChequeoContenidoAppXMLTest extends ChequeosIntegrationTest{
		
	@Test
	public void detectarErrorNoExistenciaApplicationXMLDescriptor6_WAS85(){
		Artefacto artefactoWAR = crearArtefactoWARVacio("pruebaWeb");
		artefactoWAR.agregarManifest();
		Artefacto artefactoEAR = crearArtefactoEARVacio("prueba");	
		artefactoEAR.agregarAplicacionWeb(artefactoWAR);
		artefactoEAR.agregarManifest();
		URL url = getClass().getResource("/artefactos/application.xml");
		artefactoEAR.agregarApplicationXML(new File(url.getPath()));
		lanzarTestArtefacto(artefactoEAR, 1, 0, 0, TipoServidor.WAS85, es.iam.check.analisisDespliegues.business.chequeos.model.TipoNombreChequeos.CHEQUEOS_CONTENIDO_APPLICATION_XML);
	}
	
	@Test
	public void detectarExistenciaDescriptor6ApplicationXML_WAS85(){
		Artefacto artefactoWAR = crearArtefactoWARVacio("pruebaWeb");
		artefactoWAR.agregarManifest();
		Artefacto artefactoEAR = crearArtefactoEARVacio("prueba");	
		artefactoEAR.agregarAplicacionWeb(artefactoWAR);
		artefactoEAR.agregarManifest();
		URL url = getClass().getResource("/artefactos/application6.xml");
		artefactoEAR.agregarApplicationXML(new File(url.getPath()));
		lanzarTestArtefacto(artefactoEAR, 0, 1, 0, TipoServidor.WAS85, TipoNombreChequeos.CHEQUEOS_CONTENIDO_APPLICATION_XML);
	}
	
	@Test
	public void detectarErrorNoExistenciaApplicationXMLDescriptor6_JBOSS(){
		Artefacto artefactoWAR = crearArtefactoWARVacio("pruebaWeb");
		artefactoWAR.agregarManifest();
		Artefacto artefactoEAR = crearArtefactoEARVacio("prueba");	
		artefactoEAR.agregarAplicacionWeb(artefactoWAR);
		artefactoEAR.agregarManifest();
		URL url = getClass().getResource("/artefactos/application.xml");
		artefactoEAR.agregarApplicationXML(new File(url.getPath()));
		lanzarTestArtefacto(artefactoEAR, 1, 0, 0, TipoServidor.JBOSS, TipoNombreChequeos.CHEQUEOS_CONTENIDO_APPLICATION_XML);
	}
	
	@Test
	public void detectarExistenciaDescriptor6ApplicationXML_JBOSS(){
		Artefacto artefactoWAR = crearArtefactoWARVacio("pruebaWeb");
		artefactoWAR.agregarManifest();
		Artefacto artefactoEAR = crearArtefactoEARVacio("prueba");	
		artefactoEAR.agregarAplicacionWeb(artefactoWAR);
		artefactoEAR.agregarManifest();
		URL url = getClass().getResource("/artefactos/application6.xml");
		artefactoEAR.agregarApplicationXML(new File(url.getPath()));
		lanzarTestArtefacto(artefactoEAR, 0, 1, 0, TipoServidor.JBOSS, TipoNombreChequeos.CHEQUEOS_CONTENIDO_APPLICATION_XML);
	}
	
	@Test
	public void detectarErrorNoExistenciaApplicationXMLDescriptor4_WAS61(){
		Artefacto artefactoWAR = crearArtefactoWARVacio("pruebaWeb");
		artefactoWAR.agregarManifest();
		Artefacto artefactoEAR = crearArtefactoEARVacio("prueba");	
		artefactoEAR.agregarAplicacionWeb(artefactoWAR);
		artefactoEAR.agregarManifest();
		URL url = getClass().getResource("/artefactos/application6.xml");
		artefactoEAR.agregarApplicationXML(new File(url.getPath()));
		lanzarTestArtefacto(artefactoEAR, 1, 0, 0, TipoServidor.WAS61, TipoNombreChequeos.CHEQUEOS_CONTENIDO_APPLICATION_XML);
	}
	
	@Test
	public void detectarExistenciaDescriptor6ApplicationXML_WAS61(){
		Artefacto artefactoWAR = crearArtefactoWARVacio("pruebaWeb");
		artefactoWAR.agregarManifest();
		Artefacto artefactoEAR = crearArtefactoEARVacio("prueba");	
		artefactoEAR.agregarAplicacionWeb(artefactoWAR);
		artefactoEAR.agregarManifest();
		URL url = getClass().getResource("/artefactos/application.xml");
		artefactoEAR.agregarApplicationXML(new File(url.getPath()));
		lanzarTestArtefacto(artefactoEAR, 0, 1, 0, TipoServidor.WAS61, TipoNombreChequeos.CHEQUEOS_CONTENIDO_APPLICATION_XML);
	}
	
	
}
