package instruments.brass;

import instruments.enums.Material;
import instruments.enums.Type;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TubaTest {
    private Tuba tuba;

    @Before
    public void setup(){
        tuba = new Tuba(8000, 10000, "Brass Tuba", Material.BRASS, Type.BRASS, "gold", "BBb", 4);
    }

    @Test
    public void getType(){
        assertEquals(Type.BRASS, tuba.getType());
    }

    @Test
    public void getMarkupOnSellingItem() {
        assertEquals(2000, tuba.calculateMarkup(tuba.getPriceToSellFor(), tuba.getPriceBoughtFor()), 0.00);
    }
}
