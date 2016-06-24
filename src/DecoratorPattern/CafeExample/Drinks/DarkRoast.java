package DecoratorPattern.CafeExample.Drinks;

import DecoratorPattern.CafeExample.Beverage;

/**
 * Created by theo on 6/16/16.
 */
public class DarkRoast extends Beverage {

    public DarkRoast(){
        description=" Theo-iko Dark Roast, NORMAL";
    }

    //COnstructor with Size
    public DarkRoast(Size s){

        String size="NORMAL";

        if(s== Size.BIG)
            size="BIG";
        else
        if(s==Size.SMALL)
            size="SMALL";

        description=" Theo-iko Dark Roast,"+size;
        setSize(s);
    }

    @Override
    public double cost() {
        return 0.99+getSizeCost();
    }
}
