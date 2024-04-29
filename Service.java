/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conferencemanagement;
import java.util.Scanner;
/**
 * 
 * This class choose the service , calculate total price of service and display service
 * @author Salma
 */
public class Service {
    
   protected int waitersNum=0;
    protected boolean screen;
    protected boolean speakers;
    protected int bodyguards=0;
    protected boolean liveCameras;
    protected boolean valetParking;
    protected Food food;
    Scanner input = new Scanner(System.in);
/**
 * public constructor with no parameter.

 */
    public Service() {

    }
/**
 * public constructor that initializes all the six attributes.
 * @param waitersNum  hold the number of waiters 
 * @param screen  hold true if the renter wants these services and false if not.
 * @param speakers  hold true if the renter wants these services and false if not.
 * @param bodyguards  hold the number of bodyguards
 * @param liveCameras  hold true if the renter wants these services and false if not.
 * @param valetParking hold true if the renter wants these services and false if not.

 */
    public Service(int waitersNum, boolean screen, boolean speakers, int bodyguards, boolean liveCameras, boolean valetParking) {
        this.waitersNum = waitersNum;
        this.screen = screen;
        this.speakers = speakers;
        this.bodyguards = bodyguards;
        this.liveCameras = liveCameras;
        this.valetParking = valetParking;
    }
    /**
     * public method  that takes the number of guests as a parameter and returns the approximate number of waiters needed using the following equation: Math.ceil(guestesNum / 10).
     * @param guestesNum Number of guestes 
     * @return Number of waiters depends on numbers of guests
     */
    public int calculateNumOfWaiters(int guestesNum) {
        return (int) (Math.ceil((guestesNum) / 10));
    }
    /**
     *  that takes the number of guests to return the double total price of the services by adding the prices of all the services that the renter has chosen
     * @param gustesNum Number of guestes 
     * @return Total price of service 
     */
    public double Price(int gustesNum) {
        int priceWaiters , priceScreen , priceBodyguards , priceSpeakers , priceLiveCameras , priceValetParking ;
        priceWaiters = (70 * waitersNum);
        if (screen)
            priceScreen = 500;
        else
            priceScreen = 0;
        
        priceBodyguards = (300 * bodyguards);
        if (speakers)
            priceSpeakers = 100;
        else
            priceSpeakers = 0;
        if (liveCameras)
            priceLiveCameras = 500;
        else
            priceLiveCameras = 0;
        if (valetParking)
            priceValetParking = 1000;
        else
            priceValetParking = 0;
        if(food==null)
            return priceWaiters + priceScreen + priceBodyguards + priceSpeakers + priceLiveCameras + priceValetParking;
        else
            return priceWaiters + priceScreen + priceBodyguards + priceSpeakers + priceLiveCameras + priceValetParking + food.foodPrice(gustesNum);
    }
/**
 *  This method return String that tells us what are selected services by using if statements .
 * 
 * @return Display Service as string 
 */
    public String DisplayService() {
        String s = "Services are: ";

        if (screen == true) {
            s = s + "\nScreen service ";
        }
        if (speakers == true) {
            s = s + "\nSpeakers service ";
        }
        if (bodyguards != 0) {
            s = s + "\nBodyGuards service ";
        }
        if (liveCameras == true) {
            s = s + "\nLiveCameras service ";
        }
        if (valetParking == true) {
            s = s + "\nvaletParking service ";
        }
        s = s + "\n";
        if (food == null)
            return s;
        else            
            return s + food.DisplayOrder();

    }
     /**
      * This method  display list of food type then take the user's choice and create new object from subclasses.
      */
    public void chooseFoodType() {
        System.out.println("➤Choose Food type\n"
                + "1-Arabic\n"
                + "2-Indian\n"
                + "3-Italian\n"
                + "4-French\n"
                + "5-Chinese");
        int choice = input.nextInt();
        switch (choice) {
            case 1: {
                food = (ArabicFood) new ArabicFood();
                break;
            }
            case 2: {
                food = (IndianFood) new IndianFood();
                break;
            }
            case 3: {
                food = (ItalianFood) new ItalianFood();
                break;
            }
            case 4: {
                food = (FrenchFood) new FrenchFood();
                break;
            }
            case 5: {
                food = (ChineseFood) new ChineseFood();
                break;
            }
            default: System.out.println("WRONG INPUT");
        }

    }

    @Override
    /**
     * This method to display list of all services.
     */
    public String toString() {
        return "1-Screen\n"
                + "2-speakers\n"
                + "3-bodyguards\n"
                + "4-live Cameras\n"
                + "5-valet Parking\n"
                + "6-food\n"
                + "7-stop\n";
    }

}