package AbstractFactory_FactoryMethodPattern.Pizza;

import AbstractFactory_FactoryMethodPattern.Pizza.Ingridients.Sauce;
import AbstractFactory_FactoryMethodPattern.Pizza.PizzaIngredientFactory.PizzaIngridientFactory;

/**
 * Created by theo on 6/22/16.
 */
public class CheesePizza extends Pizza {

    /*To create pizza we need an Ingredient Factory*/
    PizzaIngridientFactory ingridientFactory;

    public CheesePizza(PizzaIngridientFactory pizzaIngridientFactory) {
        name="Cheese";
        ingridientFactory=pizzaIngridientFactory;
    }

    @Override
    public double cost() {
        return 7.99;
    }

    @Override
    void prepare() {
        System.out.println("Preparing "+name);
        dough=ingridientFactory.createDough();
        sauce=ingridientFactory.createSauce();
        cheese=ingridientFactory.createCheese();
    }


}
