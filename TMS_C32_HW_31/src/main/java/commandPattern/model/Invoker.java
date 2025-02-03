package commandPattern.model;

import commandPattern.util.Command;

public class Invoker {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void executeCommand() {
        if (command != null) {
            command.execute();
        }
    }

    public void undoCommand() {
        if (command != null) {
            command.undo();
        }
    }
}