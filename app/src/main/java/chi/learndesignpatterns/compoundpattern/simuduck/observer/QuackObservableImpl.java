package chi.learndesignpatterns.compoundpattern.simuduck.observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import chi.learndesignpatterns.compoundpattern.simuduck.quackable.Quackable;

public class QuackObservableImpl implements QuackObservable {

    private List<QuackObserver> observerList = new ArrayList<>();

    private Quackable quackable;

    public QuackObservableImpl(Quackable quackable) {
        this.quackable = quackable;
    }

    @Override
    public void registerObserver(QuackObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void notifyObservers() {
        Iterator<QuackObserver> iterator = observerList.iterator();
        while (iterator.hasNext()) {
            QuackObserver observer = iterator.next();
            observer.update(quackable);
        }
    }
}
