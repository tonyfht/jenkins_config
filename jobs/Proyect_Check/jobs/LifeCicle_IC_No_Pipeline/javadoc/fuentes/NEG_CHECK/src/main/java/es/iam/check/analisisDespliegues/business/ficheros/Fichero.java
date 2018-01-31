package es.iam.check.analisisDespliegues.business.ficheros;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.HashSet;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipFile;
import es.iam.check.analisisDespliegues.business.chequeos.IChequeo;
import es.iam.check.analisisDespliegues.business.configuracion.Configuracion;

/**
 * Recubre un fichero Java.
 * @author SSA005
 */
public class Fichero{
	
	/**
	 * La ruta original del fichero.
	 */
	private String ruta;
	
	/**
	 * El nombre del fichero, puede coincidir
	 * con el nombre del fichero o tener un nombre identificativo
	 * especial.
	 */
	private String nombre;
	
	
	/**
	 * si es un directorio.
	 */
	private Boolean esDirectorio;
	
	/**
	 * El tipo de fichero del que se trata.
	 */
	private TipoFichero tipoFichero;
	
	/**
	 * Si el fichero pertenecia al contenido de otro fichero
	 * habra una referencia a su contenedor.
	 */
	private Fichero ficheroContenedor;

    /**
     * Chequeos a aplicar al fichero.
     */
	private Collection<IChequeo> chequeos;
	
	/**
	 * Constructor pasando una ruta que representa
	 * la ubicacion del fichero.
	 * @param ruta la ruta del fichero.
	 */
	public Fichero(String ruta){
		this.ruta = ruta;
		File file = getFile();
		this.esDirectorio = file.isDirectory();
		this.nombre = file.getName();
		if(esDirectorio){
			tipoFichero = TipoFichero.DIRECTORIO;
		}
	}
	
	/**
	 * Constructor pasando una ruta que representa
	 * la ubicacion del fichero.
	 * @param ruta la ruta del fichero.
	 * @param tipoFichero tipo de fichero para analizar
	 */
	public Fichero(String ruta, TipoFichero tipoFichero){
		this(ruta);
		this.tipoFichero = tipoFichero;
	}
	
	/**
	 * Constructor pasando una ruta que representa
	 * la ubicacion del fichero.
	 * @param tipoFichero tipo de fichero para analizar
	 * @param ruta ruta donde se ubica el fichero
	 * @param chequeos listado de chequeos
	 */
	public Fichero(String ruta, TipoFichero tipoFichero, Collection<IChequeo> chequeos){
		this(ruta);
		this.tipoFichero = tipoFichero;
		this.setChequeos(chequeos);
	}
	/**
	 * Constructor pasando una ruta que representa
	 * la ubicacion del fichero.
	 * @param fichero fichero a revisar
	 * @param ruta ruta donde se ubica el fichero
	 * @param chequeos listado de chequeos
	 */
	public Fichero(String ruta, Fichero fichero,  Collection<IChequeo> chequeos) {
		this(ruta);
		this.ficheroContenedor = fichero;
		this.setChequeos(chequeos);
	}
	
	/**
	 * Constructor pasando una ruta que representa
	 * la ubicacion del fichero.
	 * @param ruta ruta donde se ubica el fichero
	 * @param fichero fichero a representar.
	 */
	public Fichero(String ruta, Fichero fichero) {
		this(ruta);
		this.ficheroContenedor = fichero;
	}


	/**
	 * Devuelve el contenido de un fichero si es un directorio.
	 * @return la coleccion de ficheros
	 */
	public Collection<Fichero> listar() {
		File  file = getFile();
		Collection<Fichero> contenido = new HashSet<Fichero>();
		if(esDirectorio()){
			for (File fileInside : file.listFiles()) {
				contenido.add(new Fichero(fileInside.getAbsolutePath(), this));
			}
		}
		return contenido;
	}
	
	
	/**
	 * Devuelve el contenido de un fichero si es un directorio.
	 * @return la coleccion de ficheros
	 */
	public Collection<Fichero> listarRecursivo() {
		File  file = getFile();
		Collection<Fichero> contenido = new HashSet<Fichero>();
		if(esDirectorio()){
			Fichero nuevoFichero = null;
			for (File fileInside : file.listFiles()) {
				nuevoFichero = new Fichero(fileInside.getAbsolutePath(), this);
				contenido.add(nuevoFichero);
				if(fileInside.isDirectory()){
					contenido.addAll(nuevoFichero.listarRecursivo());
				}
			}
		}
		return contenido;
	}
	
