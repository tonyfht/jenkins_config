package es.iam.check.analisisDespliegues.integracionChequeos.artefacto;

import org.junit.Test;


import es.iam.check.analisisDespliegues.business.chequeos.model.TipoNombreChequeos;
import es.iam.check.analisisDespliegues.business.configuracion.TipoServidor;
import es.iam.check.analisisDespliegues.integracionChequeos.Artefacto;
import es.iam.check.analisisDespliegues.integracionChequeos.ChequeosIntegrationTest;



/**
 * @author SSA005
 * @author AHT005
 */
public class ChequeoDescriptoresIntegrationTest extends ChequeosIntegrationTest{
	
	
	/********************************* TEST WAS 6.1 *****************************/
	/*********************************************************************************/
	
	
	
	@Test
	public void detectarNOExistenciaBNDenEAR_WAS61(){
		Artefacto artefacto = crearArtefactoEARVacio("prueba");
		artefacto.agregarAplicacionWeb(crearArtefactoWAR("pruebaWeb").agregarManifest().agregarArchivo("kk2-jk.bnd", "WEB-INF"));		
		artefacto.agregarManifest();
		artefacto.agregarArchivo("kk.bnd", "META-INF");
		artefacto.agregarApplicationXML("artefactos/application.xml");
		
		lanzarTestArtefacto(artefacto, 1, 4, 0, TipoServidor.WAS61, TipoNombreChequeos.CHEQUEOS_DESCRIPTORES);
	}
	
	@Test
	public void detectarErrorNoExistenciaApplicationXML_WAS61(){
		Artefacto artefacto = crearArtefactoEARVacio("prueba");
		artefacto.agregarAplicacionWeb(crearArtefactoWAR("pruebaWeb").agregarManifest().agregarArchivo("ibm-web-ext.xmi", "WEB-INF"));
		artefacto.agregarManifest();
		
		lanzarTestArtefacto(artefacto, 1, 4, 0, TipoServidor.WAS61, TipoNombreChequeos.CHEQUEOS_DESCRIPTORES);
	}
	
	@Test
	public void detectarErrorExistenciaIncorrectaApplicationXML_WAS61(){
		Artefacto artefacto = crearArtefactoEARVacio("prueba");
		artefacto.agregarAplicacionWeb(crearArtefactoWAR("pruebaWeb").agregarManifest().agregarArchivo("ibm-web-ext.xmi", "WEB-INF").agregarArchivo("application.xml", "incorrecto\\META-INF"));		
		artefacto.agregarManifest();
		
		lanzarTestArtefacto(artefacto, 1, 4, 0, TipoServidor.WAS61, TipoNombreChequeos.CHEQUEOS_DESCRIPTORES);
	}
	
	
	@Test
	public void detectarErrorExistenciaDescriptoresOtrosServidores_WAS61(){
		Artefacto artefacto = crearArtefactoEARVacio("prueba");
		artefacto.agregarAplicacionWeb(crearArtefactoWAR("pruebaWeb").agregarManifest().agregarArchivo("ibm-web-ext.xmi", "WEB-INF"));		
		artefacto.agregarManifest();
		artefacto.agregarArchivo("ibm-web-ext.xmi", "META-INF");
		artefacto.agregarArchivo("jboss-web.xml", "META-INF");
		artefacto.agregarApplicationXML("artefactos/application.xml");
		
		lanzarTestArtefacto(artefacto, 1, 4, 0, TipoServidor.WAS61, TipoNombreChequeos.CHEQUEOS_DESCRIPTORES);
	}
	
	
	@Test
	public void detectarErrorNoExistenciaWebXMLenWAR_WAS61(){
		Artefacto artefacto = crearArtefactoEARVacio("prueba");
		artefacto.agregarAplicacionWeb(crearArtefactoWARSinWebXML("pruebaWeb").agregarManifest().agregarArchivo("ibm-web-ext.xmi", "WEB-INF"));
		artefacto.agregarManifest();
		artefacto.agregarApplicationXML("artefactos/application.xml");
		
		lanzarTestArtefacto(artefacto, 1, 4, 0, TipoServidor.WAS61, TipoNombreChequeos.CHEQUEOS_DESCRIPTORES);
	}
	
	@Test
	public void detectarErrorNoExistenciaIbmWebExtenWAR_WAS61(){
		Artefacto artefacto = crearArtefactoEARVacio("prueba");
		artefacto.agregarAplicacionWeb(crearArtefactoWAR("pruebaWeb").agregarManifest());
		artefacto.agregarManifest();
		artefacto.agregarApplicationXML("artefactos/application.xml");
		
		lanzarTestArtefacto(artefacto, 1, 4, 0, TipoServidor.WAS61, TipoNombreChequeos.CHEQUEOS_DESCRIPTORES);
	}
		
