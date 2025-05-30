package com.pluralsight.ScreensManager;

import com.pluralsight.Toppings.PremiumToppings;
import com.pluralsight.Interface.Screen;
import com.pluralsight.MenuItemManager.Sandwich;
import com.pluralsight.Utility.ConsoleHelper;

public class SignatureSandwichScreen implements Screen<Sandwich> {

    @Override
    public Sandwich display() {
        System.out.println("\n🥪 Choose a Signature Sandwich:");

        System.out.println("1️⃣ The Bobster");
        System.out.println("    📝 White, Toasted, Bacon, Lobster, Lettuce, Tomato, Mayo");

        System.out.println("2️⃣ ClaudZilla Melt");
        System.out.println("    📝 Wheat, Toasted, Roast Beef, Cheddar, Swiss, Grilled Onions, Peppers, Ranch");

        System.out.println("0️⃣ Cancel");

        int choice = ConsoleHelper.readInt("👉 Enter your choice (0-2): ", 0, 2);

        switch (choice) {
            case 1 -> {
                return buildBobster();
            }
            case 2 -> {
                return buildClaudZillaMelt();
            }
            case 0 -> {
                return null;  // Cancel
            }
            default -> {
                System.out.println("❌ Invalid choice.");
                return display();  // Should never hit this because readInt validates input
            }
        }
    }

    private Sandwich buildBobster() {
        Sandwich s = new Sandwich("White", "8");
        s.setToasted(true);
        s.setName("The Bobster");

        s.addTopping(new PremiumToppings("Bacon", "meat", false, "8"));
        s.addTopping(new PremiumToppings("Lobster", "meat", false, "8"));
        s.addTopping(new PremiumToppings("Lettuce", "veggie", false, "8"));
        s.addTopping(new PremiumToppings("Tomato", "veggie", false, "8"));
        s.addTopping(new PremiumToppings("Mayo", "sauce", false, "8"));

        return s;
    }

    private Sandwich buildClaudZillaMelt() {
        Sandwich s = new Sandwich("Wheat", "12");
        s.setToasted(true);
        s.setName("ClaudZilla Melt");

        s.addTopping(new PremiumToppings("Roast Beef", "meat", false, "12"));
        s.addTopping(new PremiumToppings("Cheddar", "cheese", false, "12"));
        s.addTopping(new PremiumToppings("Swiss", "cheese", false, "12"));
        s.addTopping(new PremiumToppings("Grilled Onions", "veggie", false, "12"));
        s.addTopping(new PremiumToppings("Peppers", "veggie", false, "12"));
        s.addTopping(new PremiumToppings("Ranch", "sauce", false, "12"));

        return s;
    }
}
