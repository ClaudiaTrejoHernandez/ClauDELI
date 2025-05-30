package com.pluralsight.ScreensManager;

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
        while (true) {
            System.out.println("✦🍃━━━━━━━━━━━━━༺☁︎｡⋆｡ ﾟ☾ ﾟ｡⋆｡☁︎༻━━━━━━━━━━━━━━━🍃✦");
            System.out.println("              🥪 Welcome to ClauDELI 🥪");
            System.out.println("✦🍃━━━━━━━━━━━━━༺｡⋆｡☾｡⋆｡☁︎｡⋆｡☁︎༻━━━━━━━━━━━━━━━🍃✦");

            int choice = ConsoleHelper.readInt(
                    "\n🍽️ What would you like to do?\n" +
                            "   1️⃣ Start a New Order\n" +
                            "   0️⃣ Exit 🏠\n" +
                            "  \n👉Enter your choice:", 0, 1);

            switch (choice) {
                case 1 -> newOrderFlow();
                case 0 -> {
                    System.out.println("\n👋 Thank you for visiting ClauDELI! See you soon! 👩‍🍳");
                    System.exit(0);
                }
            }
        }
    }


    private void newOrderFlow() {
        OrderScreen orderScreen = new OrderScreen(order);
        orderScreen.display();
    }
}
