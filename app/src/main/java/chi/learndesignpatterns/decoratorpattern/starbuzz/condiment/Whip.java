package chi.learndesignpatterns.decoratorpattern.starbuzz.condiment;

import chi.learndesignpatterns.decoratorpattern.starbuzz.beverage.Beverage;

public class Whip extends CondimentDecorator {

    public Whip(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return 0.10 + beverage.cost();
    }
}
