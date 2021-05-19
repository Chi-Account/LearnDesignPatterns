package chi.learndesignpatterns.strategypattern.game.character;

import chi.learndesignpatterns.strategypattern.game.weapon.Axe;

public class Troll extends Character {

    public Troll() {
        weapon = new Axe();
    }
}
