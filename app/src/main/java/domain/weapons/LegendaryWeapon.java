package domain.weapons;

import android.graphics.Color;

import java.io.Serializable;

import domain.Elements;
import domain.Perks;

/**
 * Created by Gustavo on 07/06/2015
 */
public class LegendaryWeapon extends Weapon implements Serializable{;

    public LegendaryWeapon(String name, String type, String attack, int image, Elements element, WeaponAttributes attributes, String location, Perks perks) {
        super(name, type, attack, image, element, attributes, location, perks);
    }

    @Override
    public int color(){
        return Color.rgb(82, 47, 101);
    }
}
