package chi.learndesignpatterns.factorypattern.pizza.pizza;

import chi.learndesignpatterns.factorypattern.pizza.ingredient.PizzaIngredientFactory;

public class GreekPizza extends Pizza {

    private PizzaIngredientFactory pizzaIngredientFactory;

    public GreekPizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
    }
}
