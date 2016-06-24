package StrategyPattern.DuckExample.WithPattern;

/**
 * Created by dj_di_000 on 10/6/2016.
 *
 * Definition of Strategy Pattern:
 * Define family of algorithms, encapsulates each one of them and makes them interchangeable.
 * This lets the algorithm vary independently from the clients that use it.
 *
 */
public class MainStrategy {
    public static void main (String[] args){

        Duck mallardDuck = new MallardDuck();
        mallardDuck.performFly();
        mallardDuck.performQuack();

        mallardDuck.setFlyBehaviour(new FlyNoWay());

        mallardDuck.performFly();


    }

}
