import interfaces.IAirVehicle;

public class Plane extends Vehicle implements IAirVehicle {
    private boolean suitableForInternationalTravel;
    private String privateOrCommercial;

    public Plane(String name, String colour, boolean publicTravel, int maxOccupancy,
                 int maxSpeed, boolean suitableForInternationalTravel, String privateOrCommercial) {
        super(name, colour, publicTravel, maxOccupancy, maxSpeed);
        this.privateOrCommercial = privateOrCommercial;
        this.suitableForInternationalTravel = suitableForInternationalTravel;
    }

    public boolean isSuitableForInternationalTravel(){
        return this.suitableForInternationalTravel;
    }

    public String isPrivateOrCommercial(){
        return this.privateOrCommercial;
    }

}



