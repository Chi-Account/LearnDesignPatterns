package chi.learndesignpatterns.adapterpattern;

import chi.learndesignpatterns.adapterpattern.adapter.Turkey2DuckAdapter;
import chi.learndesignpatterns.adapterpattern.duck.Duck;
import chi.learndesignpatterns.adapterpattern.duck.MallardDuck;
import chi.learndesignpatterns.adapterpattern.turkey.Turkey;
import chi.learndesignpatterns.adapterpattern.turkey.WildTurkey;

public class DuckTestDrive {

    public static void main(String[] args) {
        Turkey turkey = new WildTurkey();
        System.out.println("The Turkey says...");
        turkey.gobble();
        turkey.fly();

        Duck duck = new MallardDuck();
        System.out.println("\nThe Duck says...");
        testDuck(duck);

        Turkey2DuckAdapter turkey2DuckAdapter = new Turkey2DuckAdapter(turkey);
        System.out.println("\nThe Adapter says...");
        testDuck(turkey2DuckAdapter);
    }

    private static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
