package DecoratorFactory.CafeExample;

import DecoratorFactory.CafeExample.Condiments.Mocha;
import DecoratorFactory.CafeExample.Condiments.Whip;
import DecoratorFactory.CafeExample.Drinks.Decaf;
import DecoratorFactory.CafeExample.Drinks.Espresso;

/**
 * Created by theo on 6/16/16.
 */
public class MainCafe1 {

    public static void main(String arg[]){
        Beverage beverageEspresso = new Espresso();
        System.out.println( beverageEspresso.getDescription()+", "+beverageEspresso.cost() +"\u00A3");


        Beverage beverageDecaf=
                new Mocha(
                    new Whip(
                        new Decaf(Beverage.Size.BIG)
                    )
        );

        System.out.println( beverageDecaf.getDescription()+", "+beverageDecaf.cost() +"\u00A3");

        Beverage beverageDecaf2= new Decaf();
        beverageDecaf2= new Mocha(beverageDecaf2);
        beverageDecaf2= new Whip(beverageDecaf2);

        System.out.println( beverageDecaf2.getDescription()+", "+beverageDecaf2.cost() +"\u00A3");



    }
}
