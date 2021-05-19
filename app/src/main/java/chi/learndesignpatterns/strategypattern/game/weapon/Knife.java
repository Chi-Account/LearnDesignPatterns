package chi.learndesignpatterns.strategypattern.game.weapon;

public class Knife implements Weapon {

    @Override
    public void attack() {
        System.out.println("Stab!");
    }
}
