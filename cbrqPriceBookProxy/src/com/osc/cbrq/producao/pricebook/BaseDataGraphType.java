
package com.osc.cbrq.producao.pricebook;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;


/**
 * <p>Classe Java de BaseDataGraphType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="BaseDataGraphType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="models" type="{commonj.sdo}ModelsType" minOccurs="0"/>
 *         &lt;element name="xsd" type="{commonj.sdo}XSDType" minOccurs="0"/>
 *         &lt;element name="changeSummary" type="{commonj.sdo}ChangeSummaryType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseDataGraphType", namespace = "commonj.sdo", propOrder = {
    "models",
    "xsd",
    "changeSummary"
})
@XmlSeeAlso({
    DataGraphType.class
})
public abstract class BaseDataGraphType {

    @XmlElement(namespace = "")
    protected ModelsType models;
    @XmlElement(namespace = "")
    protected XSDType xsd;
    @XmlElement(namespace = "")
    protected ChangeSummaryType changeSummary;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Obtém o valor da propriedade models.
     * 
     * @return
     *     possible object is
     *     {@link ModelsType }
     *     
     */
    public ModelsType getModels() {
        return models;
    }

    /**
     * Define o valor da propriedade models.
     * 
     * @param value
     *     allowed object is
     *     {@link ModelsType }
     *     
     */
    public void setModels(ModelsType value) {
        this.models = value;
    }

    /**
     * Obtém o valor da propriedade xsd.
     * 
     * @return
     *     possible object is
     *     {@link XSDType }
     *     
     */
    public XSDType getXsd() {
        return xsd;
    }

    /**
     * Define o valor da propriedade xsd.
     * 
     * @param value
     *     allowed object is
     *     {@link XSDType }
     *     
     */
    public void setXsd(XSDType value) {
        this.xsd = value;
    }

    /**
     * Obtém o valor da propriedade changeSummary.
     * 
     * @return
     *     possible object is
     *     {@link ChangeSummaryType }
     *     
     */
    public ChangeSummaryType getChangeSummary() {
        return changeSummary;
    }

    /**
     * Define o valor da propriedade changeSummary.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangeSummaryType }
     *     
     */
    public void setChangeSummary(ChangeSummaryType value) {
        this.changeSummary = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}
