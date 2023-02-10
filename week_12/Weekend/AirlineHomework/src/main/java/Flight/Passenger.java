package Flight;

public class Passenger{
    private String name;
    private int numOfBags;
    private Integer seatNumber;
    private Flight flight;

    public Passenger(String name, int numOfBags, Flight flight, Integer seatNumber) {
        this.name = name;
        this.numOfBags = numOfBags;
        this.flight = flight;
        this.seatNumber = seatNumber;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(Integer seatNumber) {
        this.seatNumber = seatNumber;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumOfBags() {
        return numOfBags;
    }

    public void setNumOfBags(int numOfBags) {
        this.numOfBags = numOfBags;
    }
}
