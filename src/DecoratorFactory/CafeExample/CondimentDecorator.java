package DecoratorFactory.CafeExample;

/**
 * Created by theo on 6/16/16.
 */
public abstract class  CondimentDecorator extends Beverage {

    public Beverage beverage;

    public abstract String getDescription();
    public abstract double cost();
}
