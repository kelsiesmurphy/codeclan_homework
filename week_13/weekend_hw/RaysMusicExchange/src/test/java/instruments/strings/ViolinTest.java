package instruments.strings;

import instruments.enums.Material;
import instruments.enums.Type;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ViolinTest {
    private Violin violin;

    @Before
    public void setup(){
        violin = new Violin(1600, 2000, "Beginner Violin", Material.WOOD, Type.STRINGS, "brown", 4);
    }

    @Test
    public void getType(){
        assertEquals(Type.STRINGS, violin.getType());
    }

    @Test
    public void getMarkupOnSellingItem() {
        assertEquals(400, violin.calculateMarkup(violin.getPriceToSellFor(), violin.getPriceBoughtFor()), 0.00);
    }
}
