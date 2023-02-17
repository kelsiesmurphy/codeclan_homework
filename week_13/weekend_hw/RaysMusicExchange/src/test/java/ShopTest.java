import instruments.enums.Material;
import instruments.enums.Type;
import instruments.strings.Cello;
import instruments.woodwinds.Clarinet;
import instruments.woodwinds.Flute;
import instruments.woodwinds.Saxophone;
import item.Item;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ShopTest {
    private Shop shop;

    @Before
    public void setup(){
        Clarinet clarinet = new Clarinet(1700, 2000, "Wooden clarinet", Material.WOOD, Type.WOODWIND, "black", "Bb");
        Flute flute = new Flute(2200, 2500, "High quality flute with excellent projection", Material.SILVER, Type.WOODWIND, "silver", "C", true);
        Saxophone saxophone = new Saxophone(3000, 3200, "Tenor saxophone", Material.BRASS, Type.WOODWIND, "gold", "Bb");
        Cello cello = new Cello(1000, 1500, "Beginner Cello", Material.WOOD, Type.STRINGS, "brown", 4);

        ArrayList<Item> items = new ArrayList<>();
        items.add(clarinet);
        items.add(flute);
        items.add(saxophone);
        items.add(cello);

        shop = new Shop(items);
    }

    @Test
    public void getGetTotalProfitFromShop(){
        assertEquals(1300, shop.getTotalPotentialProfit(), 0.00);
    }
}
