package chi.learndesignpatterns.factorypattern.pizza.pizzastore;

import chi.learndesignpatterns.factorypattern.pizza.ingredient.CaliforniaPizzaIngredientFactory;
import chi.learndesignpatterns.factorypattern.pizza.ingredient.PizzaIngredientFactory;
import chi.learndesignpatterns.factorypattern.pizza.pizza.CheesePizza;
import chi.learndesignpatterns.factorypattern.pizza.pizza.ClamPizza;
import chi.learndesignpatterns.factorypattern.pizza.pizza.GreekPizza;
import chi.learndesignpatterns.factorypattern.pizza.pizza.PepperoniPizza;
import chi.learndesignpatterns.factorypattern.pizza.pizza.Pizza;
import chi.learndesignpatterns.factorypattern.pizza.pizza.PizzaType;
import chi.learndesignpatterns.factorypattern.pizza.pizza.VeggiePizza;

public class CaliforniaPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(PizzaType pizzaType) {
        Pizza pizza;
        PizzaIngredientFactory pizzaIngredientFactory = new CaliforniaPizzaIngredientFactory();
        switch (pizzaType) {
            case CHEESE:
                pizza = new CheesePizza(pizzaIngredientFactory);
                pizza.setName("California Style Cheese Pizza");
                break;
            case CLAM:
                pizza = new ClamPizza(pizzaIngredientFactory);
                pizza.setName("California Style Clam Pizza");
                break;
            case GREEK:
                pizza = new GreekPizza(pizzaIngredientFactory);
                pizza.setName("California Style Greek Pizza");
                break;
            case PEPPERONI:
                pizza = new PepperoniPizza(pizzaIngredientFactory);
                pizza.setName("California Style Pepperoni Pizza");
                break;
            case VEGGIE:
                pizza = new VeggiePizza(pizzaIngredientFactory);
                pizza.setName("California Style Veggie Pizza");
                break;
            default:
                pizza = null;
        }
        return pizza;
    }
}
