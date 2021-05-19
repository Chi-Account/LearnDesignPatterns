package chi.learndesignpatterns.decoratorpattern.starbuzz.condiment;

import chi.learndesignpatterns.decoratorpattern.starbuzz.beverage.Beverage;

public class Milk extends CondimentDecorator {

    public Milk(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }

    @Override
    public double cost() {
        return 0.10 + beverage.cost();
    }
}
