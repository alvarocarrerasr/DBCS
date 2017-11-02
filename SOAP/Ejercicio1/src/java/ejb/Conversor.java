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
public class Conversor implements ConversorLocal {

    @Override
    public float convertToMiles(float kilometers) {
        return (float) (kilometers*0.621371);
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
