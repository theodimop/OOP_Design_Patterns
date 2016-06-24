package StrategyPattern.DuckExample.WithPattern;

/**
 * Created by dj_di_000 on 10/6/2016 based on Head First Design Patterns book.
 */

//Make it abstract to prevent this classes instantiation
public abstract class Duck {

    /*
    * Every duck even decoys has
     *  a flyBehaviour (Can/Cannot)
     *  a quackBehaviour (Quack/Squeak)
     *  to be displayed
     *  a swim method, because all ducks can swim!
     *  */

    protected FlyBehaviour flyBehaviour;
    protected QuackBehaviour quackBehaviour;

    /*display() method is abstract because implementation
    * depends on the concrete class, with other words is
     * based on a species*/
    public abstract void display();


    //Delegates to behaviour Class
    public void performFly(){
        flyBehaviour.fly();
    }
    //Delegates to behaviour Class
    public void performQuack(){
        quackBehaviour.quack();
    }

    /*Every duck can swim, so this method is simply inherited */
    public void swim(){
        System.out.println("Currently swimming");
    }

    /*Set & Get FLY and QUACK behaviour*/

    public FlyBehaviour getFlyBehaviour() {
        return flyBehaviour;
    }

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public QuackBehaviour getQuackBehaviour() {
        return quackBehaviour;
    }

    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }
}
