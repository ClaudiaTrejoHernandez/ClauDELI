package com.pluralsight.Screen;

import com.pluralsight.Interface.Screen;

import java.util.InputMismatchException;
import java.util.Scanner;

public class OrderScreen implements Screen {

    public static Scanner read = new Scanner(System.in);

    @Override
    public void display() {

        try {
            System.out.println("Starting a new order...\n");

            while (true) {
                System.out.println("Choose an item to add:");
                System.out.println("1) Custom Sandwich");
                System.out.println("2) Signature Sandwich");
                System.out.println("3) Finish Order");
                int choice = read.nextInt();
                read.nextLine();

                switch (choice) {
                    case 1 -> customSandwich();
                    case 2 -> signatureSandwich();
                    case 3 -> finishOrder();
                    default -> System.out.println("❌ Invalid choice. Please try again.");
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Please input a valid option (1, 0): ");
            read.nextLine();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    public void customSandwich() {
    }

    public void signatureSandwich() {
    }

    public void finishOrder() {}
}
