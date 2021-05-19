package chi.learndesignpatterns.strategypattern.game.weapon;

public class BowAndArrow implements Weapon {

    @Override
    public void attack() {
        System.out.println("Shoot an arrow!");
    }
}
