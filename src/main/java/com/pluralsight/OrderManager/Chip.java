package com.pluralsight.OrderManager;

import com.pluralsight.Interface.PricedItem;

public class Chip implements PricedItem {
    private String flavor;
    private double price = 1.50;

    public Chip(String flavor) {
        this.flavor = flavor;
    }

    @Override
    public String getName() {
        return flavor + " Chips";
    }

    @Override
    public double getPrice() {
        return price;
    }
}
