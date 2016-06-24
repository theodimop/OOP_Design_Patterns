package AbstractFactory_FactoryMethodPattern.Pizza;

import AbstractFactory_FactoryMethodPattern.Pizza.Ingridients.Clam;
import AbstractFactory_FactoryMethodPattern.Pizza.PizzaIngredientFactory.PizzaIngridientFactory;

/**
 * Created by theo on 6/24/16.
 */
public class ClamPizza extends Pizza{

    PizzaIngridientFactory ingridientFactory;

    public ClamPizza(PizzaIngridientFactory pizzaIngridientFactory){
        ingridientFactory=pizzaIngridientFactory;
        name="Clam";
    }

    @Override
    public double cost() {
        return 6.45;
    }

    @Override
    public void prepare() {
        System.out.println("\nPreparing Pizza: "+name);
        dough=ingridientFactory.createDough();
        sauce=ingridientFactory.createSauce();
        cheese=ingridientFactory.createCheese();
        clam=ingridientFactory.createClam();
    }
}
