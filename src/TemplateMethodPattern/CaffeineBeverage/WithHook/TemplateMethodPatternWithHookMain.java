package TemplateMethodPattern.CaffeineBeverage.WithHook;

/**
 * Created by theo on 8/30/16.
 */
public class TemplateMethodPatternWithHookMain {

    public static void main(String args[]){
        TeaWithHook myTea=new TeaWithHook();
        CoffeeWithHook myCoffee=new CoffeeWithHook();

        myTea.prepareRecipe();
        myCoffee.prepareRecipe();
    }
}
