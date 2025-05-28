package com.pluralsight.OrderManager;

import com.pluralsight.Interface.PricedItem;

public class Drink implements PricedItem {

    private String size;
    private String flavor;

    public Drink(String size, String flavor) {
        this.size = size;
        this.flavor = flavor;
    }

    @Override
    public String getName() {
        return size + " " + flavor;
    }

    @Override
    public double getPrice() {
        return switch (size) {
            case "Small" -> 1.50;
            case "Medium" -> 2.00;
            case "Large" -> 2.50;
            default -> 0.0;
        };
    }
}
