/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import javax.ejb.Stateless;

/**
 *
 * @author alvarocr
 */
@Stateless
public class LoggerEJB implements LoggerEJBLocal {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    public void log(String message){
       System.out.printf("LoggerEJB: %s \n", message);
    }
}
