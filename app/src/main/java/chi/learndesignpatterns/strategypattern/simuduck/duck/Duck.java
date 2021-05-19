package chi.learndesignpatterns.strategypattern.simuduck.duck;

import chi.learndesignpatterns.strategypattern.simuduck.behavior.fly.FlyBehavior;
import chi.learndesignpatterns.strategypattern.simuduck.behavior.quack.QuackBehavior;

public abstract class Duck {

    protected FlyBehavior flyBehavior;

    protected QuackBehavior quackBehavior;

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("I'm swimming!");
    }

    public abstract void display();
}
