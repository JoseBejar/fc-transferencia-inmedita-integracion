
package bantotal.dlya.com.uy.btservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para BTExtReq complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="BTExtReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="Canal" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Requerimiento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Usuario" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Token" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BTExtReq", propOrder = {

})
public class BTExtReq {

    @XmlElement(name = "Canal", required = true)
    protected String canal;
    @XmlElement(name = "Requerimiento", required = true)
    protected String requerimiento;
    @XmlElement(name = "Usuario", required = true)
    protected String usuario;
    @XmlElement(name = "Token", required = true)
    protected String token;

    /**
     * Obtiene el valor de la propiedad canal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCanal() {
        return canal;
    }

    /**
     * Define el valor de la propiedad canal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCanal(String value) {
        this.canal = value;
    }

    /**
     * Obtiene el valor de la propiedad requerimiento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequerimiento() {
        return requerimiento;
    }

    /**
     * Define el valor de la propiedad requerimiento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequerimiento(String value) {
        this.requerimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad usuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * Define el valor de la propiedad usuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuario(String value) {
        this.usuario = value;
    }

    /**
     * Obtiene el valor de la propiedad token.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToken() {
        return token;
    }

    /**
     * Define el valor de la propiedad token.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToken(String value) {
        this.token = value;
    }

}
