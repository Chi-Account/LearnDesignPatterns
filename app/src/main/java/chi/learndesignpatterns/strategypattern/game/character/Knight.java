package chi.learndesignpatterns.strategypattern.game.character;

import chi.learndesignpatterns.strategypattern.game.weapon.Sword;

public class Knight extends Character {

    public Knight() {
        weapon = new Sword();
    }
}
