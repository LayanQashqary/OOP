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
public class Reservations {

    Reserve[] reservationsBook = new Reserve[5000];
    ArrayList<Reserve> reservationsBook_ = new ArrayList<Reserve>();
    Scanner input = new Scanner(System.in);
    protected int numOfReservation = 0;

    public void addReserve() {
        System.out.print("▶ Enter date in the form \" YYYY/MM/DD\": ");
        String date = input.next();
       

        System.out.print("▶ Enter your name: ");
        String name = input.next();
       
      long phNum=0;
        int guestsNum=0;  
        
            while(phNum==0){
            try {
          System.out.print("▶ Enter your phone number: ");
          phNum = input.nextLong();
            
        } catch (InputMismatchException ex) {
                System.err.println("Error message :Only numbers are Acceptable");
               input.nextLine();
        }
                }
            
            while(guestsNum==0){
                try{
            
         System.out.print("▶ Enter guests Number: ");
        guestsNum = input.nextInt();
                }
             catch (InputMismatchException ex) {
                System.err.println("Error message :Only numbers are Acceptable");
               input.nextLine();
             }
            }
            
        reservationsBook[numOfReservation] = new Reserve(date, name,phNum, guestsNum);

        reservationsBook[numOfReservation].chooseConferenceType();
        reservationsBook[numOfReservation].ReserveHall();
         for (int i = 0; i < numOfReservation; i++) {
            if (date.equalsIgnoreCase(reservationsBook[i].date) && reservationsBook[i].confHall == reservationsBook[numOfReservation].confHall ) {
                    System.err.println("This hall in this day is not available please enter another date : ");
                    date = input.next();
                    reservationsBook[numOfReservation].date = date;
                }
            }
        
        reservationsBook[numOfReservation].chooseServeices();

        System.out.println("\t☑Your reserve has been added to our system \n\t☑This is your reserveation number: "
                + reservationsBook[numOfReservation].reserveNum);
        numOfReservation++;
            
        
        
    
    }

//
    public void updateReserve() {
        int index = searchReserve();
        if (index == -1) {
            System.err.println("NO RESERVATION WITH THIS NUMBER");
        } else {
            System.out.println("➤What do you want to update ?\n1-phone number"
                    + "\n2-date"
                    + "\n3-guests number"
                    + "\n4-the Hall"
                    + "\n5-service");
            int choice = input.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("➤Enter new phone number ");
                    reservationsBook[index].phoneNum = input.nextLong();
                    System.out.println("\t☑Phone number has been updated to " + reservationsBook[index].phoneNum);
                    break;
                }
                case 2: {
                    System.out.println("➤Enter new date");
                    reservationsBook[index].date = input.next();
                    System.out.println("\t☑Date has been updated to " + reservationsBook[index].date);
                    break;
                }
                case 3: {
                    System.out.println("➤Enter the guests number update:");
                    reservationsBook[index].guestsNum = input.nextInt();
                    System.out.println("\t☑Guests number has been updated to " + reservationsBook[index].guestsNum);
                    break;
                }

                case 4: {
                    reservationsBook[index].ReserveHall();
                    break;
                }
                case 5: {
                    reservationsBook[index].chooseServeices();
                    break;
                }
                default:
                    System.err.println("WRONG INPUT");
            }
        }
    }

    public void cancelReserve() {
        int index = searchReserve();
        if (index == -1) {
            System.out.println("NO RESERVATION WITH THIS NUMBER");
        } else {
            System.out.println("\t☑Reservation " + reservationsBook[index].reserveNum + " has been canceled");
            for (int i = index; i < numOfReservation; i++) {
                reservationsBook[i] = reservationsBook[i + 1];
            }
            numOfReservation--;

        }
    }

    public void displayReserve() {
        int index = searchReserve();
        if (index == -1) {
            System.err.println("NO RESERVATION WITH THIS NUMBER");
        } else {
            System.out.println(reservationsBook[index].toString());
        }
    }

    public void displayAllReserves() {
        if (numOfReservation == 0) {
            System.err.println("NO RESERVATIONS YET");
        } else {
            for (int i = 0; i < numOfReservation; i++) {
                System.out.println(reservationsBook[i].toString());
            }
        }
    }

    public int searchReserve() {
        System.out.println("➤Enter your reservation's number: ");
        int RN = input.nextInt();
        Reserve R = new Reserve(RN);

        for (int index = 0; index < numOfReservation; index++) {
            if (reservationsBook[index].equals(R) == true) {
                return index;

            }
        }
        return -1;
    }

    @Override
    public String toString() {
        return  "____________________________________________________________\n"
                +"\n1-Add Reserve\n"
                + "2-Update Reserve\n"
                + "3-Cancel Reserve\n"
                + "4-Display Reserve\n"
                + "5-Display All Reserve\n";
    }
}
