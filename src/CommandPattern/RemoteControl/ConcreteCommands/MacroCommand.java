package CommandPattern.RemoteControl.ConcreteCommands;

import CommandPattern.RemoteControl.Command;

/**
 * Created by theo on 7/1/16.
 */
public class MacroCommand implements Command {

    private Command[] commands;

    public MacroCommand(Command[] commands){
        this.commands=commands;
    }

    @Override
    public void execute() {
        int limit = commands.length;
        for(int i =0;i<limit;i++)
            commands[i].execute();
    }

    @Override
    public void undo() {
        int limit = commands.length;
        for(int i =0;i<limit;i++)
            commands[i].undo();
    }
}
