package domain.weapons;

import android.graphics.Color;

import java.io.Serializable;

import domain.others.Elements;

/**
 * Created by Gustavo on 07/06/2015
 */
public class CommonWeapon extends Weapon implements Serializable{
    public CommonWeapon(String name, String type, String attack, int image, WeaponAttributes attributes) {
        super(name, type, attack, image, Elements.kinetic, attributes, null, null);
    }

    @Override
    public int color(){
        return Color.rgb(195, 188, 180);
    }
}
