/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import javax.ejb.Local;

/**
 *
 * @author alvarocr
 */
@Local
public interface SaludosEJBLocal {

    String saludaEspanol(String name);
    String saludaFrancais(String name);
    String saludaEnglish(String name);
    
}
