
package carroCompra;
import java.io.Serializable;
import java.util.ArrayList;
import javafx.util.Pair;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alvarocr
 */
public class CarroCompra implements Serializable {
    
    private ArrayList<Pair> elements;
    public CarroCompra(){
        elements = new ArrayList<Pair>();
    }
    
    public void addProduct(String description, int amount){
        elements.add(new Pair<String,Integer>(description, amount));
    }
    public void removeProducts(){
        elements.clear();
    }
    
    @Override
    public String toString(){
        String answer="";
        for(int i=0;i<elements.size();i++){
            answer+=elements.get(i).getKey();
            answer+="\t"+elements.get(i).getValue();
            answer+="</br>";
        }
        return answer;
    }
    
}
