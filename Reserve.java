/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package conferencemanagement;

import java.util.*;

/**
 *
 * @author Rawan
 */


public class Reserve implements AllHalls {

 protected String date;
   
    protected String name;
    protected long phoneNum;
    protected int guestsNum;
    protected double totalPrice;
    protected Service service = new Service();
    protected conferenceType confType;
    protected Hall confHall;
    protected int reserveNum;
    Scanner input = new Scanner(System.in);

    public Reserve(String date, String name,long phoneNum, int guestsNum) {
        this.date = date;
        this.name = name;
        this.phoneNum = phoneNum;
        this.guestsNum = guestsNum;
        this.reserveNum = (int) (1000 + Math.random() * 4001); //range =(1000-5000)
    }
   

    public Reserve(int reserveNum) {
        this.reserveNum = reserveNum;
    }

  

    public void chooseConferenceType() {
        System.out.println("➤Choose Conference type\n"
                + "1-Journalist\n"
                + "2-workshop\n"
                + "3-scientific");
        int choice = input.nextInt();
        switch (choice) {
            case 1: {
                confType = (Journalist) new Journalist();
                break;
            }
            case 2: {
                confType = (WorkShop) new WorkShop();
                break;
            }
            case 3: {
                confType = (Scientific) new Scientific();
                break;
            }
            default: System.out.println("WRONG INPUT");
        }

    }

    @Override
    public void ReserveHall() {
        ArrayList<Hall> h = searchHalls();

        for (int i = 0; i < h.size(); i++) {
          
                System.out.println(i + 1 + "- " + h.get(i).toString() + "\n");
            
        }
//take the number of the chosen hall
        try{
        System.out.println("➤Write the choosen hall number:");
        int in = input.nextInt();
        confHall = h.get(in-1);
        System.out.println("\t☑Hall "+in +" has been booked");
    }
        catch (Exception e){
           
            System.err.println("NO HALL WITH THIS NUMBER IN THE LIST!");
            ReserveHall();
            
        }
    }
    public void chooseServeices() {
        System.out.println("➤Choose the serveice number you want:   ");
        int choice = 0;
        while (choice != 7) {
            System.out.println(service.toString());
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    service.screen = true;
                    System.out.println("\t☑Screen service has been added");
                    break;

                case 2:
                    service.speakers = true;
                    System.out.println("\t☑Speakers service has been added");
                    break;

                case 3:
                    System.out.println("➤How many bodyguards do you want?");
                    int inBg = input.nextInt();
                    service.bodyguards = inBg;
                    System.out.println("\t☑Bodyguards service has been added");
                    break;

                case 4:
                    service.liveCameras = true;
                    System.out.println("\t☑Live Cameras service has been added");
                    break;

                case 5:
                    service.valetParking = true;
                    System.out.println("\t☑ValetParking service has been added");
                    break;

                case 6:
                    service.chooseFoodType();
                    service.food.addcourse();
                    break;

                case 7:
                    break;
                
                default :
                    System.out.println("WRONG INPUT");
                    break;
            }
        }
    }

    public double totalPrice() {
        return service.Price(guestsNum) + confHall.hallPrice;
    }

    @Override
    public ArrayList searchHalls() {
        ArrayList <Hall> hall = new ArrayList <Hall>();
        System.out.println("➤Search for halls based on:"
                + "\n1-Distance from city center."
                + "\n2-Distance from airport."
                + "\n3-Number of gustes."
                + "\n4-Display All");
        int ch = input.nextInt();
        switch (ch) {
            case 1: {
                
                for (int i = 0; i < halls.length; i++) {
                    if (halls[i].address.distanceFromCC < 10) 
                        hall.add(halls[i]);

                }

                break;
            }
            case 2: {

                
                for (int i = 0; i < halls.length; i++) {
                    if (halls[i].address.distanceFromAirport < 10) {
                        hall.add(halls[i]);
                    }
                }
                break;
            }
            case 3: {
               
                for (int i = 0; i < halls.length; i++) {
                     double hallSize = halls[i].size;
                    if ((double)(hallSize*2/3)>=guestsNum && guestsNum>=(double)(hallSize*2/3)-70) 
                        hall.add(halls[i]);
   
                }
                break;
            }
            case 4: {
                    Collections.addAll(hall, halls);
                break;
            }
            default: System.out.println("WRONG INPUT");
            
        }
        return hall;
    }

    @Override
    public boolean equals(Object O) {
        Reserve r = (Reserve) O;

        return r.reserveNum == this.reserveNum;
    }

    @Override
    public String toString() {
        return "\n☛Reserve Number: " + this.reserveNum
                + "\n☛Name: " + this.name
                + "\n☛Date: " + this.date
                + "\n☛Number Phone: " + this.phoneNum
                + "\n☛Number of guest: " + this.guestsNum
                + "\n☛Number of bodyguards: "+ service.bodyguards
                + "\n☛Number of Waiters: "+ service.calculateNumOfWaiters(guestsNum)
                + "\n☛Table shape (based on the conference type): "+ confType.tableShape()
                + "\n☛Total price: " + totalPrice() +"﷼"
                + "\n" + service.DisplayService()
                + confHall.toString();

    }
}