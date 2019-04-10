package Bus_Station;

//import static Bus_Station.BusStation.ExternalTrips;

import java.util.ArrayList;
import static javafx.application.Application.launch;

public abstract class Employee extends Account implements TripsManagement{
    
    String Age = new String();
    String Salary = new String();
    String Email= new String();

}


class Manager extends Employee

{
    
    
    
    public static ArrayList<Customer> Customers=new ArrayList<Customer>();
    Time Time =new Time();
    public Manager (String Username, String Password)
    {
        this.Username =Username;
        this.Password=Password;
    }
    
    int searchTrips(String InputTrip,String TripType)
    {
        
        int i;
        if(TripType.equalsIgnoreCase("internal"))
        {
        
        for(i=0;i<BusStation.InternalTrips.size();i++)
        {
            
            if(BusStation.InternalTrips.get(i).getName()==InputTrip)
            {
                return i;
            }
            
        }
        return -1;
        }
        else if(TripType.equalsIgnoreCase("external"))
        {
            for(i=0;i<BusStation.ExternalTrips.size();i++)
        {                                                                       //if -1 return alertBox else access trip
            
            if(BusStation.ExternalTrips.get(i).getName()==InputTrip)
            {
                return i;
            }
            
        }
        }
        return -1;
        
    
    }
    
    
     void CancelTrip(int indexInArrayList,String tripType)
    {
        // search shoudlve been done before calling cancel
        if(tripType.equalsIgnoreCase("internal"))
            BusStation.InternalTrips.remove(indexInArrayList);
        else if(tripType.equalsIgnoreCase("external"))
            BusStation.ExternalTrips.remove(indexInArrayList);
        
    }
    void availableDrivers()
    {
        int i;
        for(i=0;i<BusStation.Drivers.size();i++)
        {
            if(BusStation.Drivers.get(i).Available)
            {
                BusStation.AvailableDrivers.add(BusStation.Drivers.get(i));
            }
        }
            
    }
     void availableVehicles()
    {
        int i;
        for(i=0;i<BusStation.Vehicles.size();i++)
        {
            if(BusStation.Vehicles.get(i).getAvailable())
            {
                BusStation.AvailableVehicles.add(BusStation.Vehicles.get(i));
            }
        }
    }
            
            
     void AssignTrip(Driver driver,String destination,Time departure,Time arrival,int numberOfStops,Vehicle vehicle,String tripType)
     {
         
        if(tripType.equalsIgnoreCase("internal"))
        {
            Internal t = new Internal(destination,numberOfStops,departure,arrival,driver,vehicle);
            BusStation.InternalTrips.add(t);
        }

        else if(tripType.equalsIgnoreCase("external"))
        { 
           External t = new External(destination, numberOfStops, departure, arrival, driver, vehicle);
           BusStation.ExternalTrips.add(t);
        }
      
      }
     void updateTripsInPeople(Trip t)
     {
         int i,j;
        for(i=0;i<BusStation.Drivers.size();i++) 
        {
            for(j=0;j<BusStation.Drivers.get(i).AssignedTrips.size();j++)
            if(BusStation.Drivers.get(i).AssignedTrips.get(j)==t)
            {
                BusStation.Drivers.get(i).AssignedTrips.remove(j);
            }
        }
        for(i=0;i<Customers.size();i++) 
        {
            for(j=0;j<Customers.get(i).Trips.size();j++)
            if(Customers.get(i).Trips.get(j)==t)
            {
                Customers.get(i).Trips.remove(j);
            }
        }
     }

    @Override
    public void UpdateTrips() {
        
        int i;
        for(i=0;i<BusStation.InternalTrips.size();i++)
        {
            if(BusStation.InternalTrips.get(i).Departure.Year==Time.Year)
            {
                if(BusStation.InternalTrips.get(i).Departure.Month==Time.Month)
                {
                    if(BusStation.InternalTrips.get(i).Departure.Day>Time.Day)
                    {
                        updateTripsInPeople(BusStation.InternalTrips.get(i));
                       BusStation.AvailableDrivers.add(BusStation.InternalTrips.get(i).Driver);
                        BusStation.InternalTrips.remove(i);
                    }
                }
            }
            
        }
         for(i=0;i<BusStation.ExternalTrips.size();i++)
        {
            if(BusStation.ExternalTrips.get(i).Departure.Year==Time.Year)
            {
                if(BusStation.ExternalTrips.get(i).Departure.Month==Time.Month)
                {
                    if(BusStation.ExternalTrips.get(i).Departure.Day>Time.Day)
                    {
                        updateTripsInPeople(BusStation.ExternalTrips.get(i)); 
                        BusStation.AvailableDrivers.add(BusStation.ExternalTrips.get(i).Driver);
                        
                        BusStation.ExternalTrips.remove(i);
                    }
                }
            }
            
        }
         
            
    }
}
     
    

