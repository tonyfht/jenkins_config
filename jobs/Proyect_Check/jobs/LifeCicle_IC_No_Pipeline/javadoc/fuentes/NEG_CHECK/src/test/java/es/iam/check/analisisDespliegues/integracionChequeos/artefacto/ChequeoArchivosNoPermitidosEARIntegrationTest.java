package es.iam.check.analisisDespliegues.integracionChequeos.artefacto;

import org.junit.Test;
import es.iam.check.analisisDespliegues.business.chequeos.model.TipoNombreChequeos;
import es.iam.check.analisisDespliegues.business.configuracion.TipoServidor;
import es.iam.check.analisisDespliegues.integracionChequeos.Artefacto;
import es.iam.check.analisisDespliegues.integracionChequeos.ChequeosIntegrationTest;


/**
 * 
 * @author SSA000
 * @author ARD021
 * @author AHT005
 */
public class ChequeoArchivosNoPermitidosEARIntegrationTest extends ChequeosIntegrationTest{

	/********************************* TEST WAS 8.5 *****************************/
	/*********************************************************************************/
	
	@Test
	public void detectarErrorExistenciaArchivoHIBERNATE_WAS85(){
		Artefacto artefacto = configurarArtefacto("hibernate.properties", null, TipoFichero.ARCHIVO);
		lanzarTestArtefacto(artefacto, 1, 0, 0, TipoServidor.WAS85, TipoNombreChequeos.CHEQUEO_ARCHIVOS_NO_PERMITIDOS_EAR);
	}
           
	@Test
	public void detectarCualquierErrorExistenciaArchivoProperties_WAS85(){
		Artefacto artefacto = configurarArtefacto("hibernate-cofig-cfg.properties", null, TipoFichero.ARCHIVO);
		lanzarTestArtefacto(artefacto, 1, 0, 0, TipoServidor.WAS85, TipoNombreChequeos.CHEQUEO_ARCHIVOS_NO_PERMITIDOS_EAR);
	}
	
	@Test
	public void detectarErrorExistenciaArchivoHTM_WAS85(){
		Artefacto artefacto = configurarArtefacto("error.htm", null, TipoFichero.ARCHIVO);
		lanzarTestArtefacto(artefacto, 1, 0, 0, TipoServidor.WAS85, TipoNombreChequeos.CHEQUEO_ARCHIVOS_NO_PERMITIDOS_EAR);
	}

	@Test
	public void detectarErrorExistenciaArchivoCSS_WAS85(){
		Artefacto artefacto = configurarArtefacto("error.css", null, TipoFichero.ARCHIVO);
		
		lanzarTestArtefacto(artefacto, 1, 0, 0, TipoServidor.WAS85, TipoNombreChequeos.CHEQUEO_ARCHIVOS_NO_PERMITIDOS_EAR);
	}

	@Test
	public void detectarErrorExistenciaArchivoJS_WAS85(){
		Artefacto artefacto = configurarArtefacto("error.js", null, TipoFichero.ARCHIVO);
		
		lanzarTestArtefacto(artefacto, 1, 0, 0, TipoServidor.WAS85, TipoNombreChequeos.CHEQUEO_ARCHIVOS_NO_PERMITIDOS_EAR);
	}

	@Test
	public void detectarErrorExistenciaArchivoGIF_WAS85(){
		Artefacto artefacto = configurarArtefacto("error.gif", null, TipoFichero.ARCHIVO);
		
		lanzarTestArtefacto(artefacto, 1, 0, 0, TipoServidor.WAS85, TipoNombreChequeos.CHEQUEO_ARCHIVOS_NO_PERMITIDOS_EAR);
	}
        
	@Test
	public void detectarErrorExistenciaArchivoJPG_WAS85(){
		Artefacto artefacto = configurarArtefacto("error.jpg", null, TipoFichero.ARCHIVO);
		
		lanzarTestArtefacto(artefacto, 1, 0, 0, TipoServidor.WAS85, TipoNombreChequeos.CHEQUEO_ARCHIVOS_NO_PERMITIDOS_EAR);
	}

