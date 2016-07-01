package CommandPattern.RemoteControl.ConcreteCommands;

import CommandPattern.RemoteControl.Command;
import CommandPattern.RemoteControl.Receivers.Garage;

/**
 * Created by theo on 6/27/16.
 */
public
class GarageDoorOpenCommand implements Command {

    private Garage garage;

    public GarageDoorOpenCommand(Garage garage){
        this.garage=garage;
    }
    
    @Override
    public void execute() {
        garage.open();
    }

    @Override
    public void undo() {
        garage.close();
    }
}
