
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
 *         &lt;element name="Mpe005idc" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *         &lt;element name="Payload" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "mpe005Idc",
    "payload",
    "erroresnegocio"
})
@XmlRootElement(name = "wsBTRecepcionTIN.Execute")
public class WsBTRecepcionTINExecute {

    @XmlElement(name = "Extreq", required = true)
    protected BTExtReq extreq;
    @XmlElement(name = "Mpe005idc")
    protected short mpe005Idc;
    @XmlElement(name = "Payload", required = true)
    protected String payload;
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
     * Obtiene el valor de la propiedad mpe005Idc.
     * 
     */
    public short getMpe005Idc() {
        return mpe005Idc;
    }

    /**
     * Define el valor de la propiedad mpe005Idc.
     * 
     */
    public void setMpe005Idc(short value) {
        this.mpe005Idc = value;
    }

    /**
     * Obtiene el valor de la propiedad payload.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayload() {
        return payload;
    }

    /**
     * Define el valor de la propiedad payload.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayload(String value) {
        this.payload = value;
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
