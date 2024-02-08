package NewImplementations.CommandPattern;

/**
 * This is the Command interface.
 * This interface sets up execute() function to AddProductCommand, FinalizeOrderCommand and OrderHandler
 */
public interface Command {
    void execute();
}
