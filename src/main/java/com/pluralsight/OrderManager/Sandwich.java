package com.pluralsight.OrderManager;

import com.pluralsight.Interface.PricedItem;
import com.pluralsight.Interface.Topping;

import java.util.List;

public class Sandwich implements PricedItem{

    protected String bread;
    protected String size;
    boolean isToasted;

    protected List<Topping> meats;
    protected List<Topping> cheeses;
    protected List<Topping> sauces;
    protected List<Topping> regularToppings;

    public Sandwich(String bread, String size, boolean isToasted, List<Topping> meats, List<Topping> cheeses, List<Topping> sauces, List<Topping> regularToppings) {
        this.bread = bread;
        this.size = size;
        this.isToasted = isToasted;
        this.meats = meats;
        this.cheeses = cheeses;
        this.sauces = sauces;
        this.regularToppings = regularToppings;
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

    public List<Topping> getMeats() {
        return meats;
    }

    public List<Topping> getCheeses() {
        return cheeses;
    }

    public List<Topping> getSauces() {
        return sauces;
    }

    public List<Topping> getRegularToppings() {
        return regularToppings;
    }

    @Override
    public String getName() {
        return "";
    }

    @Override
    public double getPrice() {
        return 0;
    }
}
