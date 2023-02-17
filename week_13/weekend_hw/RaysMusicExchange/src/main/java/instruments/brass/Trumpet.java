package instruments.brass;

import instruments.Instrument;
import instruments.enums.Material;
import instruments.enums.Type;

public class Trumpet extends Instrument {
    private String key;
    private int waterKeys;

    public Trumpet(double priceBoughtFor, double priceToSellFor, String description, Material material, Type type, String colour, String key, int waterKeys) {
        super(priceBoughtFor, priceToSellFor, description, material, type, colour);
        this.key = key;
        this.waterKeys = waterKeys;
    }

    public String getKey() {
        return key;
    }

    public int getWaterKeys() {
        return waterKeys;
    }
}
