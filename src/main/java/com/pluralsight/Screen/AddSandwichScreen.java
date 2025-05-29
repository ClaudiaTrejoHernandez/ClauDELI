package com.pluralsight.Screen;

import com.pluralsight.Extra.RegularTopping;
import com.pluralsight.Interface.Screen;
import com.pluralsight.OrderManager.Sandwich;
import com.pluralsight.Extra.SimpleTopping;
import com.pluralsight.Utility.ConsoleHelper;

public class AddSandwichScreen implements Screen<Sandwich> {

    @Override
    public Sandwich display() {
        System.out.println("\n🌟 Creating a new sandwich...\n");

// 1) Bread
        String[] breads = {"White", "Wheat", "Rye", "Wrap"};
        int breadChoice = ConsoleHelper.readInt("Choose your bread:\n1) White\n2) Wheat\n3) Rye\n4) Wrap", 1, 4);
        String bread = breads[breadChoice - 1];

// 2) Size
        String[] sizes = {"4", "8", "12"};
        int sizeChoice = ConsoleHelper.readInt("Choose your size:\n1) 4\"\n2) 8\"\n3) 12\"", 1, 3);
        String size = sizes[sizeChoice - 1];

// Create sandwich
        Sandwich sandwich = new Sandwich(bread, size);

// 3) Meat(s)
        String[] meats = {"Steak", "Ham", "Salami", "Roast Beef", "Chicken", "Bacon"};
        System.out.println("\nMeat Options");
        System.out.println("0) Skip/Finish adding meat\n");

        for (int i = 0; i < meats.length; i++) {
            System.out.printf("%d) %s\n", i + 1, meats[i]);
        }

        while (true) {
            int meatChoice = ConsoleHelper.readInt("Select your meat option (0-6): ", 0, meats.length);
            if (meatChoice == 0) break;
            String meat = meats[meatChoice - 1];
            sandwich.addTopping(new RegularTopping(meat, "meat", false, size));
        }

// 4) Cheese(s)
        String[] cheeses = {"American", "Provolone", "Cheddar", "Swiss"};
        System.out.println("\nCheese Options");
        System.out.println("0) Skip/Finish adding cheese\n");

        for (int i = 0; i < cheeses.length; i++) {
            System.out.printf("%d) %s\n", i + 1, cheeses[i]);
        }

        while (true) {
            int cheeseChoice = ConsoleHelper.readInt("Select your cheese option (0-4):", 0, cheeses.length);
            if (cheeseChoice == 0) break;
            String cheese = cheeses[cheeseChoice - 1];
            sandwich.addTopping(new RegularTopping(cheese, "cheese", false, size));
        }

// 5) Additional toppings (not meat/cheese)
        String[] toppings = {"Lettuce", "Peppers", "Onions", "Tomatoes", "Jalapenos", "Cucumbers" , "Pickles", "Guacamole", "Mushrooms"};
        System.out.println("\nAdditional toppings");
        System.out.println("0) Skip/Finish adding toppings\n");

        for (int i = 0; i < toppings.length; i++) {
            System.out.printf("%d) %s\n", i + 1, toppings[i]);
        }

        while (true) {
            int toppingChoice = ConsoleHelper.readInt("Select topping option(0-9):", 0, toppings.length);
            if (toppingChoice == 0) break;
            sandwich.addTopping(new SimpleTopping(toppings[toppingChoice - 1]));
        }

// 6) Sauces
        String[] sauces = {"Mayo", "Mustard", "Ketchup", "Ranch", "Thousand Island Dressing", "Vinaigrette"};
        System.out.println("\nSauce options");
        System.out.println("0) Skip/Finish adding sauces\n");

        for (int i = 0; i < sauces.length; i++) {
            System.out.printf("%d) %s\n", i + 1, sauces[i]);
        }

        while (true) {
            int sauceChoice = ConsoleHelper.readInt("Select sauce option (0 - 6): ", 0, sauces.length);
            if (sauceChoice == 0) break;
            sandwich.addTopping(new SimpleTopping(sauces[sauceChoice - 1]));
        }

// 7) Sides
        String[] sides = {"Au Jus", "Spicy Sauce"};
        System.out.println("Sides options");
        System.out.printf("0) Skip/Finish adding sauces\n");
        for (int i = 0; i < sides.length; i++) {
            System.out.printf("%d) %s\n", i + 1, sides[i]);
        }

        while (true) {
            int sideChoice = ConsoleHelper.readInt("Select side option (0 - 2): ", 0, sides.length);
            if (sideChoice == 0) break;
            sandwich.addTopping(new SimpleTopping(sides[sideChoice - 1]));
        }

        return sandwich;
    }
}

