/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soap;

import ejb.ConversorLocal;
import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author alvarocr
 */
@WebService(serviceName = "ConversorSOAP")
public class ConversorSOAP {
    @EJB
    private ConversorLocal ejbRef;// Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Web Service Operation")

    @WebMethod(operationName = "convertToMiles")
    public float convertToMiles(@WebParam(name = "kilometers") float kilometers) {
        return ejbRef.convertToMiles(kilometers);
    }
    
}
