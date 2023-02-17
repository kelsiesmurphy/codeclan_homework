package instruments.strings;

import instruments.enums.Material;
import instruments.enums.Type;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CelloTest {
    private Cello cello;

    @Before
    public void setup(){
        cello = new Cello(1000, 1500, "Beginner Cello", Material.WOOD, Type.STRINGS, "brown", 4);
    }

    @Test
    public void getType(){
        assertEquals(Type.STRINGS, cello.getType());
    }

    @Test
    public void getMarkupOnSellingItem() {
        assertEquals(500, cello.calculateMarkup(cello.getPriceToSellFor(), cello.getPriceBoughtFor()), 0.00);
    }
}