	@Test
	public void detectarCorrectoExistenciaApplicationXML_WAS61(){
		Artefacto artefacto = crearArtefactoEARVacio("prueba");
		artefacto.agregarAplicacionWeb(crearArtefactoWAR("pruebaWeb").agregarManifest().agregarArchivo("ibm-web-ext.xmI", "WEB-INF"));
		artefacto.agregarManifest();
		artefacto.agregarApplicationXML("artefactos/application.xml");
		
		lanzarTestArtefacto(artefacto, 0, 5, 0, TipoServidor.WAS61, TipoNombreChequeos.CHEQUEOS_DESCRIPTORES);
	}
	
	/********************************* FIN TEST WAS 6.1 *****************************/
	/*********************************************************************************/
	
	
	/********************************* TEST WAS 8.5 *****************************/
	/*********************************************************************************/
	
	
	@Test
	public void detectarNOExistenciaBNDenEAR_WAS85(){
		Artefacto artefacto = crearArtefactoEARVacio("prueba");
		artefacto.agregarAplicacionWeb(crearArtefactoWAR("pruebaWeb").agregarManifest().agregarArchivo("kk2-jk.bnd", "WEB-INF"));		
		artefacto.agregarManifest();
		artefacto.agregarArchivo("kk.bnd", "META-INF");
		artefacto.agregarApplicationXML("artefactos/application.xml");
		
		lanzarTestArtefacto(artefacto, 1, 7, 0, TipoServidor.WAS85, TipoNombreChequeos.CHEQUEOS_DESCRIPTORES);
	}
	
	@Test
	public void detectarExistenciaXMIenEAR_WAS85(){
		Artefacto artefacto = crearArtefactoEARVacio("prueba");
		artefacto.agregarAplicacionWeb(crearArtefactoWAR("pruebaWeb").agregarManifest().agregarArchivo("kk.xmi", "WEB-INF"));		
		artefacto.agregarManifest();
		artefacto.agregarArchivo("kk.xmi", "META-INF");
		artefacto.agregarApplicationXML("artefactos/application.xml");
		
		lanzarTestArtefacto(artefacto, 2, 6, 0, TipoServidor.WAS85, TipoNombreChequeos.CHEQUEOS_DESCRIPTORES);
	}
	
	@Test
	public void detectarNoExistenciaXMIenEAR_WAS85(){
		Artefacto artefacto = crearArtefactoEARVacio("prueba");
		artefacto.agregarAplicacionWeb(crearArtefactoWAR("pruebaWeb").agregarManifest().agregarArchivo("xmi.xml", "WEB-INF"));
		artefacto.agregarManifest();
		
		lanzarTestArtefacto(artefacto, 2, 6, 0, TipoServidor.WAS85, TipoNombreChequeos.CHEQUEOS_DESCRIPTORES);
	}
	
	@Test
	public void detectarErrorNoExistenciaApplicationXML_WAS85(){
		Artefacto artefacto = crearArtefactoEARVacio("prueba");
		artefacto.agregarAplicacionWeb(crearArtefactoWAR("pruebaWeb").agregarManifest().agregarArchivo("ibm-web-ext.xml", "WEB-INF"));
		artefacto.agregarManifest();
		
		lanzarTestArtefacto(artefacto, 1, 7, 0, TipoServidor.WAS85, TipoNombreChequeos.CHEQUEOS_DESCRIPTORES);
	}
	
	@Test
	public void detectarErrorExistenciaIncorrectaApplicationXML_WAS85(){
		Artefacto artefacto = crearArtefactoEARVacio("prueba");
		artefacto.agregarAplicacionWeb(crearArtefactoWAR("pruebaWeb").agregarManifest().agregarArchivo("ibm-web-ext.xml", "WEB-INF").agregarArchivo("application.xml", "incorrecto\\META-INF"));		
		artefacto.agregarManifest();
		
		lanzarTestArtefacto(artefacto, 1, 7, 0, TipoServidor.WAS85, TipoNombreChequeos.CHEQUEOS_DESCRIPTORES);
	}
	
