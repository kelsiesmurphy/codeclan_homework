package stalls;

import behaviours.IReviewed;
import behaviours.ITicketed;
import people.Visitor;

public abstract class Stall implements IReviewed, ITicketed {

    private String name;
    private String ownerName;
    private int rating;
    private ParkingSpot parkingSpot;

    public Stall(String name, String ownerName, int rating, ParkingSpot parkingSpot) {
        this.name = name;
        this.ownerName = ownerName;
        this.rating = rating;
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

    public int getRating() {
        return rating;
    }

    public double defaultPrice() {
        return 0;
    }

    public double priceFor(Visitor visitor) {
        return 0;
    }
}
