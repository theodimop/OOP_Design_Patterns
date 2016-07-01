package CommandPattern.RemoteControl.ConcreteCommands;

import CommandPattern.RemoteControl.Command;
import CommandPattern.RemoteControl.Receivers.Stereo;

/**
 * Created by theo on 7/1/16.
 */
public
class StereoWithCDOffCommand implements Command {

    private Stereo stereo;

    public StereoWithCDOffCommand(Stereo stereo){
        this.stereo=stereo;
    }
    @Override
    public void execute() {
        stereo.off();
    }

    @Override
    public void undo() {
        stereo.on();
        stereo.setCd("Adele21");
        stereo.setVolume(20);
    }
}
