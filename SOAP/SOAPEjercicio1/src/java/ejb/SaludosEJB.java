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
public class SaludosEJB implements SaludosEJBLocal {

    @Override
    public String saludaEspanol(String name) {
        return ("¡Hola "+name + "!");
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    public String saludaFrancais(String name) {
       return ("Salut "+name + "!"); 
    }

    @Override
    public String saludaEnglish(String name) {
       return ("Hi "+name + "!");
    }
}
