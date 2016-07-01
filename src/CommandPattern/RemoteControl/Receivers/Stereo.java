package CommandPattern.RemoteControl.Receivers;

/**
 * Created by theo on 7/1/16.
 */
public class Stereo {

    private boolean stereoOn;
    private String name;

    public Stereo(String name){
        this.name=name;
        stereoOn=false;
    }

    public void on(){
        System.out.println("Stereo "+name+" : is on.");
        stereoOn=true;
    }
    public void setCd(String cdName){
        System.out.println("Stereo "+this.name+" : " +cdName+" is set.");
    }
    public void setVolume(int volume){
        System.out.println("Stereo "+this.name+" : Volume setted to " +volume+".");
    }

    public void off(){
        System.out.println("Stereo "+name+" : is off.");
        stereoOn=false;
    }

    public boolean isOn(){
        return stereoOn;
    }
    public String getName(){
        return name;
    }
}
