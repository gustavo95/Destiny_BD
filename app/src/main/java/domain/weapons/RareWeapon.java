package domain.weapons;

import android.graphics.Color;

import java.io.Serializable;

import domain.Elements;
import domain.Perks;

/**
 * Created by Gustavo on 07/06/2015
 */
public class RareWeapon extends Weapon implements Serializable {

    public RareWeapon(String name, String type, String attack, int image, Elements element, WeaponAttributes attributes) {
        super(name, type, attack, image, element, attributes, null, new Perks("Essa arma possui uma vantagem aleatoria",null,null));
    }

    @Override
    public int color(){
        return Color.rgb(80, 118, 163);
    }
}
