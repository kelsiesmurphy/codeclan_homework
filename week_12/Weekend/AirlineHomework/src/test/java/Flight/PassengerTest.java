package Flight;

import Flight.Passenger;
import org.junit.Before;
import org.junit.Test;
import plane.Plane;
import plane.PlaneType;
import staff.CabinCrewMember;
import staff.Pilot;
import staff.RankType;

import java.time.LocalDateTime;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class PassengerTest {
    private Passenger passenger;

    private Flight flightNull;
    private Flight flight;

    @Before
    public void setup(){
        Pilot pilotCaptain = new Pilot("Scott Johnston", RankType.CAPTAIN, "SJ29403");
        Pilot pilotFirstOfficer = new Pilot("Beth Banks", RankType.FIRSTOFFICER, "BB25525");
        ArrayList<Pilot> pilots = new ArrayList<>();
        pilots.add(pilotCaptain);
        pilots.add(pilotFirstOfficer);

        CabinCrewMember crewMemberAttendant = new CabinCrewMember("Janet Jameson", RankType.FLIGHTATTENDANT);
        CabinCrewMember crewMemberPurser = new CabinCrewMember("Mike Mason", RankType.PURSER);
        ArrayList<CabinCrewMember> crew = new ArrayList<>();
        crew.add(crewMemberAttendant);
        crew.add(crewMemberPurser);

        Plane plane = new Plane(PlaneType.AIRBUSA380);

        ArrayList<Passenger> passengers = new ArrayList<>();
        Passenger passenger1;
        Passenger passenger2;
        passengers.add(passenger1 = new Passenger("Paul P.", 2, flightNull, null));
        passengers.add(passenger2 = new Passenger("Mary P.", 1, flightNull, null));

        flight = new Flight(pilots, crew, plane, "AX50", "EDI", "LAX", LocalDateTime.now(), passengers);

        passenger = new Passenger("John Doe", 2, flight, null);
    }

    @Test
    public void getBagNumber() {
        assertEquals(2, passenger.getNumOfBags());
    }
}
