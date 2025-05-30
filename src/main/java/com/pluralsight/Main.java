package com.pluralsight;

import com.pluralsight.OrderManager.Order;
import com.pluralsight.ScreensManager.HomeScreen;

public class Main {
    public static void main(String[] args) {

        Order currentOrder = new Order();

        HomeScreen homeScreen = new HomeScreen(currentOrder);
        homeScreen.display();
    }
}