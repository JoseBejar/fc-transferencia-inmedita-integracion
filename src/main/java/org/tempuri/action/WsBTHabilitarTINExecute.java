
package org.tempuri.action;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
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
 *         &lt;element name="Idcamara" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *         &lt;element name="Accion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "idcamara",
    "accion"
})
@XmlRootElement(name = "wsBTHabilitarTIN.Execute")
public class WsBTHabilitarTINExecute {

    @XmlElement(name = "Extreq", required = true)
    protected BTExtReq extreq;
    @XmlElement(name = "Idcamara")
    protected short idcamara;
    @XmlElement(name = "Accion", required = true)
    protected String accion;

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
     * Obtiene el valor de la propiedad idcamara.
     * 
     */
    public short getIdcamara() {
        return idcamara;
    }

    /**
     * Define el valor de la propiedad idcamara.
     * 
     */
    public void setIdcamara(short value) {
        this.idcamara = value;
    }

    /**
     * Obtiene el valor de la propiedad accion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccion() {
        return accion;
    }

    /**
     * Define el valor de la propiedad accion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccion(String value) {
        this.accion = value;
    }

}
