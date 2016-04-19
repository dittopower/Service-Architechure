
package com.qut.deamonwarehouse;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebService(name = "DeamonWarehouse", targetNamespace = "http://www.qut.com/DeamonWarehouse")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface DeamonWarehouse {


    /**
     * 
     * @param temp
     * @return
     *     returns int
     */
    @WebMethod(operationName = "Stock", action = "urn:DeamonWarehouseIntf-DeamonWarehouse#Stock")
    @WebResult(partName = "return")
    public int stock(
        @WebParam(name = "temp", partName = "temp")
        String temp);

}
