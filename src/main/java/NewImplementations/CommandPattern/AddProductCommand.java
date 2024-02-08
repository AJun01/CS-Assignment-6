package NewImplementations.CommandPattern;

/**
 * This is the AddProductCommand class.
 * This class is responsible for handling the command of adding product to the order
 */

import NewImplementations.FactoryPattern.Order;
import NewImplementations.FactoryPattern.Product;

public class AddProductCommand implements Command {
    private Order order;
    private Product product;
    /**
     * Mapping product to order
     *
     * @param order as order
     * @param product as product
     */
    public AddProductCommand(Order order, Product product) {
        this.order = order;
        this.product = product;
    }

    public void execute() {
        order.addProduct(product);
        System.out.println("Added " + product.getName() + " to the order.");
    }
}
