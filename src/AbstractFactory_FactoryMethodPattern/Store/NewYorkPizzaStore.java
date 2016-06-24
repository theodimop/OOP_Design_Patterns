package AbstractFactory_FactoryMethodPattern.Store;

import AbstractFactory_FactoryMethodPattern.Pizza.*;
import AbstractFactory_FactoryMethodPattern.Pizza.PizzaIngredientFactory.NewYorkPizzaIngredientFactory;
import AbstractFactory_FactoryMethodPattern.Pizza.PizzaIngredientFactory.PizzaIngridientFactory;

/**
 * Created by theo on 6/22/16.
 */
public class NewYorkPizzaStore extends PizzaStore{


    @Override
    Pizza createPizza(String type) {
        PizzaIngridientFactory nyPizzaIngredientFactory=new NewYorkPizzaIngredientFactory();

        switch (type.trim()){
            case "Cheese":
                return new CheesePizza(nyPizzaIngredientFactory);
            case "Clam":
                return new ClamPizza(nyPizzaIngredientFactory);
        }
        return null;
    }
}
