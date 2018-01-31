package es.iam.check.analisisDespliegues.business.chequeos;

import java.util.Collection;
import java.util.HashSet;

import es.iam.check.analisisDespliegues.business.chequeos.incidencias.IncidenciaChequeo;
import es.iam.check.analisisDespliegues.business.chequeos.incidencias.IncidenciaChequeo.NivelIncidencia;
import es.iam.check.analisisDespliegues.business.chequeos.reglas.IRegla;
import es.iam.check.analisisDespliegues.business.chequeos.reglas.ReglaContenido;
import es.iam.check.analisisDespliegues.business.chequeos.reglas.ReglaContenidoXML;
import es.iam.check.analisisDespliegues.business.chequeos.reglas.TipoComprobacion;
import es.iam.check.analisisDespliegues.business.ficheros.Fichero;


/**
 * Chequeos que se aplican al contenido de los descriptores de despliegue.
 * @author SSA005
 */
public class ChequeoContenidoDescriptoresDespliegue extends AbstractChequeo{
	
	/**
	 * Estos ficheros deberian haber sido encontrados en el analisis.
	 */
	private Collection<IRegla> reglasContObligNoEncontrados = new HashSet<IRegla>();
	
	
	/**
	 * Constructor conveniente del chequeo.
	 * @param nombre : nombre identificativo del chequeo
	 * @param descripcion : texto que explica el chequeo
	 * @param mensajeIncorrecto : mensaje que notifica que el chequeo ha sido valorado como incorrecto
	 * @param mensajeCorrecto : mensaje que notifica que el chequeo ha sido valorado como correcto
	 * @param mensajeAviso : mensaje que notifica que el chequeo ha sido valorado con una advertencia 
	 */
	public ChequeoContenidoDescriptoresDespliegue(String nombre, String descripcion,String mensajeIncorrecto, String mensajeCorrecto, String mensajeAviso) {
		super(nombre, descripcion, mensajeIncorrecto, mensajeCorrecto, mensajeAviso);
	}

	/** {@inheritDoc} */
	@Override
	public void agregarRegla(IRegla regla) {
		super.agregarRegla(regla);
		if (regla.getTipoComprobacion() == TipoComprobacion.OBLIGATORIEDAD){
			reglasContObligNoEncontrados.add(regla);
		}
	}
	
	/** {@inheritDoc} */
	@Override
	protected void valorar() {
		for (IRegla regla : reglasContObligNoEncontrados) {
			NivelIncidencia nivelIncidencia = regla.getTipoComprobacion() == TipoComprobacion.EXISTENCIA?NivelIncidencia.ADVERTENCIA:NivelIncidencia.ERROR;
			registraIncidenciaChequeo(nivelIncidencia, regla.getEjemplo(), " ");
		}
		super.valorar();
	}


	/**
	 * Registra el evento de cumplimiento de forma distinta dependiendo del tipo de comprobacion
	 * se que efectuaba sobre el fichero.
	 * @param regla regla a registrar.
	 * @param fichero fichero a tratar.
	 * 
	 */
	protected void registrar(IRegla regla, Fichero fichero){
		String cadena = null;
		if (regla instanceof ReglaContenido) {
			cadena = ((ReglaContenido)regla).getCadena();
		}
		else {
			cadena = ((ReglaContenidoXML)regla).getCadena();
		}
		TipoComprobacion tipoComprobacion = regla.getTipoComprobacion();

		switch (tipoComprobacion) {
		case PROHIBIDO:{
			registraIncidenciaChequeo(IncidenciaChequeo.NivelIncidencia.ERROR, fichero.rutaRelativa(), " " + cadena);
			break;	
		}
		case EXISTENCIA:{
			registraIncidenciaChequeo(IncidenciaChequeo.NivelIncidencia.ADVERTENCIA, fichero.rutaRelativa(), " " + cadena);
			break;	
		}
		case OBLIGATORIEDAD:{
			marcarContenidoObligatorioEncontrado(regla);
			break;
		}
		}		
	}

	/**
	 * Marca el contenido obligatorio como encontrado.
	 * @param regla la regla a tratar.
	 */
	private void marcarContenidoObligatorioEncontrado(IRegla regla) {
		reglasContObligNoEncontrados.remove(regla);
	}

}
