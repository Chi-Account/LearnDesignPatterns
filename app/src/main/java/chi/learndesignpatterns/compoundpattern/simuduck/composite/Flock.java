package chi.learndesignpatterns.compoundpattern.simuduck.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import chi.learndesignpatterns.compoundpattern.simuduck.observer.QuackObserver;
import chi.learndesignpatterns.compoundpattern.simuduck.quackable.Quackable;

public class Flock implements Quackable {

    private List<Quackable> quackableList = new ArrayList<>();

    public void add(Quackable quackable) {
        quackableList.add(quackable);
    }

    @Override
    public void quack() {
        Iterator<Quackable> iterator = quackableList.iterator();
        while (iterator.hasNext()) {
            Quackable quackable = iterator.next();
            quackable.quack();
        }
    }

    @Override
    public void registerObserver(QuackObserver observer) {
        Iterator<Quackable> iterator = quackableList.iterator();
        while (iterator.hasNext()) {
            Quackable quackable = iterator.next();
            quackable.registerObserver(observer);
        }
    }

    @Override
    public void notifyObservers() {
    }

    @Override
    public String toString() {
        return "Flock";
    }
}
