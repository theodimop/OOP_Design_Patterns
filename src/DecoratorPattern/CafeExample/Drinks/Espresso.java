package DecoratorPattern.CafeExample.Drinks;

import DecoratorPattern.CafeExample.Beverage;

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

        String size="NORMAL";

        if(s== Size.BIG)
            size="BIG";
        else
            if(s==Size.SMALL)
                size="SMALL";


        description=" Theo-iko Espresso, "+size;
        setSize(s);
    }



    @Override
    public double cost() {
        return 1.99+getSizeCost();
    }
}
