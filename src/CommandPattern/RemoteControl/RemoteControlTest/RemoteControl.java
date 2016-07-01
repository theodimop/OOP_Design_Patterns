package CommandPattern.RemoteControl.RemoteControlTest;

import CommandPattern.RemoteControl.Command;
import CommandPattern.RemoteControl.ConcreteCommands.NoCommand;

import java.util.*;

/**
 * Created by theo on 6/27/16.
 */
public
class RemoteControl {

    private Command[] offCommands;
    private Command[] onCommands;
    //Use Data Structure stack to store undo Commands
    private Stack<Command> undoCommands;

    public RemoteControl(){
        offCommands = new Command[7];
        onCommands= new Command[7];

        Command noCommand=new NoCommand();

        for(int i=0;i<7;i++){
            onCommands[i]=noCommand;
            offCommands[i]=noCommand;
        }
        undoCommands =new Stack<>();
    }
    public void setCommand(int index,Command onCommand,Command offCommand){
        offCommands[index]=offCommand;
        onCommands[index]=onCommand;
    }
    private void addUndoCommand(Command undoCommand){
        this.undoCommands.push(undoCommand);
    }
    public void removeCommand(int index){
        Command noCommand=new NoCommand();
        offCommands[index]=noCommand;
        onCommands[index]=noCommand;
    }
    public void onButtonWasPushed(int slot){
        onCommands[slot].execute();
        //Store the command that is executed
        addUndoCommand(onCommands[slot]);
    }
    public void offButtonWasPushed(int slot){
        offCommands[slot].execute();
        //Store the command that is executed
        addUndoCommand(offCommands[slot]);
    }
    public void undoButtonWasPushed(){
        System.out.print("UNDO --> ");
        if(!undoCommands.isEmpty())
            undoCommands.pop().undo();
        else
            System.out.println("Undo Button pressed, nothing to do...");

    }
    public void print(){
        System.out.println(this.toString());
    }

    @Override
    public String toString(){
        StringBuffer buffer=new StringBuffer();
        buffer.append("\n-------------REMOTE CONTROL-------------\n\n");
        for(int i=0;i<7;i++){
            buffer.append("Slot: "+i+" : "+onCommands[i].getClass().getName()+" , "+offCommands[i].getClass().getName()+"\n");
        }
        return buffer.toString();
    }
}
