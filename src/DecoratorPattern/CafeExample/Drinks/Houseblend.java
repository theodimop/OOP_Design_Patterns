package DecoratorPattern.CafeExample.Drinks;

import DecoratorPattern.CafeExample.Beverage;

/**
 * Created by theo on 6/16/16.
 */
public class Houseblend extends Beverage {

    public Houseblend(){
        description=" Theo-iko Houseblend, NORMAL";
    }

    //COnstructor with Size
    public Houseblend(Size s){

        String size="NORMAL";

        if(s== Size.BIG)
            size="BIG";
        else
        if(s==Size.SMALL)
            size="SMALL";

        description=" Theo-iko Houseblend, "+size;
        setSize(s);
    }

    @Override
    public double cost() {
        return 0.99+getSizeCost();
    }
}
