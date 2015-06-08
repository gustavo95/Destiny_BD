package domain.ItemsLists;

import com.example.gustavo.destinybd.R;

import java.util.ArrayList;
import java.util.List;

import domain.Elements;
import domain.Perks;
import domain.weapons.ExoticWeapon;
import domain.weapons.Weapon;
import domain.weapons.WeaponAttributes;
import domain.weapons.WeaponType;

/**
 * Created by Gustavo on 07/06/2015
 */
public class PrimaryWeaponsList {
    private List<Weapon> weapons;

    public PrimaryWeaponsList(){

        weapons = new ArrayList<>();
        insertExotics();
    }

    public List<Weapon> getWeapons() {
        return weapons;
    }

    private void insertExotics(){
        weapons.add(new ExoticWeapon("347 Vesta Dynasty", WeaponType.scout,365,
                R.drawable.vesta_dynasty_347,
                Elements.cinetic, new WeaponAttributes(37,48,61,53,69,19), "?",
                new Perks("Maior precisão enquanto estiver no ar.",
                        "Precision kills temporarily increase Agility stat for 15 seconds.",
                        "Non precision kills temporarily increase Armor stat for 15 seconds.")));

        weapons.add(new ExoticWeapon("Vodu do Jacu", WeaponType.scout,334,
                R.drawable.bad_juju,
                Elements.cinetic, new WeaponAttributes(73,7,30,54,65,24), "?",
                new Perks("Esta arma tem um bônus de precisão ao efetuar tiro livre.",
                        "Após cada baixa, esta arma recarregará instantaneamente e o dano será aumentado brevemente."
                        + " Baixas ajudarão a carregar a sua super habilidade",null)));

    }

}
