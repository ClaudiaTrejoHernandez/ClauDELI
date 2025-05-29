package com.pluralsight.ui;
import com.pluralsight.OrderManager.Order;
import com.pluralsight.Screen.HomeScreen;

public class UserInterface {

    public void start() {
        Order currentOrder = new Order();

        HomeScreen homeScreen = new HomeScreen(currentOrder);
        homeScreen.display();

    }
}

