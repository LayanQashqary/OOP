
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conferencemanagement;

import java.util.Scanner;

/**
 *
 * @author Rawan
 */
public class TestConferenceManagement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);

        //-------------------------------------- Array------------------------------------------
        Reservations resArr = new Reservations();
        int choice = 0;
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n"
                +"Welcome to STRAVA!\n"
                + "Strava is a company for organizing and managing conferences,\n"
                + "and we’re glad that you chose us and we hope that our services will satisfy you.\n"
                +"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n"
                + "Choose the option you want:");
                
        while (choice != 6) {
            System.out.println(resArr + "6-stop\n____________________________________________________________");
            System.out.print("▶ Enter your choice please:");
            choice = input.nextInt();
            switch (choice) {
                case 1: {
                    resArr.addReserve();
                    break;
                }
                case 2: {
                    resArr.updateReserve();
                    break;
                }
                case 3: {
                    resArr.cancelReserve();
                    break;
                }
                case 4: {
                    resArr.displayReserve();
                    break;
                }
                case 5: {
                    resArr.displayAllReserves();
                    break;
                }
                case 6:
                    break;
                default:
                    System.err.println("WRONG INPUT!");
                    break;
            }

        }

    }

}
