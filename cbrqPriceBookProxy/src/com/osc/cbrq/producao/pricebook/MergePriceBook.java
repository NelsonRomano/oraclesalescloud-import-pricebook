
package com.osc.cbrq.producao.pricebook;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="priceBookHeader" type="{http://xmlns.oracle.com/apps/orderCapture/priceBook/priceBookService/}PriceBookHeader"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "priceBookHeader"
})
@XmlRootElement(name = "mergePriceBook")
public class MergePriceBook {

    @XmlElement(required = true)
    protected PriceBookHeader priceBookHeader;

    /**
     * Obtém o valor da propriedade priceBookHeader.
     * 
     * @return
     *     possible object is
     *     {@link PriceBookHeader }
     *     
     */
    public PriceBookHeader getPriceBookHeader() {
        return priceBookHeader;
    }

    /**
     * Define o valor da propriedade priceBookHeader.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceBookHeader }
     *     
     */
    public void setPriceBookHeader(PriceBookHeader value) {
        this.priceBookHeader = value;
    }

}
