package AbstractFactory_FactoryMethodPattern.Pizza.PizzaIngredientFactory;

import AbstractFactory_FactoryMethodPattern.Pizza.Ingridients.Abstract.*;

/**
 * Created by theo on 6/24/16.
 */
/*Abstract factory pattern:
*
* Provides an interface for creating a family of related or dependened objects (here ingredients) without
* specifying concrete classes*/
public interface PizzaIngridientFactory {

    Sauce createSauce();
    Dough createDough();
    Cheese createCheese();
    Veggies[] createVeggies();
    Pepperoni createPepperoni();
    Clam createClam();
}
