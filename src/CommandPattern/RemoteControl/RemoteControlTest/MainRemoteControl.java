package CommandPattern.RemoteControl.RemoteControlTest;

import CommandPattern.RemoteControl.ConcreteCommands.*;
import CommandPattern.RemoteControl.Receivers.CeilingFan;
import CommandPattern.RemoteControl.Receivers.Garage;
import CommandPattern.RemoteControl.Receivers.Light;
import CommandPattern.RemoteControl.Receivers.Stereo;

/**
 * Created by theo on 7/1/16.
 */
public
class MainRemoteControl {

    public static void main(String args[]){
        //1 Create Remote Control
        RemoteControl remoteControl=new RemoteControl();

        //2 Create the Receivers
        Light lightKitchen = new Light("Kitchen");
        Light lightBedroom = new Light("Bedroom");
        Garage garage = new Garage();
        Stereo stereoLivingRoom = new Stereo("Living room");
        CeilingFan ceilingFan = new CeilingFan("Bedroom");

        //3 Construct the on/off Commands
        LightOnCommand lightOnCommandKitchen = new LightOnCommand(lightKitchen);
        LightOffCommand lightOffCommandKitchen = new LightOffCommand(lightKitchen);

        LightOnCommand lightOnCommandBedroom = new LightOnCommand(lightBedroom);
        LightOffCommand lightOffCommandBedroom = new LightOffCommand(lightBedroom);

        GarageDoorOpenCommand garageDoorOpenCommand= new GarageDoorOpenCommand(garage);
        GarageDoorCloseCommand garageDoorCloseCommand= new GarageDoorCloseCommand(garage);

        StereoWithCDOnCommand stereoWithCDOnCommand=new StereoWithCDOnCommand(stereoLivingRoom);
        StereoWithCDOffCommand stereoWithCDOffCommand=new StereoWithCDOffCommand(stereoLivingRoom);

        CeilingFanOnCommand ceilingFanOnCommand=new CeilingFanOnCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOffCommand=new CeilingFanOffCommand(ceilingFan);


        //4 Set the Commands to the Remote Control
        remoteControl.setCommand(0,lightOnCommandBedroom,lightOffCommandBedroom);
        remoteControl.setCommand(1,lightOnCommandKitchen,lightOffCommandKitchen);
        remoteControl.setCommand(2,garageDoorOpenCommand,garageDoorCloseCommand);
        remoteControl.setCommand(3,stereoWithCDOnCommand,stereoWithCDOffCommand);
        remoteControl.setCommand(4,ceilingFanOnCommand,ceilingFanOffCommand);


        //Use the Remote control Like a King

        remoteControl.onButtonWasPushed(1);
        remoteControl.onButtonWasPushed(4);
        remoteControl.onButtonWasPushed(2);
        remoteControl.undoButtonWasPushed();

        remoteControl.offButtonWasPushed(3);
        remoteControl.offButtonWasPushed(4);

        remoteControl.undoButtonWasPushed();
        remoteControl.undoButtonWasPushed();
        remoteControl.undoButtonWasPushed();
        remoteControl.undoButtonWasPushed();
        remoteControl.undoButtonWasPushed();

     /*   remoteControl.onButtonWasPushed(4);
        remoteControl.onButtonWasPushed(4);
        //remoteControl.offButtonWasPushed(4);

        remoteControl.undoButtonWasPushed();*/
        //remoteControl.print();

    }
}
