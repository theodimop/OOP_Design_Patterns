package CommandPattern.RemoteControl.ConcreteCommands;

import CommandPattern.RemoteControl.Command;
import CommandPattern.RemoteControl.Receivers.CeilingFan;

/**
 * Created by theo on 7/1/16.
 */
//This command also changes the speed of the fan
public class CeilingFanOnCommand implements Command {

    private CeilingFan ceilingFan;

    public CeilingFanOnCommand(CeilingFan ceilingFan){
        this.ceilingFan=ceilingFan;
    }
    @Override
    public void execute() {
        //Ceiling Fan by default starts on LOW
        //If on button is pushed again, then MEDIUM etc...
        ceilingFan.on();
    }

    @Override
    public void undo() {
        ceilingFan.undo();
    }
}
