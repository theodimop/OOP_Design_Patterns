package DecoratorPattern.CafeExample.Drinks;

import DecoratorPattern.CafeExample.Beverage;

/**
 * Created by theo on 6/16/16.
 */
public class Decaf extends Beverage {

    public Decaf(){
        description=" Theo-iko Decaf, NORMAL";
    }

    //COnstructor with Size
    public Decaf(Size s){
        String size="NORMAL";

        if(s== Size.BIG)
            size="BIG";
        else
        if(s==Size.SMALL)
            size="SMALL";

        description=" Theo-iko Decaf, "+size;
        setSize(s);
    }

    @Override
    public double cost() {

        return 1.05+getSizeCost();

    }
}
