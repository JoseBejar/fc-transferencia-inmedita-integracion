package org.tempuri.action;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.3.0
 * 2023-06-26T13:37:16.877-05:00
 * Generated source version: 3.3.0
 *
 */
@WebService(targetNamespace = "http://tempuri.org/action/", name = "wsBTRecepcionTINSoapPort")
@XmlSeeAlso({bantotal.dlya.com.uy.btservice.ObjectFactory.class, ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface WsBTRecepcionTINSoapPort {

    @WebMethod(operationName = "Execute", action = "http://tempuri.org/action/action/AWSBTRECEPCIONTIN.Execute")
    @WebResult(name = "wsBTRecepcionTIN.ExecuteResponse", targetNamespace = "http://tempuri.org/action/", partName = "parameters")
    public WsBTRecepcionTINExecuteResponse execute(
        @WebParam(partName = "parameters", name = "wsBTRecepcionTIN.Execute", targetNamespace = "http://tempuri.org/action/")
        WsBTRecepcionTINExecute parameters
    );
}