	/**
	 * Retornar el contenido.
	 * @return el contenido a devolver.
	 */
	public String getContenido(){
		String contenido = null;
		ZipFile ficheroComprimido = null;
		ZipEntry entrada = null;
		try {
			ficheroComprimido = new ZipFile(ficheroContenedor.getFile());
			entrada = ficheroComprimido.getEntry(obtenerRutaEntrada());
			InputStream is = ficheroComprimido.getInputStream(entrada);
			java.util.Scanner scanner = new java.util.Scanner(is);
			contenido = scanner.useDelimiter("\\A").next();
			scanner.close();
			ficheroComprimido.close();
		} catch (ZipException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return contenido;
	}
	
	/**
	 * La ruta relativa.
	 * @return la ruta a retornar.
	 */
	public String rutaRelativa(){
		String rutaRelativa = "";
		int principioRuta = getRuta().indexOf(Configuracion.getFicheroAnalizar().getNombre());
		if(principioRuta < 0){
			String rutaAnterior = getFicheroContenedor().getFicheroContenedor().rutaRelativa();
			rutaRelativa = rutaAnterior.concat(File.separator).concat(getRuta().substring(getRuta().indexOf(getFicheroContenedor().getNombre())));
		}else{
			rutaRelativa = getRuta().substring(getRuta().indexOf(Configuracion.getFicheroAnalizar().getNombre()));
		}
		return rutaRelativa;
	}
	
	/**
	 * Getter.
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Setter.
	 * @param nombre the nombre to set
	 */
	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Getter.
	 * @return the tipoFichero
	 */
	public TipoFichero getTipoFichero() {
		return tipoFichero;
	}


	/**
	 * Getter.
	 * @return the directorio
	 */
	public Boolean esDirectorio() {
		return esDirectorio;
	}

	/**
	 * Getter.
	 * @return the ruta.
	 */
	public String getRuta() {
		return ruta;
	}


	/**
	 * Setter.
	 * @param ruta the ruta to set.
	 */
	public void setRuta(String ruta) {
		this.ruta = ruta;
	}
	
	/**
	 * Getter.
	 * @return el fihcero a devolver.  
	 */
	public File getFile() {
		return new File(ruta);
	}
	
	/**
	 * Setter.
	 * @param tipoFichero the tipoFichero to set
	 */
	public void setTipoFichero(TipoFichero tipoFichero) {
		this.tipoFichero = tipoFichero;
	}

	/**
	 * Getter.
	 * @return the ficheroContenedor
	 */
	public Fichero getFicheroContenedor() {
		return ficheroContenedor;
	}
	
	/**
	 * Se obtiene la ruta de entrada.
	 * @return la ruta de entrada
	 */
	private String obtenerRutaEntrada() {
		String ruta = "";
		String nombreFicheroContenedor = getFicheroContenedor().getNombre();
		String rutaRelativa = rutaRelativa();
		if(rutaRelativa.contains(nombreFicheroContenedor)){
			ruta = rutaRelativa.substring(rutaRelativa.lastIndexOf(nombreFicheroContenedor));
		}
		return ruta.substring(nombreFicheroContenedor.length() + 1).replace("\\", "/");
	}

	/**
	 * Se obtienen los chequeos.
	 * @return lista de chequeos
	 */
	public Collection<IChequeo> getChequeos() {
		return chequeos;
	}
	
	/**
	 * Setter.
	 * @param chequeos the ficheroContenedor
	 */
	public void setChequeos(Collection<IChequeo> chequeos) {
		this.chequeos = chequeos;
	}

	/**
	 * Getter.
	 * @return la cadena a imprimir.
	 */
	public String toString(){
		return ruta;
	}

	
}
