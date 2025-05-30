package com.pluralsight.MenuItemManager;

import com.pluralsight.Interface.PricedItem;
import com.pluralsight.ScreensManager.CheckoutScreen;

import java.util.ArrayList;
import java.util.List;

public class Order{
    private List<PricedItem> items = new ArrayList<>();

    public void addItem(PricedItem item) {
        items.add(0, item);
    }

    public List<PricedItem> getItems() {
        return items;
    }

    public double getTotalPrice() {
        return items.stream()
                .mapToDouble(PricedItem::getPrice)
                .sum();
    }

    public void printReceipt() {
        System.out.println("🧾 Order Receipt:\n");

        for (PricedItem item : items) {
            if (item instanceof Sandwich sandwich) {
                String toasted = sandwich.isToasted() ? "Toasted" : "";

                System.out.printf("➡️ %-25s | $%6.2f | %-7s%n", sandwich.getName(), sandwich.getPrice(), toasted);

                sandwich.getToppings().forEach(t ->
                        System.out.printf("-> %-25s | $%6.2f |%n", t.getName(), t.getTotalPrice()));
            } else {
                System.out.printf("➡️ %-25s | $%6.2f |%n", item.getName(), item.getPrice());
            }
        }

    }

    public void saveReceipt() {
        CheckoutScreen savingReceipt = new CheckoutScreen(this);
        savingReceipt.saveReceiptAsTXT();
    }

    public void clearItems() {
        items.clear();
    }

}
