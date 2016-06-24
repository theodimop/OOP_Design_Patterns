package DecoratorPattern.CafeExample.Condiments;

import DecoratorPattern.CafeExample.Beverage;
import DecoratorPattern.CafeExample.CondimentDecorator;

/**
 * Created by theo on 6/16/16.
 */
public class Soy extends CondimentDecorator {


    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+", Soy";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.2;
    }
}
