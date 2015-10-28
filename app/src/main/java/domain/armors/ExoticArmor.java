package domain.armors;

import android.graphics.Color;

import java.io.Serializable;

import domain.others.Perks;

/**
 * Created by Gustavo on 01/08/2015
 */
public class ExoticArmor  extends Armor implements Serializable{
    public ExoticArmor(String name, String defense, int image, ArmorAttributes attributes, String location, Perks perks) {
        super(name, defense, image, attributes, location, perks);
    }

    @Override
    public int color(){
        return Color.rgb(206, 174, 51);
    }

}
