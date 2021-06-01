package chi.learndesignpatterns.factorypattern.pizza.ingredient;

import chi.learndesignpatterns.factorypattern.pizza.ingredient.cheese.Cheese;
import chi.learndesignpatterns.factorypattern.pizza.ingredient.clam.FrozenClam;
import chi.learndesignpatterns.factorypattern.pizza.ingredient.cheese.MozzarellaCheese;
import chi.learndesignpatterns.factorypattern.pizza.ingredient.sauce.PlumTomatoSauce;
import chi.learndesignpatterns.factorypattern.pizza.ingredient.dough.ThickCrustDough;
import chi.learndesignpatterns.factorypattern.pizza.ingredient.clam.Clam;
import chi.learndesignpatterns.factorypattern.pizza.ingredient.dough.Dough;
import chi.learndesignpatterns.factorypattern.pizza.ingredient.pepperoni.Pepperoni;
import chi.learndesignpatterns.factorypattern.pizza.ingredient.pepperoni.SlicedPepperoni;
import chi.learndesignpatterns.factorypattern.pizza.ingredient.sauce.Sauce;
import chi.learndesignpatterns.factorypattern.pizza.ingredient.veggie.BlackOlive;
import chi.learndesignpatterns.factorypattern.pizza.ingredient.veggie.Eggplant;
import chi.learndesignpatterns.factorypattern.pizza.ingredient.veggie.Spinach;
import chi.learndesignpatterns.factorypattern.pizza.ingredient.veggie.Veggie;

public class ChicagoPizzaIngredientFactory extends PizzaIngredientFactory {

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Clam createClam() {
        return new FrozenClam();
    }

    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Veggie[] createVeggies() {
        return new Veggie[]{
                new BlackOlive(),
                new Eggplant(),
                new Spinach()
        };
    }
}
