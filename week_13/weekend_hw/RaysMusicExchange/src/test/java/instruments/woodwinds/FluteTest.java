package instruments.woodwinds;

import instruments.enums.Material;
import instruments.enums.Type;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FluteTest {
    private Flute flute;

    @Before
    public void setup(){
        flute = new Flute(2200, 2500, "High quality flute with excellent projection", Material.SILVER, Type.WOODWIND, "silver", "C", true);
    }

    @Test
    public void getType(){
        assertEquals(Type.WOODWIND, flute.getType());
    }

    @Test
    public void getMarkupOnSellingItem() {
        assertEquals(300, flute.calculateMarkup(flute.getPriceToSellFor(), flute.getPriceBoughtFor()), 0.00);
    }
}
