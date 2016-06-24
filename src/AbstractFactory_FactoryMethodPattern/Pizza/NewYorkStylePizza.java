package AbstractFactory_FactoryMethodPattern.Pizza;

/**
 * Created by theo on 6/22/16.
 */
@Deprecated
public class NewYorkStylePizza extends Pizza {

    public NewYorkStylePizza(){
        name="New York Style";
    }

    @Override
    public double cost() {
        return 8.89;
    }

    @Override
    void prepare() {

    }
}
