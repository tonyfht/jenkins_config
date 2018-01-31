package es.iam.check.analisisDespliegues.integracionChequeos.propiedades;

import org.junit.Test;

import es.iam.check.analisisDespliegues.business.configuracion.TipoServidor;
import es.iam.check.analisisDespliegues.integracionChequeos.Artefacto;
import es.iam.check.analisisDespliegues.integracionChequeos.ChequeosIntegrationTest;
/**
 * 
 * @author SSA005
 */
public class ChequeoArchivosNoPermitidosRecursosIntegrationTest extends ChequeosIntegrationTest{
	
	/**
	 * 
	 */
	@Test
	public void detectarErrorExistenciaArchivoClass(){
		Artefacto artefacto = crearArtefactoZipVacio("prueba");
		artefacto.agregarArchivo("error.class", null);
		
		lanzarTestRecursos(artefacto, 1, 1, 0, TipoServidor.WAS61);
		lanzarTestRecursos(artefacto, 1, 1, 0, TipoServidor.WAS85);
		lanzarTestRecursos(artefacto, 1, 1, 0, TipoServidor.JBOSS);
	}
	
	/**
	 * 
	 */
	@Test
	public void detectarErrorExistenciaArchivoJar(){
		Artefacto jarArtefacto = crearArtefactoJAR("error");
		Artefacto artefacto = crearArtefactoZipVacio("prueba");
		artefacto.agregarLibreria(jarArtefacto, null);
		
		lanzarTestRecursos(artefacto, 1, 1, 0, TipoServidor.WAS61);
		lanzarTestRecursos(artefacto, 1, 1, 0, TipoServidor.WAS85);
		lanzarTestRecursos(artefacto, 1, 1, 0, TipoServidor.JBOSS);
	}
	
	/**
	 * 
	 */
	@Test
	public void detectarErrorExistenciaArchivoASP(){
		Artefacto artefacto = crearArtefactoZipVacio("prueba");
		artefacto.agregarArchivo("error.asp", null);
		
		lanzarTestRecursos(artefacto, 1, 1, 0, TipoServidor.WAS61);
		lanzarTestRecursos(artefacto, 1, 1, 0, TipoServidor.WAS85);
		lanzarTestRecursos(artefacto, 1, 1, 0, TipoServidor.JBOSS);
	}
	
	/**
	 * 
	 */
	@Test
	public void detectarErrorExistenciaArchivoJava(){
		Artefacto artefacto = crearArtefactoZipVacio("prueba");
		artefacto.agregarArchivo("error.java", null);
		
		lanzarTestRecursos(artefacto, 1, 1, 0, TipoServidor.WAS61);
		lanzarTestRecursos(artefacto, 1, 1, 0, TipoServidor.WAS85);
		lanzarTestRecursos(artefacto, 1, 1, 0, TipoServidor.JBOSS);
	}
	
	/**
	 * 
	 */
	@Test
	public void detectarErrorExistenciaDirectorioSVN(){
		Artefacto artefacto = crearArtefactoZipVacio("prueba");
		artefacto.agregarDirectorio(".svn", null);
		
		lanzarTestRecursos(artefacto, 1, 1, 0, TipoServidor.WAS61);
		lanzarTestRecursos(artefacto, 1, 1, 0, TipoServidor.WAS85);
		lanzarTestRecursos(artefacto, 1, 1, 0, TipoServidor.JBOSS);
	}
	
	/**
	 * 
	 */
	@Test
	public void detectarErrorExistenciaArchivoLOG(){
		Artefacto artefacto = crearArtefactoZipVacio("prueba");
		artefacto.agregarArchivo("error.log", null);
		
		lanzarTestRecursos(artefacto, 1, 1, 0, TipoServidor.WAS61);
		lanzarTestRecursos(artefacto, 1, 1, 0, TipoServidor.WAS85);
		lanzarTestRecursos(artefacto, 1, 1, 0, TipoServidor.JBOSS);
	}
	
	/**
	 * 
	 */
	@Test
	public void detectarCorrecto(){
		Artefacto artefacto = crearArtefactoZipVacio("prueba");
		artefacto.agregarArchivo("error.properties", null);
		
		lanzarTestRecursos(artefacto, 0, 2, 0, TipoServidor.WAS61);
		lanzarTestRecursos(artefacto, 0, 2, 0, TipoServidor.WAS85);
		lanzarTestRecursos(artefacto, 0, 2, 0, TipoServidor.JBOSS);
	}

}
