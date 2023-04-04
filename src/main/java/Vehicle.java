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
    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getColour(){
        return this.colour;
    }

    public void setColour(String colour){
        this.colour = colour;
    }

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

    public boolean isForPublicTravel(){
        return this.publicTravel;
    }

    public void setIfSuitableForPublicTravel(boolean publicTravel){
        this.publicTravel = publicTravel;
    }



}
