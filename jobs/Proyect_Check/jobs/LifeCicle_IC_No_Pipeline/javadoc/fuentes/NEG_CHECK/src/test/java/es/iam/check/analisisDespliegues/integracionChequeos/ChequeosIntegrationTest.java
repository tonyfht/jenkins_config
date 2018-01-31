package es.iam.check.analisisDespliegues.integracionChequeos;

import static org.junit.Assert.assertTrue;
import java.io.File;
import java.io.IOException;
import java.util.List;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.EnterpriseArchive;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.jboss.shrinkwrap.api.spec.ResourceAdapterArchive;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.Rule;
import org.junit.rules.TemporaryFolder;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import com.gargoylesoftware.htmlunit.html.HtmlTable;
import com.gargoylesoftware.htmlunit.html.HtmlTableRow;

import es.iam.check.analisisDespliegues.business.chequeos.model.TipoNombreChequeos;
import es.iam.check.analisisDespliegues.business.configuracion.TipoServidor;
import es.iam.check.analisisDespliegues.business.main.Launcher;
import es.iam.check.analisisDespliegues.business.view.informes.InformeArtefacto;
import es.iam.check.analisisDespliegues.business.view.informes.InformeEstaticos;
import es.iam.check.analisisDespliegues.business.view.informes.InformeRecursos;



public abstract class ChequeosIntegrationTest {

	/**
	 * 
	 */
	public enum TipoFichero {ARCHIVO, DIRECTORIO, LIBRERIA};

	/**
	 * 
	 */
	@Rule
	public TemporaryFolder temporaryFolder = new TemporaryFolder();

	/**
	 * @return
	 */
	public TemporaryFolder getTemporaryFolder(){
		return temporaryFolder;
	}


	/**
	 * Establece el directorio temporal
	 * @param ruta
	 * @throws IOException 
	 */
	protected File crearDirectorio(String ruta){
		File directorio = getTemporaryFolder().newFolder(ruta);
		return directorio;
	}

	/**
	 * Establece el directorio temporal
	 * @param ruta
	 * @throws IOException 
	 */
	protected File crearArchivo(String ruta){
		File archivo = null;
		try {
			archivo = getTemporaryFolder().newFile(ruta);
		} catch (IOException e) {
		}
		return archivo;
	}
	
	protected Artefacto configurarArtefacto(String nombre, String ruta, TipoFichero tipoFichero){
		Artefacto artefacto = null;
		
		switch (tipoFichero) {
		case ARCHIVO:
			artefacto = crearArtefactoEAR("prueba").agregarArchivo(nombre, ruta);
			break;
		case DIRECTORIO:
			artefacto = crearArtefactoEAR("prueba").agregarDirectorio(nombre, ruta);
			break;
		default:
			break;
		}
		return artefacto;
	}

	/**
	 * Crea un artefacto ear sin ningun tipo de error
	 * @param nombre
	 * @return
	 */
	protected Artefacto crearArtefactoEAR(String nombre){
		Artefacto artefacto = crearArtefactoEARVacio(nombre);
		artefacto.agregarApplicationXML("artefactos/application.xml");
		((EnterpriseArchive)artefacto.getArtefactoShrinkwrap()).addAsModule(crearArtefactoWAR(nombre).getArtefactoShrinkwrap());
		return artefacto;
	}
	
	/**
	 * Crea un artefacto ear sin ningun tipo de error
	 * @param nombre
	 * @return
	 */
	protected Artefacto crearArtefactoEAR(String nombre, String extension){
		Artefacto artefacto = crearArtefactoEARVacio(nombre, extension);
		artefacto.agregarApplicationXML("artefactos/application.xml");
		((EnterpriseArchive)artefacto.getArtefactoShrinkwrap()).addAsModule(crearArtefactoWAR(nombre).getArtefactoShrinkwrap());
		return artefacto;
	}

	private Artefacto crearArtefactoEARVacio(String nombre, String extension) {
		String  nombreEar = nombre.concat(".").concat(extension);
		EnterpriseArchive enterpriseArchive = ShrinkWrap.create(EnterpriseArchive.class, nombreEar);
		return new Artefacto(enterpriseArchive, getTemporaryFolder());
	}


	protected Artefacto crearArtefactoEARVacio(String nombre) {
		String  nombreEar = nombre.concat(".ear");
		EnterpriseArchive enterpriseArchive = ShrinkWrap.create(EnterpriseArchive.class, nombreEar);
		return new Artefacto(enterpriseArchive, getTemporaryFolder());
	}

