package com.pluralsight.Screen;
import com.pluralsight.Interface.Screen;
import com.pluralsight.OrderManager.Drink;
import com.pluralsight.OrderManager.Order;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AddDrinkScreen implements Screen {

    private static Scanner read = new Scanner(System.in);

    public Drink display() {
        String size = "";
        String flavor = "";

            while (true) {
                System.out.println("Choose your Drink size:");
                System.out.println("1) Small ($2.00");
                System.out.println("2) Medium ($2.50");
                System.out.println("3) Large ($3.00");

                int choice = read.nextInt();
                read.nextLine();

                switch (choice) {
                    case 1 -> size = "Small";
                    case 2 -> size = "Medium";
                    case 3 -> size = "Large";
                    default -> System.out.println("❌ Invalid size. Please try again.");
                }

                if (!size.isEmpty()) break;
                break;
            }

                while (true) {
                    System.out.println("Choose your flavor:");
                    System.out.println("1) Pepsi");
                    System.out.println("2) Fanta");
                    System.out.println("3) Lemonade");
                    System.out.println("4) Dr. Pepper");

                    int choice = read.nextInt();
                    read.nextLine();

                    switch (choice) {
                        case 1 -> flavor = "Pepsi";
                        case 2 -> flavor = "Fanta";
                        case 3 -> flavor = "Lemonade";
                        case 4 -> flavor = "Dr. Pepper";
                        default -> System.out.println("❌ Invalid flavor. Please try again.");
                    }

                    if (!flavor.isEmpty()) break;
            }
            return new Drink(size, flavor);

        }
    }

