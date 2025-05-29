package com.pluralsight.Screen;

import com.pluralsight.Interface.Screen;
import com.pluralsight.OrderManager.Chip;
import com.pluralsight.OrderManager.Drink;
import com.pluralsight.OrderManager.Order;
import com.pluralsight.OrderManager.Sandwich;
import com.pluralsight.Utility.ConsoleHelper;

public class OrderScreen implements Screen<Void> {

    private Order order;

    public OrderScreen(Order order) {
        this.order = order;
    }

    @Override
    public Void display() {
        System.out.println("✦🍃━━━━━━━━━━━━━༺☁︎｡⋆｡ ﾟ☾ ﾟ｡⋆｡☁︎༻━━━━━━━━━━━━━━━🍃✦");
        System.out.println("             🛒 Starting a New Order 🛒");
        System.out.println("✦🍃━━━━━━━━━━━━━༺｡⋆｡☾｡⋆｡☁︎｡⋆｡☁︎༻━━━━━━━━━━━━━━━🍃✦");

        while (true) {
            int choice = ConsoleHelper.readInt(
                    "\n🍽️ Choose an item to add:\n" +
                            "   1️⃣ Custom Sandwich 🥪\n" +
                            "   2️⃣ Signature Sandwich 🥪\n" +
                            "   3️⃣ Add Drink 🥤\n" +
                            "   4️⃣ Add Chips 🍟\n" +
                            "   5️⃣ Checkout 🛒\n" +
                            "   0️⃣ Cancel Order 🛑" ,  0, 5);

            switch (choice) {
                case 1 -> customSandwich();
                case 2 -> signatureSandwich();
                case 3 -> addDrink();
                case 4 -> addChips();
                case 5 -> {
                    checkout();
                    return null;
                }
                case 0 -> {
                    cancelOrder();
                    return null;
                }
                default -> System.out.println("\n❌ Invalid choice. Please try again.\n");
            }
        }
    }

    private void customSandwich() {
        AddSandwichScreen screen = new AddSandwichScreen();
        Sandwich sandwich = screen.display();
        order.addItem(sandwich);
        System.out.println("✅ Added " + sandwich.getName() + " to your order.");
    }

    private void signatureSandwich() {
        SignatureSandwichScreen screen = new SignatureSandwichScreen();
        Sandwich sandwich = screen.display();
        if (sandwich != null) {
            order.addItem(sandwich);
            System.out.println("✅ Added " + sandwich.getName() + " to your order.");
        } else {
            System.out.println("❌ Signature sandwich selection cancelled.");
        }
    }

    private void addDrink() {
        AddDrinkScreen screen = new AddDrinkScreen();
        Drink drink = screen.display();
        order.addItem(drink);
        System.out.println("✅ Added " + drink.getName() + " to your order.");
    }

    private void addChips() {
        AddChipsScreen screen = new AddChipsScreen();
        Chip chips = screen.display();
        order.addItem(chips);
        System.out.println("✅ Added " + chips.getName() + " to your order.");
    }

    private void checkout() {
        System.out.println("\n✦🍃━━━━━━━━━━━━━༺☁︎｡⋆｡ ﾟ☾ ﾟ｡⋆｡☁︎༻━━━━━━━━━━━━━━━🍃✦");
        System.out.println("\n                  🧾 Order Summary:");
        order.printReceipt();
        System.out.println("📌 Total: $" + String.format("%.2f", order.getTotalPrice()));
        System.out.println("✦🍃━━━━━━━━━━━━━༺｡⋆｡☾｡⋆｡☁︎｡⋆｡☁︎༻━━━━━━━━━━━━━━━🍃✦");

        // Ask the user to confirm or cancel the order
        int choice = ConsoleHelper.readInt(
                "\nWould you like to confirm this order?\n" +
                        "   1️⃣ Confirm and Save Receipt\n" +
                        "   0️⃣ Cancel Order and Return to Home 🏠", 0, 1);
        if (choice == 1) {
            order.saveReceiptAsTXT();
            System.out.println("✅ Thank you for your order!\n");
        } else {
            order.clearItems();
            System.out.println("🚫 Order canceled. Returning to home screen...\n");
        }
    }


    private void cancelOrder() {
        order.clearItems();
        System.out.println("\n🚫 Order canceled. Returning to home screen...\n");
    }
}