	/**
	 * Crea un artefacto war sin ningun tipo de error
	 * @param nombre
	 * @return
	 */
	protected Artefacto crearArtefactoWAR(String nombre){
		Artefacto artefacto = crearArtefactoWARVacio(nombre);
		artefacto.agregarWebXML("artefactos/web.xml");
		WebArchive webArchive = (WebArchive)artefacto.getArtefactoShrinkwrap();
		webArchive.addAsDirectory("WEB-INF/classes");
		webArchive.addAsDirectory("WEB-INF/lib");
		webArchive.addAsDirectory("META-INF");
		//webArchive.add(EmptyAsset.INSTANCE, "ibm-web-ext.xmi");
		return artefacto;
	}
	
	/**
	 * Crea un artefacto war sin ningun tipo de error
	 * @param nombre
	 * @return
	 */
	protected Artefacto crearArtefactoWARSinWebXML(String nombre){
		Artefacto artefacto = crearArtefactoWARVacio(nombre);
		WebArchive webArchive = (WebArchive)artefacto.getArtefactoShrinkwrap();
		webArchive.addAsDirectory("WEB-INF/classes");
		webArchive.addAsDirectory("WEB-INF/lib");
		webArchive.addAsDirectory("META-INF");
		//webArchive.add(EmptyAsset.INSTANCE, "ibm-web-ext.xmi");
		return artefacto;
	}

	/**
	 * Crea un artefacto war sin ningun tipo de error
	 * @param nombre
	 * @return
	 */
	protected Artefacto crearArtefactoWARConWebXML(String nombre, File webXml){
		Artefacto artefacto = crearArtefactoWARVacio(nombre);
		WebArchive webArchive = (WebArchive)artefacto.getArtefactoShrinkwrap();
		webArchive.addAsDirectory("WEB-INF/classes");
		webArchive.addAsDirectory("WEB-INF/lib");
		webArchive.addAsDirectory("META-INF");
		webArchive.setWebXML(webXml);
		return artefacto;
	}


	/**
	 * Crea un artefacto war sin ningun tipo de error
	 * @param nombre
	 * @return
	 */
	protected Artefacto crearArtefactoWARVacio(String nombre){
		String  nombreWar = nombre.concat(".war");
		WebArchive webArchive = ShrinkWrap.create(WebArchive.class, nombreWar);
		return new Artefacto(webArchive, getTemporaryFolder());
	}

	/**
	 * Crea un artefacto war sin ningun tipo de error
	 * @param nombre
	 * @return
	 */
	protected Artefacto crearArtefactoJAR(String nombre){
		String  nombreJAR = nombre.concat(".jar");
		JavaArchive javaArchive = ShrinkWrap.create(JavaArchive.class, nombreJAR);
		javaArchive.add(EmptyAsset.INSTANCE, "clase.class");
		return new Artefacto(javaArchive, getTemporaryFolder());
	}

	/**
	 * Crea un artefacto war sin ningun tipo de error
	 * @param nombre
	 * @return
	 */
	protected Artefacto crearArtefactoZipVacio(String nombre){
		return crearFicheroComprimidoVacio(nombre, "zip");
	}

	/**
	 * Crea un artefacto war sin ningun tipo de error
	 * @param nombre
	 * @return
	 */
	protected Artefacto crearFicheroComprimidoVacio(String nombre, String extension){
		String  nombreFicheroComprimido = nombre.concat(".").concat(extension);
		ResourceAdapterArchive resourceAdapterArchive = ShrinkWrap.create(ResourceAdapterArchive.class, nombreFicheroComprimido);
		return new Artefacto(resourceAdapterArchive, getTemporaryFolder());
	}



	/**
	 * @param nombre
	 * @param ruta
	 * @param tipoFichero
	 */
	protected File lanzarTestArtefacto(Artefacto artefacto, int numeroChequeosIncorrectos, int numeroChequeosCorrectos, int numeroChequeosAviso, TipoServidor tipoServidor) {
		return lanzarTestArchivo(artefacto, numeroChequeosIncorrectos, numeroChequeosCorrectos, numeroChequeosAviso, "-a", InformeArtefacto.NOMBRE, tipoServidor, TipoNombreChequeos.Todos);
	}

	/**
	 * @param nombre
	 * @param ruta
	 * @param tipoFichero
	 */
	protected File lanzarTestArtefacto(Artefacto artefacto, int numeroChequeosIncorrectos, int numeroChequeosCorrectos, int numeroChequeosAviso, TipoServidor tipoServidor, TipoNombreChequeos filtro) {
		return lanzarTestArchivo(artefacto, numeroChequeosIncorrectos, numeroChequeosCorrectos, numeroChequeosAviso, "-a", InformeArtefacto.NOMBRE, tipoServidor, filtro);
	}


