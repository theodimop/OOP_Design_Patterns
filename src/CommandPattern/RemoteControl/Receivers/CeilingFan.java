package CommandPattern.RemoteControl.Receivers;

import java.util.Queue;
import java.util.Stack;

/**
 * Created by theo on 7/1/16.
 */
public
class CeilingFan  {

    public enum Speed{
        OFF,LOW ,MEDIUM , HIGH
    }

    private String name;
    private Speed speed;
    private Stack<Speed> previousSpeeds;//Store previous speed in a stack
    public CeilingFan(String name) {
        this.name=name;
        speed= Speed.OFF;
        previousSpeeds=new Stack<>();
    }

    public void on(){
        //Store previous speed
        previousSpeeds.push(speed);
        //Set New speed
        setSpeed();
        System.out.println("Ceiling Fan at "+name+" is ON at speed : "+speed);


    }

    public void undo(){
        if(!previousSpeeds.empty()) {
            speed = previousSpeeds.pop();
            System.out.println("Ceiling Fan at: "+name+" is ON at speed : "+speed);
        }
    }

    public void off(){
        System.out.println("Ceiling Fan at "+name+" is OFF.");
        previousSpeeds.push(speed);
        speed=Speed.OFF;
    }

    public Speed getSpeed(){
        return speed;
    }

    private void setSpeed() {
        if(speed==Speed.OFF)
            speed=Speed.LOW;
        else if(speed==Speed.LOW)
            speed=Speed.MEDIUM;
        else if(speed==Speed.MEDIUM)
            speed=Speed.HIGH;
        else
            speed=Speed.LOW;
    }
}
