package DecoratorPattern.CafeExample.Condiments;

import DecoratorPattern.CafeExample.Beverage;
import DecoratorPattern.CafeExample.CondimentDecorator;

/**
 * Created by theo on 6/16/16.
 */
public class SteamedMilk extends CondimentDecorator {


    public SteamedMilk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+", Steamed Milk";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.1;
    }
}