	/**
	 * @param nombre
	 * @param ruta
	 * @param tipoFichero
	 */
	protected File lanzarTestRecursos(Artefacto artefacto, int numeroChequeosIncorrectos, int numeroChequeosCorrectos, int numeroChequeosAviso, TipoServidor tipoServidor) {
		return lanzarTestArchivo(artefacto, numeroChequeosIncorrectos, numeroChequeosCorrectos, numeroChequeosAviso, "-r", InformeRecursos.NOMBRE, tipoServidor, TipoNombreChequeos.Todos);
	}
	
	/**
	 * @param nombre
	 * @param ruta
	 * @param tipoFichero
	 */
	protected File lanzarTestRecursos(Artefacto artefacto, int numeroChequeosIncorrectos, int numeroChequeosCorrectos, int numeroChequeosAviso, TipoServidor tipoServidor, TipoNombreChequeos filtro) {
		return lanzarTestArchivo(artefacto, numeroChequeosIncorrectos, numeroChequeosCorrectos, numeroChequeosAviso, "-r", InformeRecursos.NOMBRE, tipoServidor, filtro);
	}

	/**
	 * @param nombre
	 * @param ruta
	 * @param tipoFichero
	 */
	protected File lanzarTestEstaticos(Artefacto artefacto, int numeroChequeosIncorrectos, int numeroChequeosCorrectos, int numeroChequeosAviso, TipoServidor tipoServidor) {
		return lanzarTestArchivo(artefacto, numeroChequeosIncorrectos, numeroChequeosCorrectos, numeroChequeosAviso, "-e", InformeEstaticos.NOMBRE, tipoServidor, TipoNombreChequeos.Todos);
	}
	
	/**
	 * @param nombre
	 * @param ruta
	 * @param tipoFichero
	 */
	protected File lanzarTestEstaticos(Artefacto artefacto, int numeroChequeosIncorrectos, int numeroChequeosCorrectos, int numeroChequeosAviso, TipoServidor tipoServidor, TipoNombreChequeos filtro) {
		return lanzarTestArchivo(artefacto, numeroChequeosIncorrectos, numeroChequeosCorrectos, numeroChequeosAviso, "-e", InformeEstaticos.NOMBRE, tipoServidor, filtro);
	}
	

	private File lanzarTestArchivo(Artefacto artefacto, int numeroChequeosIncorrectos, int numeroChequeosCorrectos, int numeroChequeosAviso, String opcion, String nombreInforme, TipoServidor tipoServidor, TipoNombreChequeos filtro) {

		//Configuration
		File directorioInformes = crearDirectorio("informes");

		String direccionFisica = artefacto.persistirEnDisco();
		String[] args ={"-p", "CHECK", "-i", directorioInformes.getAbsolutePath(), opcion, direccionFisica, "-t",tipoServidor.toString(), "-f", filtro.toString()};


		Launcher launcher = new Launcher();

		//execution
		launcher.run(args);

		//Check
		File informe = new File(directorioInformes, nombreInforme);

		assertTrue("El directorio de informes contiene un informe", directorioInformes.list().length == 1);
		assertTrue("El informe debe contener el numero de chequeos incorrectos esperado", getNumeroChequeosIncorrectos(informe) == numeroChequeosIncorrectos);
		assertTrue("El informe debe contener el numero de chequeos correctos esperado", getNumeroChequeosCorrectos(informe) == numeroChequeosCorrectos);
		assertTrue("El informe debe contener el numero de chequeos con aviso esperado", getNumeroChequeosAviso(informe) == numeroChequeosAviso);
		return informe;
	}

	/*
	 * 
	 * @return
	 */
	private int getNumeroChequeosIncorrectos(File informe){
		return getNumeroCoincidenciasHtml(informe, "INCORRECTO");			
	}

	/*
	 * 
	 * @return
	 */
	private int getNumeroChequeosCorrectos(File informe){
		return getNumeroCoincidenciasHtml(informe, "CORRECTO");			
	}

	/*
	 * @return
	 */
	private int getNumeroChequeosAviso(File informe){
		return getNumeroCoincidenciasHtml(informe, "AVISO");			
	}

	private int getNumeroCoincidenciasHtml(File informe, String patron){
		int numeroCoincidencias = 0;
		final HtmlTable table = getPage(informe).getHtmlElementById("table");
		for (final HtmlTableRow row : table.getRows()) {
			List<?> numColumnas = row.getCells();
			if (numColumnas.size()==2){
				String valoracion = row.getCell(1).asText();
				
				if (valoracion.equals(patron)){
					numeroCoincidencias++;
				}
				
			}
			
		}
		
		return numeroCoincidencias;
	}

	private HtmlPage getPage(File informe){
		final WebClient webClient = new WebClient();
		HtmlPage page = null;
		String url = informe.toURI().toString();
	    try {
			page = webClient.getPage(url);
		} catch (Exception e) {
		}
	    return page;

	}

}
