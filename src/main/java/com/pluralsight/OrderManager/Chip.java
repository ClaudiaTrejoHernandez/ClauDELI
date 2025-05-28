package com.pluralsight.OrderManager;

import com.pluralsight.Interface.PricedItem;

public class Chip implements PricedItem {

    private String flavor;

    @Override
    public String getName() {
        return "";
    }

    @Override
    public double getPrice() {
        return 0;
    }
}
