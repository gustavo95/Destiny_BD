package domain.weapons;

import android.graphics.Color;

import java.io.Serializable;

import domain.Elements;
import domain.Perks;

/**
 * Created by Gustavo on 07/06/2015
 */
public class UncommonWeapon extends Weapon implements Serializable{
    private Perks perks;

    public UncommonWeapon(String name, String type, String attack, int image, WeaponAttributes attributes, Perks perks) {
        super(name, type, attack, image, Elements.cinetic, attributes);
        this.perks = perks;
    }

    public Perks getPerks() {
        return perks;
    }

    @Override
    public int color(){
        return Color.rgb(54, 111, 66);
    }
}
