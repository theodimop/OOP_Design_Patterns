package DecoratorFactory.CafeExample.Drinks;

import DecoratorFactory.CafeExample.Beverage;
import DecoratorFactory.CafeExample.BeverageFactory;

/**
 * Created by theo on 6/16/16.
 */
public class Espresso extends Beverage {

    //Empty constructor -> Normal Size
    public Espresso(){
        description=" Theo-iko Espresso, NORMAL";
    }

    //COnstructor with Size
    public Espresso(Size s){

        description=" Theo-iko Espresso, ";
        BeverageFactory.decorateBeverage(this,s);


    }



    @Override
    public double cost() {
        return 1.99+getSizeCost();
    }
}
