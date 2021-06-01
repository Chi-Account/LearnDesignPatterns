package chi.learndesignpatterns.factorypattern.pizza.ingredient;

import chi.learndesignpatterns.factorypattern.pizza.ingredient.cheese.Cheese;
import chi.learndesignpatterns.factorypattern.pizza.ingredient.clam.Clam;
import chi.learndesignpatterns.factorypattern.pizza.ingredient.dough.Dough;
import chi.learndesignpatterns.factorypattern.pizza.ingredient.pepperoni.Pepperoni;
import chi.learndesignpatterns.factorypattern.pizza.ingredient.pepperoni.SlicedPepperoni;
import chi.learndesignpatterns.factorypattern.pizza.ingredient.sauce.Sauce;
import chi.learndesignpatterns.factorypattern.pizza.ingredient.veggie.Garlic;
import chi.learndesignpatterns.factorypattern.pizza.ingredient.veggie.Mushroom;
import chi.learndesignpatterns.factorypattern.pizza.ingredient.veggie.Onion;
import chi.learndesignpatterns.factorypattern.pizza.ingredient.veggie.RedPepper;
import chi.learndesignpatterns.factorypattern.pizza.ingredient.veggie.Veggie;
import chi.learndesignpatterns.factorypattern.pizza.ingredient.clam.FreshClam;
import chi.learndesignpatterns.factorypattern.pizza.ingredient.sauce.MarinaraSauce;
import chi.learndesignpatterns.factorypattern.pizza.ingredient.cheese.ReggianoCheese;
import chi.learndesignpatterns.factorypattern.pizza.ingredient.dough.ThinCrustDough;

public class NewYorkPizzaIngredientFactory extends PizzaIngredientFactory {

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Clam createClam() {
        return new FreshClam();
    }

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Veggie[] createVeggies() {
        return new Veggie[]{
                new Garlic(),
                new Onion(),
                new Mushroom(),
                new RedPepper()
        };
    }
}
