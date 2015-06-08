package domain.weapons;

import domain.Elements;
import domain.Perks;

/**
 * Created by Gustavo on 07/06/2015
 */
public class UncommonWeapon extends Weapon{
    private Perks perks;

    public UncommonWeapon(String name, WeaponType type, int attackMin, int image, Elements element, WeaponAttributes attributes, Perks perks) {
        super(name, type, attackMin, attackMin, image, element, attributes);
        this.perks = perks;
    }

    public Perks getPerks() {
        return perks;
    }
}
