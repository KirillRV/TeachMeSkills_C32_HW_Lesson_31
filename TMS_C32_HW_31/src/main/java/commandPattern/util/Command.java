package commandPattern.util;

public interface Command {
    void execute();
    void undo();
}