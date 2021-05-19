package chi.learndesignpatterns.strategypattern.simuduck.duck;

import chi.learndesignpatterns.strategypattern.simuduck.behavior.fly.FlyNoWay;
import chi.learndesignpatterns.strategypattern.simuduck.behavior.quack.Quack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck.");
    }
}
