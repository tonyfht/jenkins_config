package es.iam.check.analisisDespliegues.business.analizadores;

import java.util.Collection;

import es.iam.check.analisisDespliegues.business.chequeos.IChequeo;
import es.iam.check.analisisDespliegues.business.chequeos.model.TipoNombreChequeos;
import es.iam.check.analisisDespliegues.business.configuracion.Configuracion;
import es.iam.check.analisisDespliegues.business.ficheros.Fichero;
import es.iam.check.analisisDespliegues.business.ficheros.FicheroComprimidoAnalizable;
import es.iam.check.analisisDespliegues.business.view.informes.Informe;
import es.iam.check.analisisDespliegues.business.view.informes.InformeEstaticos;

/**
 * Analizador para el artefacto tipo estaticos.
 * @author SSA005
 */
public class AnalizadorEstaticos extends AbstractAnalizador<FicheroComprimidoAnalizable>{

	/**
	 * Constructor que recibe un fichero a analizar de tipo recurso y los chequeos a aplicarle.
	 * @param ficheroAnalizable fichero a analizar.
	 * @param chequeos los chequeos a aplicar.
	 */
	public AnalizadorEstaticos(FicheroComprimidoAnalizable ficheroAnalizable, Collection<IChequeo> chequeos) {
		super(ficheroAnalizable, chequeos);
	}
	
	/**
	 * Constructor que recibe un fichero a analizar de tipo recurso y los chequeos a aplicarle, junto con un filtro a aplicar.
	 * @param ficheroAnalizable fichero a analizar.
	 * @param filtro el filtro a aplicar al analisis.
	 * @param chequeos los chequeos a aplicar.
	 */
	public AnalizadorEstaticos(FicheroComprimidoAnalizable ficheroAnalizable, TipoNombreChequeos filtro, Collection<IChequeo> chequeos) {
		this(ficheroAnalizable,chequeos);
		setFiltro(filtro);
	}

	/** {@inheritDoc} */
	public void iniciarAnalisis() {
		Collection<Fichero> contenido = getFicheroAnalizable().listarRecursivo();
		contenido.add(getFicheroAnalizable());
		for (IChequeo chequeo : getChequeos()) {
			chequeo.ejecutar(contenido);
		}
	}

	/** {@inheritDoc} */
	public Informe generarInforme(Configuracion conf) {
		Informe informe = new InformeEstaticos();
		return getInforme(conf, informe);
	}

}
