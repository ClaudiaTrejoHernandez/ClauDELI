package com.pluralsight.OrderManager;

import com.pluralsight.Interface.Topping;

import java.util.List;

public class SignatureSandwich extends Sandwich{


    public SignatureSandwich(String bread, String size, boolean isToasted, List<Topping> meats, List<Topping> cheeses, List<Topping> sauces, List<Topping> regularToppings) {
        super(bread, size, isToasted, meats, cheeses, sauces, regularToppings);
    }
}
