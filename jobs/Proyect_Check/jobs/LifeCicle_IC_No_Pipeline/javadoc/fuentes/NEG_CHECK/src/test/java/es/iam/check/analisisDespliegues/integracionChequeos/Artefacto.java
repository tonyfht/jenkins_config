package es.iam.check.analisisDespliegues.integracionChequeos;

import java.io.File;
import java.io.IOException;
import org.jboss.shrinkwrap.api.Archive;
import org.jboss.shrinkwrap.api.ArchivePath;
import org.jboss.shrinkwrap.api.asset.Asset;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.container.LibraryContainer;
import org.jboss.shrinkwrap.api.container.ManifestContainer;
import org.jboss.shrinkwrap.api.exporter.ZipExporter;
import org.jboss.shrinkwrap.api.spec.EnterpriseArchive;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.rules.TemporaryFolder;

/**
 * Recubre el objeto Archive de Shrinkwrap
 * @author SSA005
 */
public class Artefacto {
	
	/**
	 * La representacion de un artefacto para el
	 * proyecto Shrinkwrap
	 */
	private Archive<?> artefactoShrinkwrap;
	
	
	/**
	 * 
	 */
	private TemporaryFolder temporaryFolder;
	
	/**
	 * Constructor conveniente que crea un {@link Artefacto} a partir
	 * de un {@link Archive} de ShrinkWrap
	 */
	public Artefacto(Archive<?> artefactoShrinkwrap, TemporaryFolder temporaryFolder){
		this.artefactoShrinkwrap = artefactoShrinkwrap;
		this.temporaryFolder = temporaryFolder;
	}
	
	public String getNombre(){
		return getArtefactoShrinkwrap().getName();
	}
	

	/**
	 * @return
	 */
	public String persistirEnDisco() {
		File ficheroEnDisco = null;
		try {
			ficheroEnDisco = temporaryFolder.newFile(getNombre());
		} catch (IOException e) {
		}
		getArtefactoShrinkwrap().as(ZipExporter.class).exportTo(ficheroEnDisco, Boolean.TRUE);
		return ficheroEnDisco.getAbsolutePath();
		
	}
	
	/**
	 * 
	 * @param nombre
	 * @param path
	 * @return
	 */
	public Artefacto agregarManifest(String nombre){
		((ManifestContainer<?>)getArtefactoShrinkwrap()).addAsManifestResource(nombre, "MANIFEST.MF");
		return this;
	}
	
	/**
	 * 
	 * @param nombre
	 * @param path
	 * @return
	 */
	public Artefacto agregarManifest(){
		((ManifestContainer<?>)getArtefactoShrinkwrap()).addManifest();
		return this;
	}
	
	/**
	 * 
	 * @param nombre
	 * @param path
	 * @return
	 */
	public Artefacto agregarApplicationXML(String nombre){
		((EnterpriseArchive)getArtefactoShrinkwrap()).addAsApplicationResource(nombre, "application.xml");
		return this;
	}
	
	public Artefacto agregarApplicationXML(File applicationXml){
		((EnterpriseArchive)getArtefactoShrinkwrap()).addAsApplicationResource(applicationXml, "application.xml");
		return this;
	}
	
	/**
	 * 
	 * @param nombre
	 * @param path
	 * @return
	 */
	public Artefacto agregarWebXML(String nombre){
		((WebArchive)getArtefactoShrinkwrap()).addAsWebInfResource(nombre, "web.xml");
		return this;
	}
	
	/**
	 * 
	 * @param nombre
	 * @param path
	 * @return
	 */
	public Artefacto agregarArchivo(String nombre, String path){
		Asset asset= EmptyAsset.INSTANCE;
		if(path == null){
			path = ArchivePath.SEPARATOR + nombre;
		}else{
			path = path + ArchivePath.SEPARATOR + nombre;
		}
		getArtefactoShrinkwrap().add(asset, path);
		return this;
	}
	
	/**
	 * 
	 * @param nombre
	 * @param path
	 * @return
	 */
	public Artefacto agregarDirectorio(String nombre, String path) {
		if(path == null){
			path = nombre;
		}else{
			path = path + ArchivePath.SEPARATOR + nombre;
		}
		getArtefactoShrinkwrap().addAsDirectory(path);
		return this;
	}
	
	/**
	 * 
	 * @param nombre
	 * @param path
	 * @return
	 */
	public Artefacto agregarLibreria(Artefacto artefacto, String path) {
		if(path == null){
			path = ArchivePath.SEPARATOR + artefacto.getNombre();
		}else{
			path = path + ArchivePath.SEPARATOR + artefacto.getNombre();
		}
		((LibraryContainer<?>)getArtefactoShrinkwrap()).addAsLibrary(artefacto.getArtefactoShrinkwrap());
		return this;
	}
	
	/**
	 * @param artefacto
	 * @return
	 */
	public Artefacto agregarAplicacionWeb(Artefacto artefacto) {
		((EnterpriseArchive)getArtefactoShrinkwrap()).addAsModule(artefacto.getArtefactoShrinkwrap());
		return this;
		
	}
	
	
	/**
	 * @return the artefactoShrinkwrap
	 */
	public Archive<?> getArtefactoShrinkwrap() {
		return artefactoShrinkwrap;
	}



}
