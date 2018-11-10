
package com.osc.cbrq.producao.pricebook;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ChildFindCriteria complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ChildFindCriteria">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/adf/svc/types/}FindCriteria">
 *       &lt;sequence>
 *         &lt;element name="childAttrName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChildFindCriteria", namespace = "http://xmlns.oracle.com/adf/svc/types/", propOrder = {
    "childAttrName"
})
public class ChildFindCriteria
    extends FindCriteria
{

    @XmlElement(required = true)
    protected String childAttrName;

    /**
     * Obtém o valor da propriedade childAttrName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChildAttrName() {
        return childAttrName;
    }

    /**
     * Define o valor da propriedade childAttrName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChildAttrName(String value) {
        this.childAttrName = value;
    }

}
