package instruments.strings;

import instruments.Instrument;
import instruments.enums.Material;
import instruments.enums.Type;

public class Viola extends Instrument {
    private int stringCount;

    public Viola(double priceBoughtFor, double priceToSellFor, String description, Material material, Type type, String colour, int stringCount) {
        super(priceBoughtFor, priceToSellFor, description, material, type, colour);
        this.stringCount = stringCount;
    }

    public int getStringCount() {
        return stringCount;
    }
}
