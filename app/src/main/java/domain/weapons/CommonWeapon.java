package domain.weapons;

import android.graphics.Color;

import domain.Elements;

/**
 * Created by Gustavo on 07/06/2015
 */
public class CommonWeapon extends Weapon{
    public CommonWeapon(String name, String type, String attack, int image, Elements element, WeaponAttributes attributes) {
        super(name, type, attack, image, element, attributes);
    }

    @Override
    public int color(){
        return Color.rgb(1000, 1000, 1000);
    }
}
