package TemplateMethodPattern.CaffeineBeverage;

/**
 * Created by theo on 8/30/16.
 * This class is responsible for creating tea and
 * coffee.
 * The procedure is similar. The commonities will take place here
 * and the subclasses will be responsible for building the differencies
 */
public abstract class CaffeineBeverage {

    //Template Method.
    //Controls the algorithm and lets the subclass to do the job
    //where it is needed
    final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        addCondiments();

    }
    //defined method because its the same for both coffee and tea
    private void boilWater() {
        System.out.println("Boiling water.");
    }
    //abstract, the subclass will provide its function
    abstract void brew();
    //defined...
    private void pourInCup(){
        System.out.println("Pouring hot water in cup.");
    }
    //abstract...
    abstract void addCondiments();

}
