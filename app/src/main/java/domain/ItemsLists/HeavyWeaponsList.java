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
 * Created by Gustavo on 25/06/2015
 */
public class HeavyWeaponsList {
    private static final String lFoguete = "Lança-foguetes";
    private static final String metralhadora = "Metralhadora";

    private List<Weapon> weapons;

    public HeavyWeaponsList(){
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

        weapons.add(new ExoticWeapon("Bafo de Dragão", lFoguete, "302/365",
                R.drawable.dragons_breath, Elements.solar,
                new WeaponAttributes(18, 96, 30, 66, 52, 2), "?",
                new Perks("O tubo de lançamento pode ter até três unidades.",
                        "Balas disparadas por esta arma deixam uma labareda solar ao detonarem.",
                        null)));

    }

    private void insertLegendarys(){

        String randomPerk1 = "Essa arma possui um aprimoramento aleatorio";
        String randomPerk2 = "Essa arma possui dois aprimoramentos aleatorios";
        String reforge = "O Armeiro pode reforjar esta arma mudando os aprimoramentos disponiveis";

        weapons.add(new LegendaryWeapon("Admoestador III", lFoguete, "248/365",
                R.drawable.admonisher_iii, Elements.radom,
                new WeaponAttributes(18, 96, 30, 53, 57, 1), "?",
                new Perks(randomPerk2, null, null)));
    }

    private void insertRares(){

        weapons.add(new RareWeapon("Affentheater C/L-A", lFoguete, "224/242",
                R.drawable.affentheater_cla, Elements.radom,
                new WeaponAttributes(11, 67, 68, 45, 64, 2)));
    }

    private void insertUncommons(){

        Perks p0 = null;
        Perks p1 = new Perks("Essa arma possui um aprimoramento aleatorio", null, null);

        weapons.add(new UncommonWeapon("BTRD-345", metralhadora, "89",
                R.drawable.btrd_345, Elements.cinetic,
                new WeaponAttributes(26, 22, 66, 41, 52, 4), p0));
    }

    private void insertCommons(){

        weapons.add(new CommonWeapon("Barão RS/1", lFoguete, "-",
                R.drawable.baron_rs1, new WeaponAttributes(25, 60, 44, 33, 66, 2)));
    }
}
