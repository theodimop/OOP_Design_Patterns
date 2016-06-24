package AbstractFactory_FactoryMethodPattern.Pizza.PizzaIngredientFactory;

import AbstractFactory_FactoryMethodPattern.Pizza.Ingridients.*;

/**
 * Created by theo on 6/24/16.
 */
/*Abstract factory pattern
* Provides an interface toisupply concrete IngredientFactories */
public interface PizzaIngridientFactory {

    Sauce createSauce();
    Dough createDough();
    Cheese createCheese();
    Veggies[] createVeggies();
    Pepperoni createPepperoni();
    Clam createClam();
}
