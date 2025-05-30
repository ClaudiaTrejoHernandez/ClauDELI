package com.pluralsight.ScreensManager;

import com.pluralsight.Interface.Screen;
import com.pluralsight.MenuItemManager.Chip;
import com.pluralsight.MenuItemManager.Drink;
import com.pluralsight.OrderManager.Order;
import com.pluralsight.MenuItemManager.Sandwich;
import com.pluralsight.Utility.ConsoleHelper;

public class OrderScreen implements Screen<Void> {

    private Order order;

    public OrderScreen(Order order) {
        this.order = order;
    }

    @Override
    public Void display() {
        while (true) {
            System.out.println("✦🍃━━━━━━━━━━━━━༺☁︎｡⋆｡ ﾟ☾ ﾟ｡⋆｡☁︎༻━━━━━━━━━━━━━━━🍃✦");
            System.out.println("                 🛒 Order ScreensManager 🛒");
            System.out.println("✦🍃━━━━━━━━━━━━━༺｡⋆｡☾｡⋆｡☁︎｡⋆｡☁︎༻━━━━━━━━━━━━━━━🍃✦");

            int choice = ConsoleHelper.readInt(
                    "\n🍽️ Choose an item to add:\n" +
                            "   1️⃣ Custom Sandwich 🥪\n" +
                            "   2️⃣ Signature Sandwich 🥪\n" +
                            "   3️⃣ Add Drink 🥤\n" +
                            "   4️⃣ Add Chips 🍟\n" +
                            "   5️⃣ Checkout 🛒\n" +
                            "   0️⃣ Cancel Order 🛑" +
                            "   \n👉Enter your option: ",  0, 5);

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
        System.out.println("\n✅ Added " + sandwich.getName() + " to your order!\n");
    }

    private void signatureSandwich() {
        SignatureSandwichScreen screen = new SignatureSandwichScreen();
        Sandwich sandwich = screen.display();
        if (sandwich != null) {
            order.addItem(sandwich);
            System.out.println("\n✅ Added " + sandwich.getName() + " to your order!\n");
        } else {
            System.out.println("❌ Signature sandwich selection cancelled.");
        }
    }

    private void addDrink() {
        AddDrinkScreen screen = new AddDrinkScreen();
        Drink drink = screen.display();
        order.addItem(drink);
        System.out.println("✅ Added " + drink.getName() + " to your order!\n");
    }

    private void addChips() {
        AddChipsScreen screen = new AddChipsScreen();
        Chip chips = screen.display();
        order.addItem(chips);
        System.out.println("✅ Added " + chips.getName() + " to your order!\n");
    }

    private void checkout() {
        CheckoutScreen checkoutScreen = new CheckoutScreen(order);
        checkoutScreen.display();
    }


    private void cancelOrder() {
        order.clearItems();
        System.out.println("\n🚫 Order canceled. Returning to home screen...\n");
    }
}
