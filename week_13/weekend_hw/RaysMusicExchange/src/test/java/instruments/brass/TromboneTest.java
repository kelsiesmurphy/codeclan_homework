package instruments.brass;

import instruments.enums.Material;
import instruments.enums.Type;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TromboneTest {
    private Trombone trombone;

    @Before
    public void setup(){
        trombone = new Trombone(400, 500, "Alto Beginner Trombone", Material.BRASS, Type.BRASS, "gold", "Bb", 20.3);
    }

    @Test
    public void getType(){
        assertEquals(Type.BRASS, trombone.getType());
    }

    @Test
    public void getMarkupOnSellingItem() {
        assertEquals(100, trombone.calculateMarkup(trombone.getPriceToSellFor(), trombone.getPriceBoughtFor()), 0.00);
    }
}
