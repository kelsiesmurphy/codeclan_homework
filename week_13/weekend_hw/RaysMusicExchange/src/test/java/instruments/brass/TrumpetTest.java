package instruments.brass;

import instruments.enums.Material;
import instruments.enums.Type;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrumpetTest {
    private Trumpet trumpet;

    @Before
    public void setup(){
        trumpet = new Trumpet(450, 600, "Student Bb trumpet with fast response", Material.BRASS, Type.BRASS, "gold", "Bb", 2);
    }

    @Test
    public void getType(){
        assertEquals(Type.BRASS, trumpet.getType());
    }

    @Test
    public void getMarkupOnSellingItem() {
        assertEquals(150, trumpet.calculateMarkup(trumpet.getPriceToSellFor(), trumpet.getPriceBoughtFor()), 0.00);
    }
}
