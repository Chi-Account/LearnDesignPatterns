package chi.learndesignpatterns.strategypattern.simuduck.duck;

public class DecoyDuck extends Duck {

    @Override
    public void display() {
        System.out.println("I'm a decoy duck.");
    }
}
