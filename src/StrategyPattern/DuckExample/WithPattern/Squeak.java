package StrategyPattern.DuckExample.WithPattern;

/**
 * Created by dj_di_000 on 10/6/2016.
 */
public class Squeak implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("Squeaking!!!");
    }
}
