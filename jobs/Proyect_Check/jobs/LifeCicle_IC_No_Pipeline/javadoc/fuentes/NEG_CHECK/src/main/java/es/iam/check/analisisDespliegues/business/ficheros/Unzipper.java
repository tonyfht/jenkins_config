package es.iam.check.analisisDespliegues.business.ficheros;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipFile;
import es.iam.check.analisisDespliegues.business.chequeos.IChequeo;

/**
 * Clase para descomprimir ficheros.
 * @author SSA005
 */
public class Unzipper {
	
	/**
	 * el tamaño del buffer.
	 */
	private static final int BUFFER = 2048;
	
	
	/**
	 * Descomprime una entrada de un fichero comprimido,
	 * que es a su vez un fichero comprimido.
	 * @param ficheroContenedor el fichero que se quiere descomprimir.
	 * @param entrada cada entrada del fichero comprimido.
	 * @param nombreAnalizado el nombre del fichero analizado.
	 * @param chequeos la lista de chequeos a aplicar.
	 * @return el Fichero comprimido analizable.
	 */
	public static FicheroComprimidoAnalizable unzipEntradaFicheroAnalizable(FicheroComprimidoAnalizable ficheroContenedor, JarEntry  entrada, String nombreAnalizado, Collection<IChequeo> chequeos){
		JarFile containerJarFile = ficheroContenedor.getZipFile();
		String destinationDirectory = System.getProperty("java.io.tmpdir");
		File tempDirectory = new File(destinationDirectory);

		File entryFile = new File(tempDirectory, entrada.getName());
		File destinationParent = entryFile.getParentFile();
		destinationParent.mkdirs();		
		int currentByte;
		byte data[] = new byte[BUFFER];
		FileOutputStream fileOutputStream = null;
		BufferedOutputStream bufferedOutputStream = null; 
		BufferedInputStream bufferedInputStream = null;

		try {
			bufferedInputStream = new BufferedInputStream(containerJarFile.getInputStream(entrada));
			fileOutputStream = new FileOutputStream(entryFile);
			bufferedOutputStream = new BufferedOutputStream(fileOutputStream, BUFFER);
			while ((currentByte = bufferedInputStream.read(data, 0, BUFFER)) != -1){
				bufferedOutputStream.write(data, 0, currentByte);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				bufferedOutputStream.flush();
				bufferedOutputStream.close();
				bufferedInputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
		return new FicheroComprimidoAnalizable(entryFile.getAbsolutePath(), ficheroContenedor, TipoFichero.INDETERMINADO,chequeos);
	}
	
	/**
	 * Descromprimir el ficheroContenedor se descomprime en otro fichero.
	 * @param ficheroContenedor fichero contenedor a descomprimir.
	 * @param rutaEntrada la ruta del fichero.
	 * @return el fichero descomprimido.
	 */
	public Fichero unzipFicheroAnalizable(Fichero ficheroContenedor, String rutaEntrada){
		 try {
			ZipFile ficheroComprimido = new ZipFile(ficheroContenedor.getFile());
			ZipEntry entrada = ficheroComprimido.getEntry(rutaEntrada);
			ficheroComprimido.getInputStream(entrada);
			ficheroComprimido.close();
		} catch (ZipException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

}
