
package com.osc.cbrq.producao.pricebook;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de PriceBookHeader complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="PriceBookHeader">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PricebookId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PricebookCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StatusCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PriceBookItem" type="{http://xmlns.oracle.com/apps/orderCapture/priceBook/priceBookService/}PriceBookItem" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PriceBookHeaderTranslation" type="{http://xmlns.oracle.com/apps/orderCapture/priceBook/priceBookService/}PriceBookHeaderTranslation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="VigenciaFinal_c" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="VigenciaInicial_c" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="TabelaRegiaoPromocional_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UnidadeDeNegocio_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceBookHeader", namespace = "http://xmlns.oracle.com/apps/orderCapture/priceBook/priceBookService/", propOrder = {
    "pricebookId",
    "pricebookCode",
    "currencyCode",
    "name",
    "description",
    "statusCode",
    "priceBookItem",
    "priceBookHeaderTranslation",
    "vigenciaFinalC",
    "vigenciaInicialC",
    "tabelaRegiaoPromocionalC",
    "unidadeDeNegocioC"
})
public class PriceBookHeader {

    @XmlElement(name = "PricebookId")
    protected Long pricebookId;
    @XmlElement(name = "PricebookCode")
    protected String pricebookCode;
    @XmlElement(name = "CurrencyCode")
    protected String currencyCode;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElementRef(name = "Description", namespace = "http://xmlns.oracle.com/apps/orderCapture/priceBook/priceBookService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> description;
    @XmlElement(name = "StatusCode")
    protected String statusCode;
    @XmlElement(name = "PriceBookItem")
    protected List<PriceBookItem> priceBookItem;
    @XmlElement(name = "PriceBookHeaderTranslation")
    protected List<PriceBookHeaderTranslation> priceBookHeaderTranslation;
    @XmlElementRef(name = "VigenciaFinal_c", namespace = "http://xmlns.oracle.com/apps/orderCapture/priceBook/priceBookService/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> vigenciaFinalC;
    @XmlElementRef(name = "VigenciaInicial_c", namespace = "http://xmlns.oracle.com/apps/orderCapture/priceBook/priceBookService/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> vigenciaInicialC;
    @XmlElementRef(name = "TabelaRegiaoPromocional_c", namespace = "http://xmlns.oracle.com/apps/orderCapture/priceBook/priceBookService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tabelaRegiaoPromocionalC;
    @XmlElementRef(name = "UnidadeDeNegocio_c", namespace = "http://xmlns.oracle.com/apps/orderCapture/priceBook/priceBookService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> unidadeDeNegocioC;

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
     * Obtém o valor da propriedade pricebookCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPricebookCode() {
        return pricebookCode;
    }

    /**
     * Define o valor da propriedade pricebookCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPricebookCode(String value) {
        this.pricebookCode = value;
    }

    /**
     * Obtém o valor da propriedade currencyCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Define o valor da propriedade currencyCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }

    /**
     * Obtém o valor da propriedade name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Define o valor da propriedade name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

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
     * Obtém o valor da propriedade statusCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusCode() {
        return statusCode;
    }

    /**
     * Define o valor da propriedade statusCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusCode(String value) {
        this.statusCode = value;
    }

    /**
     * Gets the value of the priceBookItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the priceBookItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPriceBookItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PriceBookItem }
     * 
     * 
     */
    public List<PriceBookItem> getPriceBookItem() {
        if (priceBookItem == null) {
            priceBookItem = new ArrayList<PriceBookItem>();
        }
        return this.priceBookItem;
    }

    /**
     * Gets the value of the priceBookHeaderTranslation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the priceBookHeaderTranslation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPriceBookHeaderTranslation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PriceBookHeaderTranslation }
     * 
     * 
     */
    public List<PriceBookHeaderTranslation> getPriceBookHeaderTranslation() {
        if (priceBookHeaderTranslation == null) {
            priceBookHeaderTranslation = new ArrayList<PriceBookHeaderTranslation>();
        }
        return this.priceBookHeaderTranslation;
    }

    /**
     * Obtém o valor da propriedade vigenciaFinalC.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getVigenciaFinalC() {
        return vigenciaFinalC;
    }

    /**
     * Define o valor da propriedade vigenciaFinalC.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setVigenciaFinalC(JAXBElement<XMLGregorianCalendar> value) {
        this.vigenciaFinalC = value;
    }

    /**
     * Obtém o valor da propriedade vigenciaInicialC.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getVigenciaInicialC() {
        return vigenciaInicialC;
    }

    /**
     * Define o valor da propriedade vigenciaInicialC.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setVigenciaInicialC(JAXBElement<XMLGregorianCalendar> value) {
        this.vigenciaInicialC = value;
    }

    /**
     * Obtém o valor da propriedade tabelaRegiaoPromocionalC.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTabelaRegiaoPromocionalC() {
        return tabelaRegiaoPromocionalC;
    }

    /**
     * Define o valor da propriedade tabelaRegiaoPromocionalC.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTabelaRegiaoPromocionalC(JAXBElement<String> value) {
        this.tabelaRegiaoPromocionalC = value;
    }

    /**
     * Obtém o valor da propriedade unidadeDeNegocioC.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUnidadeDeNegocioC() {
        return unidadeDeNegocioC;
    }

    /**
     * Define o valor da propriedade unidadeDeNegocioC.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUnidadeDeNegocioC(JAXBElement<String> value) {
        this.unidadeDeNegocioC = value;
    }

}
