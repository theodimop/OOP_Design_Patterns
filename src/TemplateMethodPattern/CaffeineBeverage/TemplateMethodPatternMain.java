package TemplateMethodPattern.CaffeineBeverage;

/**
 * Created by theo on 8/30/16.
 *
 * The template method defines the skeleton of an algorithm in a method
 * deferring some steps to subclasses. THe subclasses redefine some steps
 * without affecting the skeleton of the algorithm.
 */
public class TemplateMethodPatternMain {

    public static void main(String args[]){

        Tea myTea = new Tea();
        Coffee myCoffee = new Coffee();

        myTea.prepareRecipe();
        myCoffee.prepareRecipe();
    }
}
