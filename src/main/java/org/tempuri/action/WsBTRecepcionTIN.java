package org.tempuri.action;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.3.0
 * 2023-06-09T03:11:11.847-05:00
 * Generated source version: 3.3.0
 *
 */
@WebServiceClient(name = "wsBTRecepcionTIN",
                  wsdlLocation = "file:/C:/FinancieraConfianza/fc-transferencia-inmediata/src/main/resources/wsdl/wsBTRecepcionTIN.wsdl",
                  targetNamespace = "http://tempuri.org/action/")
public class WsBTRecepcionTIN extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://tempuri.org/action/", "wsBTRecepcionTIN");
    public final static QName WsBTRecepcionTINSoapPort = new QName("http://tempuri.org/action/", "wsBTRecepcionTINSoapPort");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/FinancieraConfianza/fc-transferencia-inmediata/src/main/resources/wsdl/wsBTRecepcionTIN.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(WsBTRecepcionTIN.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "file:/C:/FinancieraConfianza/fc-transferencia-inmediata/src/main/resources/wsdl/wsBTRecepcionTIN.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public WsBTRecepcionTIN(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public WsBTRecepcionTIN(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WsBTRecepcionTIN() {
        super(WSDL_LOCATION, SERVICE);
    }

    public WsBTRecepcionTIN(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public WsBTRecepcionTIN(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public WsBTRecepcionTIN(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns WsBTRecepcionTINSoapPort
     */
    @WebEndpoint(name = "wsBTRecepcionTINSoapPort")
    public WsBTRecepcionTINSoapPort getWsBTRecepcionTINSoapPort() {
        return super.getPort(WsBTRecepcionTINSoapPort, WsBTRecepcionTINSoapPort.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WsBTRecepcionTINSoapPort
     */
    @WebEndpoint(name = "wsBTRecepcionTINSoapPort")
    public WsBTRecepcionTINSoapPort getWsBTRecepcionTINSoapPort(WebServiceFeature... features) {
        return super.getPort(WsBTRecepcionTINSoapPort, WsBTRecepcionTINSoapPort.class, features);
    }

}
