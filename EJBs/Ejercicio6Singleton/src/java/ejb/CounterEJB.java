/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import javax.ejb.Singleton;

/**
 *
 * @author alvarocr
 */
@Singleton
public class CounterEJB implements CounterEJBLocal {

    private int counter = 0;
    
    public synchronized void increaseCounter(){
        counter+=1;
    }
    public synchronized int getCounter(){
        return counter;
    }
}
