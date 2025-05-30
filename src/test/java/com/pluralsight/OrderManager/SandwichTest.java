package com.pluralsight.OrderManager;

import junit.framework.TestCase;

public class SandwichTest extends TestCase {

    public void testGetPrice() {
        //Arrange
        Sandwich sandwich = new Sandwich("Wheat","12");
        //Act
        double price = sandwich.getPrice();
        //Assert
        assertEquals(8.50, price);

    }

    public void testTestGetName() {
        //Arrange
        Sandwich sandwich = new Sandwich("Rye","4");
        //Act
        String name = sandwich.getName();
        //Assert
        assertEquals("4\" Rye Sandwich",name);
    }
}