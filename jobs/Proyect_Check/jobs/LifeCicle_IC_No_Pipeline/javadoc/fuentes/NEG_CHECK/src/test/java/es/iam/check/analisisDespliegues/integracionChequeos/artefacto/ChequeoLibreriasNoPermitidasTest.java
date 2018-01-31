package es.iam.check.analisisDespliegues.integracionChequeos.artefacto;

import java.io.IOException;

import org.junit.Test;

import es.iam.check.analisisDespliegues.business.chequeos.model.TipoNombreChequeos;
import es.iam.check.analisisDespliegues.business.configuracion.TipoServidor;
import es.iam.check.analisisDespliegues.integracionChequeos.Artefacto;
import es.iam.check.analisisDespliegues.integracionChequeos.ChequeosIntegrationTest;



/**
 * @author SSA005
 * @author AHT005
 */
public class ChequeoLibreriasNoPermitidasTest extends ChequeosIntegrationTest{

	/**
	 * @throws IOException 
	 * 
	 */

	
	/********************************* TEST WAS 6.1 *****************************/
	/*********************************************************************************/
	
	@Test
	public void nodetectarCorrectoNoExistenciaArchivoEJB_WAS61(){
		Artefacto artefacto = crearArtefactoEAR("prueba");
		lanzarTestArtefacto(artefacto, 0, 1, 0, TipoServidor.WAS61, TipoNombreChequeos.CHEQUEO_LIBRERIAS_NO_PERMITIDAS);
	}
	
	@Test	
	public void NOdetectarAvisoExistenciaArchivoSTRUTS2_WAS61(){
		Artefacto jar0 = crearArtefactoJAR("-core");
		Artefacto artefacto = crearArtefactoEAR("ej_ear").agregarLibreria(jar0, "lib");
		lanzarTestArtefacto(artefacto, 0, 1, 0, TipoServidor.WAS61, TipoNombreChequeos.CHEQUEO_LIBRERIAS_NO_PERMITIDAS);
	}
	
	@Test	
	public void detectarAvisoExistenciaArchivoSTRUTS2_WAS61(){
		Artefacto jar0 = crearArtefactoJAR("struts2-core-2.0.6");
		Artefacto artefacto = crearArtefactoEAR("ej_ear").agregarLibreria(jar0, "lib");
		lanzarTestArtefacto(artefacto, 1, 0, 0, TipoServidor.WAS61, TipoNombreChequeos.CHEQUEO_LIBRERIAS_NO_PERMITIDAS);
	}
	
	@Test	
	public void detectarAvisoExistenciaArchivoSTRUTS2B_WAS61(){
		Artefacto jar0 = crearArtefactoJAR("struts2-core-2.3");
		Artefacto artefacto = crearArtefactoEAR("ej_ear").agregarLibreria(jar0, "lib");
		lanzarTestArtefacto(artefacto, 0, 1, 0, TipoServidor.WAS61, TipoNombreChequeos.CHEQUEO_LIBRERIAS_NO_PERMITIDAS);
	}
	/********************************* FIN TEST WAS 6.1 *****************************/
	/*********************************************************************************/
	
	
	
		/********************************* TEST WAS 8.5 *****************************/
		/*********************************************************************************/
	
	@Test
	public void NOdetectarAvisoExistenciaArchivoEJB_WAS85(){
		Artefacto jar = crearArtefactoJAR("ejb3");
		Artefacto artefacto = crearArtefactoEAR("prueba").agregarLibreria(jar, "lib");
		lanzarTestArtefacto(artefacto, 0,1, 0, TipoServidor.WAS85, TipoNombreChequeos.CHEQUEO_LIBRERIAS_NO_PERMITIDAS);
	}
	
	@Test	
	public void NOdetectarAvisoExistenciaArchivoSTRUTS2_WAS85(){
		Artefacto jar0 = crearArtefactoJAR("-core");
		Artefacto artefacto = crearArtefactoEAR("ej_ear").agregarLibreria(jar0, "lib");
		lanzarTestArtefacto(artefacto, 0, 1, 0, TipoServidor.WAS85, TipoNombreChequeos.CHEQUEO_LIBRERIAS_NO_PERMITIDAS);
	}
	
	@Test	
	public void detectarAvisoExistenciaArchivoSTRUTS2_WAS85(){
		Artefacto jar0 = crearArtefactoJAR("struts2-core-2.0.6");
		Artefacto artefacto = crearArtefactoEAR("ej_ear").agregarLibreria(jar0, "lib");
		lanzarTestArtefacto(artefacto, 1, 0, 0, TipoServidor.WAS85, TipoNombreChequeos.CHEQUEO_LIBRERIAS_NO_PERMITIDAS);
	}
	
	@Test	
	public void detectarAvisoExistenciaArchivoSTRUTS2B_WAS85(){
		Artefacto jar0 = crearArtefactoJAR("struts2-core-2.3");
		Artefacto artefacto = crearArtefactoEAR("ej_ear").agregarLibreria(jar0, "lib");
		lanzarTestArtefacto(artefacto, 1, 0, 0, TipoServidor.WAS85, TipoNombreChequeos.CHEQUEO_LIBRERIAS_NO_PERMITIDAS);
	}
	
	/********************************* FIN TEST WAS 8.5 *****************************/
	/*********************************************************************************/
	
	/********************************* TEST JBOSS *****************************/
	/*********************************************************************************/
	
	@Test
	public void NOdetectarAvisoExistenciaArchivoEJB_JBOSS(){
		Artefacto jar = crearArtefactoJAR("ejb3");
		Artefacto artefacto = crearArtefactoEAR("prueba").agregarLibreria(jar, "lib");
		lanzarTestArtefacto(artefacto, 0,1, 0, TipoServidor.JBOSS, TipoNombreChequeos.CHEQUEO_LIBRERIAS_NO_PERMITIDAS);
	}
	
	@Test	
	public void NOdetectarAvisoExistenciaArchivoSTRUTS2_JBOSS(){
		Artefacto jar0 = crearArtefactoJAR("-core");
		Artefacto artefacto = crearArtefactoEAR("ej_ear").agregarLibreria(jar0, "lib");
		lanzarTestArtefacto(artefacto, 0, 1, 0, TipoServidor.JBOSS, TipoNombreChequeos.CHEQUEO_LIBRERIAS_NO_PERMITIDAS);
	}
	
	@Test	
	public void detectarAvisoExistenciaArchivoSTRUTS2_JBOSS(){
		Artefacto jar0 = crearArtefactoJAR("struts2-core-2.0.6");
		Artefacto artefacto = crearArtefactoEAR("ej_ear").agregarLibreria(jar0, "lib");
		lanzarTestArtefacto(artefacto, 1, 0, 0, TipoServidor.JBOSS, TipoNombreChequeos.CHEQUEO_LIBRERIAS_NO_PERMITIDAS);
	}
	
	@Test	
	public void detectarAvisoExistenciaArchivoSTRUTS2B_JBOSS(){
		Artefacto jar0 = crearArtefactoJAR("struts2-core-2.3");
		Artefacto artefacto = crearArtefactoEAR("ej_ear").agregarLibreria(jar0, "lib");
		lanzarTestArtefacto(artefacto, 1, 0, 0, TipoServidor.JBOSS, TipoNombreChequeos.CHEQUEO_LIBRERIAS_NO_PERMITIDAS);
	}
	
	
	/********************************* FIN TEST JBOSS *****************************/
	/*********************************************************************************/
	
	
	/**
	 * @throws IOException 
	 * 
	 */
	
	
	

	
}
