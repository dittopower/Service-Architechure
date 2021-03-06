
package org.tempuri;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import com.microsoft.schemas._2003._10.serialization.ObjectFactory;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "IDeamonInsurance", targetNamespace = "http://www.qut.com/DeamonInsurance")
@SOAPBinding(style = SOAPBinding.Style.RPC)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface IDeamonInsurance {


    /**
     * 
     * @param customerid
     * @return
     *     returns int
     */
    @WebMethod(operationName = "Coverage", action = "urn:DeamonInsuranceIntf-DeamonInsurance#Coverage")
    @WebResult(partName = "return")
    public int coverage(
        @WebParam(name = "customerid", partName = "customerid")
        int customerid);

}
