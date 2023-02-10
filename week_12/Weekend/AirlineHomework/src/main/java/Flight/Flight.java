package Flight;

import plane.Plane;
import staff.CabinCrewMember;
import staff.Pilot;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Random;

public class Flight {
    private ArrayList<Pilot> pilots;
    private ArrayList<CabinCrewMember> crewMembers;
    private Plane plane;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private LocalDateTime departureTime;
    private ArrayList<Passenger> passengers;

    public Flight(ArrayList<Pilot> pilots, ArrayList<CabinCrewMember> crewMembers, Plane plane, String flightNumber, String destination, String departureAirport, LocalDateTime departureTime, ArrayList<Passenger> passengers) {
        this.pilots = pilots;
        this.crewMembers = crewMembers;
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
        this.passengers = passengers;
    }

    public ArrayList<Pilot> getPilots() {
        return pilots;
    }

    public void setPilots(ArrayList<Pilot> pilots) {
        this.pilots = pilots;
    }

    public ArrayList<CabinCrewMember> getCrewMembers() {
        return crewMembers;
    }

    public void setCrewMembers(ArrayList<CabinCrewMember> crewMembers) {
        this.crewMembers = crewMembers;
    }

    public Plane getPlane() {
        return plane;
    }

    public void setPlane(Plane plane) {
        this.plane = plane;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public void setDepartureAirport(String departureAirport) {
        this.departureAirport = departureAirport;
    }

    public LocalDateTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalDateTime departureTime) {
        this.departureTime = departureTime;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(ArrayList<Passenger> passengers) {
        this.passengers = passengers;
    }

    //    METHODS OUTWITH GETTERS/SETTERS

    public int getAvailableSeats() {
        return this.plane.getPlaneType().getCapacity() - this.passengers.size();
    }

    public void bookPassenger(Passenger passenger, Flight flight) {
        passengers.add(passenger);
        passenger.setFlight(flight);


        for(Passenger person : passengers) {
            Random random = new Random();
            int seatNum = random.nextInt(flight.getPlane().getPlaneType().getCapacity());
            if(person.getSeatNumber() == seatNum) {
                continue;
            } else {
                passenger.setSeatNumber(seatNum);
                break;
            }
        }
    }
}
