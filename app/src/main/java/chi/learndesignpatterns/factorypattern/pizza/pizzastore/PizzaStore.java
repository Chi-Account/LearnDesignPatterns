package chi.learndesignpatterns.factorypattern.pizza.pizzastore;

import chi.learndesignpatterns.factorypattern.pizza.pizza.Pizza;
import chi.learndesignpatterns.factorypattern.pizza.pizza.PizzaType;

public abstract class PizzaStore {

    public final Pizza orderPizza(PizzaType pizzaType) {
        Pizza pizza = createPizza(pizzaType);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    protected abstract Pizza createPizza(PizzaType pizzaType);
}
