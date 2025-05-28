package com.pluralsight.Screen;

import com.pluralsight.Interface.Screen;
import com.pluralsight.OrderManager.Order;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AddChipScreen implements Screen {

    public static Scanner read = new Scanner(System.in);

    @Override
    public void display() {
        try {
            System.out.println("Adding Chips...\n");

            while (true) {
                System.out.println("Choose your chip(s):");
                System.out.println("1) Doritos");
                System.out.println("2) Lay's");
                System.out.println("3) Ruffles");
                System.out.println("4) Kettle Brand");
                System.out.println("5) Back to order");
                int choice = read.nextInt();
                read.nextLine();

                switch (choice) {
                    case 1 -> addDoritos();
                    case 2 -> addLays();
                    case 3 -> addRuffles();
                    case 4 -> addKettle();
                    case 5 -> backToOrder();
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

    public void addDoritos() {}

    public void addLays() {}

    public void addRuffles() {}

    public void addKettle() {}

    public void backToOrder() {}

    }

