//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.05.14 at 11:22:21 AM CEST 
//


package es.iam.check.analisisDespliegues.business.chequeos.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the es.iam.check.analisisDespliegues.model package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Analisis_QNAME = new QName("http://www.iam.es/repositorio", "analisis");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: es.iam.check.analisisDespliegues.model
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TipoRegla }
     * 
     */
    public TipoRegla createTipoRegla() {
        return new TipoRegla();
    }

    /**
     * Create an instance of {@link TipoMensaje }
     * 
     */
    public TipoMensaje createTipoMensaje() {
        return new TipoMensaje();
    }

    /**
     * Create an instance of {@link TipoChequeos }
     * 
     */
    public TipoChequeos createTipoChequeos() {
        return new TipoChequeos();
    }

    /**
     * Create an instance of {@link TipoReglas }
     * 
     */
    public TipoReglas createTipoReglas() {
        return new TipoReglas();
    }

    /**
     * Create an instance of {@link TipoChequeo }
     * 
     */
    public TipoChequeo createTipoChequeo() {
        return new TipoChequeo();
    }

    /**
     * Create an instance of {@link TipoAnalisis }
     * 
     */
    public TipoAnalisis createTipoAnalisis() {
        return new TipoAnalisis();
    }

    /**
     * Create an instance of {@link Listachequeos }
     * 
     */
    public Listachequeos createListachequeos() {
        return new Listachequeos();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoAnalisis }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iam.es/repositorio", name = "analisis")
    public JAXBElement<TipoAnalisis> createAnalisis(TipoAnalisis value) {
        return new JAXBElement<TipoAnalisis>(_Analisis_QNAME, TipoAnalisis.class, null, value);
    }

}