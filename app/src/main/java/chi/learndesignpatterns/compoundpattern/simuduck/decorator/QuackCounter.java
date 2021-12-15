package chi.learndesignpatterns.compoundpattern.simuduck.decorator;

import chi.learndesignpatterns.compoundpattern.simuduck.observer.QuackObserver;
import chi.learndesignpatterns.compoundpattern.simuduck.quackable.Quackable;

public class QuackCounter implements Quackable {

    private Quackable quackable;

    private static int numberOfQuacks;

    public QuackCounter(Quackable quackable) {
        this.quackable = quackable;
    }

    @Override
    public void quack() {
        quackable.quack();
        numberOfQuacks++;
    }

    public static int getNumberOfQuacks() {
        return numberOfQuacks;
    }

    @Override
    public void registerObserver(QuackObserver observer) {
        quackable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
    }

    @Override
    public String toString() {
        return "Quack Counter";
    }
}
