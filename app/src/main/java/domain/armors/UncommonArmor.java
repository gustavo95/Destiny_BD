package domain.armors;

import android.graphics.Color;

import java.io.Serializable;

import domain.Perks;

/**
 * Created by Gustavo on 01/08/2015
 */
public class UncommonArmor extends Armor implements Serializable {
    public UncommonArmor(String name, String defense, int image, ArmorAttributes attributes) {
        super(name, defense, image, attributes, null, new Perks("Esse item possui vantagens aleatorias",null,null));
    }

    @Override
    public int color(){
        return Color.rgb(54, 111, 66);
    }
}
