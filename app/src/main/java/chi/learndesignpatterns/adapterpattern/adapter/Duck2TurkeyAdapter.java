package chi.learndesignpatterns.adapterpattern.adapter;

import chi.learndesignpatterns.adapterpattern.duck.Duck;
import chi.learndesignpatterns.adapterpattern.turkey.Turkey;

public class Duck2TurkeyAdapter implements Turkey {

    private Duck duck;

    public Duck2TurkeyAdapter(Duck duck) {
        this.duck = duck;
    }

    @Override
    public void gobble() {
        duck.quack();
    }

    @Override
    public void fly() {
        duck.fly();
    }
}
