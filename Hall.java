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
public class Hall {
     //Data fields declaration
    protected String name;
    protected int size;
    protected Address address;
    protected double hallPrice;
    protected int numOfGates;
    protected int numOfTables;
    protected int numOfChairs;
    protected int numOfSpeakers;
    protected int numOfScreens;
    protected int numOfCCTV;
    protected boolean WiFi;

    //Parameterized Constructor
    public Hall(String name, int size, String city, String street, int distanceFromAirport, int distanceFromCC, double hallPrice, int numOfGates, int numOfTables, int numOfChairs, int numOfSpeakers, int numOfScreens, int numOfCCTV, boolean WiFi ) {

        this.name = name;
        this.size = size;
        this.address = new Address(city, street, distanceFromAirport, distanceFromCC);
        this.hallPrice = hallPrice;
        this.numOfGates = numOfGates;
        this.numOfTables = numOfTables;
        this.numOfChairs = numOfChairs;
        this.numOfSpeakers = numOfSpeakers;
        this.numOfScreens = numOfScreens;
        this.numOfCCTV = numOfCCTV;
        this.WiFi = WiFi;
    }
    
    @Override
    public boolean equals(Object o){
        Hall h = (Hall) o;
        return (h.name == this.name);  
    }
    
    @Override
    public String toString(){
        return "\nHall information:" +
                "\nName: " + name + 
                "\nSize: " + size + "m" + 
                "\nAddress: " + address.toString() +
                "Hall Price: " + hallPrice + 
                "\nNumber of Gates: " + numOfGates +
                "\nMaximum number of Tabels: " + numOfTables +
                "\nMaximum number of Chairs: " + numOfChairs + 
                "\nNumber of Speakers: " + numOfSpeakers + 
                "\nNumber of Screens: " + numOfScreens + 
                "\nNumber of CCTV Cameras: " + numOfCCTV + 
                "\nWiFi avilability: " + WiFi + "\n";
    }
}