	@Test
	public void detectarErrorExistenciaArchivoJPEG_WAS85(){
		Artefacto artefacto = configurarArtefacto("error.jpg", null, TipoFichero.ARCHIVO);
		
		lanzarTestArtefacto(artefacto, 1, 0, 0, TipoServidor.WAS85, TipoNombreChequeos.CHEQUEO_ARCHIVOS_NO_PERMITIDOS_EAR);
	}

	@Test
	public void detectarErrorExistenciaArchivoIMG_WAS85(){
		Artefacto artefacto = configurarArtefacto("error.img", null, TipoFichero.ARCHIVO);
		
		lanzarTestArtefacto(artefacto, 1, 0, 0, TipoServidor.WAS85, TipoNombreChequeos.CHEQUEO_ARCHIVOS_NO_PERMITIDOS_EAR);
	}

	@Test
	public void detectarErrorExistenciaArchivoPNG_WAS85(){
		Artefacto artefacto = configurarArtefacto("error.png", null, TipoFichero.ARCHIVO);
		
		lanzarTestArtefacto(artefacto, 1, 0, 0, TipoServidor.WAS85, TipoNombreChequeos.CHEQUEO_ARCHIVOS_NO_PERMITIDOS_EAR);
	}
	
	@Test
	public void detectarErrorExistenciaArchivoHTML_WAS85(){
		Artefacto artefacto = configurarArtefacto("error.html", null, TipoFichero.ARCHIVO);
		
		lanzarTestArtefacto(artefacto, 1, 0, 0, TipoServidor.WAS85, TipoNombreChequeos.CHEQUEO_ARCHIVOS_NO_PERMITIDOS_EAR);
	}
	
	@Test
	public void detectarErrorExistenciaArchivoDOC_WAS85(){
		Artefacto artefacto = configurarArtefacto("error.doc", null, TipoFichero.ARCHIVO);
		
		lanzarTestArtefacto(artefacto, 1, 0, 0, TipoServidor.WAS85, TipoNombreChequeos.CHEQUEO_ARCHIVOS_NO_PERMITIDOS_EAR);
	}
	
	@Test
	public void detectarErrorExistenciaArchivoPDF_WAS85(){
		Artefacto artefacto = configurarArtefacto("error.pdf", null, TipoFichero.ARCHIVO);
		
		lanzarTestArtefacto(artefacto, 1, 0, 0, TipoServidor.WAS85, TipoNombreChequeos.CHEQUEO_ARCHIVOS_NO_PERMITIDOS_EAR);
	}
	
	@Test
	public void detectarErrorExistenciaArchivoBAK_WAS85(){
		Artefacto artefacto = configurarArtefacto("error.bak", null, TipoFichero.ARCHIVO);
		
		lanzarTestArtefacto(artefacto, 1, 0, 0, TipoServidor.WAS85, TipoNombreChequeos.CHEQUEO_ARCHIVOS_NO_PERMITIDOS_EAR);
	}
	
	@Test
	public void detectarErrorExistenciaArchivoOLD_WAS85(){
		Artefacto artefacto = configurarArtefacto("error.old", null, TipoFichero.ARCHIVO);
		
		lanzarTestArtefacto(artefacto, 1, 0, 0, TipoServidor.WAS85, TipoNombreChequeos.CHEQUEO_ARCHIVOS_NO_PERMITIDOS_EAR);
	}


	@Test
	public void detectarErrorExistenciaArchivoDESA_WAS85(){
		Artefacto artefacto = configurarArtefacto("error.desa", null, TipoFichero.ARCHIVO);
		
		lanzarTestArtefacto(artefacto, 1, 0, 0, TipoServidor.WAS85, TipoNombreChequeos.CHEQUEO_ARCHIVOS_NO_PERMITIDOS_EAR);
	}
	
	@Test
	public void detectarErrorExistenciaArchivoPRE_WAS85(){
		Artefacto artefacto = configurarArtefacto("error.pre", null, TipoFichero.ARCHIVO);
		
		lanzarTestArtefacto(artefacto, 1, 0, 0, TipoServidor.WAS85, TipoNombreChequeos.CHEQUEO_ARCHIVOS_NO_PERMITIDOS_EAR);
	}
	
