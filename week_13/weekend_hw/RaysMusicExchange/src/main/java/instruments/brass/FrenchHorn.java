package instruments.brass;

import instruments.Instrument;
import instruments.enums.Material;
import instruments.enums.Type;

public class FrenchHorn extends Instrument {
    private String key;
    private int numOfValves;

    public FrenchHorn(double priceBoughtFor, double priceToSellFor, String description, Material material, Type type, String colour, String key, int numOfValves) {
        super(priceBoughtFor, priceToSellFor, description, material, type, colour);
        this.key = key;
        this.numOfValves = numOfValves;
    }

    public String getKey() {
        return key;
    }

    public int getNumOfValves() {
        return numOfValves;
    }

    @Override
    public String play(){
        return "Honk honk";
    }
}
