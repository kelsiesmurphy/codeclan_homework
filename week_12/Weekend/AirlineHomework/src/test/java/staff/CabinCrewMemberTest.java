package staff;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {
    private CabinCrewMember cabinCrewMember;

    @Before
    public void setup() {
        cabinCrewMember = new CabinCrewMember("Mary Mason", RankType.FLIGHTATTENDANT);
    }

    @Test
    public void getRank(){
        assertEquals(RankType.FLIGHTATTENDANT, cabinCrewMember.getRank());
    }

    @Test
    public void relayMessageWorks(){
        assertEquals("The seatbelt sign is now off", cabinCrewMember.relayMessage("The seatbelt sign is now off"));
    }

}
