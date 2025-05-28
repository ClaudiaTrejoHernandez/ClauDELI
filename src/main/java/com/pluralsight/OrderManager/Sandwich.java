package com.pluralsight.OrderManager;

import com.pluralsight.Interface.PricedItem;
import com.pluralsight.Interface.Topping;

import java.util.List;

public class Sandwich implements PricedItem{

    protected String bread;
    protected String size;
    boolean isToasted;

    public Sandwich(String bread, String size, boolean isToasted) {
        this.bread = bread;
        this.size = size;
        this.isToasted = isToasted;
    }


    @Override
    public String getName() {
        return size + "\"" + (isToasted ? "Toasted" : "") + bread + "Sandwich";
    }

    @Override
    public double getPrice() {
        return switch (size){
            case "4" -> 5.50;
            case "8" -> 7.00;
            case "12" -> 8.50;
            default -> 0.0;
        };
    }
}
