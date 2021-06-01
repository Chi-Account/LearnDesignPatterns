package chi.learndesignpatterns.factorypattern.pizza;

import chi.learndesignpatterns.factorypattern.pizza.pizza.Pizza;
import chi.learndesignpatterns.factorypattern.pizza.pizza.PizzaType;
import chi.learndesignpatterns.factorypattern.pizza.pizzastore.ChicagoPizzaStore;
import chi.learndesignpatterns.factorypattern.pizza.pizzastore.NewYorkPizzaStore;
import chi.learndesignpatterns.factorypattern.pizza.pizzastore.PizzaStore;

public class PizzaTestDrive {

    public static void main(String[] args) {
        Pizza pizza;

        PizzaStore newYorkPizzaStore = new NewYorkPizzaStore();
        pizza = newYorkPizzaStore.orderPizza(PizzaType.CHEESE);
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        pizza = chicagoPizzaStore.orderPizza(PizzaType.CHEESE);
        System.out.println("Joel ordered a " + pizza.getName() + "\n");
    }
}
