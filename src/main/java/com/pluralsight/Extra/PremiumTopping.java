package com.pluralsight.Extra;

import com.pluralsight.Interface.Topping;

public class PremiumTopping implements Topping{

    private String name;
    private boolean basePrice;
    private boolean extra;

    public PremiumTopping(String name, boolean basePrice, boolean extra) {
        this.name = name;
        this.basePrice = basePrice;
        this.extra = extra;
    }

    public String getName() {
        return name + (extra ? " (extra" : "");
    }

    @Override
    public double getPrice() {
        return 0;
    }

//    @Override
//    public double getPrice() {
//        return null;
//    }

    public boolean isExtra() {
        return extra;
    }
}
