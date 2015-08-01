package domain.armors;

import android.graphics.Color;

import java.io.Serializable;

/**
 * Created by Gustavo on 01/08/2015
 */
public class CommonArmor extends Armor implements Serializable {
    public CommonArmor(String name, String defense, int image, ArmorAttributes attributes) {
        super(name, defense, image, attributes, null, null);
    }

    @Override
    public int color(){
        return Color.rgb(195, 188, 180);
    }
}
