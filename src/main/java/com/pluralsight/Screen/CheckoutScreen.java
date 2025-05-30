package com.pluralsight.Screen;

import com.pluralsight.Interface.Screen;
import com.pluralsight.OrderManager.Order;
import com.pluralsight.Utility.ConsoleHelper;

public class CheckoutScreen implements Screen<Void> {

    private final Order order;

    public CheckoutScreen(Order order) {
        this.order = order;
    }

    @Override
    public Void display() {
        // Whimsical header
        System.out.println("✦🍃━━━━━━━━━━━━━༺☁︎｡⋆｡ ﾟ☾ ﾟ｡⋆｡☁︎༻━━━━━━━━━━━━━━━🍃✦");
        System.out.println("             💳 Checkout & Summary 💳");
        System.out.println("✦🍃━━━━━━━━━━━━━༺｡⋆｡☾｡⋆｡☁︎｡⋆｡☁︎༻━━━━━━━━━━━━━━━🍃✦\n");

        // Order Summary
        order.printReceipt();
        System.out.println("\n📌 Total: $" + String.format("%.2f", order.getTotalPrice()));
        ConsoleHelper.printDivider();

        // Confirm or Cancel
        int choice = ConsoleHelper.readInt(
                "Would you like to confirm this order?\n" +
                        "   1️⃣ Confirm and Save Receipt\n" +
                        "   0️⃣ Cancel Order and Return to Home 🏠\n" +
                        "👉 Enter your choice: ", 0, 1);

        if (choice == 1) {
            order.saveReceiptAsTXT();
            System.out.println("\n✅ Thank you for your order! We’ll get it ready right away.\n");
        } else {
            order.clearItems();
            System.out.println("\n🚫 Order canceled. Returning to home screen...\n");
        }

        return null;
    }
}
