package AbstractFactory_FactoryMethodPattern.Pizza;

import AbstractFactory_FactoryMethodPattern.Pizza.Ingridients.Abstract.*;

/**
 * Created by theo on 6/22/16.
 */
public abstract class Pizza {

    protected String name;
    Dough dough;//Zymh
    Sauce sauce;
    Veggies veggies[];
    Cheese cheese;
    Pepperoni pepperoni;
    Clam clam;//Mydia


    public abstract double cost();

    public  void print(){
        System.out.println("Great "+name+" pizza with only: "+cost()+"$");
    }

    public String getName(){
       return name;
   }


    /*Auxiliary possible methods*/
    public abstract void prepare();
    public void bake(){System.out.println("Bake for 25 minutes at 200");}
    public void cut(){System.out.println("Cutting the pizza into diagonal slices");}
    public void box(){System.out.println("Place pizza in official PizzaStore Box");}
}
