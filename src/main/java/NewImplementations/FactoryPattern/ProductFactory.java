package NewImplementations.FactoryPattern;
/**
 * This is the ProductFactory class.
 * This class is responsible for setting up a createProduct function to manifest products
 */
public class ProductFactory {
    /**
     * Create a product for coffee machine using this blueprint
     *
     * @param name of the product as string
     * @param type type of the product as string
     * @param price price of the product as double
     */
    public static Product createProduct(String type, String name, double price) {
        if ("drink".equalsIgnoreCase(type)) {
            return new Drink(name, price);
        } else if ("condiment".equalsIgnoreCase(type)) {
            return new Condiment(name, price);
        } else {
            throw new IllegalArgumentException("Unknown product type");
        }
    }
}
