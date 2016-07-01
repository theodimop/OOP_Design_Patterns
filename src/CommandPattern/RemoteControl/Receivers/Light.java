package CommandPattern.RemoteControl.Receivers;

/**
 * Created by theo on 6/27/16.
 */
public
class Light {

    private boolean lightOn;
    private String name;

    public Light(String name){
        lightOn=false;
        this.name=name;
    }

    public void on(){
        System.out.println(name+" : Light is on");
        lightOn=true;
    }

    public void off(){
        System.out.println(name+" : Light is off");
        lightOn=false;
    }

    public boolean isOn(){
        return lightOn;
    }
    public String getName(){
        return name;
    }
}
