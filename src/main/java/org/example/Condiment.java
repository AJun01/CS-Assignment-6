package org.example;

/**
 * This is the Drink class.
 * This class is responsible for representing a Drink.
 */
public class Condiment {
    String name;
    double price;
    /**
     * Create a Condiment object using name and price.
     *
     * @param newName name of the condiment as string
     * @param newPrice price of the condiment as double
     */
    public Condiment(String newName, double newPrice){
        this.name = newName;
        this.price = newPrice;
    }
    /*
     * Getter method for condiment name.
     */
    public String getName() {
        return name;
    }
    /**
     * Setter method for condiment name string.
     *
     * @param newName for name of a condiment
     */
    public void setName(String newName) {
        this.name = name;
    }

    /*
     * Getter method for condiment price.
     */
    public double getPrice() { return price; }
    /**
     * Setter method for condiment price double.
     *
     * @param newPrice price of condiment
     */
    public void setPrice(double newPrice) {
        this.price = newPrice;
    }

}
