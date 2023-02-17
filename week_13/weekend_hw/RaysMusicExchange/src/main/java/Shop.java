import item.Item;

import java.util.ArrayList;

public class Shop {
    private ArrayList<Item> items;

    public Shop(ArrayList<Item> items) {
        this.items = items;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    public double getTotalPotentialProfit(){
        double totalProfit = 0;

        for (Item item : this.items) {
            totalProfit += item.calculateMarkup(item.getPriceToSellFor(), item.getPriceBoughtFor());
        }

        return totalProfit;
    }
}
