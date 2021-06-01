package chi.learndesignpatterns.factorypattern.pizza.pizza;

import chi.learndesignpatterns.factorypattern.pizza.ingredient.PizzaIngredientFactory;

public class SimplePizzaFactory {

    public Pizza createPizza(PizzaType pizzaType) {
        Pizza pizza;
        PizzaIngredientFactory pizzaIngredientFactory = new PizzaIngredientFactory();
        switch (pizzaType) {
            case CHEESE:
                pizza = new CheesePizza(pizzaIngredientFactory);
                pizza.setName("Cheese Pizza");
                break;
            case CLAM:
                pizza = new ClamPizza(pizzaIngredientFactory);
                pizza.setName("Clam Pizza");
                break;
            case GREEK:
                pizza = new GreekPizza(pizzaIngredientFactory);
                pizza.setName("Greek Pizza");
                break;
            case PEPPERONI:
                pizza = new PepperoniPizza(pizzaIngredientFactory);
                pizza.setName("Pepperoni Pizza");
                break;
            case VEGGIE:
                pizza = new VeggiePizza(pizzaIngredientFactory);
                pizza.setName("Veggie Pizza");
                break;
            default:
                pizza = null;
        }
        return pizza;
    }
}
