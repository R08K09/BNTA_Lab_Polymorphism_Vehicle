import java.util.ArrayList;

public class TransportNetwork {

    private ArrayList<Vehicle> vehicles;

    public TransportNetwork(){
        this.vehicles = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle){
        this.vehicles.add(vehicle);
    }

    public int countVehicles(){
        return this.vehicles.size();
    }


}
