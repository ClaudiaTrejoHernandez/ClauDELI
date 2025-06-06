package com.pluralsight.MenuItemManager;

import com.pluralsight.Interface.PricedItem;

public class Drink implements PricedItem {

    private String size;
    private String flavor;
    private double price;

    public Drink(String size, String flavor) {
        this.size = size;
        this.flavor = flavor;
        this.price = getPriceBasedOnSize(size);
    }

    private double getPriceBasedOnSize(String size) {
        return switch (size) {
            case "Small" -> 2.00;
            case "Medium" -> 2.50;
            case "Large" -> 3.00;
            default -> 0.0;
        };
    }

    @Override
    public String getName() {
        return size + " " + flavor;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
