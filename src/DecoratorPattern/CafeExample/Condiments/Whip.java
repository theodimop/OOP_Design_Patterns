package DecoratorPattern.CafeExample.Condiments;

import DecoratorPattern.CafeExample.Beverage;
import DecoratorPattern.CafeExample.CondimentDecorator;

/**
 * Created by theo on 6/16/16.
 */
public class Whip extends CondimentDecorator {

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+", Whip";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.2;
    }
}
