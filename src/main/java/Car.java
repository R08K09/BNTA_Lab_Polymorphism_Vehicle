import interfaces.ILandVehicle;

public class Car extends Vehicle implements ILandVehicle {

    private boolean retractableRoof;
    private String vehicleFinish;
    private int numberOfWheels;

    public Car(String name, String colour, boolean publicTravel, int maxOccupancy,
               int maxSpeed, boolean retractableRoof, String vehicleFinish, int numberOfWheels){
        super(name, colour, publicTravel, maxOccupancy, maxSpeed);
        this.retractableRoof = retractableRoof;
        this.vehicleFinish = vehicleFinish;
        this.numberOfWheels = numberOfWheels;
    }

    // method
    public String getVehicleFinish(){
        return this.vehicleFinish;
    }

    public void setVehicleFinish(String vehicleFinish){
        this.vehicleFinish = vehicleFinish;
    }

    public int getNumberOfWheels(){
        return this.numberOfWheels;
    }

    public void setNumberOfWheels(int wheels){
        this.numberOfWheels = wheels;
    }

}
