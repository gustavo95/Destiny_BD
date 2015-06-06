package domain.weapons;

import domain.Elements;

/**
 * Created by Gustavo on 06/06/2015.
 */
public class Weapon {

    private String name;
    private WeaponType type;
    private String image;
    private String description;
    private Elements element;
    private WeaponAttributes attributes;

    public Weapon(String name, WeaponType type, String image, String description, Elements element, WeaponAttributes attributes) {
        this.name = name;
        this.type = type;
        this.image = image;
        this.description = description;
        this.element = element;
        this.attributes = attributes;
    }

    public String getName() {
        return name;
    }

    public WeaponType getType() {
        return type;
    }

    public String getImage() {
        return image;
    }

    public String getDescription() {
        return description;
    }

    public Elements getElement() {
        return element;
    }

    public WeaponAttributes getAttributes() {
        return attributes;
    }
}
