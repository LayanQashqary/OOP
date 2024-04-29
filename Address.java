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
public class Address {
  protected String city;
    protected String street;
    protected int distanceFromAirport;
    protected int distanceFromCC;

    public Address(String city, String street, int distanceFromAirport, int distanceFromCC) {
        this.city = city;
        this.street = street;
        this.distanceFromAirport = distanceFromAirport;
        this.distanceFromCC = distanceFromCC;

    }

    @Override
    public String toString() {
        return "The hall is located in:"
                + "\nCity: " + city
                + "\nStreet: " + street + "\n"
                + distanceFromAirport + "KM far from the Airport \n"
                + distanceFromCC + "KM far from the city center\n";

    }
}