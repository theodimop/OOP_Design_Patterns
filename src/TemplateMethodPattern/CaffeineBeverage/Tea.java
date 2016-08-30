package TemplateMethodPattern.CaffeineBeverage;

/**
 * Created by theo on 8/30/16.
 */
public class Tea extends CaffeineBeverage {
    @Override
    void brew() {
        steepTeaBag();
    }
    @Override
    void addCondiments() {
        addLemon();
    }

    private void addLemon() {
        System.out.println("Adding lemon to tea.");
    }

    private void steepTeaBag() {
        System.out.println("Steeping bag.");
    }
    /*
    FInal
    @Override
    void prepareRecipe(){

    }*/

}
