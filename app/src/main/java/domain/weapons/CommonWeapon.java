package domain.weapons;

import domain.Elements;
import domain.Perks;

/**
 * Created by Gustavo on 07/06/2015
 */
public class CommonWeapon extends Weapon{
    public CommonWeapon(String name, WeaponType type, int attackMin, int image, Elements element, WeaponAttributes attributes, Perks perks) {
        super(name, type, attackMin, attackMin, image, element, attributes);
    }
}
