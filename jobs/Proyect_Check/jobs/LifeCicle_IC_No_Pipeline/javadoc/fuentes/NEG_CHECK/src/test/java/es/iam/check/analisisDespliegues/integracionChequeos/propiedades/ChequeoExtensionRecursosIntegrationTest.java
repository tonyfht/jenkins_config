package es.iam.check.analisisDespliegues.integracionChequeos.propiedades;

import org.junit.Test;

import es.iam.check.analisisDespliegues.business.configuracion.TipoServidor;
import es.iam.check.analisisDespliegues.integracionChequeos.Artefacto;
import es.iam.check.analisisDespliegues.integracionChequeos.ChequeosIntegrationTest;


/**
 * Test de integracion para comprobar que la extension del archivo de recursos
 * tiene la extension adecuada.
 * @author SSA005
 */
public class ChequeoExtensionRecursosIntegrationTest extends ChequeosIntegrationTest{
	
	/**
	 * 
	 */
	@Test
	public void detectarCorrectoExtensionZIP(){
  		Artefacto artefacto = crearFicheroComprimidoVacio("XXXXX_recursos", "zip");
		artefacto.agregarArchivo("fichero.properties", null);
		lanzarTestRecursos(artefacto, 0, 2, 0, TipoServidor.WAS61);
		lanzarTestRecursos(artefacto, 0, 2, 0, TipoServidor.WAS85);
		lanzarTestRecursos(artefacto, 0, 2, 0, TipoServidor.JBOSS);
	}
	
	/**
	 * 
	 */
	@Test
	public void detectarErrorExtensionRAR(){
		Artefacto artefacto = crearFicheroComprimidoVacio("XXXXX_recursos", "rar");
		artefacto.agregarArchivo("fichero.properties", null);
		lanzarTestRecursos(artefacto, 1, 1, 0, TipoServidor.WAS61);
		lanzarTestRecursos(artefacto, 1, 1, 0, TipoServidor.WAS85);
		lanzarTestRecursos(artefacto, 1, 1, 0, TipoServidor.JBOSS);
	}
	


}
