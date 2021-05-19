package chi.learndesignpatterns.strategypattern.simuduck;

import chi.learndesignpatterns.strategypattern.simuduck.behavior.fly.FlyRocketPowered;
import chi.learndesignpatterns.strategypattern.simuduck.duck.Duck;
import chi.learndesignpatterns.strategypattern.simuduck.duck.MallardDuck;
import chi.learndesignpatterns.strategypattern.simuduck.duck.ModelDuck;

public class MiniDuckSimulator {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
