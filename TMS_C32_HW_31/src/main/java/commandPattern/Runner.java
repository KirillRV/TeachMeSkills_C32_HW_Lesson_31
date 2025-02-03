package commandPattern;

import commandPattern.command.FanOn;
import commandPattern.command.LightOff;
import commandPattern.command.LightOn;
import commandPattern.model.Fan;
import commandPattern.model.Light;
import commandPattern.model.Invoker;

public class Runner {
    public static void main(String[] args) {
        Light light = new Light();
        Fan fan = new Fan();

        Invoker invoker = new Invoker();

        // Включение света
        invoker.setCommand(new LightOn(light));
        invoker.executeCommand();

        // Включение вентилятора
        invoker.setCommand(new FanOn(fan));
        invoker.executeCommand();

        // Выключение света
        invoker.setCommand(new LightOff(light));
        invoker.executeCommand();

        // Отмена последнего действия (включение света)
        invoker.undoCommand();
    }
}
