package instruments.brass;

import instruments.enums.Material;
import instruments.enums.Type;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FrenchHornTest {
    private FrenchHorn frenchHorn;

    @Before
    public void setup(){
        frenchHorn = new FrenchHorn(3500, 4000, "Brass French Horn", Material.BRASS, Type.BRASS, "gold", "F", 4);
    }

    @Test
    public void getType(){
        assertEquals(Type.BRASS, frenchHorn.getType());
    }

    @Test
    public void getMarkupOnSellingItem() {
        assertEquals(500, frenchHorn.calculateMarkup(frenchHorn.getPriceToSellFor(), frenchHorn.getPriceBoughtFor()), 0.00);
    }

    @Test
    public void canPlayFrenchHorn(){
        assertEquals("Honk honk", frenchHorn.play());
    }
}