package es.iam.check.analisisDespliegues.business.ficheros;

import java.util.Collection;
import es.iam.check.analisisDespliegues.business.analizadores.AnalizadorArtefacto;
import es.iam.check.analisisDespliegues.business.analizadores.AnalizadorEstaticos;
import es.iam.check.analisisDespliegues.business.analizadores.AnalizadorRecursos;
import es.iam.check.analisisDespliegues.business.analizadores.IAnalizador;
import es.iam.check.analisisDespliegues.business.chequeos.IChequeo;
import es.iam.check.analisisDespliegues.business.chequeos.model.TipoNombreChequeos;
import es.iam.check.analisisDespliegues.business.configuracion.Configuracion;

/**
 * Representa un tipo de fichero analizable.
 * @author SSA005
 */
public class FicheroAnalizable extends Fichero{


	/**
	 * Analizador usado por el directorio analizable.
	 */
	private IAnalizador analizador;

	/**
	 * Constructor de los ficheros analizables.
	 * @param tipoFichero tipo de fichero para analizar
	 * @param ruta ruta donde se ubica el fichero
	 * @param filtro filtro a aplicar
	 * @param chequeos listado de chequeos
	 */
	public FicheroAnalizable(String ruta, TipoFichero tipoFichero, TipoNombreChequeos filtro, Collection<IChequeo> chequeos) {
		super(ruta, tipoFichero, chequeos);
		this.analizador = seleccionarAnalizador(tipoFichero,chequeos);
		this.analizador.setFiltro(filtro);
	}
	

	/**
	 * Constructor de los ficheros analizables.
	 * @param tipoFichero tipo de fichero para analizar
	 * @param ruta ruta donde se ubica el fichero
	 * @param fichero fichero a revisar
	 * @param chequeos listado de chequeos
	 */
	public FicheroAnalizable(String ruta, Fichero fichero, TipoFichero tipoFichero, Collection<IChequeo> chequeos) {
		super(ruta, fichero, chequeos);
		setTipoFichero(tipoFichero);
		this.analizador = seleccionarAnalizador(tipoFichero,chequeos);
	}
	
	/**
	 * Analizado el directorio.
	 * @param conf el fichero de configuracion
	 */
	public void analizar(Configuracion conf){
		analizador.iniciarAnalisis();
		analizador.generarInforme(conf);
	}

	/*
	 * selecciona el analizador.
	 * @param tipoFichero el fichero a analizar.
	 * @param chequeos el listado de chequeos a aplicar.
	 */
	private IAnalizador seleccionarAnalizador(TipoFichero tipoFichero, Collection<IChequeo> chequeos) {
		IAnalizador analizador = null;
		switch (tipoFichero) {

		case APLICACION:{
			analizador = new AnalizadorArtefacto((FicheroComprimidoAnalizable) this, chequeos);
			break;
		}
		case RECURSOS:{
			analizador = new AnalizadorRecursos((FicheroComprimidoAnalizable) this, chequeos);
			break;
		}
		case ESTATICOS:{
			analizador = new AnalizadorEstaticos((FicheroComprimidoAnalizable) this, chequeos);
			break;
		}
		default:
			break;
		}
		return analizador;
	}
}
