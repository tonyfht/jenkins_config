package es.iam.check.analisisDespliegues.integracionChequeos.artefacto;

import org.junit.Test;


import es.iam.check.analisisDespliegues.business.chequeos.model.TipoNombreChequeos;
import es.iam.check.analisisDespliegues.business.configuracion.TipoServidor;
import es.iam.check.analisisDespliegues.integracionChequeos.Artefacto;
import es.iam.check.analisisDespliegues.integracionChequeos.ChequeosIntegrationTest;


/**
 * 
 * @author SSA005
 * @author ARD021
 * 
 */
public class ChequeoEstructuraIntegrationTest extends ChequeosIntegrationTest{
	
	@Test
	public void detectarErrorNoExistenciaMETAINFenEAR_WAS85(){
		Artefacto artefacto = crearArtefactoEARVacio("prueba");
		artefacto.agregarAplicacionWeb(crearArtefactoWAR("pruebaWeb").agregarManifest());
		
		lanzarTestArtefacto(artefacto, 1, 3, 0, TipoServidor.WAS85, TipoNombreChequeos.CHEQUEOS_ESTRUCTURA);
	}
	
	@Test
	public void detectarErrorExistenciaIncorrectaMETAINFenEAR_WAS85(){
		Artefacto artefacto = crearArtefactoEARVacio("prueba");
		artefacto.agregarDirectorio("carpetaIncorrecta", null);
		artefacto.agregarDirectorio("META-INF", "carpetaIncorrecta");
		artefacto.agregarAplicacionWeb(crearArtefactoWAR("pruebaWeb").agregarManifest());
		
		lanzarTestArtefacto(artefacto, 1, 3, 0, TipoServidor.WAS85, TipoNombreChequeos.CHEQUEOS_ESTRUCTURA);
	}
	
	@Test
	public void detectarErrorNoExistenciaWEBINFLib_WAS85(){
		Artefacto artefactoWAR = crearArtefactoWARVacio("pruebaWeb");
		artefactoWAR.agregarDirectorio("classes", "WEB-INF");
		artefactoWAR.agregarManifest();
		Artefacto artefactoEAR = crearArtefactoEARVacio("prueba");
		artefactoEAR.agregarManifest();
		artefactoEAR.agregarAplicacionWeb(artefactoWAR);
		//artefactoWAR.agregarWebXML("artefactos/web.xml");
		//artefactoWAR.agregarArchivo("ibm-web-ext.xmi", null);
		//artefactoEAR.agregarApplicationXML("artefactos/application.xml");
		
		lanzarTestArtefacto(artefactoEAR, 1, 3, 0, TipoServidor.WAS85, TipoNombreChequeos.CHEQUEOS_ESTRUCTURA);
	}
	
	@Test
	public void detectarErrorNoExistenciaWEBINFClasses_WAS85(){
		Artefacto artefactoWAR = crearArtefactoWARVacio("pruebaWeb");
		artefactoWAR.agregarDirectorio("lib", "WEB-INF");
		artefactoWAR.agregarManifest();
		Artefacto artefactoEAR = crearArtefactoEARVacio("prueba");
		artefactoEAR.agregarAplicacionWeb(artefactoWAR);
		artefactoEAR.agregarManifest();
		//artefactoWAR.agregarWebXML("artefactos/web.xml");
		//artefactoWAR.agregarArchivo("ibm-web-ext.xmi", null);		
		//artefactoEAR.agregarApplicationXML("artefactos/application.xml");
		
		lanzarTestArtefacto(artefactoEAR, 1, 3, 0, TipoServidor.WAS85, TipoNombreChequeos.CHEQUEOS_ESTRUCTURA);
	}
	
	@Test
	public void detectarErrorExistenciaMETAINFIbmconfig_WAS85(){
		Artefacto artefactoEAR = crearArtefactoEAR("prueba");
		artefactoEAR.agregarDirectorio("ibmconfig", "META-INF");
		
		lanzarTestArtefacto(artefactoEAR, 1, 3, 0, TipoServidor.WAS85, TipoNombreChequeos.CHEQUEOS_ESTRUCTURA);
	}
	
	
	@Test
	public void estructuraOK_WAS85(){
		Artefacto artefactoWAR = crearArtefactoWARVacio("pruebaWeb");
		artefactoWAR.agregarDirectorio("lib", "WEB-INF");
		artefactoWAR.agregarDirectorio("classes", "WEB-INF");
		artefactoWAR.agregarManifest();
		Artefacto artefactoEAR = crearArtefactoEARVacio("prueba");	
		artefactoEAR.agregarAplicacionWeb(artefactoWAR);
		artefactoEAR.agregarManifest();
		
		lanzarTestArtefacto(artefactoEAR, 0, 4, 0, TipoServidor.WAS85, TipoNombreChequeos.CHEQUEOS_ESTRUCTURA);
	}
	
