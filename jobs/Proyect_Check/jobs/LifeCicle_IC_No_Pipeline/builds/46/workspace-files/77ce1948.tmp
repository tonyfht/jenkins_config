package es.iam.check.analisisDespliegues.business.ficheros;

import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.zip.ZipEntry;

import es.iam.check.analisisDespliegues.business.chequeos.IChequeo;
import es.iam.check.analisisDespliegues.business.chequeos.model.TipoNombreChequeos;



/**
 * Representa un tipo de fichero analizable que este comprimido.
 * @author SSA005
 */
public class FicheroComprimidoAnalizable extends FicheroAnalizable{
	

	/**
	 * Constructor de los ficheros comprimidos analizables.
	 * @param tipoFichero tipo de fichero para analizar
	 * @param ruta ruta donde se ubica el fichero
	 * @param filtro filtro a aplicar
	 * @param chequeos listado de chequeos
	 */
	public FicheroComprimidoAnalizable(String ruta, TipoFichero tipoFichero, TipoNombreChequeos filtro, Collection<IChequeo> chequeos) {
		super(ruta, tipoFichero, filtro, chequeos);
		
	}
	
	/**
	 * Constructor de los ficheros comprimidos analizables.
	 * @param tipoFichero tipo de fichero para analizar
	 * @param ruta ruta donde se ubica el fichero
	 * @param fichero fichero a revisar
	 * @param chequeos listado de chequeos
	 */
	public FicheroComprimidoAnalizable(String ruta, Fichero fichero, TipoFichero tipoFichero, Collection<IChequeo> chequeos) {
		super(ruta, fichero, tipoFichero, chequeos);
	}
	
	

	/**
	 * listado recursivo de los ficheros.
	 * @see es.iam.check.analisisDespliegues.business.ficheros.Fichero#listarRecursivo()
	 * @return lista de ficheros a retornar
	 */
	@Override
	public Collection<Fichero> listarRecursivo() {
		JarFile  file = getZipFile();
		Collection<Fichero> contenido = new HashSet<Fichero>();
		Enumeration<JarEntry> entradasComprimidas = file.entries();
		while (entradasComprimidas.hasMoreElements()){
			JarEntry entrada = entradasComprimidas.nextElement();
			if ((esArchivoComprimido(cambiarSentidoSeparadorDirectorios(entrada)))){
				String nombreAnalisis = getRuta().concat(File.separator).concat(cambiarSentidoSeparadorDirectorios(entrada));
				FicheroComprimidoAnalizable nuevoFicheroComprimidoAnalizable = Unzipper.unzipEntradaFicheroAnalizable(this, entrada, nombreAnalisis,super.getChequeos());
				contenido.add(nuevoFicheroComprimidoAnalizable);
				contenido.addAll(nuevoFicheroComprimidoAnalizable.listarRecursivo());
			}else{
				contenido.add(new Fichero(getRuta().concat(File.separator).concat(cambiarSentidoSeparadorDirectorios(entrada)), this));
			}
		}
		return contenido;
	}
	
	@Override
	public String rutaRelativa() {
		return getNombre();
	}

	/*
	 * Metodo que cambia los separadores.
	 * @param entrada la entrada zipeada.
	 */
	private String cambiarSentidoSeparadorDirectorios(ZipEntry entrada) {
		return entrada.getName().replace('/', File.separatorChar);
	}

	/*
	 * Metodo que identifica si el archivo es comprimido.
	 * @param nombreFichero el nombre de fichero que se interroga.
	 */
	private boolean esArchivoComprimido(String nombreFichero) {
		TipoExtension tipoExtension = TipoExtension.extension(nombreFichero);
		return (tipoExtension == TipoExtension.EAR || tipoExtension == TipoExtension.WAR)?true:false;
	}

	/**
	 * Obtener el fichero de zip.
	 * @return JarFile lista de ficheros a retornar.
	 */
	protected JarFile getZipFile(){
		JarFile zipFile = null;
		try {
			zipFile = new JarFile (getFile());
		} catch (IOException e) {
			e.printStackTrace();
		}
		return zipFile;
	}

}
