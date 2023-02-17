package accessories;

import item.Item;

public abstract class Accessory extends Item {
    public Accessory(double priceBoughtFor, double priceToSellFor, String description) {
        super(priceBoughtFor, priceToSellFor, description);
    }
}
