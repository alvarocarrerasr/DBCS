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
public class HelloWorldBean implements HelloWorldBeanRemote {

    @Override
    public void sayHello(String name) {
        System.out.printf("Hello %s !\n");
    }


}
