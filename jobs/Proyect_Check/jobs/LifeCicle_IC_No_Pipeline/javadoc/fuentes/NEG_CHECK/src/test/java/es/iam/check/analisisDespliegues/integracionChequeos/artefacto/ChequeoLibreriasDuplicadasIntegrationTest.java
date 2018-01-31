package es.iam.check.analisisDespliegues.integracionChequeos.artefacto;

import java.io.IOException;

import org.junit.Test;

import es.iam.check.analisisDespliegues.business.chequeos.model.TipoNombreChequeos;
import es.iam.check.analisisDespliegues.business.configuracion.TipoServidor;
import es.iam.check.analisisDespliegues.integracionChequeos.Artefacto;
import es.iam.check.analisisDespliegues.integracionChequeos.ChequeosIntegrationTest;

/**
 * @author SSA005
 */
public class ChequeoLibreriasDuplicadasIntegrationTest extends ChequeosIntegrationTest{
	
	/**
	 * @throws IOException 
	 * 
	 */
	@Test
	public void detectarErrorLibreriaDuplicada_WAS85(){
		Artefacto jar = crearArtefactoJAR("hibernate-core-3.6.8-Final");
		jar.agregarManifest("artefactos/MANIFEST.MF-Hibernate-3.6.8.Final");
		Artefacto warArtefacto = crearArtefactoWAR("pruebaWar");
		warArtefacto.agregarLibreria(jar, null);
		Artefacto earArtefacto = crearArtefactoEAR("prueba");
		earArtefacto.agregarLibreria(jar, null);
		earArtefacto.agregarAplicacionWeb(warArtefacto);
		
		lanzarTestArtefacto(earArtefacto, 1, 0, 0, TipoServidor.WAS85,TipoNombreChequeos.CHEQUEO_LIBRERIAS_DUPLICADAS);

	}
	
	/**
	 * @throws IOException 
	 * 
	 */
	@Test
	public void detectarErrorLibreriaDuplicadaDistintoNombre_WAS85(){
		Artefacto jar = crearArtefactoJAR("hibernate-core-3.6.8-Final");
		jar.agregarManifest("artefactos/MANIFEST.MF-Hibernate-3.6.8.Final");
		
		Artefacto jarDuplicado = crearArtefactoJAR("hibernate-core");
		jarDuplicado.agregarManifest("artefactos/MANIFEST.MF-Hibernate-3.6.8.Final");
		Artefacto warArtefacto = crearArtefactoWAR("pruebaWar");
		warArtefacto.agregarLibreria(jarDuplicado, null);
		Artefacto earArtefacto = crearArtefactoEAR("prueba");
		earArtefacto.agregarLibreria(jar, null);
		earArtefacto.agregarAplicacionWeb(warArtefacto);
		
		lanzarTestArtefacto(earArtefacto, 1, 0, 0, TipoServidor.WAS85,TipoNombreChequeos.CHEQUEO_LIBRERIAS_DUPLICADAS);

	}
	
	/**
	 * @throws IOException 
	 * 
	 */
	@Test
	public void detectarCorrectoSinLibreriaDuplicada_WAS85(){
		Artefacto jar = crearArtefactoJAR("hibernate-core");
		jar.agregarManifest("artefactos/MANIFEST.MF-Hibernate-3.7.1");	
		Artefacto jarNoDuplicado = crearArtefactoJAR("hibernate-core");
		jarNoDuplicado.agregarManifest("artefactos/MANIFEST.MF-Hibernate-3.6.8.Final");
		Artefacto warArtefacto = crearArtefactoWAR("pruebaWar");
		warArtefacto.agregarLibreria(jarNoDuplicado, null);
		Artefacto earArtefacto = crearArtefactoEAR("prueba");
		earArtefacto.agregarLibreria(jar, null);
		earArtefacto.agregarAplicacionWeb(warArtefacto);
		
		lanzarTestArtefacto(earArtefacto, 0, 1, 0, TipoServidor.WAS85,TipoNombreChequeos.CHEQUEO_LIBRERIAS_DUPLICADAS);

	}
	
	@Test
	public void detectarErrorLibreriaDuplicada_WAS61(){
		Artefacto jar = crearArtefactoJAR("hibernate-core-3.6.8-Final");
		jar.agregarManifest("artefactos/MANIFEST.MF-Hibernate-3.6.8.Final");
		Artefacto warArtefacto = crearArtefactoWAR("pruebaWar");
		warArtefacto.agregarLibreria(jar, null);
		Artefacto earArtefacto = crearArtefactoEAR("prueba");
		earArtefacto.agregarLibreria(jar, null);
		earArtefacto.agregarAplicacionWeb(warArtefacto);
		
		lanzarTestArtefacto(earArtefacto, 1, 0, 0, TipoServidor.WAS61,TipoNombreChequeos.CHEQUEO_LIBRERIAS_DUPLICADAS);

	}
	
