package instruments.percussion;

import instruments.Instrument;
import instruments.enums.Material;
import instruments.enums.Type;

public class Keyboard extends Instrument {
    private int keyCount;

    public Keyboard(double priceBoughtFor, double priceToSellFor, String description, Material material, Type type, String colour, int keyCount) {
        super(priceBoughtFor, priceToSellFor, description, material, type, colour);
        this.keyCount = keyCount;
    }

    public int getKeyCount() {
        return keyCount;
    }
}
