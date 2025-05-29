package com.pluralsight.Extra;

import com.pluralsight.Interface.Topping;

public class SimpleTopping implements Topping {

    private String name;

    public SimpleTopping(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getTotalPrice() {
        return 0.0;  // Included topping, no extra charge
    }

    @Override
    public String getType() {
        return "regular";
    }
}
