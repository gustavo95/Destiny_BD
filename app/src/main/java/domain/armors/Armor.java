package domain.armors;

import java.io.Serializable;

import domain.others.Perks;

/**
 * Created by Gustavo on 01/08/2015
 */
public abstract class Armor implements Serializable{

    private String name;
    private String defense;
    private int image;
    private ArmorAttributes attributes;
    private String location;
    private Perks perks;

    public Armor(String name, String defense, int image, ArmorAttributes attributes, String location, Perks perks) {
        this.name = name;
        this.defense = defense;
        this.image = image;
        this.attributes = attributes;
        this.location = location;
        this.perks = perks;
    }

    public String getName() {
        return name;
    }

    public String getDefense() {
        return defense;
    }

    public ArmorAttributes getAttributes() {
        return attributes;
    }

    public int getImage() {
        return image;
    }

    public String getLocation() {
        return location;
    }

    public Perks getPerks() {
        return perks;
    }

    public abstract int color();
}
