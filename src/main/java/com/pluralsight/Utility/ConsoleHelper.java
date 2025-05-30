package com.pluralsight.Utility;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsoleHelper {
    private static final Scanner read = new Scanner(System.in);

    public static int readInt(String prompt, int min, int max) {
        while (true) {
            try {
                System.out.println(prompt);
                int input = read.nextInt();
                read.nextLine();

                if (input >= min && input <= max) {
                    return input;
                } else {
                    System.out.println("\n❌ Please enter a number between " + min + " and " + max + ".\n");
                }
            } catch (InputMismatchException e) {
                System.out.println("\n❌ Invalid input. Please enter a number.\n");
                read.nextLine();
            }
        }
    }

    public static void printDivider() {
        System.out.println("\n✦🍃━━━━━━━━━━━━━༺☁︎｡⋆｡ ﾟ☾ ﾟ｡⋆｡☁︎༻━━━━━━━━━━━━━━━🍃✦\n");
    }

//    public static String readLine(String prompt) {
//        System.out.println(prompt);
//        return read.nextLine();
//    }
}
