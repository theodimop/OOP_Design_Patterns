package TemplateMethodPattern.CaffeineBeverage.WithHook;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by theo on 8/30/16.
 */
public class CoffeeWithHook extends  CaffeineBeverageWithHook {
    @Override
    void brew() {
        System.out.println("Dripping coffee through filter.");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding sugar and milk.");
    }

    @Override
    boolean customerWantsCondiments(){
        String answer = getUserInput();
        if(answer.toLowerCase().startsWith("y"))
            return true;
        else
            return false;


    }

    private String getUserInput() {
        String answer = null;

        System.out.println("Would you like sugar and milk to your coffee? (Y/N)");

        BufferedReader in =new BufferedReader(new InputStreamReader(System.in));

        try {
            answer=in.readLine();
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        if(answer==null)
            answer="no";

        return answer;
    }
}
