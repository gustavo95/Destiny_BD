package domain.weapons;

import android.graphics.Color;

import domain.Elements;
import domain.Perks;

/**
 * Created by Gustavo on 07/06/2015
 */
public class UncommonWeapon extends Weapon{
    private Perks perks;

    public UncommonWeapon(String name, String type, String attack, int image, Elements element, WeaponAttributes attributes, Perks perks) {
        super(name, type, attack, image, element, attributes);
        this.perks = perks;
    }

    public Perks getPerks() {
        return perks;
    }

    @Override
    public int color(){
        return Color.rgb(1000, 1000, 1000);
    }
}
