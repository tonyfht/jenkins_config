package es.iam.check.analisisDespliegues.business.analizadores;

import java.util.Collection;
import java.util.HashSet;
import es.iam.check.analisisDespliegues.business.chequeos.IChequeo;
import es.iam.check.analisisDespliegues.business.chequeos.model.TipoNombreChequeos;
import es.iam.check.analisisDespliegues.business.configuracion.Configuracion;
import es.iam.check.analisisDespliegues.business.ficheros.Fichero;
import es.iam.check.analisisDespliegues.business.ficheros.FicheroAnalizable;
import es.iam.check.analisisDespliegues.business.view.informes.Informe;


/**
 * Clase base abstracta que aplica a todo tipo de artefacto analizable (artefacto,estaticos,recursos).
 * @param <T> cualquier clase que extienda de FicheroAnalizable.
 * @author SSA005
 * @author ARD021
 */
public abstract class AbstractAnalizador<T extends FicheroAnalizable> implements IAnalizador{
	
	/**
	 * Coleccion de chequeos que se deben de lanzar sobre el analizable.
	 */
	private Collection<IChequeo> chequeos = new HashSet<IChequeo>();
	
	/**
	 * El fichero que se analizara.
	 */
	private T ficheroAnalizable;
	
	/**
	 * Filtro que se aplicará a los chequeos.
	 */
	private TipoNombreChequeos filtro;
	 
	/**
	 *  Contructor del analizador, que establece el fichero a analizar y los chequeos que se realizaran
	 *  sobre el.
	 * @param ficheroAnalizar el fichero que se debe analizar.
	 * @param chequeos chequeos a aplicar al fichero a analizar.
	 */
	public AbstractAnalizador(T ficheroAnalizar, Collection<IChequeo> chequeos){
		ficheroAnalizable = ficheroAnalizar; 
		this.chequeos = chequeos;
	}

	/**
	 * Metodo que realiza el analisis de los chequeos aplicables al artefacto
	 * seleccionado con el filtro correspondiente.
	 */
	public void iniciarAnalisis() {
		Collection<Fichero> contenido = getFicheroAnalizable().listarRecursivo();
		contenido.add(getFicheroAnalizable());
		for (IChequeo chequeo : getChequeos()) {
			if (chequeo.getNombre().equals(getFiltro().toString()) ||getFiltro().toString().equals(TipoNombreChequeos.Todos.toString())){
				chequeo.ejecutar(contenido);
			}
		}
	}

	/**
	 * getter.
	 * @return the ficheroAnalizable fichero que se analizará.
	 */
	public T getFicheroAnalizable() {
		return ficheroAnalizable;
	}

	/**
	 * getter.
	 * @return the chequeos los chequeos que se aplicaran a un artefacto analizable.
	 */
	public Collection<IChequeo> getChequeos() {
		return chequeos;
	}

	/**
	 * getter.
	 * @return el filtro que se aplicará a los chequeos.
	 */
	public TipoNombreChequeos getFiltro() {
		return filtro;
	}

	/**
	 * setter.
	 * @param filtro filtro a aplicar.
	 */
	public void setFiltro(TipoNombreChequeos filtro) {
		this.filtro = filtro;
	}

	/**
	 * getter.
	 * @param conf configuracion que se solicta en linea de comandos.
	 * @param informe el Informe generado con los resultados de los análisis.
	 * @return el Informe generado con los resultados de los análisis.
	 */
	protected Informe getInforme(Configuracion conf, Informe informe) {
		informe.setFiltro(getFiltro());
		informe.componer(getChequeos(),conf);
		return informe;
	}

}
