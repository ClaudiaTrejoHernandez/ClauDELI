package com.pluralsight.Screen;

import com.pluralsight.Extra.RegularTopping;
import com.pluralsight.Interface.Screen;
import com.pluralsight.OrderManager.Sandwich;
import com.pluralsight.Utility.ConsoleHelper;

public class SignatureSandwichScreen implements Screen<Sandwich> {

    public Sandwich display() {
        System.out.println("\n🥪 Choose a Signature Sandwich:");
        System.out.println("1) Turkey Club");
        System.out.println("2) Veggie Delight");
        System.out.println("3) The Carnivore");
        System.out.println("0) Cancel");

        int choice = ConsoleHelper.readInt("Enter your choice:", 0, 3);

        switch (choice) {
            case 1 -> {
                return buildTurkeyClub();
            }
            case 2 -> {
                return buildVeggieDelight();
            }
            case 3 -> {
                return buildCarnivore();
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

    private Sandwich buildTurkeyClub() {
        Sandwich s = new Sandwich("Wheat", "8");
        s.setToasted(true);
        s.setName("Turkey Club");

        s.addTopping(new RegularTopping("Turkey", "meat", false, "8"));
        s.addTopping(new RegularTopping("Bacon", "meat", false, "8"));
        s.addTopping(new RegularTopping("Swiss", "cheese", false, "8"));
        s.addTopping(new RegularTopping("Lettuce", "veggie", false, "8"));
        s.addTopping(new RegularTopping("Tomatoes", "veggie", false, "8"));
        s.addTopping(new RegularTopping("Mayo", "sauce", false, "8"));

        return s;
    }

    private Sandwich buildVeggieDelight() {
        Sandwich s = new Sandwich("Rye", "8");
        s.setToasted(false);
        s.setName("Veggie Delight");

        s.addTopping(new RegularTopping("Lettuce", "veggie", false, "8"));
        s.addTopping(new RegularTopping("Tomatoes", "veggie", false, "8"));
        s.addTopping(new RegularTopping("Cucumbers", "veggie", false, "8"));
        s.addTopping(new RegularTopping("Peppers", "veggie", false, "8"));
        s.addTopping(new RegularTopping("Swiss", "cheese", false, "8"));
        s.addTopping(new RegularTopping("Vinaigrette", "sauce", false, "8"));

        return s;
    }

    private Sandwich buildCarnivore() {
        Sandwich s = new Sandwich("White", "12");
        s.setToasted(true);
        s.setName("The Carnivore");

        s.addTopping(new RegularTopping("Steak", "meat", false, "12"));
        s.addTopping(new RegularTopping("Ham", "meat", false, "12"));
        s.addTopping(new RegularTopping("Salami", "meat", false, "12"));
        s.addTopping(new RegularTopping("Roast Beef", "meat", false, "12"));
        s.addTopping(new RegularTopping("Cheddar", "cheese", false, "12"));
        s.addTopping(new RegularTopping("Ranch", "sauce", false, "12"));

        return s;
    }

}
