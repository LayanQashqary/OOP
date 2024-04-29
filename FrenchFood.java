/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conferencemanagement;

/**
 *
 * @author Rawan
 */
public class FrenchFood extends Food {
    
     public FrenchFood(){
         mainCourse = new String[]{"Gigot d’Agneau", "Coquilles Saint-Jacques", "Ratatouille", "Escargots"};
         dessertCourse = new String[]{"Macaron" ,"Crepe" ,"Cream brulee","French toast", "Soufflé"};
         appetizersCourse = new String[]{"Sourdough bread", "croissant", "Salade de Chèvre Chaud"
         ,"Tomates Farcies","Gratin Dauphinois"};
    }
    
    
     @Override
    public double foodPrice(int gustesNum){
        return order.length * 9 + gustesNum * 90;
    }

    
    

}
