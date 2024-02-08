package NewImplementations;

import NewImplementations.CommandPattern.AddProductCommand;
import NewImplementations.CommandPattern.Command;
import NewImplementations.CommandPattern.FinalizeOrderCommand;
import NewImplementations.CommandPattern.OrderHandler;
import NewImplementations.FactoryPattern.Order;
import NewImplementations.FactoryPattern.Product;
import NewImplementations.FactoryPattern.ProductFactory;
import NewImplementations.TemplatePattern.BeverageOrderProcess;
import NewImplementations.TemplatePattern.OrderProcessTemplate;

public class Main {

    public static void main(String[] args){
        //initiating order and order handler
        Order order = new Order();
        OrderHandler handler = new OrderHandler();

        //creating first command after create product: espresso
        Product espresso = ProductFactory.createProduct("drink", "Espresso", 2.00);
        Command addEspresso = new AddProductCommand(order, espresso);

        //handles espresso
        handler.setCommand(addEspresso);
        handler.executeCommand();

        //creating second command after create product: sugar
        Product sugar = ProductFactory.createProduct("condiment", "Sugar", 0.50);
        Command addSugar = new AddProductCommand(order, sugar);

        //handles sugar
        handler.setCommand(addSugar);
        handler.executeCommand();

        //finalizing command
        Command finalizeCommand = new FinalizeOrderCommand(order);
        handler.setCommand(finalizeCommand);
        handler.executeCommand();

        //process final order
        OrderProcessTemplate beverageOrderProcess = new BeverageOrderProcess(order, handler);
        beverageOrderProcess.processOrder();
    }
}
