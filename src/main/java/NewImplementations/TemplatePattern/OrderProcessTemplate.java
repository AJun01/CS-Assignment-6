package NewImplementations.TemplatePattern;

import NewImplementations.CommandPattern.Command;
import NewImplementations.CommandPattern.FinalizeOrderCommand;
import NewImplementations.FactoryPattern.Order;
import NewImplementations.CommandPattern.OrderHandler;
/**
 * This is the OrderProcessTemplate abstract class.
 * This class sets up a structure: selectProducts, customizeOrder, finalizeOrder for both beverage and condiment
 */
public abstract class OrderProcessTemplate {
    protected Order order;
    protected OrderHandler handler;

    public OrderProcessTemplate(Order order, OrderHandler handler) {
        this.order = order;
        this.handler = handler;
    }

    public final void processOrder() {
        selectProducts();
        customizeOrder();
        finalizeOrder();
    }
    protected abstract void selectProducts();
    protected abstract void customizeOrder();
    protected void finalizeOrder() {
        Command finalizeCommand = new FinalizeOrderCommand(order);
        handler.setCommand(finalizeCommand);
        handler.executeCommand();
    }
}
