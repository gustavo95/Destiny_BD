package domain.weapons;

import java.io.Serializable;

import domain.Elements;

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

    public Weapon(String name, String type, String attack, int image, Elements element, WeaponAttributes attributes) {
        this.name = name;
        this.type = type;
        this.attack = attack;
        this.image = image;
        this.element = element;
        this.attributes = attributes;
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

    public abstract int color();

}
