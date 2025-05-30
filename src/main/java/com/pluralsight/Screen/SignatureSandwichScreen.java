package com.pluralsight.Screen;

import com.pluralsight.Extra.RegularTopping;
import com.pluralsight.Interface.Screen;
import com.pluralsight.OrderManager.Sandwich;
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

        s.addTopping(new RegularTopping("Bacon", "meat", false, "8"));
        s.addTopping(new RegularTopping("Lobster", "meat", false, "8"));
        s.addTopping(new RegularTopping("Lettuce", "veggie", false, "8"));
        s.addTopping(new RegularTopping("Tomato", "veggie", false, "8"));
        s.addTopping(new RegularTopping("Mayo", "sauce", false, "8"));

        return s;
    }

    private Sandwich buildClaudZillaMelt() {
        Sandwich s = new Sandwich("Wheat", "12");
        s.setToasted(true);
        s.setName("ClaudZilla Melt");

        s.addTopping(new RegularTopping("Roast Beef", "meat", false, "12"));
        s.addTopping(new RegularTopping("Cheddar", "cheese", false, "12"));
        s.addTopping(new RegularTopping("Swiss", "cheese", false, "12"));
        s.addTopping(new RegularTopping("Grilled Onions", "veggie", false, "12"));
        s.addTopping(new RegularTopping("Peppers", "veggie", false, "12"));
        s.addTopping(new RegularTopping("Ranch", "sauce", false, "12"));

        return s;
    }
}
