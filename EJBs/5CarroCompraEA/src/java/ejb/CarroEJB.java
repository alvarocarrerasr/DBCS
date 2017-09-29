/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import javax.ejb.Stateful;
import carroCompra.CarroCompra;
import javax.ejb.Remove;

/**
 *
 * @author alvarocr
 */
@Stateful
public class CarroEJB implements CarroEJBLocal {

    private CarroCompra carro = new CarroCompra();
    @Override
    public void addElement(String articleName, int amount) {
        carro.addProduct(articleName, amount);
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    public CarroCompra getElements() {
        return carro;
    }
    
    @Remove
    public void finishEJB(){
        carro.removeProducts();
        carro = null;
    }

    
}
