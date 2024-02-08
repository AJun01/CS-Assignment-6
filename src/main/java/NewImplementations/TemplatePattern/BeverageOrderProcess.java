package NewImplementations.TemplatePattern;

import NewImplementations.CommandPattern.AddProductCommand;
import NewImplementations.CommandPattern.Command;
import NewImplementations.CommandPattern.OrderHandler;
import NewImplementations.FactoryPattern.Order;
import NewImplementations.FactoryPattern.Product;
import NewImplementations.FactoryPattern.ProductFactory;
/**
 * This is the BeverageOrderProcess.
 * This class is a OrderProcessTemplate extends
 */
public class BeverageOrderProcess extends OrderProcessTemplate {
    public BeverageOrderProcess(Order order, OrderHandler handler) {
        super(order, handler);
    }
    protected void selectProducts() {
        Product espresso = ProductFactory.createProduct("drink", "Espresso", 2.00);
        Command addProductCommand = new AddProductCommand(order, espresso);
        handler.setCommand(addProductCommand);
        handler.executeCommand();
    }
    protected void customizeOrder() {
        Product sugar = ProductFactory.createProduct("condiment", "Sugar", 0.50);
        Command addCondimentCommand = new AddProductCommand(order, sugar);
        handler.setCommand(addCondimentCommand);
        handler.executeCommand();
    }
}
