package chi.learndesignpatterns.strategypattern.game.character;

import chi.learndesignpatterns.strategypattern.game.weapon.BowAndArrow;

public class Queen extends Character {

    public Queen() {
        weapon = new BowAndArrow();
    }
}
