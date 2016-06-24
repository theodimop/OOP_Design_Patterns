package AbstractFactory_FactoryMethodPattern.Pizza.PizzaIngredientFactory;

import AbstractFactory_FactoryMethodPattern.Pizza.Ingridients.*;
import AbstractFactory_FactoryMethodPattern.Pizza.Ingridients.Abstract.*;

/**
 * Created by theo on 6/24/16.
 */
public class ChicagoPizzaIngredientFactory implements PizzaIngridientFactory {
    @Override
    public Sauce createSauce() {
        return new PlamPotatoSauce();
    }

    @Override
    public Dough createDough() {

        System.out.println("Creating Chicago style dough...");
        return new ThickCrustDough();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        return new SlicedVeggies[0];
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SpicyPepperoni();
    }

    @Override
    public Clam createClam() {
        return new FrozenClam();
    }
}
