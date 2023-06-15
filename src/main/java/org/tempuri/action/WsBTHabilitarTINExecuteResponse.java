
package org.tempuri.action;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import bantotal.dlya.com.uy.btservice.BTErroresNegocio;
import bantotal.dlya.com.uy.btservice.BTExtReq;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Extreq" type="{http://uy.com.dlya.bantotal/BTService/}BTExtReq"/&gt;
 *         &lt;element name="Dscrespuesta" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Erroresnegocio" type="{http://uy.com.dlya.bantotal/BTService/}BTErroresNegocio"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "extreq",
    "dscrespuesta",
    "erroresnegocio"
})
@XmlRootElement(name = "wsBTHabilitarTIN.ExecuteResponse")
public class WsBTHabilitarTINExecuteResponse {

    @XmlElement(name = "Extreq", required = true)
    protected BTExtReq extreq;
    @XmlElement(name = "Dscrespuesta", required = true)
    protected String dscrespuesta;
    @XmlElement(name = "Erroresnegocio", required = true)
    protected BTErroresNegocio erroresnegocio;

    /**
     * Obtiene el valor de la propiedad extreq.
     * 
     * @return
     *     possible object is
     *     {@link BTExtReq }
     *     
     */
    public BTExtReq getExtreq() {
        return extreq;
    }

    /**
     * Define el valor de la propiedad extreq.
     * 
     * @param value
     *     allowed object is
     *     {@link BTExtReq }
     *     
     */
    public void setExtreq(BTExtReq value) {
        this.extreq = value;
    }

    /**
     * Obtiene el valor de la propiedad dscrespuesta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDscrespuesta() {
        return dscrespuesta;
    }

    /**
     * Define el valor de la propiedad dscrespuesta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDscrespuesta(String value) {
        this.dscrespuesta = value;
    }

    /**
     * Obtiene el valor de la propiedad erroresnegocio.
     * 
     * @return
     *     possible object is
     *     {@link BTErroresNegocio }
     *     
     */
    public BTErroresNegocio getErroresnegocio() {
        return erroresnegocio;
    }

    /**
     * Define el valor de la propiedad erroresnegocio.
     * 
     * @param value
     *     allowed object is
     *     {@link BTErroresNegocio }
     *     
     */
    public void setErroresnegocio(BTErroresNegocio value) {
        this.erroresnegocio = value;
    }

}
