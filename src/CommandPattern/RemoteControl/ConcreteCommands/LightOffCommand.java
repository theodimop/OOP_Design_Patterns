package CommandPattern.RemoteControl.ConcreteCommands;

import CommandPattern.RemoteControl.Command;
import CommandPattern.RemoteControl.Receivers.Light;

/**
 * Created by theo on 6/27/16.
 */
public class LightOffCommand implements Command {

    Light light;

    /*
     * @params Light to invoke the correct methods, kitchen light ,garden etc.
     */
    public LightOffCommand(Light light){
        this.light=light;
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
