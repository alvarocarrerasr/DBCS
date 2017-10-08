/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4holamundoclient;

import ejb.NewSessionBeanRemote;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 *
 * @author alvarocr
 */
public class Main {

    @EJB
    private static NewSessionBeanRemote newSessionBean;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NewSessionBeanRemote session = null;
        try { 
            Context context = new InitialContext();
             session = (NewSessionBeanRemote) context.lookup("java:global/Ejercicio4HolaMundoEA-ejb/NewSessionBean");
        } catch (NamingException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        session.diHola("Álvaro");
        
       
    }
    
}
