package plane;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    private Plane plane;

    @Before
    public void setup(){
        plane = new Plane(PlaneType.AIRBUSA380);
    }

    @Test
    public void getPlaneType() {
        assertEquals(PlaneType.AIRBUSA380, plane.getPlaneType());
    }
}