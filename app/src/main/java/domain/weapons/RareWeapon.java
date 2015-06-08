package domain.weapons;

import domain.Elements;
import domain.Perks;

/**
 * Created by Gustavo on 07/06/2015
 */
public class RareWeapon extends Weapon {
    private Perks perks;

    public RareWeapon(String name, WeaponType type, int attackMin, int attackMax, int image, Elements element, WeaponAttributes attributes) {
        super(name, type, attackMin, attackMax, image, element, attributes);
        this.perks = new Perks("Esse item possui uma melhoria aleatoria","","");
    }

    public Perks getPerks() {
        return perks;
    }
}
