package NewImplementations.CommandPattern;

import NewImplementations.FactoryPattern.Order;
/**
 * This is the FinalizeOrderCommand class.
 * This class is responsible for handling the command of finalizing
 */
public class FinalizeOrderCommand implements Command {
    private Order order;

    public FinalizeOrderCommand(Order order) {
        this.order = order;
    }

    public void execute() {
        order.finalizeOrder();
        System.out.println("order finalized");
    }
}
