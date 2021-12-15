package chi.learndesignpatterns.compoundpattern.simuduck.adapter;

import chi.learndesignpatterns.compoundpattern.simuduck.observer.QuackObserver;
import chi.learndesignpatterns.compoundpattern.simuduck.quackable.Quackable;

public class GooseAdapter implements Quackable {

    private Goose goose;

    public GooseAdapter(Goose goose) {
        this.goose = goose;
    }

    @Override
    public void quack() {
        goose.honk();
    }

    @Override
    public void registerObserver(QuackObserver observer) {
    }

    @Override
    public void notifyObservers() {
    }

    @Override
    public String toString() {
        return "Goose Adapter";
    }
}
