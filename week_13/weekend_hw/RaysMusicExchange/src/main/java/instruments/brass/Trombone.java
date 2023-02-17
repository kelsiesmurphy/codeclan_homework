package instruments.brass;

import instruments.Instrument;
import instruments.enums.Material;
import instruments.enums.Type;

public class Trombone extends Instrument {
    private String key;
    private double bellSize;

    public Trombone(double priceBoughtFor, double priceToSellFor, String description, Material material, Type type, String colour, String key, double bellSize) {
        super(priceBoughtFor, priceToSellFor, description, material, type, colour);
        this.key = key;
        this.bellSize = bellSize;
    }

    public String getKey() {
        return key;
    }

    public double getBellSize() {
        return bellSize;
    }
}
