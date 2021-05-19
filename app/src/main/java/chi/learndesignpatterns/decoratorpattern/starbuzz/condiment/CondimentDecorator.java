package chi.learndesignpatterns.decoratorpattern.starbuzz.condiment;

import chi.learndesignpatterns.decoratorpattern.starbuzz.beverage.Beverage;

public abstract class CondimentDecorator extends Beverage {

    protected Beverage beverage;

    public CondimentDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public abstract String getDescription();

    @Override
    public Size getSize() {
        return beverage.getSize();
    }
}
