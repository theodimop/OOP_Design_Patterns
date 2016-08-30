package TemplateMethodPattern.CaffeineBeverage.WithHook;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by theo on 8/30/16.
 */
public class TeaWithHook  extends CaffeineBeverageWithHook{
    @Override
    void brew() {
        System.out.println("Steeping bag.");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding lemon to tea.");
    }

    //THe hook here is if the customer wants lemon...
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

        System.out.println("Would you like lemon to your tea? (Y/N)");

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
