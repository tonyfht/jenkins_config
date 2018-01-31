package es.iam.check.analisisDespliegues.business.chequeos;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;

import es.iam.check.analisisDespliegues.business.analizadores.AbstractAnalizador;
import es.iam.check.analisisDespliegues.business.analizadores.AnalizadorArtefacto;
import es.iam.check.analisisDespliegues.business.analizadores.AnalizadorEstaticos;
import es.iam.check.analisisDespliegues.business.analizadores.AnalizadorRecursos;
import es.iam.check.analisisDespliegues.business.chequeos.exception.InstalacionException;
import es.iam.check.analisisDespliegues.business.chequeos.model.ObjectFactory;
import es.iam.check.analisisDespliegues.business.chequeos.model.TipoAnalisis;
import es.iam.check.analisisDespliegues.business.chequeos.model.TipoChequeo;
import es.iam.check.analisisDespliegues.business.chequeos.model.TipoChequeos;
import es.iam.check.analisisDespliegues.business.chequeos.model.TipoRegla;
import es.iam.check.analisisDespliegues.business.chequeos.model.TipoReglas;
import es.iam.check.analisisDespliegues.business.chequeos.model.ValuesTipoRegla;
import es.iam.check.analisisDespliegues.business.chequeos.model.ValuesTiposChequeos;
import es.iam.check.analisisDespliegues.business.chequeos.reglas.IRegla;
import es.iam.check.analisisDespliegues.business.chequeos.reglas.ReglaArchivo;
import es.iam.check.analisisDespliegues.business.chequeos.reglas.ReglaContenido;
import es.iam.check.analisisDespliegues.business.chequeos.reglas.ReglaContenidoXML;
import es.iam.check.analisisDespliegues.business.chequeos.reglas.TipoComprobacion;
import es.iam.check.analisisDespliegues.business.chequeos.reglas.TratamientoMayusculas;

/**
 * Clase encargada de obtener el conjunto de chequeos(como lista) necesarios para un tipo de analizador
 * concreto. Trabaja contra una url o un stream que contiene una configuración xml de dichos chequeos
 * y que puede ser validada contra el schema correspondiente.
 * 
 * @author ARD021
 *
 */
public class ChequeosFactory {
	
    /**
     * Configuración de chequeos de todos los tipos de análisis de los que se 
     * pueden recuperar chequeos. Es el elemento raiz del xml de configuración de 
     * cada tipo de servidor.
     */
	private TipoAnalisis tipoAnalisis;
	

	/**
	 * Constructor basado en un stream.
	 * @param stream contiene  el xml con la configuración de los chequeos.
	 */
	public ChequeosFactory( InputStream stream ) {
		
		tipoAnalisis = getConfiguracion(stream);
			
	}
	
	/**
	 * Metodo que recupera una lista de chequeos acorde al tipo de analizador que se solicita.
	 * @param tipoAnalizador el tipo de analizador a tratar.
	 * @return el conjunto de chequeos a tener en cuenta.
	 */
	public Collection<IChequeo> createChequeos (Class<? extends AbstractAnalizador<?>> tipoAnalizador) {
		
		List<TipoChequeos> listaTipoChequeos = null;
		
	       if (tipoAnalizador.equals(AnalizadorEstaticos.class)){
	    	   listaTipoChequeos = tipoAnalisis.getAnalizadorEstaticos().getChequeos();
	       }else if(tipoAnalizador.equals(AnalizadorRecursos.class)){
	    	   listaTipoChequeos = tipoAnalisis.getAnalizadorRecursos().getChequeos();
	       }else if(tipoAnalizador. equals(AnalizadorArtefacto.class)){
	    	   listaTipoChequeos = tipoAnalisis.getAnalizadorArtefacto().getChequeos();
	       }else{
	    	   throw new IllegalArgumentException("No hay analizadores de este tipo");   
	       }
	       
	     Collection<IChequeo> chequeos = getChequeos( listaTipoChequeos );	
	       
	     return chequeos; 
	 }

	
	
	/**
	 * Metodo que obtiene toda la configuración del xml de chequeos para un tipo de servidor y que
	 * es validado para ser desserializado en un objeto TipoAnalisis que representa todo el xml.
	 * @param xml en formato stream que representa el fichero con la configuración de los chequeos a aplicar
	 * a un tipo de servidor concreto. 
	 * @return devuelve el objeto raiz del xml una vez desserializado por JAXB.
	 */
	private TipoAnalisis getConfiguracion(InputStream xml) {

		TipoAnalisis tipoAnalisis = null;

		try {

			SchemaFactory sf = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
			InputStream stream = getClass().getResourceAsStream("/xml/repositorio.xsd");
			
			Schema schema = sf.newSchema(new StreamSource(stream)); 
			JAXBContext jc = JAXBContext.newInstance(ObjectFactory.class);
			Unmarshaller unmarshaller = jc.createUnmarshaller();
			unmarshaller.setSchema(schema);
			
			JAXBElement<TipoAnalisis> element = unmarshaller.unmarshal(
					new StreamSource(xml), TipoAnalisis.class);
			tipoAnalisis = element.getValue();
			xml.close();
			
		} catch (Exception e) {
			throw new InstalacionException(e);
		}

		return tipoAnalisis;

	}
	
