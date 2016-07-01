package AdapterPattern.TurkeyIntoDuck;

/**
 * Created by theo on 7/1/16.
 */
public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("Quaaaackkk, Quackkkkk....");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying...");
    }
}
