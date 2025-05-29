package com.pluralsight.Screen;

import com.pluralsight.Interface.Screen;
import com.pluralsight.OrderManager.Order;
import com.pluralsight.Utility.ConsoleHelper;

public class HomeScreen implements Screen<Void> {

    private Order order;

    public HomeScreen(Order order) {
        this.order = order;
    }

    @Override
    public Void display() {
        System.out.println("✦🍃━━━━━━━━━━━━━༺☁︎｡⋆｡ ﾟ☾ ﾟ｡⋆｡☁︎༻━━━━━━━━━━━━━━━🍃✦");
        System.out.println("              🥪 Welcome to ClauDELI 🥪");
        System.out.println("✦🍃━━━━━━━━━━━━━༺｡⋆｡☾｡⋆｡☁︎｡⋆｡☁︎༻━━━━━━━━━━━━━━━🍃✦");

        while (true) {
            int choice = ConsoleHelper.readInt(
                    "\n🍽️ What would you like to do?\n" +
                            "   1️⃣ Start a New Order\n" +
                            "   0️⃣ Exit 🏠", 0, 1);

            switch (choice) {
                case 1 -> newOrder();
                case 0 -> {
                    System.out.println("\n👋 Thank you for visiting ClauDELI! See you soon! 👩‍🍳");
                    System.exit(0);
                }
            }
        }
    }



    private void newOrder() {
        OrderScreen orderScreen = new OrderScreen(order);
        orderScreen.display();
    }
}
