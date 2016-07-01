package CommandPattern.RemoteControl.ConcreteCommands;

import CommandPattern.RemoteControl.Command;
import CommandPattern.RemoteControl.Receivers.Stereo;

/**
 * Created by theo on 7/1/16.
 */
public
class StereoWithCDOnCommand implements Command {

    private Stereo stereo;

    public StereoWithCDOnCommand(Stereo stereo){
        this.stereo=stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCd("Adele21");
        stereo.setVolume(20);
    }

    @Override
    public void undo() {
        stereo.off();
    }
}
