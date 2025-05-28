package com.pluralsight.Screen;

import com.pluralsight.Interface.Screen;
import com.pluralsight.OrderManager.Order;
import java.util.InputMismatchException;
import java.util.Scanner;

public class HomeScreen implements Screen {

    public static Scanner read = new Scanner(System.in);
    private Order order;

    public HomeScreen(Order order) {
        this.order = order;
    }

    @Override
    public void display() {

        try {
            System.out.println("Welcome to ClauDELI");

            while (true) {
                System.out.println("Choose an option: ");
                System.out.println("1) New Order");
                System.out.println("0) Exit ");
                int choice = read.nextInt();
                read.nextLine();

                switch (choice) {
                    case 1 -> newOrder();
                    case 0 -> {
                        System.out.println("Exiting ClauDELI. Come Again!👋");
                        return;
                    }
                    default -> System.out.println("❌ Invalid choice. Please try again.");
                }

            }
        } catch (InputMismatchException e){
            System.out.println("Please input a valid option (1, 0): ");
            read.nextLine();
        }

        catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    private void newOrder() {
        OrderScreen orderScreen = new OrderScreen(order);
        orderScreen.display();
    }
}
