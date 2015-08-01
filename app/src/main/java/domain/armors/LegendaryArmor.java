package domain.armors;

import android.graphics.Color;

import java.io.Serializable;

import domain.Perks;

/**
 * Created by Gustavo on 01/08/2015
 */
public class LegendaryArmor extends Armor implements Serializable {
    public LegendaryArmor(String name, String defense, int image, ArmorAttributes attributes, String location, Perks perks) {
        super(name, defense, image, attributes, location, perks);
    }

    @Override
    public int color(){
        return Color.rgb(82, 47, 101);
    }
}
