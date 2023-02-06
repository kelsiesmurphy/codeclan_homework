import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {
    private WaterBottle waterBottle;

    @Before
    public void setup() {
        waterBottle = new WaterBottle(100);
    }

    @Test
    public void waterBottleLoses10WhenDrink() {
        waterBottle.drink();
        waterBottle.drink();
        assertEquals(80, waterBottle.getVolume());
    }

    @Test
    public void waterBottleCanBeEmptied() {
        waterBottle.empty();
        assertEquals(0, waterBottle.getVolume());
    }

    @Test
    public void waterBottleCanBeRefilled() {
        waterBottle.empty();
        waterBottle.refill();
        assertEquals(100, waterBottle.getVolume());
    }
}


