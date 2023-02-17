package instruments.strings;

import instruments.enums.Material;
import instruments.enums.Type;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {
    private Guitar guitar;

    @Before
    public void setup(){
        guitar = new Guitar(700, 1000, "Beginner Guitar", Material.WOOD, Type.STRINGS, "brown", 6);
    }

    @Test
    public void getType(){
        assertEquals(Type.STRINGS, guitar.getType());
    }

    @Test
    public void getMarkupOnSellingItem() {
        assertEquals(300, guitar.calculateMarkup(guitar.getPriceToSellFor(), guitar.getPriceBoughtFor()), 0.00);
    }
}
