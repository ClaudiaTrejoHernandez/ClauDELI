package com.pluralsight.OrderManager;

import com.pluralsight.Interface.PricedItem;
import com.pluralsight.Interface.Topping;

import java.util.ArrayList;
import java.util.List;

public class Sandwich implements PricedItem{

    private String bread;
    private String size;
    private boolean isToasted;

    private List<Topping> toppings = new ArrayList<>();

    public Sandwich(String bread, String size, boolean isToasted, List<Topping> toppings) {
        this.bread = bread;
        this.size = size;
        this.isToasted = isToasted;
    }

    public void addTopping(Topping topping) {
        toppings.add(topping);
    }

    public void addToppings(List<Topping> toppings) {
        this.toppings.addAll(toppings);
    }

    public void setToasted(boolean toasted) {
        isToasted = toasted;
    }

    public String getBread() {
        return bread;
    }

    public String getSize() {
        return size;
    }

    public boolean isToasted() {
        return isToasted;
    }

    public List<Topping> getToppings() {
        return toppings;
    }

    @Override
    public String getName() {
        return (isToasted ? "Toasted" : "") + size + "\" " + bread + " Sandwich";
    }

    @Override
    public double getPrice() {
        return toppings.stream().mapToDouble(Topping::getPrice).sum();
    }
}