	@Test
	public void detectarErrorExistenciaArchivoPRO_WAS85(){
		Artefacto artefacto = configurarArtefacto("error.pro", null, TipoFichero.ARCHIVO);
		
		lanzarTestArtefacto(artefacto, 1, 0, 0, TipoServidor.WAS85, TipoNombreChequeos.CHEQUEO_ARCHIVOS_NO_PERMITIDOS_EAR);
	}
	
	@Test
	public void detectarErrorExistenciaArchivoV1_WAS85(){
		Artefacto artefacto = configurarArtefacto("error.v1", null, TipoFichero.ARCHIVO);
		
		lanzarTestArtefacto(artefacto, 1, 0, 0, TipoServidor.WAS85, TipoNombreChequeos.CHEQUEO_ARCHIVOS_NO_PERMITIDOS_EAR);
	}
	
	@Test
	public void detectarErrorExistenciaDirectorioSVN_WAS85(){
		Artefacto artefacto = configurarArtefacto(".svn", null, TipoFichero.DIRECTORIO);
		
		lanzarTestArtefacto(artefacto, 1, 0, 0, TipoServidor.WAS85, TipoNombreChequeos.CHEQUEO_ARCHIVOS_NO_PERMITIDOS_EAR);
	}
	
	@Test
	public void detectarErrorExistenciaArchivoThumbsdb_WAS85(){
		Artefacto artefacto = configurarArtefacto("Thumbs.db", null, TipoFichero.ARCHIVO);
		
		lanzarTestArtefacto(artefacto, 1, 0, 0, TipoServidor.WAS85, TipoNombreChequeos.CHEQUEO_ARCHIVOS_NO_PERMITIDOS_EAR);
	}
	
	
	@Test
	public void detectarErrorExistenciaDirectorioCVS_WAS85(){
		Artefacto artefacto = configurarArtefacto("cvs", null, TipoFichero.DIRECTORIO);
		
		lanzarTestArtefacto(artefacto, 1, 0, 0, TipoServidor.WAS85, TipoNombreChequeos.CHEQUEO_ARCHIVOS_NO_PERMITIDOS_EAR);
	}
	
	@Test
	public void detectarErrorExistenciaArchivoIndexDo_WAS85(){
		Artefacto artefacto = configurarArtefacto("index.do", null, TipoFichero.ARCHIVO);
		
		lanzarTestArtefacto(artefacto, 1, 0, 0, TipoServidor.WAS85, TipoNombreChequeos.CHEQUEO_ARCHIVOS_NO_PERMITIDOS_EAR);
	}
	
	@Test
	public void detectarErrorExistenciaArchivoDesarollo_WAS85(){
		Artefacto artefacto = configurarArtefacto("error.desarrollo", null, TipoFichero.ARCHIVO);
		
		lanzarTestArtefacto(artefacto, 1, 0, 0, TipoServidor.WAS85, TipoNombreChequeos.CHEQUEO_ARCHIVOS_NO_PERMITIDOS_EAR);
	}
	
	@Test
	public void detectarErrorExistenciaArchivoJbossProperties_WAS85(){
		Artefacto artefacto = configurarArtefacto("jboss.properties", null, TipoFichero.ARCHIVO);
		
		lanzarTestArtefacto(artefacto, 1, 0, 0, TipoServidor.WAS85, TipoNombreChequeos.CHEQUEO_ARCHIVOS_NO_PERMITIDOS_EAR);
	}
        
	
        
	/********************************* FIN TEST WAS 8.5 *****************************/
	/*********************************************************************************/
	
        
       
	
	/********************************* TEST JBOSS *****************************/
	/*********************************************************************************/
	
        
        @Test
	public void detectarErrorExistenciaArchivoHTM_JBOSS(){
		Artefacto artefacto = configurarArtefacto("error.htm", null, TipoFichero.ARCHIVO);
		lanzarTestArtefacto(artefacto, 1, 0, 0, TipoServidor.JBOSS, TipoNombreChequeos.CHEQUEO_ARCHIVOS_NO_PERMITIDOS_EAR);
	}

