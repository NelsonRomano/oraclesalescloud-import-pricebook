
package com.osc.cbrq.producao.pricebook;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ServiceErrorMessage complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ServiceErrorMessage">
 *   &lt;complexContent>
 *     &lt;extension base="{http://xmlns.oracle.com/adf/svc/errors/}ServiceMessage">
 *       &lt;sequence>
 *         &lt;element name="sdoObject" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element name="exceptionClassName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceErrorMessage", namespace = "http://xmlns.oracle.com/adf/svc/errors/", propOrder = {
    "sdoObject",
    "exceptionClassName"
})
@XmlSeeAlso({
    ServiceDMLErrorMessage.class,
    ServiceAttrValErrorMessage.class,
    ServiceRowValErrorMessage.class
})
public class ServiceErrorMessage
    extends ServiceMessage
{

    protected Object sdoObject;
    protected String exceptionClassName;

    /**
     * Obtém o valor da propriedade sdoObject.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSdoObject() {
        return sdoObject;
    }

    /**
     * Define o valor da propriedade sdoObject.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSdoObject(Object value) {
        this.sdoObject = value;
    }

    /**
     * Obtém o valor da propriedade exceptionClassName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExceptionClassName() {
        return exceptionClassName;
    }

    /**
     * Define o valor da propriedade exceptionClassName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExceptionClassName(String value) {
        this.exceptionClassName = value;
    }

}
