import attractions.Attraction;
import attractions.Dodgems;
import org.junit.Before;
import org.junit.Test;
import people.Visitor;
import stalls.CandyflossStall;
import stalls.ParkingSpot;
import stalls.Stall;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {
    private ThemePark themePark;

    @Before
    public void setup() {
        ArrayList<Attraction> attractions = new ArrayList<>();
        ArrayList<Stall> stalls = new ArrayList<>();
        themePark = new ThemePark(attractions, stalls);
    }

    @Test
    public void canVisit() {
        Visitor visitor1 = new Visitor(16, 145, 12.00);
        Attraction attraction1 = new Dodgems("Dodgems", 4);
        themePark.visit(visitor1, attraction1);
        assertEquals(1, attraction1.getVisitCount());
    }
}
