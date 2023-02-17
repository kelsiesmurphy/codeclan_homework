package instruments.strings;

import instruments.enums.Material;
import instruments.enums.Type;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ViolaTest {
    private Viola viola;

    @Before
    public void setup(){
        viola = new Viola(1000, 1500, "Beginner Viola", Material.WOOD, Type.STRINGS, "brown", 4);
    }

    @Test
    public void getType(){
        assertEquals(Type.STRINGS, viola.getType());
    }

    @Test
    public void getMarkupOnSellingItem() {
        assertEquals(500, viola.calculateMarkup(viola.getPriceToSellFor(), viola.getPriceBoughtFor()), 0.00);
    }
}
