package es.iam.check.analisisDespliegues.integracionChequeos.estaticos;

import org.junit.Test;

import es.iam.check.analisisDespliegues.business.configuracion.TipoServidor;
import es.iam.check.analisisDespliegues.integracionChequeos.Artefacto;
import es.iam.check.analisisDespliegues.integracionChequeos.ChequeosIntegrationTest;


/**
 * @author SSA005
 */
public class ChequeoArchivosNoPermitidosEstaticosIntegationTest extends ChequeosIntegrationTest{

	/**
	 * 
	 */
	@Test
	public void detectarErrorExistenciaArchivoThumbsdb(){
		Artefacto artefacto = crearArtefactoZipVacio("prueba");
		artefacto.agregarArchivo("Thumbs.db", null);

		lanzarTestEstaticos(artefacto, 1, 1, 0, TipoServidor.JBOSS);
		lanzarTestEstaticos(artefacto, 1, 1, 0, TipoServidor.WAS61);
		lanzarTestEstaticos(artefacto, 1, 1, 0, TipoServidor.WAS85);
	}

	/**
	 * 
	 */
	@Test
	public void detectarErrorExistenciaDirectorioMaven(){
		Artefacto artefacto = crearArtefactoZipVacio("prueba");
		artefacto.agregarDirectorio("maven", null);

		lanzarTestEstaticos(artefacto, 1, 1, 0, TipoServidor.JBOSS);
		lanzarTestEstaticos(artefacto, 1, 1, 0, TipoServidor.WAS61);
		lanzarTestEstaticos(artefacto, 1, 1, 0, TipoServidor.WAS85);
	}

	/**
	 * 
	 */
	@Test
	public void detectarErrorExistenciaArchivoClass(){
		Artefacto artefacto = crearArtefactoZipVacio("prueba");
		artefacto.agregarArchivo("error.class", null);

		lanzarTestEstaticos(artefacto, 1, 1, 0, TipoServidor.JBOSS);
		lanzarTestEstaticos(artefacto, 1, 1, 0, TipoServidor.WAS61);
		lanzarTestEstaticos(artefacto, 1, 1, 0, TipoServidor.WAS85);
	}

	/**
	 * 
	 */
	@Test
	public void detectarErrorExistenciaArchivoJar(){
		Artefacto jarArtefacto = crearArtefactoJAR("error");
		Artefacto artefacto = crearArtefactoZipVacio("prueba");
		artefacto.agregarLibreria(jarArtefacto, null);

		lanzarTestEstaticos(artefacto, 1, 1, 0, TipoServidor.JBOSS);
		lanzarTestEstaticos(artefacto, 1, 1, 0, TipoServidor.WAS61);
		lanzarTestEstaticos(artefacto, 1, 1, 0, TipoServidor.WAS85);
	}

	/**
	 * 
	 */
	@Test
	public void detectarErrorExistenciaArchivoASP(){
		Artefacto artefacto = crearArtefactoZipVacio("prueba");
		artefacto.agregarArchivo("error.asp", null);

		lanzarTestEstaticos(artefacto, 1, 1, 0, TipoServidor.JBOSS);
		lanzarTestEstaticos(artefacto, 1, 1, 0, TipoServidor.WAS61);
		lanzarTestEstaticos(artefacto, 1, 1, 0, TipoServidor.WAS85);
	}

	/**
	 * 
	 */
	@Test
	public void detectarErrorExistenciaArchivoJava(){
		Artefacto artefacto = crearArtefactoZipVacio("prueba");
		artefacto.agregarArchivo("error.java", null);

		lanzarTestEstaticos(artefacto, 1, 1, 0, TipoServidor.JBOSS);
		lanzarTestEstaticos(artefacto, 1, 1, 0, TipoServidor.WAS61);
		lanzarTestEstaticos(artefacto, 1, 1, 0, TipoServidor.WAS85);
	}

	/**
	 * 
	 */
	@Test
	public void detectarErrorExistenciaDirectorioSVN(){
		Artefacto artefacto = crearArtefactoZipVacio("prueba");
		artefacto.agregarDirectorio(".svn", null);

		lanzarTestEstaticos(artefacto, 1, 1, 0, TipoServidor.JBOSS);
		lanzarTestEstaticos(artefacto, 1, 1, 0, TipoServidor.WAS61);
		lanzarTestEstaticos(artefacto, 1, 1, 0, TipoServidor.WAS85);
	}

	/**
	 * 
	 */
	@Test
	public void detectarErrorExistenciaArchivoLOG(){
		Artefacto artefacto = crearArtefactoZipVacio("prueba");
		artefacto.agregarArchivo("error.log", null);

		lanzarTestEstaticos(artefacto, 1, 1, 0, TipoServidor.JBOSS);
		lanzarTestEstaticos(artefacto, 1, 1, 0, TipoServidor.WAS61);
		lanzarTestEstaticos(artefacto, 1, 1, 0, TipoServidor.WAS85);
	}

	/**
	 * 
	 */
	@Test
	public void detectarCorrecto(){
		Artefacto artefacto = crearArtefactoZipVacio("prueba");
		artefacto.agregarArchivo("error.properties", null);

		lanzarTestEstaticos(artefacto, 0, 2, 0, TipoServidor.JBOSS);
		lanzarTestEstaticos(artefacto, 0, 2, 0, TipoServidor.WAS61);
		lanzarTestEstaticos(artefacto, 0, 2, 0, TipoServidor.WAS85);
	}

}
