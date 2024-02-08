package NewImplementations;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import NewImplementations.CommandPattern.*;
import NewImplementations.FactoryPattern.*;
import NewImplementations.TemplatePattern.*;
public class TestUnits {

    public TestUnits(){
    }

    @Test
    public void testGetDrinkName() {
        Product test1 = ProductFactory.createProduct("drink", "test1", 2.00);
        assertEquals("test1", test1.getName());
    }
    @Test
    public void testGetDrinkPrice() {
        Product test1 = ProductFactory.createProduct("drink", "test1", 2.00);
        assertEquals(2.00, test1.getPrice(),2);
    }
    @Test
    public void testGetCondimentName() {
        Product test2 = ProductFactory.createProduct("condiment", "test2", 0.5);
        assertEquals("test2", test2.getName());
    }
    @Test
    public void testGetCondimentPrice() {
        Product test2 = ProductFactory.createProduct("condiment", "test2", 0.5);
        assertEquals(0.5, test2.getPrice(),0.5);
    }

    @Test
    public void testOrderAdding() {
        Order order = new Order();
        OrderHandler handler = new OrderHandler();
        Product mamamiya = ProductFactory.createProduct("drink", "mamamiya", 2.00);
        Command addMamamiya = new AddProductCommand(order, mamamiya);
        handler.setCommand(addMamamiya);
        handler.executeCommand();
        assertEquals("[Name: mamamiya, Price: $2.0]", order.toString());
    }
    @Test
    public void testOrderFinalizing() {
        Order order = new Order();
        OrderHandler handler = new OrderHandler();
        Product mamamiya = ProductFactory.createProduct("drink", "mamamiya", 2.00);
        Command addMamamiya = new AddProductCommand(order, mamamiya);
        handler.setCommand(addMamamiya);
        handler.executeCommand();
        Command finalizeCommand = new FinalizeOrderCommand(order);
        handler.setCommand(finalizeCommand);
        handler.executeCommand();
        assertEquals(true, order.isFinalizedtoString());
    }

}