	@Test
	public void detectarErrorExistenciaArchivoCSS_JBOSS(){
		Artefacto artefacto = configurarArtefacto("error.css", null, TipoFichero.ARCHIVO);
		
		lanzarTestArtefacto(artefacto, 1, 0, 0, TipoServidor.JBOSS, TipoNombreChequeos.CHEQUEO_ARCHIVOS_NO_PERMITIDOS_EAR);
	}

	@Test
	public void detectarErrorExistenciaArchivoJS_JBOSS(){
		Artefacto artefacto = configurarArtefacto("error.js", null, TipoFichero.ARCHIVO);
		
		lanzarTestArtefacto(artefacto, 1, 0, 0, TipoServidor.JBOSS, TipoNombreChequeos.CHEQUEO_ARCHIVOS_NO_PERMITIDOS_EAR);
	}

	@Test
	public void detectarErrorExistenciaArchivoGIF_JBOSS(){
		Artefacto artefacto = configurarArtefacto("error.gif", null, TipoFichero.ARCHIVO);
		
		lanzarTestArtefacto(artefacto, 1, 0, 0, TipoServidor.JBOSS, TipoNombreChequeos.CHEQUEO_ARCHIVOS_NO_PERMITIDOS_EAR);
	}

	@Test
	public void detectarErrorExistenciaArchivoJPG_JBOSS(){
		Artefacto artefacto = configurarArtefacto("error.jpg", null, TipoFichero.ARCHIVO);
		
		lanzarTestArtefacto(artefacto, 1, 0, 0, TipoServidor.JBOSS, TipoNombreChequeos.CHEQUEO_ARCHIVOS_NO_PERMITIDOS_EAR);
	}

	@Test
	public void detectarErrorExistenciaArchivoJPEG_JBOSS(){
		Artefacto artefacto = configurarArtefacto("error.jpg", null, TipoFichero.ARCHIVO);
		
		lanzarTestArtefacto(artefacto, 1, 0, 0, TipoServidor.JBOSS, TipoNombreChequeos.CHEQUEO_ARCHIVOS_NO_PERMITIDOS_EAR);
	}

	@Test
	public void detectarErrorExistenciaArchivoIMG_JBOSS(){
		Artefacto artefacto = configurarArtefacto("error.img", null, TipoFichero.ARCHIVO);
		
		lanzarTestArtefacto(artefacto, 1, 0, 0, TipoServidor.JBOSS, TipoNombreChequeos.CHEQUEO_ARCHIVOS_NO_PERMITIDOS_EAR);
	}

	@Test
	public void detectarErrorExistenciaArchivoPNG_JBOSS(){
		Artefacto artefacto = configurarArtefacto("error.png", null, TipoFichero.ARCHIVO);
		
		lanzarTestArtefacto(artefacto, 1, 0, 0, TipoServidor.JBOSS, TipoNombreChequeos.CHEQUEO_ARCHIVOS_NO_PERMITIDOS_EAR);
	}
	
	@Test
	public void detectarErrorExistenciaArchivoHTML_JBOSS(){
		Artefacto artefacto = configurarArtefacto("error.html", null, TipoFichero.ARCHIVO);
		
		lanzarTestArtefacto(artefacto, 1, 0, 0, TipoServidor.JBOSS, TipoNombreChequeos.CHEQUEO_ARCHIVOS_NO_PERMITIDOS_EAR);
	}
	
	@Test
	public void detectarErrorExistenciaArchivoDOC_JBOSS(){
		Artefacto artefacto = configurarArtefacto("error.doc", null, TipoFichero.ARCHIVO);
		
		lanzarTestArtefacto(artefacto, 1, 0, 0, TipoServidor.JBOSS, TipoNombreChequeos.CHEQUEO_ARCHIVOS_NO_PERMITIDOS_EAR);
	}
	
