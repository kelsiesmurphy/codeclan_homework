package instruments.strings;

import instruments.enums.Material;
import instruments.enums.Type;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DoubleBassTest {
    private DoubleBass doubleBass;

    @Before
    public void setup(){
        doubleBass = new DoubleBass(2500, 3500, "Beginner DoubleBass", Material.WOOD, Type.STRINGS, "brown", 4);
    }

    @Test
    public void getType(){
        assertEquals(Type.STRINGS, doubleBass.getType());
    }

    @Test
    public void getMarkupOnSellingItem() {
        assertEquals(1000, doubleBass.calculateMarkup(doubleBass.getPriceToSellFor(), doubleBass.getPriceBoughtFor()), 0.00);
    }
}
