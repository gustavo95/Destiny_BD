package domain.ItemsLists;

import com.example.gustavo.destinybd.R;

import java.util.ArrayList;
import java.util.List;

import domain.Elements;
import domain.Perks;
import domain.weapons.CommonWeapon;
import domain.weapons.ExoticWeapon;
import domain.weapons.LegendaryWeapon;
import domain.weapons.RareWeapon;
import domain.weapons.UncommonWeapon;
import domain.weapons.Weapon;
import domain.weapons.WeaponAttributes;

/**
 * Created by Gustavo on 23/06/2015
 */
public class SpecialWeaponsList {
    private static final String pistola = "Pistola";
    private static final String fFusao = "Fuzil de Fusão";
    private static final String fPrecisao = "Fuzil de Precisão";
    private static final String escopeta = "escopeta";

    private List<Weapon> weapons;

    public SpecialWeaponsList(){
        weapons = new ArrayList<>();
        insertExotics();
        insertLegendarys();
        insertRares();
        insertUncommons();
        insertCommons();
    }

    public List<Weapon> getWeapons() {
        return weapons;
    }

    private void insertExotics(){

        weapons.add(new ExoticWeapon("Promessa do Rebaixado", pistola, "365",
                R.drawable.dregs_promise, Elements.arc,
                new WeaponAttributes(100, 5, 41, 79, 86, 18), "Cifra Anciã",
                new Perks("Esta arma sempre tem munição quando você reaparece.",
                        "Balas elétricas de alto ricochete com aquisição de alvo aprimorada.",
                        null)));

    }

    private void insertLegendarys(){

        String randomPerk1 = "Essa arma possui um aprimoramento aleatorio";
        String randomPerk2 = "Essa arma possui dois aprimoramentos aleatorios";
        String reforge = "O Armeiro pode reforjar esta arma mudando os aprimoramentos disponiveis";

        weapons.add(new LegendaryWeapon("20/20 AMR7", fPrecisao, "331/365",
                R.drawable.amr7_2020, Elements.radom,
                new WeaponAttributes(43, 10, 63, 32, 79, 4), "?",
                new Perks(randomPerk2, reforge, null)));
    }

    private void insertRares(){

        weapons.add(new RareWeapon("Agnes III", escopeta, "224/242",
                R.drawable.agnes_iii, Elements.radom,
                new WeaponAttributes(5, 67, 21, 2, 20, 5)));
    }

    private void insertUncommons(){

        Perks p0 = null;
        Perks p1 = new Perks("Essa arma possui um aprimoramento aleatorio", null, null);

        weapons.add(new UncommonWeapon("13098v incognito", fPrecisao, "60",
                R.drawable.incognito_13098v, Elements.radom,
                new WeaponAttributes(26, 22, 66, 41, 52, 4), p0));
    }

    private void insertCommons(){

        weapons.add(new CommonWeapon("Calcutta-LR1", fPrecisao, "43",
                R.drawable.calcutta_lr1, new WeaponAttributes(43, 10, 60, 37, 65, 3)));
    }

}
