
package com.osc.cbrq.producao.pricebook;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ProcessControl complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ProcessControl">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="returnMode" type="{http://xmlns.oracle.com/adf/svc/types/}ReturnMode" minOccurs="0"/>
 *         &lt;element name="exceptionReturnMode" type="{http://xmlns.oracle.com/adf/svc/types/}ReturnMode" minOccurs="0"/>
 *         &lt;element name="partialFailureAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcessControl", namespace = "http://xmlns.oracle.com/adf/svc/types/", propOrder = {
    "returnMode",
    "exceptionReturnMode",
    "partialFailureAllowed"
})
public class ProcessControl {

    @XmlSchemaType(name = "string")
    protected ReturnMode returnMode;
    @XmlSchemaType(name = "string")
    protected ReturnMode exceptionReturnMode;
    @XmlElement(defaultValue = "false")
    protected boolean partialFailureAllowed;

    /**
     * Obtém o valor da propriedade returnMode.
     * 
     * @return
     *     possible object is
     *     {@link ReturnMode }
     *     
     */
    public ReturnMode getReturnMode() {
        return returnMode;
    }

    /**
     * Define o valor da propriedade returnMode.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnMode }
     *     
     */
    public void setReturnMode(ReturnMode value) {
        this.returnMode = value;
    }

    /**
     * Obtém o valor da propriedade exceptionReturnMode.
     * 
     * @return
     *     possible object is
     *     {@link ReturnMode }
     *     
     */
    public ReturnMode getExceptionReturnMode() {
        return exceptionReturnMode;
    }

    /**
     * Define o valor da propriedade exceptionReturnMode.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnMode }
     *     
     */
    public void setExceptionReturnMode(ReturnMode value) {
        this.exceptionReturnMode = value;
    }

    /**
     * Obtém o valor da propriedade partialFailureAllowed.
     * 
     */
    public boolean isPartialFailureAllowed() {
        return partialFailureAllowed;
    }

    /**
     * Define o valor da propriedade partialFailureAllowed.
     * 
     */
    public void setPartialFailureAllowed(boolean value) {
        this.partialFailureAllowed = value;
    }

}
