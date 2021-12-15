package chi.learndesignpatterns.compoundpattern.simuduck.factory;

import chi.learndesignpatterns.compoundpattern.simuduck.decorator.QuackCounter;
import chi.learndesignpatterns.compoundpattern.simuduck.quackable.Quackable;
import chi.learndesignpatterns.compoundpattern.simuduck.duck.DuckCall;
import chi.learndesignpatterns.compoundpattern.simuduck.duck.MallardDuck;
import chi.learndesignpatterns.compoundpattern.simuduck.duck.RedheadDuck;
import chi.learndesignpatterns.compoundpattern.simuduck.duck.RubberDuck;

public class CountingDuckFactory extends AbstractDuckFactory {

    @Override
    public Quackable createMallardDuck() {
        return new QuackCounter(new MallardDuck());
    }

    @Override
    public Quackable createRedheadDuck() {
        return new QuackCounter(new RedheadDuck());
    }

    @Override
    public Quackable createDuckCall() {
        return new QuackCounter(new DuckCall());
    }

    @Override
    public Quackable createRubberDuck() {
        return new QuackCounter(new RubberDuck());
    }
}
