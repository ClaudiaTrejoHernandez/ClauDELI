package com.pluralsight.Toppings;

import com.pluralsight.Interface.Topping;

public class PremiumToppings implements Topping {

    private String name;
    private String type;
    private boolean isExtra;
    private String size;

    //Constructor for no extra toppings
    public PremiumToppings(String name, String type, boolean isExtra, String size) {
        this.name = name;
        this.type = type;
        this.isExtra = isExtra;
        this.size = size;
    }

    @Override
    public String getName() {
        return (isExtra ? "Toppings " : "") + name;
    }

    @Override
    public double getTotalPrice() {
        return getPrice(size);
    }

    @Override
    public String getType() {
        return type;
    }



    public double getPrice(String size) {
        return switch (type) {
            case "meat" -> isExtra ? getExtraMeatPrice(this.size) : getMeatPrice(this.size);
            case "cheese" -> isExtra ? getExtraCheesePrice(this.size) : getCheesePrice(this.size);
            default -> 0.0;
        };
    }

    public double getMeatPrice(String size) {
        return switch (size) {
            case "4" -> 1.00;
            case "8" -> 2.00;
            case "12" -> 3.00;
            default -> 0.0;
        };
    }

    private double getExtraMeatPrice(String size) {
        return switch (size) {
            case "4" -> 0.50;
            case "8" -> 1.00;
            case "12" -> 1.50;
            default -> 0.0;
        };
    }

    private double getCheesePrice(String size) {
        return switch (size) {
            case "4" -> 0.75;
            case "8" -> 1.50;
            case "12" -> 2.25;
            default -> 0.0;
        };
    }

    private double getExtraCheesePrice(String size) {
        return switch (size) {
            case "4" -> 0.30;
            case "8" -> 0.60;
            case "12" -> 0.90;
            default -> 0.0;
        };
    }
}
