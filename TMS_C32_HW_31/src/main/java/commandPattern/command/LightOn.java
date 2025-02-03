package commandPattern.command;

import commandPattern.model.Light;
import commandPattern.util.Command;

public class LightOn implements Command {
    private final Light light;

    public LightOn(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
