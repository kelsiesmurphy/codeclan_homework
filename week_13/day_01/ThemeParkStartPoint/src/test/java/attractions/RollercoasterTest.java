package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void visitorOverAgeAndHeight() {
        Visitor visitor = new Visitor(13, 176, 12.00);
        assertEquals(true, rollerCoaster.isAllowedTo(visitor));
    }

    @Test
    public void visitorUnderAgeAndHeight() {
        Visitor visitor = new Visitor(11, 100, 12.00);
        assertEquals(false, rollerCoaster.isAllowedTo(visitor));
    }

    @Test
    public void visitorUnderAgeAndOverHeight() {
        Visitor visitor = new Visitor(11, 400, 12.00);
        assertEquals(false, rollerCoaster.isAllowedTo(visitor));
    }

    @Test
    public void visitorOverAgeAndUnderHeight() {
        Visitor visitor = new Visitor(18, 100, 12.00);
        assertEquals(false, rollerCoaster.isAllowedTo(visitor));
    }

    @Test
    public void priceForVisitorUnder200cm() {
        Visitor visitor = new Visitor(18, 100, 12.00);
        assertEquals(8.40, rollerCoaster.priceFor(visitor), 0.00);
    }

    @Test
    public void priceForVisitorOver200cm() {
        Visitor visitor = new Visitor(18, 240, 12.00);
        assertEquals(16.80, rollerCoaster.priceFor(visitor), 0.00);
    }
}
