package domain.weapons;

import domain.Elements;
import domain.Perks;

/**
 * Created by Gustavo on 07/06/2015
 */
public class LegendaryWeapon extends Weapon {
    private String location;
    private Perks perks;

    public LegendaryWeapon(String name, WeaponType type, int attackMin, int image, Elements element, WeaponAttributes attributes, String location, Perks perks) {
        super(name, type, attackMin, 365, image, element, attributes);
        this.location = location;
        this.perks = perks;
    }

    public String getLocation() {
        return location;
    }

    public Perks getPerks() {
        return perks;
    }
}
