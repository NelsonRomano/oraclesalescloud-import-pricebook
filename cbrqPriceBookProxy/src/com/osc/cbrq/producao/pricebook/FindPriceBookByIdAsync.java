
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
 *         &lt;element name="findCriteria" type="{http://xmlns.oracle.com/adf/svc/types/}FindCriteria"/>
 *         &lt;element name="PriceBookId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="findControl" type="{http://xmlns.oracle.com/adf/svc/types/}FindControl"/>
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
    "findCriteria",
    "priceBookId",
    "findControl"
})
@XmlRootElement(name = "findPriceBookByIdAsync")
public class FindPriceBookByIdAsync {

    @XmlElement(required = true)
    protected FindCriteria findCriteria;
    @XmlElement(name = "PriceBookId")
    protected long priceBookId;
    @XmlElement(required = true)
    protected FindControl findControl;

    /**
     * Obtém o valor da propriedade findCriteria.
     * 
     * @return
     *     possible object is
     *     {@link FindCriteria }
     *     
     */
    public FindCriteria getFindCriteria() {
        return findCriteria;
    }

    /**
     * Define o valor da propriedade findCriteria.
     * 
     * @param value
     *     allowed object is
     *     {@link FindCriteria }
     *     
     */
    public void setFindCriteria(FindCriteria value) {
        this.findCriteria = value;
    }

    /**
     * Obtém o valor da propriedade priceBookId.
     * 
     */
    public long getPriceBookId() {
        return priceBookId;
    }

    /**
     * Define o valor da propriedade priceBookId.
     * 
     */
    public void setPriceBookId(long value) {
        this.priceBookId = value;
    }

    /**
     * Obtém o valor da propriedade findControl.
     * 
     * @return
     *     possible object is
     *     {@link FindControl }
     *     
     */
    public FindControl getFindControl() {
        return findControl;
    }

    /**
     * Define o valor da propriedade findControl.
     * 
     * @param value
     *     allowed object is
     *     {@link FindControl }
     *     
     */
    public void setFindControl(FindControl value) {
        this.findControl = value;
    }

}
