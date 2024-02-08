package NewImplementations.TemplatePattern;

import NewImplementations.CommandPattern.AddProductCommand;
import NewImplementations.CommandPattern.Command;
import NewImplementations.CommandPattern.OrderHandler;
import NewImplementations.FactoryPattern.Order;
import NewImplementations.FactoryPattern.Product;
import NewImplementations.FactoryPattern.ProductFactory;
/**
 * This is the CondimentOrderProcess.
 * This class is a OrderProcessTemplate extends
 */
class CondimentOrderProcess extends OrderProcessTemplate {
    public CondimentOrderProcess(Order order, OrderHandler handler) {
        super(order, handler);
    }

    protected void selectProducts() {
        Product sugar = ProductFactory.createProduct("condiment", "Sugar", 0.50);
        Command addSugarCommand = new AddProductCommand(order, sugar);
        handler.setCommand(addSugarCommand);
        handler.executeCommand();

        Product milk = ProductFactory.createProduct("condiment", "Milk", 0.50);
        Command addMilkCommand = new AddProductCommand(order, milk);
        handler.setCommand(addMilkCommand);
        handler.executeCommand();
    }

    protected void customizeOrder() {
        System.out.println("Nope, current not available");
    }
}
