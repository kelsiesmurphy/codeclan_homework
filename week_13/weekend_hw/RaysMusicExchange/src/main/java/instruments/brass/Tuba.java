package instruments.brass;

import instruments.Instrument;
import instruments.enums.Material;
import instruments.enums.Type;

public class Tuba extends Instrument {
    private String key;
    private int valves;

    public Tuba(double priceBoughtFor, double priceToSellFor, String description, Material material, Type type, String colour, String key, int valves) {
        super(priceBoughtFor, priceToSellFor, description, material, type, colour);
        this.key = key;
        this.valves = valves;
    }

    public String getKey() {
        return key;
    }

    public int getValves() {
        return valves;
    }
}
