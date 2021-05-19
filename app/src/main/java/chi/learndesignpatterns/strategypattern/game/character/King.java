package chi.learndesignpatterns.strategypattern.game.character;

import chi.learndesignpatterns.strategypattern.game.weapon.Knife;

public class King extends Character {

    public King() {
        weapon = new Knife();
    }
}
