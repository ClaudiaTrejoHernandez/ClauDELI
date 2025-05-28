package com.pluralsight.Screen;

import java.util.Scanner;

public class CustomerInfoScreen {

    public static Scanner read = new Scanner(System.in);

    public void display() {
        try {
            System.out.println("Enter your first name: ");
            String firstName;
            System.out.println("Enter your last name: ");
            String lastName;
            System.out.println("Enter your phone number: ");
            String phoneNumber;

//            order.setCustomer(new Customer(firstName, lastName, phoneNumber));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