	/**
	 * Metodo encargado de recuperar los chequeos que se encuentran dentro del analisis
	 * de un tipo de artefacto que ha sido obtenido del xml de configuración de chequeos.
	 * @param listaTipoChequeos los chequeos de un tipo de analisis.
	 * @return las lista de objetos chequeos que se deben aplicar al objeto que se analizará.
	 */
	private Collection<IChequeo> getChequeos( List<TipoChequeos> listaTipoChequeos ) {

		Collection<IChequeo> chequeos = new HashSet<IChequeo>();

		for (TipoChequeos tipoChequeos : listaTipoChequeos) {

			for (TipoChequeo tipoChequeo : tipoChequeos.getChequeo()) {

				AbstractChequeo chequeo = null;
				
				if (tipoChequeo.getTipo()
						.equals(ValuesTiposChequeos.CHEQUEO_EXISTENCIA_FICHEROS
								.value())) {
					 chequeo = new ChequeoExistenciaFicheros(
							tipoChequeo.getNombre().toString(),
							tipoChequeo.getDescripcion(),
							tipoChequeo.getMensaje().getIncorrecto(),
							tipoChequeo.getMensaje().getCorrecto(), tipoChequeo
							.getMensaje().getAvisos());
				}
				
				if (tipoChequeo.getTipo()
						.equals(ValuesTiposChequeos.CHEQUEO_CONTENIDO_DESCRIPTORES_DESPLIEGUE
								.value())) {
					chequeo = new ChequeoContenidoDescriptoresDespliegue(
								tipoChequeo.getNombre().toString(),
								tipoChequeo.getDescripcion(),
								tipoChequeo.getMensaje().getIncorrecto(),
								tipoChequeo.getMensaje().getCorrecto(), tipoChequeo
								.getMensaje().getAvisos());

					
				}
				
				if (tipoChequeo.getTipo()
						.equals(ValuesTiposChequeos.CHEQUEO_LIBRERIAS_DUPLICADAS
								.value())) {
					chequeo = new ChequeoLibreriasDuplicadas(
							tipoChequeo.getNombre().toString(),
							tipoChequeo.getDescripcion(),
							tipoChequeo.getMensaje().getIncorrecto(),
							tipoChequeo.getMensaje().getCorrecto(), tipoChequeo
							.getMensaje().getAvisos());
					
				}
				
				List<IRegla> reglas = getReglas(tipoChequeo
						.getReglas());

				for (IRegla regla : reglas) {
					if (regla instanceof ReglaArchivo && chequeo instanceof ChequeoContenidoDescriptoresDespliegue){
						chequeo.agregarReglaPrevia(regla);
					}else
						chequeo.agregarRegla(regla);
				}

				chequeos.add(chequeo);


			}

		}

		return chequeos;
	}

	/**
	 * Metodo encargado de devolver una lista de Reglas instanciadas a a partir del objeto que representa
	 * el conjunto de reglas que se encuentra en cada chequeo del xml de configuración en forma de objeto
	 * TipoReglas.
	 * @param tipoReglas Objeto que representa el conjunto de reglas de un chequeo xml.
	 * @return la lista de reglas que tiene cada chequeo del xml (representado por el objeto TipoReglas) y
	 * que se aplicará dentro de un chequeo al objeto que se analizará.
	 */
	private List<IRegla> getReglas (TipoReglas tipoReglas){
		
		List<IRegla> reglasArchivo = new ArrayList<IRegla>();
		for (TipoRegla regla: tipoReglas.getRegla()){
			
			if (regla.getTipo().equals(ValuesTipoRegla.REGLA_ARCHIVO)){
				
				ReglaArchivo reglaArchivo = new ReglaArchivo(regla.getEjemplo(), regla.getPatronOCadena(), TipoComprobacion.valueOf(regla.getTipoComprobacion().toString()),
				TratamientoMayusculas.valueOf(regla.getTratamientoMayusculas().toString()));
				reglasArchivo.add(reglaArchivo);
				
			}
			
			if (regla.getTipo().equals(ValuesTipoRegla.REGLA_CONTENIDO)){
				
				ReglaContenido reglaContenido = new ReglaContenido(regla.getEjemplo(), regla.getPatronOCadena(), TipoComprobacion.valueOf(regla.getTipoComprobacion().toString()));
				reglasArchivo.add(reglaContenido);
				
			}
			
			if (regla.getTipo().equals(ValuesTipoRegla.REGLA_CONTENIDOXML)){
				
				ReglaContenidoXML reglaContenidoXML = new ReglaContenidoXML(regla.getEjemplo(), regla.getPatronOCadena(), TipoComprobacion.valueOf(regla.getTipoComprobacion().toString()));
				reglasArchivo.add(reglaContenidoXML);
				
			}
		}
		
		return reglasArchivo;
		
	}
	

}
