package chi.learndesignpatterns.factorypattern.pizza.ingredient;

import chi.learndesignpatterns.factorypattern.pizza.ingredient.cheese.Cheese;
import chi.learndesignpatterns.factorypattern.pizza.ingredient.cheese.GoatCheese;
import chi.learndesignpatterns.factorypattern.pizza.ingredient.clam.Calamari;
import chi.learndesignpatterns.factorypattern.pizza.ingredient.clam.Clam;
import chi.learndesignpatterns.factorypattern.pizza.ingredient.dough.Dough;
import chi.learndesignpatterns.factorypattern.pizza.ingredient.dough.VeryThinCrustDough;
import chi.learndesignpatterns.factorypattern.pizza.ingredient.pepperoni.Pepperoni;
import chi.learndesignpatterns.factorypattern.pizza.ingredient.pepperoni.SlicedPepperoni;
import chi.learndesignpatterns.factorypattern.pizza.ingredient.sauce.BruschettaSauce;
import chi.learndesignpatterns.factorypattern.pizza.ingredient.sauce.Sauce;
import chi.learndesignpatterns.factorypattern.pizza.ingredient.veggie.Veggie;

public class CaliforniaPizzaIngredientFactory extends PizzaIngredientFactory {

    @Override
    public Cheese createCheese() {
        return new GoatCheese();
    }

    @Override
    public Clam createClam() {
        return new Calamari();
    }

    @Override
    public Dough createDough() {
        return new VeryThinCrustDough();
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Sauce createSauce() {
        return new BruschettaSauce();
    }

    @Override
    public Veggie[] createVeggies() {
        return null;
    }
}
