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
 * 2023-06-26T10:30:54.656-05:00
 * Generated source version: 3.3.0
 *
 */
@WebServiceClient(name = "wsBTHabilitarTIN",
                  wsdlLocation = "file:/C:/Users/Gerar/Desktop/Proyecto%20Integracion/fc-transferencia-inmedita-integracion/src/main/resources/wsdl/wsBTHabilitarTIN.wsdl",
                  targetNamespace = "http://tempuri.org/action/")
public class WsBTHabilitarTIN extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://tempuri.org/action/", "wsBTHabilitarTIN");
    public final static QName WsBTHabilitarTINSoapPort = new QName("http://tempuri.org/action/", "wsBTHabilitarTINSoapPort");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Users/Gerar/Desktop/Proyecto%20Integracion/fc-transferencia-inmedita-integracion/src/main/resources/wsdl/wsBTHabilitarTIN.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(WsBTHabilitarTIN.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "file:/C:/Users/Gerar/Desktop/Proyecto%20Integracion/fc-transferencia-inmedita-integracion/src/main/resources/wsdl/wsBTHabilitarTIN.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public WsBTHabilitarTIN(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public WsBTHabilitarTIN(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WsBTHabilitarTIN() {
        super(WSDL_LOCATION, SERVICE);
    }

    public WsBTHabilitarTIN(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public WsBTHabilitarTIN(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public WsBTHabilitarTIN(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns WsBTHabilitarTINSoapPort
     */
    @WebEndpoint(name = "wsBTHabilitarTINSoapPort")
    public WsBTHabilitarTINSoapPort getWsBTHabilitarTINSoapPort() {
        return super.getPort(WsBTHabilitarTINSoapPort, WsBTHabilitarTINSoapPort.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WsBTHabilitarTINSoapPort
     */
    @WebEndpoint(name = "wsBTHabilitarTINSoapPort")
    public WsBTHabilitarTINSoapPort getWsBTHabilitarTINSoapPort(WebServiceFeature... features) {
        return super.getPort(WsBTHabilitarTINSoapPort, WsBTHabilitarTINSoapPort.class, features);
    }

}
