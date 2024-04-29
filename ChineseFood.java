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
public class ChineseFood  extends Food{
    
 public ChineseFood() {
        mainCourse = new String[]{"Spring roll", "Chinese noodles", "Kung Pao Chicken",
            "Sweet and savory chicken pieces", "Fried rice", "Mongolian meat"};
        dessertCourse = new String[]{"Yuanxia candy", "dwanoo candy", "Zongzi candy", "Rolled pancakes"};
        appetizersCourse = new String[]{"Jiaozi", "Egg rolls", "Cabbage salad",
            "spinach salad", "Okra salad recipe"};
    }

    @Override
    public double foodPrice(int gustesNum) {
        return order.length * 8 + gustesNum * 80;
    }
}