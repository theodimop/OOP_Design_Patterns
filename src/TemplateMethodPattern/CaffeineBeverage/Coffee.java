package TemplateMethodPattern.CaffeineBeverage;

/**
 * Created by theo on 8/30/16.
 */
public class Coffee extends CaffeineBeverage {
    @Override
    void brew() {
        brewCoffeeGrinds();
    }

    @Override
    void addCondiments() {
        addSugarAndMilk();
    }


    private void brewCoffeeGrinds() {
        System.out.println("Dripping coffee through filter.");
    }

    private void addSugarAndMilk() {
        System.out.println("Adding sugar and milk.");
    }
}
