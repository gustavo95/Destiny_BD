package domain.weapons;

import android.graphics.Color;

import domain.Elements;
import domain.Perks;

/**
 * Created by Gustavo on 07/06/2015
 */
public class RareWeapon extends Weapon {
    private Perks perks;

    public RareWeapon(String name, String type, String attack, int image, Elements element, WeaponAttributes attributes) {
        super(name, type, attack, image, element, attributes);
        this.perks = new Perks("Esse item possui uma melhoria aleatoria","","");
    }

    public Perks getPerks() {
        return perks;
    }

    @Override
    public int color(){
        return Color.rgb(1000, 1000, 1000);
    }
}
