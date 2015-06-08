package domain.weapons;

import domain.Elements;

/**
 * Created by Gustavo on 06/06/2015
 */
public class Weapon {

    private String name;
    private WeaponType type;
    private int attackMin;
    private int attackMax;
    private int image;
    private Elements element;
    private WeaponAttributes attributes;

    public Weapon(String name, WeaponType type, int attackMin, int attackMax, int image, Elements element, WeaponAttributes attributes) {
        this.name = name;
        this.type = type;
        this.attackMin = attackMin;
        this.attackMax = attackMax;
        this.image = image;
        this.element = element;
        this.attributes = attributes;
    }

    public String getName() {
        return name;
    }

    public WeaponType getType() {
        return type;
    }

    public int getAttackMin() {
        return attackMin;
    }

    public int getAttackMax() {
        return attackMax;
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

}
