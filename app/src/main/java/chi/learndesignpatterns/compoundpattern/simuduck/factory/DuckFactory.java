package chi.learndesignpatterns.compoundpattern.simuduck.factory;

import chi.learndesignpatterns.compoundpattern.simuduck.quackable.Quackable;
import chi.learndesignpatterns.compoundpattern.simuduck.duck.DuckCall;
import chi.learndesignpatterns.compoundpattern.simuduck.duck.MallardDuck;
import chi.learndesignpatterns.compoundpattern.simuduck.duck.RedheadDuck;
import chi.learndesignpatterns.compoundpattern.simuduck.duck.RubberDuck;

public class DuckFactory extends AbstractDuckFactory {

    @Override
    public Quackable createMallardDuck() {
        return new MallardDuck();
    }

    @Override
    public Quackable createRedheadDuck() {
        return new RedheadDuck();
    }

    @Override
    public Quackable createDuckCall() {
        return new DuckCall();
    }

    @Override
    public Quackable createRubberDuck() {
        return new RubberDuck();
    }
}
