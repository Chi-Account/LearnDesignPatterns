package chi.learndesignpatterns.compoundpattern.simuduck.quackable;

import chi.learndesignpatterns.compoundpattern.simuduck.observer.QuackObservable;

public interface Quackable extends QuackObservable {

    void quack();
}
