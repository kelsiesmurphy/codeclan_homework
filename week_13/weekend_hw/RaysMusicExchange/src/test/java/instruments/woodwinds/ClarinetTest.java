package instruments.woodwinds;

import instruments.brass.FrenchHorn;
import instruments.enums.Material;
import instruments.enums.Type;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClarinetTest {
    private Clarinet clarinet;

    @Before
    public void setup(){
        clarinet = new Clarinet(1700, 2000, "Wooden clarinet", Material.WOOD, Type.WOODWIND, "black", "Bb");
    }

    @Test
    public void getType(){
        assertEquals(Type.WOODWIND, clarinet.getType());
    }

    @Test
    public void getMarkupOnSellingItem() {
        assertEquals(300, clarinet.calculateMarkup(clarinet.getPriceToSellFor(), clarinet.getPriceBoughtFor()), 0.00);
    }
}
