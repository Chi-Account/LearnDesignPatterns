package chi.learndesignpatterns.templatemethodpattern.beverage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Coffee extends CaffeineBeverage {

    @Override
    protected boolean customerWantsCondiments() {
        String answer = getUserInput();
        if (answer.toLowerCase().startsWith("y")) {
            return true;
        } else {
            return false;
        }
    }

    private String getUserInput() {
        String answer = null;

        System.out.println("Would you like milk and sugar with your coffee (y/n)?");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = bufferedReader.readLine();
        } catch (IOException e) {
            System.err.println("IO error trying to read your answer");
        }

        if (answer == null) {
            answer = "no";
        }
        return answer;
    }

    @Override
    protected void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }
}
