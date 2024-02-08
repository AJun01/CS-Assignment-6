package NewImplementations.FactoryPattern;

/**
 * This is the Product abstract class.
 * This class is responsible for setting up structures for coffee machine products
 */
public abstract class Product {
    protected String name;
    protected double price;
    /**
     * Create a product for coffee machine
     *
     * @param name of the product as string
     * @param price price of the product as double
     */
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
    @Override
    public String toString() {
        return "Name: " + name + ", Price: $" + price;
    }
}