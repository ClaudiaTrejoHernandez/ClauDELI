package com.pluralsight.Extra;

import com.pluralsight.Interface.Topping;

public class RegularTopping implements Topping {

    private String name;
    private boolean extra;

    public RegularTopping(String name, boolean extra) {
        this.name = name;
        this.extra = extra;
    }

    @Override
    public String getName() {
        return "";
    }

    @Override
    public double getPrice() {
        return 0;
    }

    @Override
    public boolean isExtra() {
        return extra;
    }
}
