package commandPattern.command;

import commandPattern.model.Fan;
import commandPattern.util.Command;

class FanOff implements Command {
    private final Fan fan;

    public FanOff(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        fan.off();
    }

    @Override
    public void undo() {
        fan.on();
    }
}