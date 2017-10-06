/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4helloworldclient;

import ejb.HelloWorldBeanRemote;
import java.util.Properties;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 *
 * @author alvarocr
 */
public class Main {

    private final static String BEAN_PATH="java:global/Ejercicio2Local/NewSessionBean!ejb.NewSessionBeanLocal";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws NamingException {
        Properties prop = new Properties();
        prop.setProperty("org.omg.CORBA.ORBInitialHost", "localhost");
        prop.setProperty("org.omg.CORBA.ORBInitialPort", "3700");
        Context context = new InitialContext(prop);
        HelloWorldBeanRemote bean = (HelloWorldBeanRemote) context.lookup(BEAN_PATH); 
        bean.sayHello("Álvaro");
    }

}