	@Test
	public void detectarErrorExistenciaArchivoPDF_JBOSS(){
		Artefacto artefacto = configurarArtefacto("error.pdf", null, TipoFichero.ARCHIVO);
		
		lanzarTestArtefacto(artefacto, 1, 0, 0, TipoServidor.JBOSS, TipoNombreChequeos.CHEQUEO_ARCHIVOS_NO_PERMITIDOS_EAR);
	}
	
	@Test
	public void detectarErrorExistenciaArchivoBAK_JBOSS(){
		Artefacto artefacto = configurarArtefacto("error.bak", null, TipoFichero.ARCHIVO);
		
		lanzarTestArtefacto(artefacto, 1, 0, 0, TipoServidor.JBOSS, TipoNombreChequeos.CHEQUEO_ARCHIVOS_NO_PERMITIDOS_EAR);
	}
	
	@Test
	public void detectarErrorExistenciaArchivoOLD_JBOSS(){
		Artefacto artefacto = configurarArtefacto("error.old", null, TipoFichero.ARCHIVO);
		
		lanzarTestArtefacto(artefacto, 1, 0, 0, TipoServidor.JBOSS, TipoNombreChequeos.CHEQUEO_ARCHIVOS_NO_PERMITIDOS_EAR);
	}

	@Test
	public void detectarErrorExistenciaArchivoBACK_JBOSS(){
		Artefacto artefacto = configurarArtefacto("error.bak", null, TipoFichero.ARCHIVO);
		
		lanzarTestArtefacto(artefacto, 1, 0, 0, TipoServidor.JBOSS, TipoNombreChequeos.CHEQUEO_ARCHIVOS_NO_PERMITIDOS_EAR);
	}
	
	@Test
	public void detectarErrorExistenciaArchivoDESA_JBOSS(){
		Artefacto artefacto = configurarArtefacto("error.desa", null, TipoFichero.ARCHIVO);
		
		lanzarTestArtefacto(artefacto, 1, 0, 0, TipoServidor.JBOSS, TipoNombreChequeos.CHEQUEO_ARCHIVOS_NO_PERMITIDOS_EAR);
	}
	
	@Test
	public void detectarErrorExistenciaArchivoPRE_JBOSS(){
		Artefacto artefacto = configurarArtefacto("error.pre", null, TipoFichero.ARCHIVO);
		
		lanzarTestArtefacto(artefacto, 1, 0, 0, TipoServidor.JBOSS, TipoNombreChequeos.CHEQUEO_ARCHIVOS_NO_PERMITIDOS_EAR);
	}
	
	@Test
	public void detectarErrorExistenciaArchivoPRO_JBOSS(){
		Artefacto artefacto = configurarArtefacto("error.pro", null, TipoFichero.ARCHIVO);
		
		lanzarTestArtefacto(artefacto, 1, 0, 0, TipoServidor.JBOSS, TipoNombreChequeos.CHEQUEO_ARCHIVOS_NO_PERMITIDOS_EAR);
	}
	
	@Test
	public void detectarErrorExistenciaArchivoV1_JBOSS(){
		Artefacto artefacto = configurarArtefacto("error.v1", null, TipoFichero.ARCHIVO);
		
		lanzarTestArtefacto(artefacto, 1, 0, 0, TipoServidor.JBOSS, TipoNombreChequeos.CHEQUEO_ARCHIVOS_NO_PERMITIDOS_EAR);
	}
	
	@Test
	public void detectarErrorExistenciaDirectorioSVN_JBOSS(){
		Artefacto artefacto = configurarArtefacto(".svn", null, TipoFichero.DIRECTORIO);
		
		lanzarTestArtefacto(artefacto, 1, 0, 0, TipoServidor.JBOSS, TipoNombreChequeos.CHEQUEO_ARCHIVOS_NO_PERMITIDOS_EAR);
	}
	

