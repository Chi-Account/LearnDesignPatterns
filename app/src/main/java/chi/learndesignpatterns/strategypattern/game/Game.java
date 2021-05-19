package chi.learndesignpatterns.strategypattern.game;

import chi.learndesignpatterns.strategypattern.game.character.Character;
import chi.learndesignpatterns.strategypattern.game.character.Knight;
import chi.learndesignpatterns.strategypattern.game.weapon.BowAndArrow;

public class Game {

    public static void main(String[] args) {
        Character knight = new Knight();
        knight.fight();
        knight.setWeapon(new BowAndArrow());
        knight.fight();
    }
}
