
package bantotal.dlya.com.uy.btservice;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the bantotal.dlya.com.uy.btservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: bantotal.dlya.com.uy.btservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BTExtReq }
     * 
     */
    public BTExtReq createBTExtReq() {
        return new BTExtReq();
    }

    /**
     * Create an instance of {@link BTErroresNegocio }
     * 
     */
    public BTErroresNegocio createBTErroresNegocio() {
        return new BTErroresNegocio();
    }

    /**
     * Create an instance of {@link BTErrorNegocio }
     * 
     */
    public BTErrorNegocio createBTErrorNegocio() {
        return new BTErrorNegocio();
    }

}
