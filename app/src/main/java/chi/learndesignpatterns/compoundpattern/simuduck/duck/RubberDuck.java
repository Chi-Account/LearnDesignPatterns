package chi.learndesignpatterns.compoundpattern.simuduck.duck;

import chi.learndesignpatterns.compoundpattern.simuduck.observer.QuackObservableImpl;
import chi.learndesignpatterns.compoundpattern.simuduck.observer.QuackObserver;
import chi.learndesignpatterns.compoundpattern.simuduck.quackable.Quackable;

public class RubberDuck implements Quackable {

    private QuackObservableImpl observable;

    public RubberDuck() {
        observable = new QuackObservableImpl(this);
    }

    @Override
    public void quack() {
        System.out.println("Squeak");
        notifyObservers();
    }

    @Override
    public void registerObserver(QuackObserver observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }

    @Override
    public String toString() {
        return "Rubber Duck";
    }
}