	@Test
	public void detectarErrorExistenciaArchivoThumbsdb_JBOSS(){
		Artefacto artefacto = configurarArtefacto("Thumbs.db", null, TipoFichero.ARCHIVO);
		
		lanzarTestArtefacto(artefacto, 1, 0, 0, TipoServidor.JBOSS, TipoNombreChequeos.CHEQUEO_ARCHIVOS_NO_PERMITIDOS_EAR);
	}
	
	
	@Test
	public void detectarErrorExistenciaDirectorioCVS_JBOSS(){
		Artefacto artefacto = configurarArtefacto("cvs", null, TipoFichero.DIRECTORIO);
		
		lanzarTestArtefacto(artefacto, 1, 0, 0, TipoServidor.JBOSS, TipoNombreChequeos.CHEQUEO_ARCHIVOS_NO_PERMITIDOS_EAR);
	}
	
	@Test
	public void detectarErrorExistenciaArchivoIndexDo_JBOSS(){
		Artefacto artefacto = configurarArtefacto("index.do", null, TipoFichero.ARCHIVO);
		
		lanzarTestArtefacto(artefacto, 1, 0, 0, TipoServidor.JBOSS, TipoNombreChequeos.CHEQUEO_ARCHIVOS_NO_PERMITIDOS_EAR);
	}
	
	@Test
	public void detectarErrorExistenciaArchivoDesarollo_JBOSS(){
		Artefacto artefacto = configurarArtefacto("error.desarrollo", null, TipoFichero.ARCHIVO);
		
		lanzarTestArtefacto(artefacto, 1, 0, 0, TipoServidor.JBOSS, TipoNombreChequeos.CHEQUEO_ARCHIVOS_NO_PERMITIDOS_EAR);
	}
	
	@Test
	public void detectarErrorExistenciaArchivoJbossProperties_JBOSS(){
		Artefacto artefacto = configurarArtefacto("jboss.properties", null, TipoFichero.ARCHIVO);
		
		lanzarTestArtefacto(artefacto, 1, 0, 0, TipoServidor.JBOSS, TipoNombreChequeos.CHEQUEO_ARCHIVOS_NO_PERMITIDOS_EAR);
	}
	
	/********************************* FIN TEST JBOSS *****************************/
	/*********************************************************************************/
	
	
	/********************************* TEST WAS 6.1 *****************************/
	/*********************************************************************************/
	
	@Test
	public void detectarErrorExistenciaArchivoHTM_WAS61(){
		Artefacto artefacto = configurarArtefacto("error.htm", null, TipoFichero.ARCHIVO);
		lanzarTestArtefacto(artefacto, 1, 0, 0, TipoServidor.WAS61, TipoNombreChequeos.CHEQUEO_ARCHIVOS_NO_PERMITIDOS_EAR);
	}

	@Test
	public void detectarErrorExistenciaArchivoCSS_WAS61(){
		Artefacto artefacto = configurarArtefacto("error.css", null, TipoFichero.ARCHIVO);
		
		lanzarTestArtefacto(artefacto, 1, 0, 0, TipoServidor.WAS61, TipoNombreChequeos.CHEQUEO_ARCHIVOS_NO_PERMITIDOS_EAR);
	}

	@Test
	public void detectarErrorExistenciaArchivoJS_WAS61(){
		Artefacto artefacto = configurarArtefacto("error.js", null, TipoFichero.ARCHIVO);
		
		lanzarTestArtefacto(artefacto, 1, 0, 0, TipoServidor.WAS61, TipoNombreChequeos.CHEQUEO_ARCHIVOS_NO_PERMITIDOS_EAR);
	}

	@Test
	public void detectarErrorExistenciaArchivoGIF_WAS61(){
		Artefacto artefacto = configurarArtefacto("error.gif", null, TipoFichero.ARCHIVO);
		
		lanzarTestArtefacto(artefacto, 1, 0, 0, TipoServidor.WAS61, TipoNombreChequeos.CHEQUEO_ARCHIVOS_NO_PERMITIDOS_EAR);
	}

	@Test
	public void detectarErrorExistenciaArchivoJPG_WAS61(){
		Artefacto artefacto = configurarArtefacto("error.jpg", null, TipoFichero.ARCHIVO);
		
		lanzarTestArtefacto(artefacto, 1, 0, 0, TipoServidor.WAS61, TipoNombreChequeos.CHEQUEO_ARCHIVOS_NO_PERMITIDOS_EAR);
	}

