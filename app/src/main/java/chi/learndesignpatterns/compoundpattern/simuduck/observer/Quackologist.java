package chi.learndesignpatterns.compoundpattern.simuduck.observer;

public class Quackologist implements QuackObserver {

    @Override
    public void update(QuackObservable quackObservable) {
        System.out.println("Quackologist: " + quackObservable + " just quacked.");
    }
}
