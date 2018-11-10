
package com.osc.cbrq.producao.pricebook;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de PriceBookItem complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="PriceBookItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PricebookItemId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PricebookId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="InvItemId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ItemDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ListPrice" type="{http://xmlns.oracle.com/adf/svc/types/}AmountType" minOccurs="0"/>
 *         &lt;element name="PriceUOMCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Desconto_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Volume_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PrecoNegociado_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PrecoNegociado2_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceBookItem", namespace = "http://xmlns.oracle.com/apps/orderCapture/priceBook/priceBookService/", propOrder = {
    "pricebookItemId",
    "pricebookId",
    "invItemId",
    "itemDescription",
    "listPrice",
    "priceUOMCode",
    "descontoC",
    "volumeC",
    "precoNegociadoC",
    "precoNegociado2C"
})
public class PriceBookItem {

    @XmlElement(name = "PricebookItemId")
    protected Long pricebookItemId;
    @XmlElement(name = "PricebookId")
    protected Long pricebookId;
    @XmlElementRef(name = "InvItemId", namespace = "http://xmlns.oracle.com/apps/orderCapture/priceBook/priceBookService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> invItemId;
    @XmlElementRef(name = "ItemDescription", namespace = "http://xmlns.oracle.com/apps/orderCapture/priceBook/priceBookService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> itemDescription;
    @XmlElementRef(name = "ListPrice", namespace = "http://xmlns.oracle.com/apps/orderCapture/priceBook/priceBookService/", type = JAXBElement.class, required = false)
    protected JAXBElement<AmountType> listPrice;
    @XmlElementRef(name = "PriceUOMCode", namespace = "http://xmlns.oracle.com/apps/orderCapture/priceBook/priceBookService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> priceUOMCode;
    @XmlElementRef(name = "Desconto_c", namespace = "http://xmlns.oracle.com/apps/orderCapture/priceBook/priceBookService/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> descontoC;
    @XmlElementRef(name = "Volume_c", namespace = "http://xmlns.oracle.com/apps/orderCapture/priceBook/priceBookService/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> volumeC;
    @XmlElementRef(name = "PrecoNegociado_c", namespace = "http://xmlns.oracle.com/apps/orderCapture/priceBook/priceBookService/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> precoNegociadoC;
    @XmlElementRef(name = "PrecoNegociado2_c", namespace = "http://xmlns.oracle.com/apps/orderCapture/priceBook/priceBookService/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> precoNegociado2C;

    /**
     * Obtém o valor da propriedade pricebookItemId.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPricebookItemId() {
        return pricebookItemId;
    }

    /**
     * Define o valor da propriedade pricebookItemId.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPricebookItemId(Long value) {
        this.pricebookItemId = value;
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
     * Obtém o valor da propriedade invItemId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getInvItemId() {
        return invItemId;
    }

    /**
     * Define o valor da propriedade invItemId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setInvItemId(JAXBElement<Long> value) {
        this.invItemId = value;
    }

    /**
     * Obtém o valor da propriedade itemDescription.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getItemDescription() {
        return itemDescription;
    }

    /**
     * Define o valor da propriedade itemDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setItemDescription(JAXBElement<String> value) {
        this.itemDescription = value;
    }

    /**
     * Obtém o valor da propriedade listPrice.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public JAXBElement<AmountType> getListPrice() {
        return listPrice;
    }

    /**
     * Define o valor da propriedade listPrice.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public void setListPrice(JAXBElement<AmountType> value) {
        this.listPrice = value;
    }

    /**
     * Obtém o valor da propriedade priceUOMCode.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPriceUOMCode() {
        return priceUOMCode;
    }

    /**
     * Define o valor da propriedade priceUOMCode.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPriceUOMCode(JAXBElement<String> value) {
        this.priceUOMCode = value;
    }

    /**
     * Obtém o valor da propriedade descontoC.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getDescontoC() {
        return descontoC;
    }

    /**
     * Define o valor da propriedade descontoC.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setDescontoC(JAXBElement<BigDecimal> value) {
        this.descontoC = value;
    }

    /**
     * Obtém o valor da propriedade volumeC.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getVolumeC() {
        return volumeC;
    }

    /**
     * Define o valor da propriedade volumeC.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setVolumeC(JAXBElement<BigDecimal> value) {
        this.volumeC = value;
    }

    /**
     * Obtém o valor da propriedade precoNegociadoC.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getPrecoNegociadoC() {
        return precoNegociadoC;
    }

    /**
     * Define o valor da propriedade precoNegociadoC.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setPrecoNegociadoC(JAXBElement<BigDecimal> value) {
        this.precoNegociadoC = value;
    }

    /**
     * Obtém o valor da propriedade precoNegociado2C.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getPrecoNegociado2C() {
        return precoNegociado2C;
    }

    /**
     * Define o valor da propriedade precoNegociado2C.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setPrecoNegociado2C(JAXBElement<BigDecimal> value) {
        this.precoNegociado2C = value;
    }

}
