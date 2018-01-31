package es.iam.check.analisisDespliegues.business.main;

import java.util.Map;

import es.iam.check.analisisDespliegues.business.chequeos.exception.InstalacionException;
import es.iam.check.analisisDespliegues.business.configuracion.Argumentos;
import es.iam.check.analisisDespliegues.business.configuracion.Configuracion;
import es.iam.check.analisisDespliegues.business.configuracion.excepcion.NumeroArgumentosIncorrectoException;
import es.iam.check.analisisDespliegues.business.configuracion.excepcion.UsoException;
import es.iam.check.analisisDespliegues.business.ficheros.FicheroAnalizable;
import es.iam.check.analisisDespliegues.business.ficheros.FicheroComprimidoAnalizable;
import es.iam.check.analisisDespliegues.business.ficheros.TipoFichero;

/**
 * Controla el ciclo de vida de la aplicacion.
 * @author SSA005
 * @author ARD021
 */
public class Launcher {
	
	
	/**
	 * Ejecuta el codigo de arranque de
	 * la aplicacion.
	 * @param args argumentos pasados en linea de comandos.
	 * 
	 */
	public void run(String[] args){
		try{
			Configuracion configuracion = inicializar(args);
			execute(configuracion);
		} catch (UsoException usoException) {
			Uso.mostrar();
		}catch (InstalacionException instExc) {
			Uso.mostrar("La instalación de la aplicación no es correcta. Revisarla:" + instExc);
		}
	}

   	/**
	 * Se inicia la aplicacion, configurandola a partir de los argumentos
	 * especificados.
	 * @param args argumentos de la linea de comandos.
	 * @return el objeto Configuracion que representa las opciones de ejecución del programa.
	 * @throws UsoException
	 */
	private Configuracion inicializar(String[] args) throws UsoException {
		Map<Argumentos, Object> argumentos =  leerArgumentosLineaComandos(args);
		Configuracion configuracion = new Configuracion(argumentos);
		return configuracion;
	}

	/**
	 * Ejecuta un analisis sobre el artefacto indicado.
	 * @param configuracion el objeto Configuracion que representa las opciones de ejecución del programa.
	 */
	private void execute(Configuracion conf) { 
		FicheroAnalizable ficheroAnalizable = obtenerFicheroAnalizar(conf);
		
		Configuracion.setFicheroAnalizar(ficheroAnalizable); 
		//FIXME : Esto es una gran chapuza pero para eliminarlo hay que terminar la refactorizacion
		//de la aplicación y recolocar algunas responsabilidades que
		//tenia la clase de configuración y que no lo pertenecian. Se ha hecho en parte...
			
		ficheroAnalizable.analizar(conf);
	}

	/**
	 * Trasnforma la linea de comandos en un mapa con semántica interna representando lo
	 * que se desea ejecutar en el análisis.
	 * @param args argumentos de la linea de comandos.
	 * @return mapa con las opciones que se deben ejecutar en el  analisis.
	 * @throws UsoException
	 */
	private Map<Argumentos, Object> leerArgumentosLineaComandos(String[] args)throws UsoException {
		Map<Argumentos, Object> argumentos = null;
		try{	
			argumentos = Argumentos.parsearLineaComandos(args);
		}catch (NumeroArgumentosIncorrectoException numeroArgumentosIncorrectoException) {
			throw new UsoException();
		}
		return argumentos;
	}
	
	/**
	 * Método que devuelve un fichero a analizar en base a las opciones de configuracion
	 * que se han seleccionado. El fichero analizable contiene los chequeos que deben aplicarse
	 * al mismo y un filtro para que solo se muestre en el informe de análisis los chequeos que
	 * se deseen. TODO: Esta responsabilidad era parte de la configuración (en forma inadecuada) 
	 * por lo que se ha extraido a esta clase como primer paso de una refactorización más profunda que está
	 * por hacer. 
	 * @param conf el objeto Configuracion que representa las opciones de ejecución del programa.
	 * @return el fichero a analizar.
	 */
	private FicheroAnalizable obtenerFicheroAnalizar(Configuracion conf) {
		FicheroAnalizable fichero= null;
		
		if (conf.getFicheroEstaticos()!=null){
			fichero = new FicheroComprimidoAnalizable(conf.getFicheroEstaticos().getPath(), TipoFichero.ESTATICOS, conf.getFiltroTipoNombreChequeos(),conf.resuelveChequeosPorAnalizador(TipoFichero.ESTATICOS));	
		}
		if (conf.getFicheroRecursos()!=null){
			fichero = new FicheroComprimidoAnalizable(conf.getFicheroRecursos().getPath(), TipoFichero.RECURSOS, conf.getFiltroTipoNombreChequeos(),conf.resuelveChequeosPorAnalizador(TipoFichero.RECURSOS));
		}
		if (conf.getFicheroArtefacto()!=null){
			fichero = new FicheroComprimidoAnalizable(conf.getFicheroArtefacto().getPath(), TipoFichero.APLICACION, conf.getFiltroTipoNombreChequeos(),conf.resuelveChequeosPorAnalizador(TipoFichero.APLICACION));
		}
			
		return fichero;
	}
}
