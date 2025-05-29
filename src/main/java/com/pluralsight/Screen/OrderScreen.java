package com.pluralsight.Screen;

import com.pluralsight.Interface.Screen;
import com.pluralsight.OrderManager.Chip;
import com.pluralsight.OrderManager.Drink;
import com.pluralsight.OrderManager.Order;
import com.pluralsight.OrderManager.Sandwich;
import com.pluralsight.Utility.ConsoleHelper;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class OrderScreen implements Screen<Void> {

    private Order order;

    public OrderScreen(Order order) {
        this.order = order;
    }

    @Override
    public Void display() {
        System.out.println("Starting a new order...\n");

        while (true) {
            int choice = ConsoleHelper.readInt(
                    "\nChoose an item to add:\n" +
                            "1) Custom Sandwich\n" +
                            "2) Signature Sandwich\n" +
                            "3) Add Drink\n" +
                            "4) Add chips\n" +
                            "5) Checkout\n" +
                            "0) Cancel Order", 0, 5);

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
                default -> System.out.println("❌ Invalid choice. Please try again.");  // Should never occur due to validation
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
        System.out.println("\n🧾 Order Summary:");
        order.printReceipt();
        System.out.println("💲 Total: $" + String.format("%.2f", order.getTotalPrice()));

        // Ask the user to confirm or cancel the order
        int choice = ConsoleHelper.readInt(
                "\nWould you like to confirm this order?\n1) Confirm and Save Receipt\n0) Cancel Order and Return to Home", 0, 1);

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
