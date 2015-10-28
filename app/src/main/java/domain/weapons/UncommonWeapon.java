package domain.weapons;

import android.graphics.Color;

import java.io.Serializable;

import domain.others.Elements;
import domain.others.Perks;

/**
 * Created by Gustavo on 07/06/2015
 */
public class UncommonWeapon extends Weapon implements Serializable{

    public UncommonWeapon(String name, String type, String attack, int image, Elements element,WeaponAttributes attributes, Perks perks) {
        super(name, type, attack, image, element, attributes, null, perks);
    }

    @Override
    public int color(){
        return Color.rgb(54, 111, 66);
    }
}
