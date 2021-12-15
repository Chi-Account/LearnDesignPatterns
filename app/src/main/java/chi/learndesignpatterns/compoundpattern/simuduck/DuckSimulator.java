package chi.learndesignpatterns.compoundpattern.simuduck;

import chi.learndesignpatterns.compoundpattern.simuduck.factory.AbstractDuckFactory;
import chi.learndesignpatterns.compoundpattern.simuduck.factory.CountingDuckFactory;
import chi.learndesignpatterns.compoundpattern.simuduck.composite.Flock;
import chi.learndesignpatterns.compoundpattern.simuduck.adapter.Goose;
import chi.learndesignpatterns.compoundpattern.simuduck.adapter.GooseAdapter;
import chi.learndesignpatterns.compoundpattern.simuduck.observer.Quackologist;
import chi.learndesignpatterns.compoundpattern.simuduck.decorator.QuackCounter;
import chi.learndesignpatterns.compoundpattern.simuduck.quackable.Quackable;

public class DuckSimulator {

    public static void main(String[] args) {
        DuckSimulator duckSimulator = new DuckSimulator();
        AbstractDuckFactory abstractDuckFactory = new CountingDuckFactory();

        duckSimulator.simulate(abstractDuckFactory);
    }

    public void simulate(AbstractDuckFactory abstractDuckFactory) {
        Quackable redheadDuck = abstractDuckFactory.createRedheadDuck();
        Quackable duckCall = abstractDuckFactory.createDuckCall();
        Quackable rubberDuck = abstractDuckFactory.createRubberDuck();
        Quackable gooseDuck = new GooseAdapter(new Goose());

        Flock flockOfDucks = new Flock();
        flockOfDucks.add(redheadDuck);
        flockOfDucks.add(duckCall);
        flockOfDucks.add(rubberDuck);
        flockOfDucks.add(gooseDuck);

        Quackable mallardDuck = abstractDuckFactory.createMallardDuck();
        Quackable mallardDuck2 = abstractDuckFactory.createMallardDuck();
        Quackable mallardDuck3 = abstractDuckFactory.createMallardDuck();
        Quackable mallardDuck4 = abstractDuckFactory.createMallardDuck();

        Flock flockOfMallardDucks = new Flock();
        flockOfMallardDucks.add(mallardDuck);
        flockOfMallardDucks.add(mallardDuck2);
        flockOfMallardDucks.add(mallardDuck3);
        flockOfMallardDucks.add(mallardDuck4);

        flockOfDucks.add(flockOfMallardDucks);

        System.out.println("\nDuck Simulator: With QuackObserver");
        Quackologist quackologist = new Quackologist();
        flockOfDucks.registerObserver(quackologist);

        simulate(flockOfDucks);

        System.out.println("\nThe ducks quacked " + QuackCounter.getNumberOfQuacks() + " times");
    }

    private void simulate(Quackable quackable) {
        quackable.quack();
    }
}
