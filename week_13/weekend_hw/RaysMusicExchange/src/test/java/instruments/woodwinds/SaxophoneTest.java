package instruments.woodwinds;

import instruments.enums.Material;
import instruments.enums.Type;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SaxophoneTest {
    private Saxophone saxophone;

    @Before
    public void setup(){
        saxophone = new Saxophone(3000, 3200, "Tenor saxophone", Material.BRASS, Type.WOODWIND, "gold", "Bb");
    }

    @Test
    public void getType(){
        assertEquals(Type.WOODWIND, saxophone.getType());
    }

    @Test
    public void getMarkupOnSellingItem() {
        assertEquals(200, saxophone.calculateMarkup(saxophone.getPriceToSellFor(), saxophone.getPriceBoughtFor()), 0.00);
    }
}
