package CommandPattern.RemoteControl.SingleButtonTest;

import CommandPattern.RemoteControl.ConcreteCommands.GarageDoorOpenCommand;
import CommandPattern.RemoteControl.Receivers.Garage;
import CommandPattern.RemoteControl.Receivers.Light;
import CommandPattern.RemoteControl.ConcreteCommands.LightOffCommand;
import CommandPattern.RemoteControl.ConcreteCommands.LightOnCommand;

/**
 * Created by theo on 6/27/16.
 */
public
class MainSingleButtonRemoteControl {

    public static void main(String args[]){
        //1..Create the Remote control
        SingleButtonRemoteControl remoteControl= new SingleButtonRemoteControl();
        //2. Create the Kitchen Light
        Light kitchenLight= new Light("Kitchen");
        //3. Create the on command for the kitchen light
        LightOnCommand kitchenLightOnCommand= new LightOnCommand(kitchenLight);
        //4. Assign command to slot
        remoteControl.setCommandToSlot(kitchenLightOnCommand);

        //Click the remote button
        remoteControl.buttonWasPressed();

        //Assign different command to slot!
        LightOffCommand kitchenLightOffCommand=new LightOffCommand(kitchenLight);
        remoteControl.setCommandToSlot(kitchenLightOffCommand);
        remoteControl.buttonWasPressed();

        Garage garage=new Garage();
        GarageDoorOpenCommand garageDoorOpenCommand=new GarageDoorOpenCommand(garage);
        remoteControl.setCommandToSlot(garageDoorOpenCommand);
        remoteControl.buttonWasPressed();

    }
}