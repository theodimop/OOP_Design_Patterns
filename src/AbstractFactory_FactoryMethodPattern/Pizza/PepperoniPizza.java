package AbstractFactory_FactoryMethodPattern.Pizza;

/**
 * Created by theo on 6/22/16.
 */
@Deprecated
public class PepperoniPizza extends Pizza {

    public PepperoniPizza(){
        name="PepperoniPizza";
    }

    @Override
    public double cost() {
        return 6.99;
    }

    @Override
    public void prepare() {

    }
}

