package CommandPattern.RemoteControl.SingleButtonTest;

import CommandPattern.RemoteControl.Command;

/**
 * Created by theo on 6/27/16.
 */
public
class SingleButtonRemoteControl {

    Command slot;

    public SingleButtonRemoteControl(){}

    public void setCommandToSlot(Command command){
        slot=command;
    }

    public void buttonWasPressed(){
        slot.execute();
    }

}
