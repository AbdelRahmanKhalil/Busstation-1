/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bus_Station;
import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public abstract class Trip {
    String Name; 
    String Destination;
    ArrayList<Customer> Passengers = new ArrayList<Customer>();
    int NumberOfStops;
    float Price;
    float DistanceInKm;
    Time Departure ;
    Time Arrival;
    Driver Driver;
    Vehicle Vehicle;
    int AvailableSeats;
    
    public Trip(String destination,int numberOfStops,Time departure,Time arrival,Driver driver,Vehicle vehicle)
    {
        Destination=destination;
        NumberOfStops=numberOfStops;
        Departure=departure;
        Arrival=arrival;
        Driver=driver;
        Vehicle=vehicle;
        //AvailableSeats=vehicle.getSeats();
    }
    public Trip(String name,String destination, Time departure,float price) {
     
        Name=name;
        Destination=destination;
        Departure=departure;
        Price=price;
    }
    public Trip(String Destination,int stops,Time Departure,Time Arrival,Driver driver)
    {
         this.Destination=Destination;
         this.NumberOfStops=stops;
         this.Departure=Departure;
         this.Arrival=Arrival;
         this.Driver=driver;
    }

    public Trip()
    {
        
    }
    
    public void calculatePrice()
    {
                
    }
    
    public void addPassenger(Customer c)
    {
        Passengers.add(c);
    }
    public void removePassenger(Customer c)
    {
        Passengers.remove(c);
    }
    public String getName ()
    {
        return this.Name;
    }
}
