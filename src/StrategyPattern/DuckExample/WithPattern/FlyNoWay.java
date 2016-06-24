package StrategyPattern.DuckExample.WithPattern;

/**
 * Created by dj_di_000 on 10/6/2016.
 */
public class FlyNoWay implements FlyBehaviour{


    @Override
    public void fly() {
        System.out.println("Can't fly");
    }

}
