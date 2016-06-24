package DecoratorPattern.CafeExample;


public abstract class  CondimentDecorator extends Beverage {

    public Beverage beverage;

    public abstract String getDescription();
    public abstract double cost();
}
