package AdapterPattern.TurkeyIntoDuck;

/**
 * Created by theo on 7/1/16.
 */
public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("Gobble, Gobble ... ");
    }

    @Override
    public void fly() {
        System.out.println("Flying few meters...");
    }
}
