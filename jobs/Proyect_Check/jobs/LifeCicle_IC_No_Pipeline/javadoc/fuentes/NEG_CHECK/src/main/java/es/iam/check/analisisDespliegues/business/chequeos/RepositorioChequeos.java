package es.iam.check.analisisDespliegues.business.chequeos;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import es.iam.check.analisisDespliegues.business.analizadores.AbstractAnalizador;
import es.iam.check.analisisDespliegues.business.analizadores.AnalizadorArtefacto;
import es.iam.check.analisisDespliegues.business.analizadores.AnalizadorEstaticos;
import es.iam.check.analisisDespliegues.business.analizadores.AnalizadorRecursos;
import es.iam.check.analisisDespliegues.business.analizadores.IAnalizador;
import es.iam.check.analisisDespliegues.business.chequeos.exception.InstalacionException;
import es.iam.check.analisisDespliegues.business.configuracion.TipoServidor;

/**
 * Existe un {@link AbstractAnalizador} por tipo de elemento que es analizable en un despliegue.
 * Un artefacto ear, el archivo de estaticos y los ficheros  de recursos por entorno. 
 * Por cada elemento que participa en el despliegue se deben pasar una serie de chequeos.
 * El {@link RepositorioChequeos} devuele una copia de la lista de chequeos que
 * debe pasar el analizador recogiendolos del xml de configuracion que debe existir
 * para cada tipo de servidor.
 * 
 * @author SSA005
 * @author ARD021
 */
public class RepositorioChequeos {

	/**
	 * Mapa de chequeos por clase de analizador. Este mapa guarda la relacion de
	 * chequeos que deben pasarse para el elemento a analizar.
	 */
	private Map<Class<? extends IAnalizador>, Collection<IChequeo>> chequeosPorTipoAnalizador = new HashMap<Class<? extends IAnalizador>, Collection<IChequeo>>();

	
	/**
	 * Objeto capza de analizar el xml con los chequeos que deben aplicarse a los objetos a analizar una
	 * vez seleccionado el tipo de servidor al que pertenece dicho objeto.
	 */
	private ChequeosFactory factory;

	/**
	 * PseudoConstructor capaz de instanciar los chequeos configurados para un tipo de servidor
	 * concreto pasado como parametro.
	 * @param tipoServidor el tipo de servidor donde se aplican los chequeos.
	 */
	public void init(TipoServidor tipoServidor){
		try {
	
			if (tipoServidor.equals(TipoServidor.WAS61))
				factory = new ChequeosFactory(getClass().getResourceAsStream("/xml/RepositorioWAS61.xml"));
			
			if (tipoServidor.equals(TipoServidor.WAS85))
				factory = new ChequeosFactory(getClass().getResourceAsStream("/xml/Repositorio85.xml"));
			
			if (tipoServidor.equals(TipoServidor.JBOSS))
				factory = new ChequeosFactory(getClass().getResourceAsStream("/xml/RepositorioJBOSS.xml"));
			
		} catch (Exception e) {
			throw new InstalacionException(e);
		}
		
		chequeosPorTipoAnalizador.put(AnalizadorArtefacto.class,cargarChequeosPorTipoAnalizador(AnalizadorArtefacto.class));
		chequeosPorTipoAnalizador.put(AnalizadorRecursos.class,cargarChequeosPorTipoAnalizador(AnalizadorRecursos.class));
		chequeosPorTipoAnalizador.put(AnalizadorEstaticos.class,cargarChequeosPorTipoAnalizador(AnalizadorEstaticos.class));
		
		
	}

	/**
	 * Devuelve una copia de los chequeos que el analizador debe comprobar.
	 * @param analizador Tipo de analizador a considerar.
	 * @return la copia de la lista de chequeos.
	 */
	public Collection<IChequeo> resuelveChequeosPorAnalizador(Class<? extends IAnalizador> analizador) {
		return chequeosPorTipoAnalizador.get(analizador);
	}

	
	/**
	 * La lista de chequeos para un artefacto ear.
	 * @param analizador Tipo de analizador a considerar.
	 * @return
	 */
	private Collection<IChequeo> cargarChequeosPorTipoAnalizador(Class<? extends AbstractAnalizador<?>> classz) {
		Collection<IChequeo> chequeos = new HashSet<IChequeo>();
		chequeos.addAll(factory.createChequeos(classz));
		return chequeos;
	}


}
