package AbstractFactory_FactoryMethodPattern.Factories;

import AbstractFactory_FactoryMethodPattern.Pizza.*;

/**
 * Created by theo on 6/22/16.
 */

/*I dont want to your just Factory classes
 *because ends up to give the ability to the
 * franchisers change the preparation, bake and
 * other processes...
  */
@Deprecated
public abstract class SimplePizzaFactory {

    public static Pizza createPizza(String type){

        switch (type.trim()){
            case "Cheese":
                //return new CheesePizza();
            case "Clam":
                //return new ClamPizza();

        }
        return null;

    }

}
