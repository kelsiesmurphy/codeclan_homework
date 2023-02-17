package instruments.percussion;

import instruments.enums.Material;
import instruments.enums.Type;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KeyboardTest {
    private Keyboard keyboard;

    @Before
    public void setup(){
        keyboard = new Keyboard(2500, 3000, "Stage Piano", Material.WOOD, Type.PERCUSSION, "black", 88);
    }

    @Test
    public void getType(){
        assertEquals(Type.PERCUSSION, keyboard.getType());
    }

    @Test
    public void getMarkupOnSellingItem() {
        assertEquals(500, keyboard.calculateMarkup(keyboard.getPriceToSellFor(), keyboard.getPriceBoughtFor()), 0.00);
    }
}
