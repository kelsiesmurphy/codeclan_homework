package stalls;

import behaviours.IReviewed;
import behaviours.ITicketed;

public abstract class Stall implements IReviewed, ITicketed {

    private String name;
    private String ownerName;
    private ParkingSpot parkingSpot;

    public Stall(String name, String ownerName, ParkingSpot parkingSpot) {
        this.name = name;
        this.ownerName = ownerName;
        this.parkingSpot = parkingSpot;
    }

    public String getName() {
        return name;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }
}
