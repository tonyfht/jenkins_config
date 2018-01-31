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
 * @author AHT005
 */
public class ChequeoContenidoWebAppTest extends ChequeosIntegrationTest{
		
	
	/********************************* TEST WAS 8.5 *****************************/
	/*********************************************************************************/
	
	@Test
	public void detectarErrorExistenciaSessionTimeoutWebApplicationXML_WAS85(){
		Artefacto artefacto = crearArtefactoEARVacio("prueba");
		URL url = getClass().getResource("/artefactos/webSessionTimeout.xml");
		
		artefacto.agregarAplicacionWeb(crearArtefactoWARConWebXML("abc", new File(url.getPath())));
		artefacto.agregarManifest();
		lanzarTestArtefacto(artefacto, 2, 1, 0, TipoServidor.WAS85, TipoNombreChequeos.CHEQUEOS_CONTENIDO_WEB_XML);
	}
	
	@Test
	public void detectarErrorNoExistenciaNamespace30WebApplicationXML_WAS85(){
		Artefacto artefacto = crearArtefactoEARVacio("prueba");
		URL url = getClass().getResource("/artefactos/web.xml");
		
		artefacto.agregarAplicacionWeb(crearArtefactoWARConWebXML("abc", new File(url.getPath())));
		artefacto.agregarManifest();
		lanzarTestArtefacto(artefacto, 3, 0, 0, TipoServidor.WAS85, TipoNombreChequeos.CHEQUEOS_CONTENIDO_WEB_XML);
	}
	
	@Test
	public void detectarExistenciaNamespace30_Y_No_SessionTimeout_WebApplicationXML_WAS85(){
		Artefacto artefacto = crearArtefactoEARVacio("prueba");
		URL url = getClass().getResource("/artefactos/web30.xml");
		
		artefacto.agregarAplicacionWeb(crearArtefactoWARConWebXML("abc", new File(url.getPath())));
		artefacto.agregarManifest();
		lanzarTestArtefacto(artefacto, 1, 2, 0, TipoServidor.WAS85, TipoNombreChequeos.CHEQUEOS_CONTENIDO_WEB_XML);
	}
	
	@Test
	public void detectarExistenciaEnableFileServing_WebApplicationXML_WAS85(){
		Artefacto artefacto = crearArtefactoEARVacio("prueba");
		URL url = getClass().getResource("/artefactos/ibm-web-ext.xml");
		
		artefacto.agregarAplicacionWeb(crearArtefactoWARConWebXML("abc", new File(url.getPath())));
		artefacto.agregarManifest();
		lanzarTestArtefacto(artefacto, 2, 1, 0, TipoServidor.WAS85, TipoNombreChequeos.CHEQUEOS_CONTENIDO_WEB_XML);
	}
	
	
	/********************************* FIN TEST WAS 8.5 *****************************/
	/*********************************************************************************/
	
	/********************************* TEST WAS JBOSS *****************************/
	/*********************************************************************************/
	
	@Test
	public void detectarErrorNoExistenciaSessionTimeoutWebApplicationXML_JBOSS(){
		Artefacto artefacto = crearArtefactoEARVacio("prueba");
		URL url = getClass().getResource("/artefactos/web30.xml");
		
		artefacto.agregarAplicacionWeb(crearArtefactoWARConWebXML("abc", new File(url.getPath())));
		artefacto.agregarManifest();
		lanzarTestArtefacto(artefacto, 1, 1, 0, TipoServidor.JBOSS, TipoNombreChequeos.CHEQUEOS_CONTENIDO_WEB_XML);
	}
	
	@Test
	public void detectarErrorNoExistenciaNamespace30YSessionTimeoutEnWebApplicationXML_JBOSS(){
		Artefacto artefacto = crearArtefactoEARVacio("prueba");
		URL url = getClass().getResource("/artefactos/web.xml");
		
		artefacto.agregarAplicacionWeb(crearArtefactoWARConWebXML("abc", new File(url.getPath())));
		artefacto.agregarManifest();
		lanzarTestArtefacto(artefacto, 1, 1, 0, TipoServidor.JBOSS, TipoNombreChequeos.CHEQUEOS_CONTENIDO_WEB_XML);
	}
	
	@Test
	public void detectarExistenciaNamespace30_Y_SI_SessionTimeout_WebApplicationXML_JBOSS(){
		Artefacto artefacto = crearArtefactoEARVacio("prueba");
		URL url = getClass().getResource("/artefactos/webSessionTimeout.xml");
		
		artefacto.agregarAplicacionWeb(crearArtefactoWARConWebXML("abc", new File(url.getPath())));
		artefacto.agregarManifest();
		lanzarTestArtefacto(artefacto, 1, 1, 0, TipoServidor.JBOSS, TipoNombreChequeos.CHEQUEOS_CONTENIDO_WEB_XML);
	}
	
	/********************************* FIN TEST WAS JBOSS *****************************/
	/*********************************************************************************/
	
	
	/********************************* TEST WAS WAS61 *****************************/
	/*********************************************************************************/
	
	@Test
	public void detectarErrorExistenciaSessionTimeoutWebApplicationXML_WAS61(){
		Artefacto artefacto = crearArtefactoEARVacio("prueba");
		URL url = getClass().getResource("/artefactos/web.xml");
		
		artefacto.agregarAplicacionWeb(crearArtefactoWARConWebXML("abc", new File(url.getPath())));
		artefacto.agregarManifest();
		lanzarTestArtefacto(artefacto, 1, 1, 0, TipoServidor.WAS61, TipoNombreChequeos.CHEQUEOS_CONTENIDO_WEB_XML);
	}
	
	@Test
	public void detectarErrorNoExistenciaNamespace24WebApplicationXML_WAS61(){
		Artefacto artefacto = crearArtefactoEARVacio("prueba");
		URL url = getClass().getResource("/artefactos/web30.xml");
		
		artefacto.agregarAplicacionWeb(crearArtefactoWARConWebXML("abc", new File(url.getPath())));
		artefacto.agregarManifest();
		lanzarTestArtefacto(artefacto, 1, 1, 0, TipoServidor.WAS61, TipoNombreChequeos.CHEQUEOS_CONTENIDO_WEB_XML);
	}
	
	@Test
	public void detectarExistenciaNamespace24_Y_No_SessionTimeout_WebApplicationXML_WAS61(){
		Artefacto artefacto = crearArtefactoEARVacio("prueba");
		URL url = getClass().getResource("/artefactos/web.xml");
		
		artefacto.agregarAplicacionWeb(crearArtefactoWARConWebXML("abc", new File(url.getPath())));
		artefacto.agregarManifest();
		lanzarTestArtefacto(artefacto, 1, 1, 0, TipoServidor.WAS61, TipoNombreChequeos.CHEQUEOS_CONTENIDO_WEB_XML);
	}
	
	/********************************* FIN TEST WAS WAS61 *****************************/
	/*********************************************************************************/
}
