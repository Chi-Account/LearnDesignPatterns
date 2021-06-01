package chi.learndesignpatterns.factorypattern.pizza.pizzastore;

import chi.learndesignpatterns.factorypattern.pizza.ingredient.ChicagoPizzaIngredientFactory;
import chi.learndesignpatterns.factorypattern.pizza.ingredient.PizzaIngredientFactory;
import chi.learndesignpatterns.factorypattern.pizza.pizza.CheesePizza;
import chi.learndesignpatterns.factorypattern.pizza.pizza.ClamPizza;
import chi.learndesignpatterns.factorypattern.pizza.pizza.GreekPizza;
import chi.learndesignpatterns.factorypattern.pizza.pizza.PepperoniPizza;
import chi.learndesignpatterns.factorypattern.pizza.pizza.Pizza;
import chi.learndesignpatterns.factorypattern.pizza.pizza.PizzaType;
import chi.learndesignpatterns.factorypattern.pizza.pizza.VeggiePizza;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(PizzaType pizzaType) {
        Pizza pizza;
        PizzaIngredientFactory pizzaIngredientFactory = new ChicagoPizzaIngredientFactory();
        switch (pizzaType) {
            case CHEESE:
                pizza = new CheesePizza(pizzaIngredientFactory);
                pizza.setName("Chicago Style Cheese Pizza");
                break;
            case CLAM:
                pizza = new ClamPizza(pizzaIngredientFactory);
                pizza.setName("Chicago Style Clam Pizza");
                break;
            case GREEK:
                pizza = new GreekPizza(pizzaIngredientFactory);
                pizza.setName("Chicago Style Greek Pizza");
                break;
            case PEPPERONI:
                pizza = new PepperoniPizza(pizzaIngredientFactory);
                pizza.setName("Chicago Style Pepperoni Pizza");
                break;
            case VEGGIE:
                pizza = new VeggiePizza(pizzaIngredientFactory);
                pizza.setName("Chicago Style Veggie Pizza");
                break;
            default:
                pizza = null;
        }
        return pizza;
    }
}
