package com.pluralsight.Screen;

import com.pluralsight.Interface.PricedItem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddSandwichScreen implements PricedItem {

    private static Scanner read = new Scanner(System.in);

    @Override
    public void display() {
        String bread = chooseBread();
        String size = chooseSize();


        String meat = chooseMeat();
        List<String> meats = new ArrayList<>();
        meats.add(meat);

        boolean extraMeat = askExtraMeat();
        if (extraMeat) {
            String secondMeat = chooseMeat();
            meats.add(secondMeat);
        }


        boolean toasted = askToasted();

        System.out.println("\n✅ Sandwich Summary:");
        System.out.println("Bread: " + bread);
        System.out.println("Size: " + size + "\"");
        System.out.println("Meat: " + meat + (extraMeat ? " (extra)" : ""));
        System.out.println("Toasted: " + (toasted ? "Yes" : "No"));
    }


    //Bread selection

    private String chooseBread() {
        while (true) {
            System.out.println("Choose bread: ");
            System.out.println("1️⃣ White");
            System.out.println("2️⃣ Wheat");
            System.out.println("3️⃣ Rye");
            System.out.println("4️⃣ Wrap");

            int choice = read.nextInt();
            read.nextLine();

            switch (choice) {
                case 1 -> {
                    return "White";
                }
                case 2 -> {
                    return "Wheat";
                }
                case 3 -> {
                    return "Rye";
                }
                case 4 -> {
                    return "Wrap";
                }
                default -> {
                    System.out.println("Invalid choice. Try again.");
                }
            };
        }
    }

    //Size selection

    private String chooseSize() {
        while (true) {
            System.out.println("Choose size");
            System.out.println("1️⃣ 4' ");
            System.out.println("2️⃣ 8' ");
            System.out.println("3️⃣ 12' ");

            int choice = read.nextInt();
            read.nextLine();

            switch (choice) {
                case 1 -> {
                    return "4";
                }
                case 2 -> {
                    return "8";
                }
                case 3 -> {
                    return "12";
                }
                default -> {
                    System.out.println("Invalid choice. Try again. ");
                }
            };
        }
    }

    //Meat selection

    private String chooseMeat() {
        while (true) {
            System.out.println("Choose meat: ");
            System.out.println("1️⃣ Steak ");
            System.out.println("2️⃣ Ham ");
            System.out.println("3️⃣ Salami ");
            System.out.println("4️⃣ Roast Beef ");
            System.out.println("5️⃣ Chicken ");
            System.out.println("6️⃣ Bacon");

            int choice = read.nextInt();
            read.nextLine();

             switch (choice) {
                case 1 -> {
                     return "Steak";
                 }
                case 2 -> {
                     return "Ham";
                 }
                case 3 -> {
                     return "Salami";
                 }
                case 4 -> {
                     return "Roast Beef";
                 }
                case 5 -> {
                     return "Chicken";
                 }
                case 6 -> {
                     return "Bacon";
                 }
                default -> {
                    System.out.println("Invalid choice. Try again. ");
                }

            };

        }
    }

    private boolean askExtraMeat() {
        while (true) {
            System.out.println("Would you like extra meat? Y/N");
            String input = read.nextLine().trim().toLowerCase();

            if (input.equals("y") || input.equals("yes")) {
                return true;
            } else if (input.equals("n") || input.equals("no")) {
                return false;
            } else {
                System.out.println("Invalid input. Please type Y or N. ");
            }
        }
    }

    private boolean askToasted() {
        System.out.println("Would you like your sandwich toasted? Y/N? ");
        String input = read.nextLine().trim().toLowerCase();
        return input.equals("y") || input.equals("yes");
    }

    @Override
    public String getName() {
        return "";
    }

    @Override
    public double getPrice() {
        return 0;
    }
}


