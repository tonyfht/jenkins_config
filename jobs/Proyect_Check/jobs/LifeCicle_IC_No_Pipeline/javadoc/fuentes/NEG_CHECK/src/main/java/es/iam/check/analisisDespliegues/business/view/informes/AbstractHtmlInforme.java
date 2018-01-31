package es.iam.check.analisisDespliegues.business.view.informes;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collection;

import es.iam.check.analisisDespliegues.business.chequeos.IChequeo;
import es.iam.check.analisisDespliegues.business.chequeos.incidencias.IncidenciaChequeo;
import es.iam.check.analisisDespliegues.business.chequeos.model.TipoNombreChequeos;
import es.iam.check.analisisDespliegues.business.configuracion.Configuracion;

/**
 * Informe generico del que deben heredar todos los demas para generar
 * el informe bajo html.
 * @author ARD021
 */
public class AbstractHtmlInforme implements Informe{
	
	/**
	 * El nombre del informe.
	 */
	private String nombre;
	
	/**
	 * El filtro del informe.
	 */
	private TipoNombreChequeos filtro;

	/**
	 * Metodo que genera el informe basandose en los chequeos y la configuracion.
	 * @see es.iam.check.analisisDespliegues.business.view.informes.Informe#componer(java.util.Collection)
	 * @param chequeos lista de chequeos
	 * @param conf configuración de ejecución
	 */
	public void componer(Collection<IChequeo> chequeos, Configuracion conf) {
		BufferedWriter salidaFichero = null;
		File directorioInforme = new File(conf.getDirectorioInformes().getRuta());
		File file = new File(directorioInforme, nombre);
		int numIncumplimientos = 0;
		try {
			salidaFichero = new BufferedWriter(new FileWriter(file));
			salidaFichero.write(getCabeceraBegin("Resultado del analisis del fichero: \t" + Configuracion.getFicheroAnalizar().getNombre(),
					"Ruta fichero: \t" + Configuracion.getFicheroAnalizar().getRuta()));
					
			salidaFichero.write(getCabeceraEnd());
			for (IChequeo chequeo : chequeos) {
				if (chequeo.getNombre().equals(filtro.toString()) || filtro.equals(TipoNombreChequeos.Todos)){
					salidaFichero.write(getFilaNombre(chequeo.getNombre(),chequeo.getValoracion().toString()));		 
					if (!escribeDatosChequeo(salidaFichero, chequeo))
						numIncumplimientos++;
				}
			}
			salidaFichero.write(getTotalIncumplimientos(Integer.toString(numIncumplimientos)));
			
			salidaFichero.newLine();
			salidaFichero.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	/**
	 * getter.
	 * @return el filtro aplicado.
	 */
	public TipoNombreChequeos getFiltro() {
		return filtro;
	}

	/**
	 * setter.
	 * @param filtro filtro que se aplica.
	 */
	public void setFiltro(TipoNombreChequeos filtro) {
		this.filtro = filtro;
	}

	/**
	 * getter.
	 * @return el nombre del informe.
	 */
    public String getNombre() {
		return nombre;
	}

    /**
     * setter.
     * @param nombre nombre del informe.
     */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	/**
	 * Escribe el chequeo en el informe html.
	 * @param salidaFichero buffer de fichero donde escribimos.
	 * @param chequeo chequeo a escribir.
	 * @return 
	 * @throws IOException
	 */
	private boolean escribeDatosChequeo(BufferedWriter salidaFichero, IChequeo chequeo) throws IOException {
		
		boolean ret = false;
		salidaFichero.newLine();
		
		if(!chequeo.getIncidenciasChequeo().isEmpty()){
		  
			salidaFichero.newLine();
			int cont=0;
			for (IncidenciaChequeo incidenciaChequeo : chequeo.getIncidenciasChequeo()) {
				StringBuilder incidencias = new StringBuilder("");
				incidencias.append(incidenciaChequeo.getRutaIncidencia());
				incidencias.append("\t");
				incidencias.append(incidenciaChequeo.getComentario());
				if (cont==0){
					salidaFichero.write(getListaViolaciones(chequeo.getDescripcion(),"",""));
				}
					salidaFichero.write(getListaViolaciones("",incidenciaChequeo.getNivelIncidencia().toString(),incidencias.toString()));
					cont++;
			}
		}else{
			salidaFichero.write(getListaViolaciones(chequeo.getDescripcion(),"",""));
			ret = true;
		}
		
		salidaFichero.newLine();
		return ret;
	}

    /**
     * Template para la parte inicial  de la cabecera.
     * @param nombreArtefacto
     * @param param2
     * @return
     */
	private String getCabeceraBegin(String nombreArtefacto, String rutaArtefacto){
		return "<html>\n" 
				+ "<head>\n" 
				+ "<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n" 
				+ "<title>INFORME DE CHEQUEOS</title><style type=\"text/css\">\n" 
				+ "body {margin-left: 3%; font-size:10pt;font-family:Arial;color:#000000 ; }\n" 
				+ "table.details tr th {font-size:10pt;font-family:Arial;font-weight:bold;background:#70B06D}\n" 
				+ "table.details tr {font-size:10pt;font-family:Arial;font-weight:normal;background:#A5D8A3}\n" 
				+ "table tbody	tr.alternate {background:#DBF9DA;}\n" 
				+ "table tbody tr.dark {background:#F4F4A7;font-weight:bold}\n" 
				+ "</style></head>\n" 
				+ "<body>\n" 
				+ "<h2>" + nombreArtefacto + "</h2>\n" 
				+ "<h3>" + rutaArtefacto + "</h3>\n";
	}
	
	/**
	 * Template para la parte final de la cabecera.
	 * @return la cadena con el template.
	 */
	private String getCabeceraEnd(){
		return "<table id=\"table\" width=\"90%\" border=\"1\" class=\"details\">\n" 
				+ "<tr>\n" 
				+ "<th align=\"left\" width=\"5%\">Nombre</th>\n" 
				+ "<th align=\"left\" width=\"45%\">Descripcion</th>\n" 
				+ "<th align=\"left\" width=\"45%\">Incumplimiento</th>\n" 
				+ "<th align=\"center\" width=\"5%\">Valoracion</th>\n" 
				+ "</tr>\n";
	}

	/**
	 * Template para la fila del nombre.
	 * @param nombre nombre del chequeo.
	 * @return la cadena con el template.
	 */
    private String getFilaNombre (String nombre, String valoracion){
    		
    	  String val = "CORRECTO";
    	  String bgColor="bgcolor=\"#58FA58\"";
    	
    			if (!val.equalsIgnoreCase(valoracion))
    			{
    				bgColor="bgcolor=\"red\"";    		
    			}
    			return	"<tr>\n" 
				+ "<td colspan=\"3\">" + nombre + "</td>\n" 
				+ "<td align=\"center\" "+bgColor +">" + valoracion + "</td>\n" 
				+ "</tr>\n";
				
    }
    	
    /**
     * Template para el listado de violaciones.
     * @param descripcion descripcion del chequeo.
     * @param valoracion valoracion del chequeo.
     * @param incumplimientos incumplimientos que se han producidos.
     * @return la cadena con el template.
     */
    private String getListaViolaciones(String descripcion, String valoracion, String incumplimientos){
    	String estilo = "class=\"alternate\"";
    	if ("ADVERTENCIA".equals(valoracion)) {
    		estilo = "style=\"background-color: #F4F4A7\"";
    	} else if ("ERROR".equals(valoracion)) {
    		estilo = "style=\"background-color: red\"";
    	}
    	return "<tr class=\"alternate\">\n" 
				+ "<td></td>\n" 
				+ "<td>" + descripcion + "</td>\n" 
				+ "<td>" + incumplimientos + "</td>\n" 
				+ "<td align=\"center\"" + estilo + " >" + valoracion + "</td>\n" 
				+ "</tr>\n";
    }
    
    /**
     * Template para el total de incumplimientos.
     * @param numIncumplimientos el numero de incumplimientos en los chequeos.
     * @return la cadena con el template.
     */
    private String getTotalIncumplimientos(String numIncumplimientos){
    	return 	"<tr class=\"dark\">" 
				+ "<td colspan=\"3\"><bold>NUMERO DE CHEQUEOS INCUMPLIDOS</bold></td>" 
				+ "<td align=\"center\">" + numIncumplimientos + "</td>" 
				+ "</tr>";
    }
 
 }
