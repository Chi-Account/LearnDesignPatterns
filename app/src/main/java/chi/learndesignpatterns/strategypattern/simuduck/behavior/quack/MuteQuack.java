package chi.learndesignpatterns.strategypattern.simuduck.behavior.quack;

public class MuteQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Silence");
    }
}
