package org.example;

/**
 * This is the Addons class.
 * This class is responsible for storing and creating new addons  by using Condiment.class.
 */
public class AddOnOptions {

    //milk and sugar

    private Condiment milk = new Condiment("Milk", 0.5);

    private Condiment sugar = new Condiment("Sugar", 0.5);

    /*
     * Getter method for milk.
     */
    public Condiment getMilk() {
        return milk;
    }
    /*
     * Getter method for sugar.
     */
    public Condiment getSugar() {
        return sugar;
    }
}