	@Test
	public void detectarErrorExistenciaArchivoJPEG_WAS61(){
		Artefacto artefacto = configurarArtefacto("error.jpg", null, TipoFichero.ARCHIVO);
		
		lanzarTestArtefacto(artefacto, 1, 0, 0, TipoServidor.WAS61, TipoNombreChequeos.CHEQUEO_ARCHIVOS_NO_PERMITIDOS_EAR);
	}

	@Test
	public void detectarErrorExistenciaArchivoIMG_WAS61(){
		Artefacto artefacto = configurarArtefacto("error.img", null, TipoFichero.ARCHIVO);
		
		lanzarTestArtefacto(artefacto, 1, 0, 0, TipoServidor.WAS61, TipoNombreChequeos.CHEQUEO_ARCHIVOS_NO_PERMITIDOS_EAR);
	}

	@Test
	public void detectarErrorExistenciaArchivoPNG_WAS61(){
		Artefacto artefacto = configurarArtefacto("error.png", null, TipoFichero.ARCHIVO);
		
		lanzarTestArtefacto(artefacto, 1, 0, 0, TipoServidor.WAS61, TipoNombreChequeos.CHEQUEO_ARCHIVOS_NO_PERMITIDOS_EAR);
	}
	
	@Test
	public void detectarErrorExistenciaArchivoHTML_WAS61(){
		Artefacto artefacto = configurarArtefacto("error.html", null, TipoFichero.ARCHIVO);
		
		lanzarTestArtefacto(artefacto, 1, 0, 0, TipoServidor.WAS61, TipoNombreChequeos.CHEQUEO_ARCHIVOS_NO_PERMITIDOS_EAR);
	}
	
	@Test
	public void detectarErrorExistenciaArchivoDOC_WAS61(){
		Artefacto artefacto = configurarArtefacto("error.doc", null, TipoFichero.ARCHIVO);
		
		lanzarTestArtefacto(artefacto, 1, 0, 0, TipoServidor.WAS61, TipoNombreChequeos.CHEQUEO_ARCHIVOS_NO_PERMITIDOS_EAR);
	}
	
	@Test
	public void detectarErrorExistenciaArchivoPDF_WAS61(){
		Artefacto artefacto = configurarArtefacto("error.pdf", null, TipoFichero.ARCHIVO);
		
		lanzarTestArtefacto(artefacto, 1, 0, 0, TipoServidor.WAS61, TipoNombreChequeos.CHEQUEO_ARCHIVOS_NO_PERMITIDOS_EAR);
	}
	
	@Test
	public void detectarErrorExistenciaArchivoBAK_WAS61(){
		Artefacto artefacto = configurarArtefacto("error.bak", null, TipoFichero.ARCHIVO);
		
		lanzarTestArtefacto(artefacto, 1, 0, 0, TipoServidor.WAS61, TipoNombreChequeos.CHEQUEO_ARCHIVOS_NO_PERMITIDOS_EAR);
	}
	
	@Test
	public void detectarErrorExistenciaArchivoOLD_WAS61(){
		Artefacto artefacto = configurarArtefacto("error.old", null, TipoFichero.ARCHIVO);
		
		lanzarTestArtefacto(artefacto, 1, 0, 0, TipoServidor.WAS61, TipoNombreChequeos.CHEQUEO_ARCHIVOS_NO_PERMITIDOS_EAR);
	}

	@Test
	public void detectarErrorExistenciaArchivoBACK_WAS61(){
		Artefacto artefacto = configurarArtefacto("error.bak", null, TipoFichero.ARCHIVO);
		
		lanzarTestArtefacto(artefacto, 1, 0, 0, TipoServidor.WAS61, TipoNombreChequeos.CHEQUEO_ARCHIVOS_NO_PERMITIDOS_EAR);
	}
	
	@Test
	public void detectarErrorExistenciaArchivoDESA_WAS61(){
		Artefacto artefacto = configurarArtefacto("error.desa", null, TipoFichero.ARCHIVO);
		
		lanzarTestArtefacto(artefacto, 1, 0, 0, TipoServidor.WAS61, TipoNombreChequeos.CHEQUEO_ARCHIVOS_NO_PERMITIDOS_EAR);
	}
	
