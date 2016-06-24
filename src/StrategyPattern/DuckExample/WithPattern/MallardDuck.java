package StrategyPattern.DuckExample.WithPattern;

/**
 * Created by dj_di_000 on 10/6/2016.
 */

/*
* MallardDuck can fly and quack.
* Hence in the constructor with initialize these behaviours*/
public class MallardDuck extends Duck {


    public MallardDuck(){

        flyBehaviour=new FlyWithWings();
        quackBehaviour=new Quack();
    }


    @Override
    public void display() {
        System.out.println("A Mallard duck is displayed");
    }
}
