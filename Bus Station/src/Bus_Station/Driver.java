package Bus_Station;
import Bus_Station.Employee;
import Bus_Station.Trip;
import java.util.ArrayList;

class Driver extends Employee 
{
    ArrayList<Trip> AssignedTrips = new ArrayList<Trip>();
    Boolean Available=true;
    
    public Driver (String Username, String Password)
    {
        this.Username=Username;
        this.Password=Password;
    }
    float Rating;

    
    public void removeTrip(int Index) {
        
    }

    @Override
    public void UpdateTrips() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}