
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
 *         &lt;element name="priceBookItemService" type="{http://xmlns.oracle.com/apps/orderCapture/priceBook/priceBookService/}PriceBookItem"/>
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
    "priceBookItemService"
})
@XmlRootElement(name = "deletePriceBookItemAsync")
public class DeletePriceBookItemAsync {

    @XmlElement(required = true)
    protected PriceBookItem priceBookItemService;

    /**
     * Obtém o valor da propriedade priceBookItemService.
     * 
     * @return
     *     possible object is
     *     {@link PriceBookItem }
     *     
     */
    public PriceBookItem getPriceBookItemService() {
        return priceBookItemService;
    }

    /**
     * Define o valor da propriedade priceBookItemService.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceBookItem }
     *     
     */
    public void setPriceBookItemService(PriceBookItem value) {
        this.priceBookItemService = value;
    }

}
