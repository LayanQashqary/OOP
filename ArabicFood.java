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
public class ArabicFood extends Food {
    
   
    

        public ArabicFood() {
        mainCourse = new String[]{"Meat Kebab", "Chicken kebab", "Kafta with Yougert", "Shawarma"};
        dessertCourse = new String[]{"Baklawa","Kounafa", "Mahalabia" ,"Umm Ali"};
        appetizersCourse = new String[]{"Hummus","Mutabal","Kebbah","Fattouch","Tabouleh","Rocca salad"};
    }

    @Override
    public double foodPrice(int gustesNum) {
        return order.length * 6 + gustesNum * 60;
    }

}