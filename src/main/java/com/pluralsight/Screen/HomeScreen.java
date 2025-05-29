package com.pluralsight.Screen;

import com.pluralsight.Interface.Screen;
import com.pluralsight.OrderManager.Order;
import com.pluralsight.OrderManager.Sandwich;
import com.pluralsight.Utility.ConsoleHelper;

public class HomeScreen implements Screen<Void> {

    private Order order;

    public HomeScreen(Order order) {
        this.order = order;
    }

    @Override
    public Void display() {
        System.out.println("✦🍃━━━━━━━━━━━━━༺☁︎｡⋆｡ ﾟ☾ ﾟ｡⋆｡☁︎༻━━━━━━━━━━━━━━━🍃✦");
        System.out.println("       🥪 Welcome to ClauDELI 🥪");
        System.out.println("✦🍃━━━━━━━━━━━━━༺｡⋆｡☾｡⋆｡☁︎｡⋆｡☁︎༻━━━━━━━━━━━━━━━🍃✦\n");

        while (true) {
            System.out.println("\n🍽️ What would you like to do?");
            System.out.println("   1️⃣ Start a New Order");
            System.out.println("   0️⃣ Exit 🏠");
            System.out.println("✦🍃━━━━━━━━━━━━━༺☁︎｡⋆｡ ﾟ☾ ﾟ｡⋆｡☁︎༻━━━━━━━━━━━━━━━🍃✦");

            int choice = ConsoleHelper.readInt("👉 Enter your choice: ", 0, 1);

            switch (choice) {
                case 1 -> newOrder();
                case 0 -> {
                    System.out.println("\n👋 Thank you for visiting ClauDELI! See you soon! 🌈");
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
