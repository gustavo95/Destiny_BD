package domain.weapons;

import domain.Elements;
import domain.Perks;

/**
 * Created by Gustavo on 06/06/2015.
 */
public class ExoticWeapon extends Weapon {
    private int attackMin;
    private int attackMax;
    private String location;
    private Perks perks;

    public ExoticWeapon(String name, WeaponType type, String image, String description, Elements element, WeaponAttributes attributes, int attackMin, int attackMax, String location, Perks perks) {
        super(name, type, image, description, element, attributes);
        this.attackMin = attackMin;
        this.attackMax = attackMax;
        this.location = location;
        this.perks = perks;
    }

    public int getAttackMin() {
        return attackMin;
    }

    public int getAttackMax() {
        return attackMax;
    }

    public String getLocation() {
        return location;
    }

    public Perks getPerks() {
        return perks;
    }
}
