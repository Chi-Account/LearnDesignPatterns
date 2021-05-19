package chi.learndesignpatterns.strategypattern.game.weapon;

public class Axe implements Weapon {

    @Override
    public void attack() {
        System.out.println("Hack!");
    }
}
