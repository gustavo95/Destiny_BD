package domain.weapons;

import android.graphics.Color;

import domain.Elements;
import domain.Perks;

/**
 * Created by Gustavo on 07/06/2015
 */
public class RareWeapon extends Weapon {
    private Perks perks;

    public RareWeapon(String name, String type, String attack, int image, WeaponAttributes attributes) {
        super(name, type, attack, image, Elements.cinetic, attributes);
        this.perks = new Perks("Essa arma possui um aprimoramento aleatorio",null,null);
    }

    public Perks getPerks() {
        return perks;
    }

    @Override
    public int color(){
        return Color.rgb(80, 118, 163);
    }
}
