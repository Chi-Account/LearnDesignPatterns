package chi.learndesignpatterns.factorypattern.pizza.pizza;

import java.util.Arrays;

import chi.learndesignpatterns.factorypattern.pizza.ingredient.cheese.Cheese;
import chi.learndesignpatterns.factorypattern.pizza.ingredient.clam.Clam;
import chi.learndesignpatterns.factorypattern.pizza.ingredient.dough.Dough;
import chi.learndesignpatterns.factorypattern.pizza.ingredient.pepperoni.Pepperoni;
import chi.learndesignpatterns.factorypattern.pizza.ingredient.sauce.Sauce;
import chi.learndesignpatterns.factorypattern.pizza.ingredient.veggie.Veggie;

public abstract class Pizza {

    protected String name;

    protected Cheese cheese;

    protected Clam clam;

    protected Dough dough;

    protected Pepperoni pepperoni;

    protected Sauce sauce;

    protected Veggie[] veggies;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void prepare();

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", cheese=" + cheese +
                ", clam=" + clam +
                ", dough=" + dough +
                ", pepperoni=" + pepperoni +
                ", sauce=" + sauce +
                ", veggies=" + Arrays.toString(veggies) +
                '}';
    }
}
