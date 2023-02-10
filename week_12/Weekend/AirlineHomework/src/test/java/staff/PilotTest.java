package staff;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {
    private Pilot pilot;

    @Before
    public void setup() {
        pilot = new Pilot("Scott Johnston", RankType.CAPTAIN, "SJ389235");
    }

    @Test
    public void getLicense(){
        assertEquals("SJ389235", pilot.getLicenseNumber());
    }

    @Test
    public void flyPlane(){
        assertEquals("Neowwwwwwwww", pilot.flyPlane());
    }
}