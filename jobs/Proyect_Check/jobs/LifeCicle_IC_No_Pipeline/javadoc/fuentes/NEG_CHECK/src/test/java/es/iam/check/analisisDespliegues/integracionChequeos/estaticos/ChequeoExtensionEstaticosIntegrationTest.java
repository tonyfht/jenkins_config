package es.iam.check.analisisDespliegues.integracionChequeos.estaticos;

import org.junit.Test;

import es.iam.check.analisisDespliegues.business.configuracion.TipoServidor;
import es.iam.check.analisisDespliegues.integracionChequeos.Artefacto;
import es.iam.check.analisisDespliegues.integracionChequeos.ChequeosIntegrationTest;

/**
 * Test de integracion para comprobar que existe un archivo con la extension
 * adecuada .zip y que ese archivo debe corresponderse con el archivo de estaticos
 * a analizar.
 * @author SSA005
 */
public class ChequeoExtensionEstaticosIntegrationTest extends ChequeosIntegrationTest{
	
	/**
	 * 
	 */
	@Test
	public void detectarErrorExtensionRAR(){
		Artefacto artefacto = crearFicheroComprimidoVacio("XXXXX_estaticos", "rar");
		artefacto.agregarArchivo("fichero.html", null);
		lanzarTestEstaticos(artefacto, 1, 1, 0, TipoServidor.JBOSS);
		lanzarTestEstaticos(artefacto, 1, 1, 0, TipoServidor.WAS61);
		lanzarTestEstaticos(artefacto, 1, 1, 0, TipoServidor.WAS85);
	}
	
	/**
	 * 
	 */
	@Test
	public void detectarCorrectoExtensionZIP(){
		Artefacto artefacto = crearFicheroComprimidoVacio("XXXXX_estaticos", "zip");
		artefacto.agregarArchivo("fichero.html", null);
		lanzarTestEstaticos(artefacto, 0, 2, 0, TipoServidor.JBOSS);
		lanzarTestEstaticos(artefacto, 0, 2, 0, TipoServidor.WAS61);
		lanzarTestEstaticos(artefacto, 0, 2, 0, TipoServidor.WAS85);
	}

}
