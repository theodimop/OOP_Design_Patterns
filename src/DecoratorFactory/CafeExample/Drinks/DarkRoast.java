package DecoratorFactory.CafeExample.Drinks;

import DecoratorFactory.CafeExample.Beverage;
import DecoratorFactory.CafeExample.BeverageFactory;

/**
 * Created by theo on 6/16/16.
 */
public class DarkRoast extends Beverage {

    public DarkRoast(){
        description=" Theo-iko Dark Roast, NORMAL";
    }

    //COnstructor with Size
    public DarkRoast(Size s){

        description=" Theo-iko Dark Roast,";
        BeverageFactory.decorateBeverage(this,s);
    }

    @Override
    public double cost() {
        return 0.99+getSizeCost();
    }
}
