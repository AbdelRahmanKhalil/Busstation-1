/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bus_Station;

/**
 *
 * @author Lenovo
 */
public class Internal extends Trip {

    public Internal(String destination, int numberOfStops, Time departure, Time arrival, Bus_Station.Driver driver, Bus_Station.Vehicle vehicle) {
        super(destination, numberOfStops, departure, arrival, driver, vehicle);
    }
   public Internal(String name,String destination, Time departure,float price) {
     
       super(name,destination, departure, price);
        
    }
   public Internal (String Destination,int stops,Time Departure,Time Arrival,Driver driver)
    {
         super(Destination,stops,Departure, Arrival,driver);
    }
    public Internal()
    {
        
    }
    
    @Override
    public void calculatePrice()
    {
        
    }
    
}
