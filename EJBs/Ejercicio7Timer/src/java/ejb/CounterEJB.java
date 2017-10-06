/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import javax.ejb.EJB;
import javax.ejb.Schedule;
import javax.ejb.Singleton;

/**
 *
 * @author alvarocr
 */
@Singleton
public class CounterEJB implements CounterEJBLocal {

    @EJB
    private LoggerEJBLocal loggerEJB;

    private int counter;
    
    public synchronized void increaseCounter(){
        counter+=1;
    }
    public synchronized int getCounter(){
        return counter;
    }
    @Schedule(hour = "*", minute="*", second="*/10")
    public void generaLog() {
       loggerEJB.log(String.valueOf(counter));
    }
}
