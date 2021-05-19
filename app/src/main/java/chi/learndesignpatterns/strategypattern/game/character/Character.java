package chi.learndesignpatterns.strategypattern.game.character;

import chi.learndesignpatterns.strategypattern.game.weapon.Weapon;

public abstract class Character {

    protected Weapon weapon;

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void fight() {
        weapon.attack();
    }
}
