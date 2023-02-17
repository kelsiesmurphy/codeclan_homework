package instruments;

import behaviours.IPlay;
import instruments.enums.Material;
import instruments.enums.Type;
import item.Item;

public abstract class Instrument extends Item implements IPlay {
    private Material material;
    private Type type;
    private String colour;

    public Instrument(double priceBoughtFor, double priceToSellFor, String description, Material material, Type type, String colour) {
        super(priceBoughtFor, priceToSellFor, description);
        this.material = material;
        this.type = type;
        this.colour = colour;
    }

    public Material getMaterial() {
        return material;
    }

    public Type getType() {
        return type;
    }

    public String getColour() {
        return colour;
    }

    public String play(){
        return "Doo doo";
    }
}
