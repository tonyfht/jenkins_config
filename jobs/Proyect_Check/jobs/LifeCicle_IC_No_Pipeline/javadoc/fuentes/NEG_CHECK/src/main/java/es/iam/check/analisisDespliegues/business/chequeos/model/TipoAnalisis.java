//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.05.14 at 11:22:21 AM CEST 
//


package es.iam.check.analisisDespliegues.business.chequeos.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TipoAnalisis complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TipoAnalisis">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AnalizadorEstaticos" type="{http://www.iam.es/repositorio}Listachequeos"/>
 *         &lt;element name="AnalizadorRecursos" type="{http://www.iam.es/repositorio}Listachequeos"/>
 *         &lt;element name="AnalizadorArtefacto" type="{http://www.iam.es/repositorio}Listachequeos"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TipoAnalisis", propOrder = {
    "analizadorEstaticos",
    "analizadorRecursos",
    "analizadorArtefacto"
})
public class TipoAnalisis {

    @XmlElement(name = "AnalizadorEstaticos", required = true)
    protected Listachequeos analizadorEstaticos;
    @XmlElement(name = "AnalizadorRecursos", required = true)
    protected Listachequeos analizadorRecursos;
    @XmlElement(name = "AnalizadorArtefacto", required = true)
    protected Listachequeos analizadorArtefacto;

    /**
     * Gets the value of the analizadorEstaticos property.
     * 
     * @return
     *     possible object is
     *     {@link Listachequeos }
     *     
     */
    public Listachequeos getAnalizadorEstaticos() {
        return analizadorEstaticos;
    }

    /**
     * Sets the value of the analizadorEstaticos property.
     * 
     * @param value
     *     allowed object is
     *     {@link Listachequeos }
     *     
     */
    public void setAnalizadorEstaticos(Listachequeos value) {
        this.analizadorEstaticos = value;
    }

    /**
     * Gets the value of the analizadorRecursos property.
     * 
     * @return
     *     possible object is
     *     {@link Listachequeos }
     *     
     */
    public Listachequeos getAnalizadorRecursos() {
        return analizadorRecursos;
    }

    /**
     * Sets the value of the analizadorRecursos property.
     * 
     * @param value
     *     allowed object is
     *     {@link Listachequeos }
     *     
     */
    public void setAnalizadorRecursos(Listachequeos value) {
        this.analizadorRecursos = value;
    }

    /**
     * Gets the value of the analizadorArtefacto property.
     * 
     * @return
     *     possible object is
     *     {@link Listachequeos }
     *     
     */
    public Listachequeos getAnalizadorArtefacto() {
        return analizadorArtefacto;
    }

    /**
     * Sets the value of the analizadorArtefacto property.
     * 
     * @param value
     *     allowed object is
     *     {@link Listachequeos }
     *     
     */
    public void setAnalizadorArtefacto(Listachequeos value) {
        this.analizadorArtefacto = value;
    }

}
