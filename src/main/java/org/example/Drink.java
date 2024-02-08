package org.example;

/**
 * This is the Drink class.
 * This class is responsible for representing a Drink.
 */
public class Drink {
    String name;
    String type;
    double price;
    /**
     * Create a Drink object using name, type and price.
     *
     * @param newName name of the drink as string
     * @param newType type of the drink as string
     * @param newPrice price of the drink as double
     */
    public Drink(String newName, String newType, double newPrice){
        this.name = newName;
        this.type = newType;
        this.price = newPrice;
    }
    /*
     * Getter method for drink name.
     */
    public String getName() {
        return name;
    }
    /**
     * Setter method for drink name string.
     *
     * @param newName drink name of a drink
     */
    public void setName(String newName) {
        this.name = newName;
    }

    /*
     * Getter method for drink type.
     */
    public String getType() {
        return type;
    }
    /**
     * Setter method for drink type string.
     *
     * @param newType drink type of a drink
     */
    public void setType(String newType) {
        this.type = newType;
    }

    /*
     * Getter method for drink price.
     */
    public double getPrice() {
        return price;
    }
    /**
     * Setter method for drink price double.
     *
     * @param newPrice drink price of a drink
     */
    public void setPrice(double newPrice) {this.price = newPrice;}
    /**
     * toString method for drinks
     */
    @Override
    public String toString(){
        return this.name + " " + this.type + " " + Double.toString(this.price);
    }

}
