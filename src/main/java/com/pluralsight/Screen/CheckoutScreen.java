package com.pluralsight.Screen;

import com.pluralsight.Interface.PricedItem;
import com.pluralsight.Interface.Screen;
import com.pluralsight.Interface.Topping;
import com.pluralsight.OrderManager.Order;
import com.pluralsight.OrderManager.Sandwich;
import com.pluralsight.Utility.ConsoleHelper;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

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
            saveReceiptAsTXT();
            System.out.println("\n✅ Thank you for your order!\n");
        } else {
            order.clearItems();
            System.out.println("\n🚫 Order canceled. Returning to home screen...\n");
        }

        return null;
    }


    public void saveReceiptAsTXT() {
        // Create the receipts folder if it doesn’t exist
        File receiptsFolder = new File("receipts");
        if (!receiptsFolder.exists()) {
            receiptsFolder.mkdirs();  // creates receipts/ folder
        }

        // Generate timestamped file name
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss");
        String fileName = now.format(formatter) + ".txt";
        File receiptFile = new File(receiptsFolder, fileName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(receiptFile))) {
            writer.write("🧾 Order Receipt:\n\n");

            for (PricedItem item : order.getItems()) {
                if (item instanceof Sandwich sandwich) {
                    String toasted = sandwich.isToasted() ? "Toasted" : "";
                    writer.write(String.format("➡️ %-25s | $%6.2f | %-7s%n", sandwich.getName(), sandwich.getPrice(), toasted));

                    for (Topping t : sandwich.getToppings()) {
                        writer.write(String.format("-> %-25s | $%6.2f |%n", t.getName(), t.getTotalPrice()));
                    }
                } else {
                    writer.write(String.format("➡️ %-25s | $%6.2f |%n", item.getName(), item.getPrice()));
                }
            }

            writer.write(String.format("\n📌 Total: $%.2f%n", order.getTotalPrice()));
            System.out.println("📝 Receipt saved as: receipts/" + fileName);

        } catch (IOException e) {
            System.out.println("❌ Error writing receipt file: " + e.getMessage());
        }
    }
    }

