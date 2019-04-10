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
public class Customer extends Account implements TripsManagement {
    
    String PhoneNumber;
    int Age;
    ArrayList<Trip> Trips = new ArrayList<Trip>();
    ArrayList<Integer> SearchedIndexes=new ArrayList<Integer>();
    
    public Customer( String userName,String password,String phoneNumber,int age)
    {
        this.Username=userName;
        this.Password=password;
        this.PhoneNumber=phoneNumber;
        this.Age=age;
    }
    
    
    Customer orderTrip(Trip t)    //returns customer to add passenger to the main arraylist of trips
    {
        Trips.add(t);
        return this;
    }
    
    void deleteTrip(int indexOfTrip,Trip tripFromManager)
    {
        Trips.remove(indexOfTrip);
        tripFromManager.removePassenger(this);
        
    }        
    void reviewTrips () //
    {
        
    }

    
    public void removeTrip(int Index) {
        
    }

    @Override
    public void UpdateTrips() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    int searchTrips(String InputTrip,String TripType)
    {
        System.out.println("Entered Search");
        int i;
        int result=-1;                                                              //if didn't find results
        if(TripType.equalsIgnoreCase("internal"))
        {
        
        for(i=0;i<BusStation.InternalTrips.size();i++)
        {
            
            if(InputTrip.equalsIgnoreCase(BusStation.InternalTrips.get(i).Destination))
            {
                SearchedIndexes.add(i);
                result=0;   //found result
            }
            
        }
        return result;
        }
        else if(TripType.equalsIgnoreCase("external"))
        {
            for(i=0;i<BusStation.ExternalTrips.size();i++)
        {                                                                       //if -1 return alertBox else access trip
            
            if(InputTrip.equalsIgnoreCase(BusStation.ExternalTrips.get(i).Destination))
            {
                SearchedIndexes.add(i);
                result=0;
            }
            
        }
            return result;
        }
        return result;
        
        
    
    }
    
            
}
