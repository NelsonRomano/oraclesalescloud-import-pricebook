
package com.osc.cbrq.producao.pricebook;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de PriceBookHeaderTranslation complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="PriceBookHeaderTranslation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Language" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PricebookId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="SourceLang" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceBookHeaderTranslation", namespace = "http://xmlns.oracle.com/apps/orderCapture/priceBook/priceBookService/", propOrder = {
    "description",
    "language",
    "name",
    "pricebookId",
    "sourceLang"
})
public class PriceBookHeaderTranslation {

    @XmlElementRef(name = "Description", namespace = "http://xmlns.oracle.com/apps/orderCapture/priceBook/priceBookService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> description;
    @XmlElement(name = "Language")
    protected String language;
    @XmlElementRef(name = "Name", namespace = "http://xmlns.oracle.com/apps/orderCapture/priceBook/priceBookService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> name;
    @XmlElement(name = "PricebookId")
    protected Long pricebookId;
    @XmlElement(name = "SourceLang")
    protected String sourceLang;

    /**
     * Obtém o valor da propriedade description.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescription() {
        return description;
    }

    /**
     * Define o valor da propriedade description.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescription(JAXBElement<String> value) {
        this.description = value;
    }

    /**
     * Obtém o valor da propriedade language.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Define o valor da propriedade language.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Obtém o valor da propriedade name.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getName() {
        return name;
    }

    /**
     * Define o valor da propriedade name.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setName(JAXBElement<String> value) {
        this.name = value;
    }

    /**
     * Obtém o valor da propriedade pricebookId.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPricebookId() {
        return pricebookId;
    }

    /**
     * Define o valor da propriedade pricebookId.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPricebookId(Long value) {
        this.pricebookId = value;
    }

    /**
     * Obtém o valor da propriedade sourceLang.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceLang() {
        return sourceLang;
    }

    /**
     * Define o valor da propriedade sourceLang.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceLang(String value) {
        this.sourceLang = value;
    }

}