	@Test
	public void detectarErrorNoExistenciaMETAINFenEAR_JBOSS(){
		Artefacto artefacto = crearArtefactoEARVacio("prueba");
		artefacto.agregarAplicacionWeb(crearArtefactoWAR("pruebaWeb").agregarManifest());
		
		lanzarTestArtefacto(artefacto, 1, 3, 0, TipoServidor.JBOSS, TipoNombreChequeos.CHEQUEOS_ESTRUCTURA);
	}
	
	@Test
	public void detectarErrorExistenciaIncorrectaMETAINFenEAR_JBOSS(){
		Artefacto artefacto = crearArtefactoEARVacio("prueba");
		artefacto.agregarDirectorio("carpetaIncorrecta", null);
		artefacto.agregarDirectorio("META-INF", "carpetaIncorrecta");
		artefacto.agregarAplicacionWeb(crearArtefactoWAR("pruebaWeb").agregarManifest());
		
		lanzarTestArtefacto(artefacto, 1, 3, 0, TipoServidor.JBOSS, TipoNombreChequeos.CHEQUEOS_ESTRUCTURA);
	}
	
	@Test
	public void detectarErrorNoExistenciaWEBINFLib_JBOSS(){
		Artefacto artefactoWAR = crearArtefactoWARVacio("pruebaWeb");
		artefactoWAR.agregarDirectorio("classes", "WEB-INF");
		artefactoWAR.agregarManifest();
		Artefacto artefactoEAR = crearArtefactoEARVacio("prueba");
		artefactoEAR.agregarManifest();
		artefactoEAR.agregarAplicacionWeb(artefactoWAR);
		//artefactoWAR.agregarWebXML("artefactos/web.xml");
		//artefactoWAR.agregarArchivo("ibm-web-ext.xmi", null);
		//artefactoEAR.agregarApplicationXML("artefactos/application.xml");
		
		lanzarTestArtefacto(artefactoEAR, 1, 3, 0, TipoServidor.JBOSS, TipoNombreChequeos.CHEQUEOS_ESTRUCTURA);
	}
	
	@Test
	public void detectarErrorNoExistenciaWEBINFClasses_JBOSS(){
		Artefacto artefactoWAR = crearArtefactoWARVacio("pruebaWeb");
		artefactoWAR.agregarDirectorio("lib", "WEB-INF");
		artefactoWAR.agregarManifest();
		Artefacto artefactoEAR = crearArtefactoEARVacio("prueba");
		artefactoEAR.agregarAplicacionWeb(artefactoWAR);
		artefactoEAR.agregarManifest();
		//artefactoWAR.agregarWebXML("artefactos/web.xml");
		//artefactoWAR.agregarArchivo("ibm-web-ext.xmi", null);		
		//artefactoEAR.agregarApplicationXML("artefactos/application.xml");
		
		lanzarTestArtefacto(artefactoEAR, 1, 3, 0, TipoServidor.JBOSS, TipoNombreChequeos.CHEQUEOS_ESTRUCTURA);
	}
	
	@Test
	public void detectarErrorExistenciaMETAINFIbmconfig_JBOSS(){
		Artefacto artefactoEAR = crearArtefactoEAR("prueba");
		artefactoEAR.agregarDirectorio("ibmconfig", "META-INF");
		
		lanzarTestArtefacto(artefactoEAR, 1, 3, 0, TipoServidor.JBOSS, TipoNombreChequeos.CHEQUEOS_ESTRUCTURA);
	}
	
	
	@Test
	public void estructuraOK_JBOSS(){
		Artefacto artefactoWAR = crearArtefactoWARVacio("pruebaWeb");
		artefactoWAR.agregarDirectorio("lib", "WEB-INF");
		artefactoWAR.agregarDirectorio("classes", "WEB-INF");
		artefactoWAR.agregarManifest();
		Artefacto artefactoEAR = crearArtefactoEARVacio("prueba");	
		artefactoEAR.agregarAplicacionWeb(artefactoWAR);
		artefactoEAR.agregarManifest();
		
		lanzarTestArtefacto(artefactoEAR, 0, 4, 0, TipoServidor.JBOSS, TipoNombreChequeos.CHEQUEOS_ESTRUCTURA);
	}
	
