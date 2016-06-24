package AbstractFactory_FactoryMethodPattern.Pizza;

/**
 * Created by theo on 6/22/16.
 */
@Deprecated
public class ChicagoStylePizza extends Pizza {

    public ChicagoStylePizza(){
        name="Chicago Style";
    }

    @Override
    public double cost() {
        return 8.99;
    }

    @Override
    public void prepare() {

    }
}
