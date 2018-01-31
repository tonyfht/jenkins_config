package es.iam.check.analisisDespliegues.business.chequeos;

import java.util.Collection;
import es.iam.check.analisisDespliegues.business.chequeos.incidencias.IncidenciaChequeo;
import es.iam.check.analisisDespliegues.business.chequeos.reglas.IRegla;
import es.iam.check.analisisDespliegues.business.ficheros.Fichero;

/**
 * Interface que define las caracteristicas a cumplir para todos los
 * chequeos que se definan.
 * @author SSA005
 */
public interface IChequeo {
	
	/**
	 * Agrega una regla de negocio al chequeo.
	 * @param regla a agregar.
	 */
	void agregarRegla(IRegla regla);
	
	/**
	 * Agrega una regla adicional previa a las reglas de negocio del chequeo.
	 * @param reglaAdicional a agregar.
	 */
	void agregarReglaPrevia(IRegla reglaAdicional);
	
	/**
	 * Comprueba los chequeos contra el contenido que se ha de analizar.
	 * @param contenido contenido sobre el que se analizaran los chequeos.
	 */
	void ejecutar(Collection<Fichero> contenido);
	
	/**
	 * Devuelve la valoracion del chequeo teniendo en cuenta
	 * los resultado de las incidencias durante el analisis.
	 * @return la valoración de la incidencia detectada.
	 */
	Valoracion getValoracion();
	
	/**
	 * Devuelve la descripcion del chequeo que se mostrara en el informe.
	 * @return la descripción del chequeo.
	 */
	String getDescripcion();
	
	/**
	 * Devuelve el nombre del chequeo que se mostrara en el informe.
	 * @return el nombre del chequeo. 
	 */
	String getNombre();	
	
	/**
	 * Devuelve el mensaje de la valoracion general del chequeo, que se
	 * mostrara en el informe.
	 * @param valoracion la valoracion de la que extraer el mensaje.
	 * @return el mensaje asociado a la valoración del chequeo.
	 */
	String getMensaje(Valoracion valoracion);
	
	/**
	 * Devuelve las incidencias encontradas en el analisis
	 * durante las comprobaciones del chequeo.
	 * @return la collección de incidencias de un chequeo aplicado.
	 */
	Collection<IncidenciaChequeo> getIncidenciasChequeo();

}
