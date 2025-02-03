package commandPattern.command;

import commandPattern.model.Fan;
import commandPattern.util.Command;

public class FanOn implements Command {
    private final Fan fan;

    public FanOn(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        fan.on();
    }

    @Override
    public void undo() {
        fan.off();
    }
}
