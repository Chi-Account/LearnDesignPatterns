package chi.learndesignpatterns.compoundpattern.simuduck.observer;

public interface QuackObservable {

    void registerObserver(QuackObserver observer);

    void notifyObservers();
}
