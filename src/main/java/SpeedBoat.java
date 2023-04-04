import interfaces.IWaterVehicle;

public class SpeedBoat extends Vehicle implements IWaterVehicle {

    private boolean divesUnderwater;
    private String hullType;


    public SpeedBoat(String name, String colour, boolean publicTravel, int maxOccupancy,
                 int maxSpeed, boolean divesUnderwater, String hullType){
        super(name, colour, publicTravel, maxOccupancy, maxSpeed);
        this.divesUnderwater = divesUnderwater;
        this.hullType = hullType;
    }

    public boolean canDiveUnderwater(){
        return this.divesUnderwater;
    }

    public String getHullType() {
        return this.hullType;
    }

    public void setHullType(String hullType){
        this.hullType = hullType;
    }
}
