package instruments.woodwinds;

import instruments.Instrument;
import instruments.enums.Material;
import instruments.enums.Type;

public class Flute extends Instrument {
    private String key;
    private Boolean offsetG;

    public Flute(double priceBoughtFor, double priceToSellFor, String description, Material material, Type type, String colour, String key, Boolean offsetG) {
        super(priceBoughtFor, priceToSellFor, description, material, type, colour);
        this.key = key;
        this.offsetG = offsetG;
    }

    public String getKey() {
        return key;
    }

    public Boolean getOffsetG() {
        return offsetG;
    }
}
