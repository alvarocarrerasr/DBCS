/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soap;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author alvarocr
 */
@WebService(serviceName = "SOAPNormal")
public class SOAPNormal {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "convertToMiles")
    public float convertToMiles(@WebParam(name = "amount") float amount) {
        //TODO write your implementation code here:
        return (float) (amount*0.62);
    }

    
    
}
