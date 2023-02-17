package item;

import behaviours.ISell;

public abstract class Item implements ISell {
    private double priceBoughtFor;
    private double priceToSellFor;
    private String description;

    public Item(double priceBoughtFor, double priceToSellFor, String description) {
        this.priceBoughtFor = priceBoughtFor;
        this.priceToSellFor = priceToSellFor;
        this.description = description;
    }

    public double getPriceBoughtFor() {
        return priceBoughtFor;
    }

    public double getPriceToSellFor() {
        return priceToSellFor;
    }

    public String getDescription() {
        return description;
    }

    public double calculateMarkup(double priceToSellFor, double priceBoughtFor){
        return priceToSellFor - priceBoughtFor;
    }
}
