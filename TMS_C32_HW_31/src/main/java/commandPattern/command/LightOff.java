package commandPattern.command;

import commandPattern.model.Light;
import commandPattern.util.Command;

public class LightOff implements Command {
    private final Light light;

    public LightOff(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}