package AbstractFactory_FactoryMethodPattern;

import AbstractFactory_FactoryMethodPattern.Pizza.Pizza;
import AbstractFactory_FactoryMethodPattern.Store.ChicagoPizzaStore;
import AbstractFactory_FactoryMethodPattern.Store.NewYorkPizzaStore;
import AbstractFactory_FactoryMethodPattern.Store.PizzaStore;

/**
 * Page 136.Head first Design Patterns gives an abstract scheme
 * to understand the design of this application
 * ------------------------------------------------------------
 * With this pattern we created a Pizza franchise store
 * without using Factory classes to restrict our franchisers
 * to use their techniques.
 * We used a factory method in the abstract class Pizza store
 * which delegates to the correct local Pizza store which is
 * responsible to create the correct type of pizza
 */

public class MainFactory {

    public static void main(String args[]){
        PizzaStore nYpizzaStore= new NewYorkPizzaStore();

        Pizza pizza =nYpizzaStore.orderPizza("Cheese");
        pizza.print();

        PizzaStore chicagoPizzaStore= new ChicagoPizzaStore();

        pizza= chicagoPizzaStore.orderPizza("Cheese");
        pizza.print();

        pizza = chicagoPizzaStore.orderPizza("Clam");
        pizza.print();

    }

}
