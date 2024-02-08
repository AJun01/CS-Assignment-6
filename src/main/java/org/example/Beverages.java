package org.example;

/**
 * This is the Beverages class.
 * This class is responsible for storing and creating new beverage by using Drink.class.
 */

public class Beverages {

    //Coffee - Espresso, Americano, Latte Macchiato

    private final Drink espresso = new Drink("Espresso", "Coffee", 2);
    private final Drink americano = new Drink("Americano", "Coffee", 2);
    private final Drink Macchiato = new Drink("Macchiato", "Coffee",2);

    //Tea - Black Tea, Green Tea, and Yellow Tea

    private final Drink BTea = new Drink("Black Tea","Tea", 1.5);
    private final Drink GTea = new Drink("Green Tea", "Tea", 1.5);
    private final Drink YTea = new Drink("Yellow Tea", "Tea", 1.5);

    /*
     * Getter method for Espresso .
     */
    public Drink getEspresso(){
        return espresso;
    }
    /*
     * Getter method for Americano .
     */
    public Drink getAmericano(){
        return americano;
    }
    /*
     * Getter method for Macchiato price .
     */
    public Drink getMacchiato(){
        return Macchiato;
    }
    /*
     * Getter method for BTea price .
     */
    public Drink getBTea(){
        return BTea;
    }
    /*
     * Getter method for GTea price .
     */
    public Drink getGTea(){
        return GTea;
    }
    /*
     * Getter method for YTea price .
     */
    public Drink getYTea(){
        return YTea;
    }
}


