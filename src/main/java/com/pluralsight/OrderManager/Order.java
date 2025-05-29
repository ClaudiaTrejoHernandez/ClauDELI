package com.pluralsight.OrderManager;

import com.pluralsight.Interface.PricedItem;
import com.pluralsight.Interface.Topping;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Order{
    private List<PricedItem> items = new ArrayList<>();

    public void addItem(PricedItem item) {
        items.add(item);
    }

    public double getTotalPrice() {
        return items.stream()
                .mapToDouble(PricedItem::getPrice)
                .sum();
    }

    public void printReceipt() {
        System.out.println("\n🧾 Order Receipt:");

        for (PricedItem item : items) {
            System.out.printf("- %-20s $%.2f%n", item.getName(), item.getPrice());

            //Print sandwich toppings
            if (item instanceof Sandwich sandwich) {
                sandwich.getToppings().forEach(t->
                System.out.printf("     -> %-17s $%.2f%n", t.getName(), t.getTotalPrice()));
            }
        }

        System.out.printf("\nTotal: $%.2f%n", getTotalPrice());
    }

    public void saveReceiptAsTXT() {
        // Create the receipts directory if it doesn’t exist
        File receiptsDir = new File("receipts");
        if (!receiptsDir.exists()) {
            receiptsDir.mkdirs();  // creates receipts/ folder
        }

        // Generate timestamped file name
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss");
        String fileName = now.format(formatter) + ".txt";
        File receiptFile = new File(receiptsDir, fileName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(receiptFile))) {
            writer.write("🧾 Order Receipt:\n");
            for (PricedItem item : items) {
                writer.write("- " + item.getName() + ", $" + String.format("%.2f", item.getPrice()) + "\n");
                if (item instanceof Sandwich sandwich) {
                    for (Topping t : sandwich.getToppings()) {
                        writer.write("    -> " + t.getName() + ", $" + String.format("%.2f", t.getTotalPrice()) + "\n");
                    }
                }
            }
            writer.write("\nTotal: $" + String.format("%.2f", getTotalPrice()) + "\n");
            System.out.println("📝 Receipt saved as: receipts/" + fileName);
        } catch (IOException e) {
            System.out.println("❌ Error writing receipt file: " + e.getMessage());
        }
    }

    public void clearItems() {
        items.clear();
    }

}