	@Test
	public void detectarErrorNoExistenciaMANIFESTenEAR_WAS85(){
		Artefacto artefacto = crearArtefactoEARVacio("prueba");
		artefacto.agregarAplicacionWeb(crearArtefactoWAR("pruebaWeb").agregarManifest().agregarArchivo("ibm-web-ext.xml", "WEB-INF"));
		artefacto.agregarDirectorio("META-INF", null);
		artefacto.agregarApplicationXML("artefactos/application.xml");
		
		lanzarTestArtefacto(artefacto, 1, 7, 0, TipoServidor.WAS85, TipoNombreChequeos.CHEQUEOS_DESCRIPTORES);
	}
	
	@Test
	public void detectarErrorExistenciaDescriptoresOtrosServidores_WAS85(){
		Artefacto artefacto = crearArtefactoEARVacio("prueba");
		artefacto.agregarAplicacionWeb(crearArtefactoWAR("pruebaWeb").agregarManifest().agregarArchivo("ibm-web-ext.xml", "WEB-INF"));		
		artefacto.agregarManifest();
		artefacto.agregarArchivo("ibm-web-ext.xmi", "META-INF");
		artefacto.agregarArchivo("jboss-web.xml", "META-INF");
		artefacto.agregarApplicationXML("artefactos/application.xml");
		
		lanzarTestArtefacto(artefacto, 2, 6, 0, TipoServidor.WAS85, TipoNombreChequeos.CHEQUEOS_DESCRIPTORES);
	}
	
	
	@Test
	public void detectarErrorNoExistenciaMANIFESTenWAR_WAS85(){
		Artefacto artefacto = crearArtefactoEARVacio("prueba");
		artefacto.agregarAplicacionWeb(crearArtefactoWAR("pruebaWeb").agregarArchivo("ibm-web-ext.xml", "WEB-INF"));
		artefacto.agregarManifest();
		artefacto.agregarApplicationXML("artefactos/application.xml");
		
		lanzarTestArtefacto(artefacto, 1, 7, 0, TipoServidor.WAS85, TipoNombreChequeos.CHEQUEOS_DESCRIPTORES);
	}
	
	@Test
	public void detectarErrorNoExistenciaWebXMLenWAR_WAS85(){
		Artefacto artefacto = crearArtefactoEARVacio("prueba");
		artefacto.agregarAplicacionWeb(crearArtefactoWARSinWebXML("pruebaWeb").agregarManifest().agregarArchivo("ibm-web-ext.xml", "WEB-INF"));
		artefacto.agregarManifest();
		artefacto.agregarApplicationXML("artefactos/application.xml");
		
		lanzarTestArtefacto(artefacto, 1, 7, 0, TipoServidor.WAS85, TipoNombreChequeos.CHEQUEOS_DESCRIPTORES);
	}
	
	@Test
	public void detectarErrorNoExistenciaIbmWebExtenWAR_WAS85(){
		Artefacto artefacto = crearArtefactoEARVacio("prueba");
		artefacto.agregarAplicacionWeb(crearArtefactoWAR("pruebaWeb").agregarManifest());
		artefacto.agregarManifest();
		artefacto.agregarApplicationXML("artefactos/application.xml");
		
		lanzarTestArtefacto(artefacto, 1, 7, 0, TipoServidor.WAS85, TipoNombreChequeos.CHEQUEOS_DESCRIPTORES);
	}
		
	@Test
	public void detectarCorrectoExistenciaApplicationXML_WAS85(){
		Artefacto artefacto = crearArtefactoEARVacio("prueba");
		artefacto.agregarAplicacionWeb(crearArtefactoWAR("pruebaWeb").agregarManifest().agregarArchivo("ibm-web-ext.xml", "WEB-INF"));
		artefacto.agregarManifest();
		artefacto.agregarApplicationXML("artefactos/application.xml");
		
		lanzarTestArtefacto(artefacto, 0, 8, 0, TipoServidor.WAS85, TipoNombreChequeos.CHEQUEOS_DESCRIPTORES);
	}
	
	/********************************* FIN TEST WAS 8.5 *****************************/
	/*********************************************************************************/
	
	/********************************* TEST JBOSS *****************************/
	/*********************************************************************************/

