package chi.learndesignpatterns.strategypattern.simuduck.behavior.quack;

public class Squeak implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
