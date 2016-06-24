package DecoratorFactory.CafeExample.Drinks;

import DecoratorFactory.CafeExample.Beverage;
import DecoratorFactory.CafeExample.BeverageFactory;

/**
 * Created by theo on 6/16/16.
 */
public class Decaf extends Beverage {

    public Decaf(){
        description=" Theo-iko Decaf, NORMAL";
    }

    //COnstructor with Size
    public Decaf(Size s){
        description=" Theo-iko Decaf, ";
        BeverageFactory.decorateBeverage(this,s);

    }

    @Override
    public double cost() {

        return 1.05+getSizeCost();

    }
}
