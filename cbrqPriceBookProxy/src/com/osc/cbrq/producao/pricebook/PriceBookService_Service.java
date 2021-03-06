
package com.osc.cbrq.producao.pricebook;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "PriceBookService", targetNamespace = "http://xmlns.oracle.com/apps/orderCapture/priceBook/priceBookService/", wsdlLocation = "https://cbrq.crm.us2.oraclecloud.com/external-ordercapture-priceBook/PriceBookService?WSDL")
public class PriceBookService_Service
    extends Service
{

    private final static URL PRICEBOOKSERVICE_WSDL_LOCATION;
    private final static WebServiceException PRICEBOOKSERVICE_EXCEPTION;
    private final static QName PRICEBOOKSERVICE_QNAME = new QName("http://xmlns.oracle.com/apps/orderCapture/priceBook/priceBookService/", "PriceBookService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://cbrq.crm.us2.oraclecloud.com/external-ordercapture-priceBook/PriceBookService?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        PRICEBOOKSERVICE_WSDL_LOCATION = url;
        PRICEBOOKSERVICE_EXCEPTION = e;
    }

    public PriceBookService_Service() {
        super(__getWsdlLocation(), PRICEBOOKSERVICE_QNAME);
    }

    public PriceBookService_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), PRICEBOOKSERVICE_QNAME, features);
    }

    public PriceBookService_Service(URL wsdlLocation) {
        super(wsdlLocation, PRICEBOOKSERVICE_QNAME);
    }

    public PriceBookService_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, PRICEBOOKSERVICE_QNAME, features);
    }

    public PriceBookService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public PriceBookService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns PriceBookService
     */
    @WebEndpoint(name = "PriceBookServiceSoapHttpPort")
    public PriceBookService getPriceBookServiceSoapHttpPort() {
        return super.getPort(new QName("http://xmlns.oracle.com/apps/orderCapture/priceBook/priceBookService/", "PriceBookServiceSoapHttpPort"), PriceBookService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns PriceBookService
     */
    @WebEndpoint(name = "PriceBookServiceSoapHttpPort")
    public PriceBookService getPriceBookServiceSoapHttpPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://xmlns.oracle.com/apps/orderCapture/priceBook/priceBookService/", "PriceBookServiceSoapHttpPort"), PriceBookService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (PRICEBOOKSERVICE_EXCEPTION!= null) {
            throw PRICEBOOKSERVICE_EXCEPTION;
        }
        return PRICEBOOKSERVICE_WSDL_LOCATION;
    }

}