	@Test
	public void detectarNOExistenciaBNDenEAR_JBOSS(){
		Artefacto artefacto = crearArtefactoEARVacio("prueba");
		artefacto.agregarAplicacionWeb(crearArtefactoWAR("pruebaWeb").agregarManifest().agregarArchivo("kk.bnd", "WEB-INF"));		
		artefacto.agregarManifest();
		artefacto.agregarArchivo("kk.bnd", "META-INF");
		artefacto.agregarApplicationXML("artefactos/application.xml");
		
		lanzarTestArtefacto(artefacto, 0, 6, 0, TipoServidor.JBOSS, TipoNombreChequeos.CHEQUEOS_DESCRIPTORES);
	}
	
	
	@Test
	public void detectarErrorNoExistenciaApplicationXML_JBOSS(){
		Artefacto artefacto = crearArtefactoEARVacio("prueba");
		artefacto.agregarAplicacionWeb(crearArtefactoWAR("pruebaWeb").agregarManifest());
		artefacto.agregarManifest();
		
		lanzarTestArtefacto(artefacto, 1, 5, 0, TipoServidor.JBOSS, TipoNombreChequeos.CHEQUEOS_DESCRIPTORES);
	}
	
	@Test
	public void detectarErrorExistenciaIncorrectaApplicationXML_JBOSS(){
		Artefacto artefacto = crearArtefactoEARVacio("prueba");
		artefacto.agregarAplicacionWeb(crearArtefactoWAR("pruebaWeb").agregarManifest().agregarArchivo("application.xml", "incorrecto\\META-INF"));		
		artefacto.agregarManifest();
		
		lanzarTestArtefacto(artefacto, 1, 5, 0, TipoServidor.JBOSS, TipoNombreChequeos.CHEQUEOS_DESCRIPTORES);
	}
	
	@Test
	public void detectarErrorNoExistenciaMANIFESTenEAR_JBOSS(){
		Artefacto artefacto = crearArtefactoEARVacio("prueba");
		artefacto.agregarAplicacionWeb(crearArtefactoWAR("pruebaWeb").agregarManifest());
		artefacto.agregarDirectorio("META-INF", null);
		artefacto.agregarApplicationXML("artefactos/application.xml");
		
		lanzarTestArtefacto(artefacto, 1, 5, 0, TipoServidor.JBOSS, TipoNombreChequeos.CHEQUEOS_DESCRIPTORES);
	}
	
	@Test
	public void detectarErrorExistenciaDescriptoresOtrosServidores_JBOSS(){
		Artefacto artefacto = crearArtefactoEARVacio("prueba");
		artefacto.agregarAplicacionWeb(crearArtefactoWAR("pruebaWeb").agregarManifest().agregarArchivo("ibm-web-ext.xml", "WEB-INF"));		
		artefacto.agregarManifest();
		artefacto.agregarArchivo("ibm-web-ext.xmi", "META-INF");
		artefacto.agregarArchivo("ibm-web-ext.xml", "META-INF");
		artefacto.agregarApplicationXML("artefactos/application.xml");
		
		lanzarTestArtefacto(artefacto, 1, 5, 0, TipoServidor.JBOSS, TipoNombreChequeos.CHEQUEOS_DESCRIPTORES);
	}
	
	
	@Test
	public void detectarErrorNoExistenciaMANIFESTenWAR_JBOSS(){
		Artefacto artefacto = crearArtefactoEARVacio("prueba");
		artefacto.agregarAplicacionWeb(crearArtefactoWAR("pruebaWeb"));
		artefacto.agregarManifest();
		artefacto.agregarApplicationXML("artefactos/application.xml");
		
		lanzarTestArtefacto(artefacto, 1, 5, 0, TipoServidor.JBOSS, TipoNombreChequeos.CHEQUEOS_DESCRIPTORES);
	}
	
	@Test
	public void detectarErrorNoExistenciaWebXMLenWAR_JBOSS(){
		Artefacto artefacto = crearArtefactoEARVacio("prueba");
		artefacto.agregarAplicacionWeb(crearArtefactoWARSinWebXML("pruebaWeb").agregarManifest());
		artefacto.agregarManifest();
		artefacto.agregarApplicationXML("artefactos/application.xml");
		
		lanzarTestArtefacto(artefacto, 1, 5, 0, TipoServidor.JBOSS, TipoNombreChequeos.CHEQUEOS_DESCRIPTORES);
	}
	
			
	@Test
	public void detectarCorrectoExistenciaApplicationXML_JBOSS(){
		Artefacto artefacto = crearArtefactoEARVacio("prueba");
		artefacto.agregarAplicacionWeb(crearArtefactoWAR("pruebaWeb").agregarManifest());
		artefacto.agregarManifest();
		artefacto.agregarApplicationXML("artefactos/application.xml");
		
		lanzarTestArtefacto(artefacto, 0, 6, 0, TipoServidor.JBOSS, TipoNombreChequeos.CHEQUEOS_DESCRIPTORES);
	}
	
	/*********************************FIN TEST JBOSS *****************************/
	/*********************************************************************************/
	


}
