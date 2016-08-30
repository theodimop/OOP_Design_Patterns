package TemplateMethodPattern.CaffeineBeverage.WithHook;

/**
 * Created by theo on 8/30/16.
 */
public abstract class CaffeineBeverageWithHook {

    //Template Method.
    //Controls the algorithm and lets the subclass to do the job
    //where it is needed
    final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        if(customerWantsCondiments())
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

    //Default implementation
    boolean customerWantsCondiments(){
        return true;
    }

}
