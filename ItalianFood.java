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
public class ItalianFood  extends Food{
    
      public ItalianFood(){
         mainCourse = new String[]{"Pizza", "Pasta", "Risotto", "Gnocchi", "Lasagne", "Ravioli"};
         dessertCourse = new String[]{"tiramisu" ,"Gelato", "panna cotta", "cannoli", "bomboloni"};
         appetizersCourse = new String[]{"Salad de burrata", "Bagna Cauda", "Polenta", "Focaccia"
         , "Arancini", "Panzerotto fritto"};
    }
        
    @Override
    public double foodPrice(int gustesNum){
        return order.length * 7 + gustesNum * 70;
    }


}
