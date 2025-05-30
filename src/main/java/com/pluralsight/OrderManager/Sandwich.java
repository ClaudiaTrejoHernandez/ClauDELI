package com.pluralsight.OrderManager;

import com.pluralsight.Extra.RegularTopping;
import com.pluralsight.Interface.PricedItem;
import com.pluralsight.Interface.Topping;

import java.util.ArrayList;
import java.util.List;

public class Sandwich implements PricedItem {
    private String size;
    private String bread;
    private boolean toasted;
    private String name;
    private List<Topping> toppings = new ArrayList<>();

    public Sandwich(String bread, String size) {
        this.bread = bread;
        this.size = size;
    }


    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setToasted(boolean toasted) {
        this.toasted = toasted;
    }

    public void addTopping(Topping topping) {
        toppings.add(topping);
    }

    public List<Topping> getToppings() {
        return toppings;
    }

    public boolean isToasted() {
        return toasted;
    }

    @Override
    public double getPrice() {
        double basePrice = switch (size) {
            case "4" -> 5.00;
            case "8" -> 7.00;
            case "12" -> 8.50;
            default -> 0;
        };

        return basePrice + toppings.stream().mapToDouble(Topping::getTotalPrice).sum();
    }

    @Override
    public String getName() {
        if (name != null && !name.isEmpty()){
            return name;
        }
        return size + "\" " + bread + " Sandwich";
    }

    public void setName(String name) {
        this.name = name;
    }
}
