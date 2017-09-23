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
public class HolaMundo implements HolaMundoRemote {

    @Override
    public void diHola(String nombre) {
        System.out.printf("Hola %s!", nombre);
    }
    @Override
    public String getGreetingString(String nombre){
        return "Hola "+nombre+"!";
    }

}
