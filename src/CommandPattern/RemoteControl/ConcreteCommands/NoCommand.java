package CommandPattern.RemoteControl.ConcreteCommands;

import CommandPattern.RemoteControl.Command;

/**
 * Created by theo on 7/1/16.
 */
public class NoCommand implements Command {
    @Override
    public void execute() {
       //Empty Command!
    }

    @Override
    public void undo() {
        //Nothing to undo
    }
}
