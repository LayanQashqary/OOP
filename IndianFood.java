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
public class IndianFood  extends Food{
   
   public IndianFood() {
        mainCourse = new String[] {"Chicken 65","Biryani", "chicken butter","Reshmi kabab", "Tikka Masala"
                , "Curry"};
        dessertCourse = new String[] { "Gulaab jamman", "Halwa", "Barfi"};
        appetizersCourse = new String[] {"Butter nan", "Samosa", "Vada Pav", "Roti Bread"};
    }
   
    @Override
    public double foodPrice(int gustesNum){
        return order.length * 6 + gustesNum * 60;
    }

}
