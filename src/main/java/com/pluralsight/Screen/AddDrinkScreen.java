package com.pluralsight.Screen;

import com.pluralsight.Interface.Screen;
import com.pluralsight.OrderManager.Drink;
import com.pluralsight.Utility.ConsoleHelper;

public class AddDrinkScreen implements Screen<Drink> {

    @Override
    public Drink display() {
        String size = "";
        String flavor = "";

        // Get drink size
        int sizeChoice = ConsoleHelper.readInt(
                "Choose your Drink size:\n1) Small ($2.00)\n2) Medium ($2.50)\n3) Large ($3.00)", 1, 3);

            switch (sizeChoice) {
                case 1 -> size = "Small";
                case 2 -> size = "Medium";
                case 3 -> size = "Large";
            }

        // Get drink flavor
        int flavorChoice = ConsoleHelper.readInt(
            "Choose your Drink flavor:\n1) Pepsi\n2) Fanta\n3) Lemonade\n4) Dr. Pepper", 1, 4);

            switch (flavorChoice) {
                case 1 -> flavor = "Pepsi";
                case 2 -> flavor = "Fanta";
                case 3 -> flavor = "Lemonade";
                case 4 -> flavor = "Dr. Pepper";
            }

        System.out.println("\n✅ " + size + " " + flavor + " selected!");
        return new Drink(size, flavor);
    }
}
