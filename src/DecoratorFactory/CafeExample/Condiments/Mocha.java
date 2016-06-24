package DecoratorFactory.CafeExample.Condiments;

import DecoratorFactory.CafeExample.Beverage;
import DecoratorFactory.CafeExample.CondimentDecorator;

/**
 * Created by theo on 6/16/16.
 */
public class Mocha extends CondimentDecorator {


    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+", Mocha";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.2;
    }
}
