import interfaces.IVehicle;

public abstract class Vehicle implements IVehicle {

    // Properties
    private String name;
    private String colour;
    private boolean publicTravel;
    private int maxOccupancy;
    private int maxSpeed;

    // Constructors
    public Vehicle(String name, String colour, boolean publicTravel, int maxOccupancy, int maxSpeed){
        this.name = name;
        this.colour = colour;
        this.publicTravel = publicTravel;
        this.maxOccupancy = maxOccupancy;
        this.maxSpeed = maxSpeed;
    }

    // Methods
    public int getMaxSpeed(){
        return this.maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed){
        this.maxSpeed = maxSpeed;
    }

    public int getMaxOccupancy(){
        return this.maxOccupancy;
    }

    public void setMaxOccupancy(int maxOccupancy){
        this.maxOccupancy = maxOccupancy;
    }


}
