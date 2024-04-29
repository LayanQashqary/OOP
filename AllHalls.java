/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conferencemanagement;

import java.util.ArrayList;

/**
 * This interface to Declare array of Hall type contains 8 elements of creating new objects from Hall
 * Declare an abstract method called searchHalls return array of Hall.
 * Declare a void abstract method called ReserveHall.
 * @author Salma
 */
public interface AllHalls {
   
    Hall halls[] = {
        new Hall("Moon", 450, "Jeddah", "King Abdulaziz", 5, 7, 13000, 4, 20, 900, 7, 4, 8, true),
        new Hall("Mary", 300, "Jeddah", "King Abdulaziz", 10, 0, 24000, 7, 30, 600, 5, 9, 9, true),
        new Hall("bin sultan", 250, "Jeddah", "Saad", 34, 8, 17500, 10, 80, 500, 25, 12, 6, true),
        new Hall("Samara", 315, "Jeddah", "King Sultan", 15, 13, 16000, 7, 30, 630, 12, 2, 8, true),
        new Hall("Sadim", 900, "Jeddah", "Marthad", 37, 14, 9800, 4, 24, 1800, 9, 2, 6, true),
        new Hall("shomos", 1000, "Jeddah", "King Sultan", 38, 20, 18000, 8, 85, 2500, 18, 4, 7, false),
        new Hall("AlQasr", 500, "Jeddah", "AlBasateen", 50, 15, 20000, 6, 50, 1000, 8, 4, 8, true),
        new Hall("Leylaty", 450, "Jeddah", "AlKhaldih", 3, 30, 25000, 4, 40, 900, 4, 2, 10, true)};
/**
 * abstract method return array of Hall.
 * @return array of Hall.
 */
    public ArrayList searchHalls();

    public void ReserveHall();

}