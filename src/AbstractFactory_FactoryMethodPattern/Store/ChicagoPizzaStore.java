package AbstractFactory_FactoryMethodPattern.Store;

import AbstractFactory_FactoryMethodPattern.Pizza.*;
import AbstractFactory_FactoryMethodPattern.Pizza.PizzaIngredientFactory.ChicagoPizzaIngredientFactory;
import AbstractFactory_FactoryMethodPattern.Pizza.PizzaIngredientFactory.PizzaIngridientFactory;

/**
 * Created by theo on 6/22/16.
 */

/*Chicago Pizza Store needs only to know how they should create Pizza's*/
public class ChicagoPizzaStore extends PizzaStore {

    PizzaIngridientFactory chicagoPizzaIngredientFactory;

    @Override
    Pizza createPizza(String type) {

        chicagoPizzaIngredientFactory = new ChicagoPizzaIngredientFactory();

        switch (type.trim()) {
            case "Cheese":
                return new CheesePizza(chicagoPizzaIngredientFactory);
            case "Clam":
                return new ClamPizza(chicagoPizzaIngredientFactory);
        }
        return null;
    }
}
