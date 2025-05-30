package com.pluralsight.ScreensManager;

import com.pluralsight.Toppings.PremiumToppings;
import com.pluralsight.Interface.Screen;
import com.pluralsight.MenuItemManager.Sandwich;
import com.pluralsight.Toppings.RegularToppings;
import com.pluralsight.Utility.ConsoleHelper;

public class AddSandwichScreen implements Screen<Sandwich> {

    @Override
    public Sandwich display() {
        System.out.println("✦🍃━━━━━━━━━━━━━༺☁︎｡⋆｡ ﾟ☾ ﾟ｡⋆｡☁︎༻━━━━━━━━━━━━━━━🍃✦");
        System.out.println("              🥪 Build Your Sandwich 🥪");
        System.out.println("✦🍃━━━━━━━━━━━━━༺｡⋆｡☾｡⋆｡☁︎｡⋆｡☁︎༻━━━━━━━━━━━━━━━🍃✦\n");

// 1) Bread
        String[] breads = {"White", "Wheat", "Rye", "Wrap"};
        System.out.println("🍞 Choose your bread:");
        for (int i = 0; i < breads.length; i++) {
            System.out.printf("   %d️⃣ %s\n", i + 1, breads[i]);
        }
        String bread = breads[ConsoleHelper.readInt("👉 Enter your choice (1-4): ", 1, 4) - 1];


// 2) Size
        String[] sizes = {"4", "8", "12"};
        ConsoleHelper.printDivider();
        System.out.println("📏 Choose your size:");
        System.out.println("   1️⃣ 4\"\n   2️⃣ 8\"\n   3️⃣ 12\"");

        String size = sizes[ConsoleHelper.readInt("👉 Enter your choice (1-3): ", 1, 3) - 1];

// Create new sandwich:
        Sandwich sandwich = new Sandwich(bread, size);

// Toasted?
        ConsoleHelper.printDivider();
        System.out.println("🔥 Would you like your sandwich toasted?");
        System.out.println("   1️⃣ Yes\n   2️⃣ No");
        boolean isToasted = ConsoleHelper.readInt("👉 Enter your choice (1-2): ", 1, 2) == 1;
        sandwich.setToasted(isToasted);




// 3) Meat(s)
        String[] meats = {"Steak", "Ham", "Salami", "Roast Beef", "Chicken", "Bacon"};
        ConsoleHelper.printDivider();
        System.out.println("🥩 Meat Options:");
        for (int i = 0; i < meats.length; i++) {
            System.out.printf("     %d) %s\n", i + 1, meats[i]);
        }
        System.out.println("     0) Skip/Finish adding Meat");

        while (true) {
            int choice = ConsoleHelper.readInt("👉 Enter your choice (0-6): ", 0, meats.length);
            if (choice == 0) break;
            sandwich.addTopping(new PremiumToppings(meats[choice - 1], "meat", false, size));
        }



// 4) Cheese(s)
        String[] cheeses = {"American", "Provolone", "Cheddar", "Swiss"};
        ConsoleHelper.printDivider();
        System.out.println("🧀 Cheese Options:");
        for (int i = 0; i < cheeses.length; i++) {
            System.out.printf("     %d) %s\n", i + 1, cheeses[i]);
        }
        System.out.println("     0) Skip/Finish adding Cheese");

        while (true) {
            int choice = ConsoleHelper.readInt("👉 Enter your choice (0-4): ", 0, cheeses.length);
            if (choice == 0) break;
            sandwich.addTopping(new PremiumToppings(cheeses[choice - 1], "cheese", false, size));
        }

// 5) Additional toppings
        String[] toppings = {"Lettuce", "Peppers", "Onions", "Tomatoes", "Jalapenos", "Cucumbers", "Pickles", "Guacamole", "Mushrooms"};
        ConsoleHelper.printDivider();
        System.out.println("🥗 Additional Toppings:");
        for (int i = 0; i < toppings.length; i++) {
            System.out.printf("     %d) %s\n", i + 1, toppings[i]);
        }
        System.out.println("     0) Skip/Finish adding Toppings");

        while (true) {
            int choice = ConsoleHelper.readInt("👉 Enter your choice (0-9): ", 0, toppings.length);
            if (choice == 0) break;
            sandwich.addTopping(new RegularToppings(toppings[choice - 1]));
        }

// 6) Sauces
        String[] sauces = {"Mayo", "Mustard", "Ketchup", "Ranch", "Thousand Island", "Vinaigrette"};
        ConsoleHelper.printDivider();
        System.out.println("🍯 Sauce Options:");
        for (int i = 0; i < sauces.length; i++) {
            System.out.printf("     %d) %s\n", i + 1, sauces[i]);
        }
        System.out.println("     0) Skip/Finish adding Sauces");

        while (true) {
            int choice = ConsoleHelper.readInt("👉 Enter your choice (0-6): ", 0, sauces.length);
            if (choice == 0) break;
            sandwich.addTopping(new RegularToppings(sauces[choice - 1]));
        }

// 7) Sides
        String[] sides = {"Au Jus", "Spicy Sauce"};
        ConsoleHelper.printDivider();
        System.out.println("🍽️ Sides Options:");
        for (int i = 0; i < sides.length; i++) {
            System.out.printf("     %d) %s\n", i + 1, sides[i]);
        }
        System.out.println("     0) Skip/Finish adding Sides");

        while (true) {
            int choice = ConsoleHelper.readInt("👉 Enter your choice (0-2): ", 0, sides.length);
            if (choice == 0) break;
            sandwich.addTopping(new RegularToppings(sides[choice - 1]));
        }

        return sandwich;
    }
}