	@Test
	public void detectarErrorExistenciaArchivoPRE_WAS61(){
		Artefacto artefacto = configurarArtefacto("error.pre", null, TipoFichero.ARCHIVO);
		
		lanzarTestArtefacto(artefacto, 1, 0, 0, TipoServidor.WAS61, TipoNombreChequeos.CHEQUEO_ARCHIVOS_NO_PERMITIDOS_EAR);
	}
	
	@Test
	public void detectarErrorExistenciaArchivoPRO_WAS61(){
		Artefacto artefacto = configurarArtefacto("error.pro", null, TipoFichero.ARCHIVO);
		
		lanzarTestArtefacto(artefacto, 1, 0, 0, TipoServidor.WAS61, TipoNombreChequeos.CHEQUEO_ARCHIVOS_NO_PERMITIDOS_EAR);
	}
	
	@Test
	public void detectarErrorExistenciaArchivoV1_WAS61(){
		Artefacto artefacto = configurarArtefacto("error.v1", null, TipoFichero.ARCHIVO);
		
		lanzarTestArtefacto(artefacto, 1, 0, 0, TipoServidor.WAS61, TipoNombreChequeos.CHEQUEO_ARCHIVOS_NO_PERMITIDOS_EAR);
	}
	
	@Test
	public void detectarErrorExistenciaDirectorioSVN_WAS61(){
		Artefacto artefacto = configurarArtefacto(".svn", null, TipoFichero.DIRECTORIO);
		
		lanzarTestArtefacto(artefacto, 1, 0, 0, TipoServidor.WAS61, TipoNombreChequeos.CHEQUEO_ARCHIVOS_NO_PERMITIDOS_EAR);
	}

	
	@Test
	public void detectarErrorExistenciaArchivoThumbsdb_WAS61(){
		Artefacto artefacto = configurarArtefacto("Thumbs.db", null, TipoFichero.ARCHIVO);
		
		lanzarTestArtefacto(artefacto, 1, 0, 0, TipoServidor.WAS61, TipoNombreChequeos.CHEQUEO_ARCHIVOS_NO_PERMITIDOS_EAR);
	}
	
	
	@Test
	public void detectarErrorExistenciaDirectorioCVS_WAS61(){
		Artefacto artefacto = configurarArtefacto("cvs", null, TipoFichero.DIRECTORIO);
		
		lanzarTestArtefacto(artefacto, 1, 0, 0, TipoServidor.WAS61, TipoNombreChequeos.CHEQUEO_ARCHIVOS_NO_PERMITIDOS_EAR);
	}
	
	@Test
	public void detectarErrorExistenciaArchivoIndexDo_WAS61(){
		Artefacto artefacto = configurarArtefacto("index.do", null, TipoFichero.ARCHIVO);
		
		lanzarTestArtefacto(artefacto, 1, 0, 0, TipoServidor.WAS61, TipoNombreChequeos.CHEQUEO_ARCHIVOS_NO_PERMITIDOS_EAR);
	}
	
	@Test
	public void detectarErrorExistenciaArchivoDesarollo_WAS61(){
		Artefacto artefacto = configurarArtefacto("error.desarrollo", null, TipoFichero.ARCHIVO);
		
		lanzarTestArtefacto(artefacto, 1, 0, 0, TipoServidor.WAS61, TipoNombreChequeos.CHEQUEO_ARCHIVOS_NO_PERMITIDOS_EAR);
	}
	
	@Test
	public void detectarErrorExistenciaArchivoJbossProperties_WAS61(){
		Artefacto artefacto = configurarArtefacto("jboss.properties", null, TipoFichero.ARCHIVO);
		
		lanzarTestArtefacto(artefacto, 1, 0, 0, TipoServidor.WAS61, TipoNombreChequeos.CHEQUEO_ARCHIVOS_NO_PERMITIDOS_EAR);
	}
	
        
	/********************************* FIN TEST WAS 6.1 *****************************/
	/*********************************************************************************/
}
