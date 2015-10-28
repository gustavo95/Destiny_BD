package domain.weapons;

import android.graphics.Color;

import java.io.Serializable;

import domain.others.Elements;
import domain.others.Perks;

/**
 * Created by Gustavo on 06/06/2015
 */
public class ExoticWeapon extends Weapon implements Serializable{

    public ExoticWeapon(String name, String type, String attack, int image, Elements element, WeaponAttributes attributes, String location, Perks perks) {
        super(name, type, attack, image, element, attributes, location, perks);
    }

    @Override
    public int color(){
        return Color.rgb(206,174,51);
    }
}
