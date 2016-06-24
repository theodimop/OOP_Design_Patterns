package AbstractFactory_FactoryMethodPattern.Pizza.PizzaIngredientFactory;

import AbstractFactory_FactoryMethodPattern.Pizza.Ingridients.*;
import AbstractFactory_FactoryMethodPattern.Pizza.Ingridients.Abstract.*;

/*New York Pizza Store needs only to know how they should create Pizza's*/

public class NewYorkPizzaIngredientFactory implements PizzaIngridientFactory {
    @Override
    public Sauce createSauce(){ return new MarinaraSauce();}
    @Override
    public Dough createDough(){
        System.out.println("Creating New York style dough...");
        return new ThinCrustDough();}
    @Override
    public Cheese createCheese(){return new RegianoCheese();}
    @Override
    public Veggies[] createVeggies(){return new SlicedVeggies[0];}
    @Override
    public Pepperoni createPepperoni(){return new SlicedPepperoni();}
    @Override
    public Clam createClam() {
        return new FreshClam();
    }
}
