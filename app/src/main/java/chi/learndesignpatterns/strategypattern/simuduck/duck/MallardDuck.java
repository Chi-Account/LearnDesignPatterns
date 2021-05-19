package chi.learndesignpatterns.strategypattern.simuduck.duck;

import chi.learndesignpatterns.strategypattern.simuduck.behavior.fly.FlyWithWings;
import chi.learndesignpatterns.strategypattern.simuduck.behavior.quack.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a mallard duck.");
    }
}
