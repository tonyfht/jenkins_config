package es.iam.check.analisisDespliegues.business.chequeos;

import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

import es.iam.check.analisisDespliegues.business.chequeos.incidencias.IncidenciaChequeo.NivelIncidencia;
import es.iam.check.analisisDespliegues.business.chequeos.reglas.IRegla;
import es.iam.check.analisisDespliegues.business.ficheros.Fichero;

/**
 * Chequeo que detecta las librerias duplicadas existentes en un artefacto.
 * @author SSA005
 */
public class ChequeoLibreriasDuplicadas extends AbstractChequeo{

	/**
	 * Librerias que se han encontrado tanto en el .ear\lib como en el *.war\WEB-INF\lib.
	 */
	private Map<String, String> digestLibreriasEncontradas = new HashMap<String, String>();

	/**
	 * Constructor conveniente del chequeo.
	 * @param nombre : nombre identificativo del chequeo
	 * @param descripcion : texto que explica el chequeo
	 * @param mensajeIncorrecto : mensaje que notifica que el chequeo ha sido valorado como incorrecto
	 * @param mensajeCorrecto : mensaje que notifica que el chequeo ha sido valorado como correcto
	 * @param mensajeAviso : mensaje que notifica que el chequeo ha sido valorado con una advertencia 
	 */
	public ChequeoLibreriasDuplicadas(String nombre, String descripcion, String mensajeIncorrecto, String mensajeCorrecto, String mensajeAviso) {
		super(nombre, descripcion, mensajeIncorrecto, mensajeCorrecto, mensajeAviso);
	}

	/**
	 * registra una libreria leyendo su archivo MANIFEST.
	 * @param regla la regla a registrar.
	 * @param fichero la libreria a tratar.
	 */
	protected void registrar(IRegla regla,Fichero fichero) {
		String digest = calcularMD5(fichero);
		if (digestLibreriasEncontradas.containsKey(digest)){
			registraIncidenciaChequeo(NivelIncidencia.ERROR, fichero.rutaRelativa(), "Esta libreria esta duplicada con: " + digestLibreriasEncontradas.get(digest));
		}else{
			digestLibreriasEncontradas.put(digest, fichero.rutaRelativa());
		}
	}

	/**
	 * calculo del md5 de un fichero.
	 * @param fichero el fichero sujeto del calculo.
	 * @return la cadena hexadecimal con el md5.
	 */
	private String calcularMD5(Fichero fichero) {
		JarFile jarFile;
		String digest = null;
		InputStream iStream = null;
		String rutaEntrada =obtenerRutaJar(fichero);
		try{
			MessageDigest algorithm = MessageDigest.getInstance("MD5");
			jarFile = new JarFile(fichero.getFicheroContenedor().getFile());
			JarEntry jarEntry= jarFile.getJarEntry(rutaEntrada);
			iStream = jarFile.getInputStream(jarEntry);
			Scanner scanner = new Scanner(iStream);
			byte[] defaultBytes = scanner.useDelimiter("\\A").next().getBytes();
			algorithm.reset();
			algorithm.update(defaultBytes);
			byte messageDigest[] = algorithm.digest();
			StringBuffer hexString = new StringBuffer();

			for (int i = 0; i < messageDigest.length; i++){
				String hex = Integer.toHexString(0xFF & messageDigest[i]);
				if (hex.length() == 1){
					hexString.append('0');
				}
				hexString.append(hex);
			}
			digest = hexString.toString();
			jarFile.close();
			scanner.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		
		return digest;
	}

	/**
	 * Obtiene la ruta al artefacto.
	 * @param fichero el fichero.
	 * @return la ruta calculada.
	 */
	private String obtenerRutaJar(Fichero fichero) {
		String ruta = "";
		String nombreFicheroContenedor = fichero.getFicheroContenedor().getNombre();
		String rutaRelativa = fichero.rutaRelativa();
		if(rutaRelativa.contains(nombreFicheroContenedor)){
			ruta = rutaRelativa.substring(rutaRelativa.lastIndexOf(nombreFicheroContenedor));
		}
		return ruta.substring(nombreFicheroContenedor.length() + 1).replace("\\", "/");
	}

}
