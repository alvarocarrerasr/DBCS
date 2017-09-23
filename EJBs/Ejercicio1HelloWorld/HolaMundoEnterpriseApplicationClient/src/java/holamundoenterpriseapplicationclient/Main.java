/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundoenterpriseapplicationclient;

import ejb.HolaMundoRemote;
import javax.ejb.EJB;

/**
 *
 * @author alvarocr
 */
public class Main {

    @EJB
    private static HolaMundoRemote holaMundo;
    private final static String NOMBRE="Álvaro";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Resultado = "+holaMundo.getGreetingString(NOMBRE));
        
        //Lo siguiente se imprime en el servidor GlassFish
        holaMundo.diHola(NOMBRE);
    }
    
}
