package instruments.woodwinds;

import instruments.Instrument;
import instruments.enums.Material;
import instruments.enums.Type;

public class Clarinet extends Instrument {
    private String key;

    public Clarinet(double priceBoughtFor, double priceToSellFor, String description, Material material, Type type, String colour, String key) {
        super(priceBoughtFor, priceToSellFor, description, material, type, colour);
        this.key = key;
    }

    public String getKey() {
        return key;
    }
}
