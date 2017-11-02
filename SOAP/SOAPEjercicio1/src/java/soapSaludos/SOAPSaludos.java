/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soapSaludos;

import ejb.SaludosEJBLocal;
import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author alvarocr
 */
@WebService(serviceName = "SOAPSaludos")
public class SOAPSaludos {
    @EJB
    private SaludosEJBLocal ejbRef;// Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Web Service Operation")

    @WebMethod(operationName = "saludaEspanol")
    public String saludaEspanol(@WebParam(name = "name") String name) {
        return ejbRef.saludaEspanol(name);
    }

    @WebMethod(operationName = "saludaFrancais")
    public String saludaFrancais(@WebParam(name = "name") String name) {
        return ejbRef.saludaFrancais(name);
    }

    @WebMethod(operationName = "saludaEnglish")
    public String saludaEnglish(@WebParam(name = "name") String name) {
        return ejbRef.saludaEnglish(name);
    }
    
}
