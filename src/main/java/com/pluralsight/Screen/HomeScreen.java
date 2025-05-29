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
        System.out.println("Welcome to ClauDELI");

        while (true) {
            System.out.println("Choose an option: ");
            System.out.println("1) New Order");
            System.out.println("0) Exit ");

            int choice = ConsoleHelper.readInt("Enter your choice: ", 0, 1);

            switch (choice) {
                case 1 -> newOrder();
                case 0 -> {
                    System.out.println("Exiting ClauDELI. Come Again!👋");
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
