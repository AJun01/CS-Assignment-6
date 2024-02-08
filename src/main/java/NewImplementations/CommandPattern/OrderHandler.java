package NewImplementations.CommandPattern;

/**
 * This is the OrderHandler class.
 * This class is responsible for handling the setCommand and executeCommand
 */

public class OrderHandler {
    private Command command;
    public void setCommand(Command command) {
        this.command = command;
    }
    public void executeCommand() {
        command.execute();
    }
}
