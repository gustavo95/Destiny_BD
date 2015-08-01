package domain.armors;

import java.io.Serializable;

/**
 * Created by Gustavo on 01/08/2015
 */
public class ArmorAttributes implements Serializable {
    private int light;
    private int intellect;
    private int discipline;
    private int strength;

    public ArmorAttributes(int light, int intellect, int discipline, int strength) {
        this.light = light;
        this.intellect = intellect;
        this.discipline = discipline;
        this.strength = strength;
    }

    public int getLight() {
        return light;
    }

    public int getIntellect() {
        return intellect;
    }

    public int getDiscipline() {
        return discipline;
    }

    public int getStrength() {
        return strength;
    }
}
