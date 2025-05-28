package com.pluralsight.OrderManager;

import com.pluralsight.Interface.Topping;
import java.util.List;

public class CustomSandwich extends Sandwich {

    public CustomSandwich(String bread, String size, boolean isToasted,
                          List<Topping> meats,
                          List<Topping> cheeses,
                          List<Topping> sauces,
                          List<Topping> regularToppings) {

        super(bread, size, isToasted, meats, cheeses, sauces, regularToppings);
    }

    @Override
    public String getBread() {
        return null;
    }
    @Override
    public double getPrice() {
        double basePrice = switch (size) {
            case "4" -> 5.5;
            case "8" -> 7.0;
            case "12" -> 8.5;
            default -> 0.0;
        };

        double meatCost = meats.size() * 0.75;
        double cheeseCost = cheeses.size() * .50;
        double toppingCost = regularToppings.size() * 0.30;

        return basePrice + meatCost + cheeseCost + toppingCost;


    }
}
