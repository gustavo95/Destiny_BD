package domain.weapons;

import java.io.Serializable;

import domain.Elements;
import domain.Perks;

/**
 * Created by Gustavo on 06/06/2015
 */
public abstract class Weapon implements Serializable {

    private String name;
    private String type;
    private String attack;
    private int image;
    private Elements element;
    private WeaponAttributes attributes;
    private String location;
    private Perks perks;

    public Weapon(String name, String type, String attack, int image, Elements element, WeaponAttributes attributes, String location, Perks perks) {
        this.name = name;
        this.type = type;
        this.attack = attack;
        this.image = image;
        this.element = element;
        this.attributes = attributes;
        this.location = location;
        this.perks = perks;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getAttack() {
        return attack;
    }

    public int getImage() {
        return image;
    }

    public Elements getElement() {
        return element;
    }

    public WeaponAttributes getAttributes() {
        return attributes;
    }

    public String getLocation() {
        return location;
    }

    public Perks getPerks() {
        return perks;
    }

    public abstract int color();

}
