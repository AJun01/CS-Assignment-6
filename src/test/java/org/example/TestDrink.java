package org.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import org.example.Drink;
public class TestDrink {

    public TestDrink(){
    }

    @Test
    public void testGetDrinkName() {
        Drink drink = new Drink("Makabaka", "Coffee", 48);
        assertEquals("Makabaka", drink.getName());
    }

    @Test
    public void testSetDrinkName() {
        Drink drink = new Drink("Makabaka", "Coffee", 48);
        drink.setName("Salalala");
        assertEquals("Salalala", drink.getName());
    }
    @Test
    public void testGetDrinkType() {
        Drink drink = new Drink("Makabaka", "Coffee", 48);
        assertEquals("Coffee", drink.getType());
    }

    @Test
    public void testSetDrinkType() {
        Drink drink = new Drink("Makabaka", "Coffee", 48);
        drink.setType("Tea");
        assertEquals("Tea", drink.getType());
    }
}
