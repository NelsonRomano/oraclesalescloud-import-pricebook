
package com.osc.cbrq.producao.pricebook;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de FindControl complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="FindControl">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="retrieveAllTranslations" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FindControl", namespace = "http://xmlns.oracle.com/adf/svc/types/", propOrder = {
    "retrieveAllTranslations"
})
public class FindControl {

    @XmlElement(defaultValue = "false")
    protected boolean retrieveAllTranslations;

    /**
     * Obtém o valor da propriedade retrieveAllTranslations.
     * 
     */
    public boolean isRetrieveAllTranslations() {
        return retrieveAllTranslations;
    }

    /**
     * Define o valor da propriedade retrieveAllTranslations.
     * 
     */
    public void setRetrieveAllTranslations(boolean value) {
        this.retrieveAllTranslations = value;
    }

}
