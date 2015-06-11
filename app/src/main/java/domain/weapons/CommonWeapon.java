package domain.weapons;

import android.graphics.Color;

import domain.Elements;

/**
 * Created by Gustavo on 07/06/2015
 */
public class CommonWeapon extends Weapon{
    public CommonWeapon(String name, String type, String attack, int image, WeaponAttributes attributes) {
        super(name, type, attack, image, Elements.cinetic, attributes);
    }

    @Override
    public int color(){
        return Color.rgb(195, 188, 180);
    }
}
