package CommandPattern.RemoteControl.ConcreteCommands;

import CommandPattern.RemoteControl.Command;
import CommandPattern.RemoteControl.Receivers.Garage;

/**
 * Created by theo on 6/27/16.
 */
public
class GarageDoorCloseCommand implements Command {

    private Garage garage;

    public GarageDoorCloseCommand(Garage garage){
        this.garage=garage;
    }
    
    @Override
    public void execute() {
        garage.close();
    }

    @Override
    public void undo() {
        garage.open();
    }
}
