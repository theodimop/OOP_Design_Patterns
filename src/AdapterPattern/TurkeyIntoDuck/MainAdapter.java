package AdapterPattern.TurkeyIntoDuck;

/**
 * Created by theo on 7/1/16.
 */
public class MainAdapter {

    public static void main(String args[]){

        System.out.println("The duck says :");
        Duck mallardDuck = new MallardDuck();
        performDuckTest(mallardDuck);

        System.out.println("\nThe turkey says :");
        Turkey wildTurkey = new WildTurkey();
        wildTurkey.gobble();
        wildTurkey.fly();

        System.out.println("\nThe turkeyAdapter says :");
        //we have a turkey which acts like a duck!!
        Duck turkeyAdapter = new TurkeyAdapter(wildTurkey);
        performDuckTest(turkeyAdapter);
    }
    private static void performDuckTest(Duck duck){
        duck.quack();
        duck.fly();
    }
}
