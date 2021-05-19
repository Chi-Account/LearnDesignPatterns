package chi.learndesignpatterns.strategypattern.game.weapon;

public class Sword implements Weapon {

    @Override
    public void attack() {
        System.out.println("Wave!");
    }
}