	/**
	 * @throws IOException 
	 * 
	 */
	@Test
	public void detectarErrorLibreriaDuplicadaDistintoNombre_WAS61(){
		Artefacto jar = crearArtefactoJAR("hibernate-core-3.6.8-Final");
		jar.agregarManifest("artefactos/MANIFEST.MF-Hibernate-3.6.8.Final");
		
		Artefacto jarDuplicado = crearArtefactoJAR("hibernate-core");
		jarDuplicado.agregarManifest("artefactos/MANIFEST.MF-Hibernate-3.6.8.Final");
		Artefacto warArtefacto = crearArtefactoWAR("pruebaWar");
		warArtefacto.agregarLibreria(jarDuplicado, null);
		Artefacto earArtefacto = crearArtefactoEAR("prueba");
		earArtefacto.agregarLibreria(jar, null);
		earArtefacto.agregarAplicacionWeb(warArtefacto);
		
		lanzarTestArtefacto(earArtefacto, 1, 0, 0, TipoServidor.WAS61,TipoNombreChequeos.CHEQUEO_LIBRERIAS_DUPLICADAS);

	}
	
	/**
	 * @throws IOException 
	 * 
	 */
	@Test
	public void detectarCorrectoSinLibreriaDuplicada_WAS61(){
		Artefacto jar = crearArtefactoJAR("hibernate-core");
		jar.agregarManifest("artefactos/MANIFEST.MF-Hibernate-3.7.1");	
		Artefacto jarNoDuplicado = crearArtefactoJAR("hibernate-core");
		jarNoDuplicado.agregarManifest("artefactos/MANIFEST.MF-Hibernate-3.6.8.Final");
		Artefacto warArtefacto = crearArtefactoWAR("pruebaWar");
		warArtefacto.agregarLibreria(jarNoDuplicado, null);
		Artefacto earArtefacto = crearArtefactoEAR("prueba");
		earArtefacto.agregarLibreria(jar, null);
		earArtefacto.agregarAplicacionWeb(warArtefacto);
		
		lanzarTestArtefacto(earArtefacto, 0, 1, 0, TipoServidor.WAS61,TipoNombreChequeos.CHEQUEO_LIBRERIAS_DUPLICADAS);

	}
	
	@Test
	public void detectarErrorLibreriaDuplicada_JBOSS(){
		Artefacto jar = crearArtefactoJAR("hibernate-core-3.6.8-Final");
		jar.agregarManifest("artefactos/MANIFEST.MF-Hibernate-3.6.8.Final");
		Artefacto warArtefacto = crearArtefactoWAR("pruebaWar");
		warArtefacto.agregarLibreria(jar, null);
		Artefacto earArtefacto = crearArtefactoEAR("prueba");
		earArtefacto.agregarLibreria(jar, null);
		earArtefacto.agregarAplicacionWeb(warArtefacto);
		
		lanzarTestArtefacto(earArtefacto, 1, 0, 0, TipoServidor.JBOSS,TipoNombreChequeos.CHEQUEO_LIBRERIAS_DUPLICADAS);

	}
	
	/**
	 * @throws IOException 
	 * 
	 */
	@Test
	public void detectarErrorLibreriaDuplicadaDistintoNombre_JBOSS(){
		Artefacto jar = crearArtefactoJAR("hibernate-core-3.6.8-Final");
		jar.agregarManifest("artefactos/MANIFEST.MF-Hibernate-3.6.8.Final");
		
		Artefacto jarDuplicado = crearArtefactoJAR("hibernate-core");
		jarDuplicado.agregarManifest("artefactos/MANIFEST.MF-Hibernate-3.6.8.Final");
		Artefacto warArtefacto = crearArtefactoWAR("pruebaWar");
		warArtefacto.agregarLibreria(jarDuplicado, null);
		Artefacto earArtefacto = crearArtefactoEAR("prueba");
		earArtefacto.agregarLibreria(jar, null);
		earArtefacto.agregarAplicacionWeb(warArtefacto);
		
		lanzarTestArtefacto(earArtefacto, 1, 0, 0, TipoServidor.JBOSS,TipoNombreChequeos.CHEQUEO_LIBRERIAS_DUPLICADAS);

	}
	
	/**
	 * @throws IOException 
	 * 
	 */
	@Test
	public void detectarCorrectoSinLibreriaDuplicada_JBOSS(){
		Artefacto jar = crearArtefactoJAR("hibernate-core");
		jar.agregarManifest("artefactos/MANIFEST.MF-Hibernate-3.7.1");	
		Artefacto jarNoDuplicado = crearArtefactoJAR("hibernate-core");
		jarNoDuplicado.agregarManifest("artefactos/MANIFEST.MF-Hibernate-3.6.8.Final");
		Artefacto warArtefacto = crearArtefactoWAR("pruebaWar");
		warArtefacto.agregarLibreria(jarNoDuplicado, null);
		Artefacto earArtefacto = crearArtefactoEAR("prueba");
		earArtefacto.agregarLibreria(jar, null);
		earArtefacto.agregarAplicacionWeb(warArtefacto);
		
		lanzarTestArtefacto(earArtefacto, 0, 1, 0, TipoServidor.JBOSS,TipoNombreChequeos.CHEQUEO_LIBRERIAS_DUPLICADAS);

	}

}