	@Test
	public void detectarErrorNoExistenciaMETAINFenEAR_WAS61(){
		Artefacto artefacto = crearArtefactoEARVacio("prueba");
		artefacto.agregarAplicacionWeb(crearArtefactoWAR("pruebaWeb").agregarManifest());
		
		lanzarTestArtefacto(artefacto, 1, 2, 0, TipoServidor.WAS61, TipoNombreChequeos.CHEQUEOS_ESTRUCTURA);
	}
	
	@Test
	public void detectarErrorExistenciaIncorrectaMETAINFenEAR_WAS61(){
		Artefacto artefacto = crearArtefactoEARVacio("prueba");
		artefacto.agregarDirectorio("carpetaIncorrecta", null);
		artefacto.agregarDirectorio("META-INF", "carpetaIncorrecta");
		artefacto.agregarAplicacionWeb(crearArtefactoWAR("pruebaWeb").agregarManifest());
		
		lanzarTestArtefacto(artefacto, 1, 2, 0, TipoServidor.WAS61, TipoNombreChequeos.CHEQUEOS_ESTRUCTURA);
	}
	
	@Test
	public void detectarErrorNoExistenciaWEBINFLib_WAS61(){
		Artefacto artefactoWAR = crearArtefactoWARVacio("pruebaWeb");
		artefactoWAR.agregarDirectorio("classes", "WEB-INF");
		artefactoWAR.agregarManifest();
		Artefacto artefactoEAR = crearArtefactoEARVacio("prueba");
		artefactoEAR.agregarManifest();
		artefactoEAR.agregarAplicacionWeb(artefactoWAR);
		//artefactoWAR.agregarWebXML("artefactos/web.xml");
		//artefactoWAR.agregarArchivo("ibm-web-ext.xmi", null);
		//artefactoEAR.agregarApplicationXML("artefactos/application.xml");
		
		lanzarTestArtefacto(artefactoEAR, 1, 2, 0, TipoServidor.WAS61, TipoNombreChequeos.CHEQUEOS_ESTRUCTURA);
	}
	
	@Test
	public void detectarErrorNoExistenciaWEBINFClasses_WAS61(){
		Artefacto artefactoWAR = crearArtefactoWARVacio("pruebaWeb");
		artefactoWAR.agregarDirectorio("lib", "WEB-INF");
		artefactoWAR.agregarManifest();
		Artefacto artefactoEAR = crearArtefactoEARVacio("prueba");
		artefactoEAR.agregarAplicacionWeb(artefactoWAR);
		artefactoEAR.agregarManifest();
		//artefactoWAR.agregarWebXML("artefactos/web.xml");
		//artefactoWAR.agregarArchivo("ibm-web-ext.xmi", null);		
		//artefactoEAR.agregarApplicationXML("artefactos/application.xml");
		
		lanzarTestArtefacto(artefactoEAR, 1, 2, 0, TipoServidor.WAS61, TipoNombreChequeos.CHEQUEOS_ESTRUCTURA);
	}
	
	@Test
	public void detectarErrorExistenciaMETAINFIbmconfig_WAS61(){
		Artefacto artefactoEAR = crearArtefactoEAR("prueba");
		artefactoEAR.agregarDirectorio("ibmconfig", "META-INF");
		
		lanzarTestArtefacto(artefactoEAR, 1, 2, 0, TipoServidor.WAS61, TipoNombreChequeos.CHEQUEOS_ESTRUCTURA);
	}
	
	
	@Test
	public void estructuraOK_WAS61(){
		Artefacto artefactoWAR = crearArtefactoWARVacio("pruebaWeb");
		artefactoWAR.agregarDirectorio("lib", "WEB-INF");
		artefactoWAR.agregarDirectorio("classes", "WEB-INF");
		artefactoWAR.agregarManifest();
		Artefacto artefactoEAR = crearArtefactoEARVacio("prueba");	
		artefactoEAR.agregarAplicacionWeb(artefactoWAR);
		artefactoEAR.agregarManifest();
		
		lanzarTestArtefacto(artefactoEAR, 0, 3, 0, TipoServidor.WAS61, TipoNombreChequeos.CHEQUEOS_ESTRUCTURA);
	}


	
	
}
