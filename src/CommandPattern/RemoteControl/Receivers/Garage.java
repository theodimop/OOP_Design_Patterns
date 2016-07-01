package CommandPattern.RemoteControl.Receivers;

/**
 * Created by theo on 6/27/16.
 */
public
class Garage {

    private boolean openDoor;

    public Garage(){
        openDoor=false;
    }

    public void open(){
        openDoor=true;
        System.out.println("Garage : Door is Open");
    }
    public void close(){
        openDoor=false;
        System.out.println("Garage : Door is Closed");
    }
    public boolean isOpen(){
        return openDoor;
    }

}
