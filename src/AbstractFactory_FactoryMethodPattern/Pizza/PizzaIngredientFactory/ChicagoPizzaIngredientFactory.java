package AbstractFactory_FactoryMethodPattern.Pizza.PizzaIngredientFactory;

import AbstractFactory_FactoryMethodPattern.Pizza.Ingridients.*;

/**
 * Created by theo on 6/24/16.
 */
public class ChicagoPizzaIngredientFactory implements PizzaIngridientFactory {
    @Override
    public Sauce createSauce() {
        return new Sauce();
    }

    @Override
    public Dough createDough() {
        return new Dough();
    }

    @Override
    public Cheese createCheese() {
        return new Cheese();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[0];
    }

    @Override
    public Pepperoni createPepperoni() {
        return new Pepperoni();
    }

    @Override
    public Clam createClam() {
        return new Clam();
    }
}
