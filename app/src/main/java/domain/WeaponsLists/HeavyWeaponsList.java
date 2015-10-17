package domain.WeaponsLists;

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
                new WeaponAttributes(18, 96, 30, 66, 52, 2),
                "Esse item pode ser encontrado em atividades do Anoitecer, engramas, incursões, Prisão dos Anciões e crisol. " +
                        "Xûr, Agente dos Nove, às vezes vende este item na Torre.",
                new Perks("O tubo de lançamento pode ter até três unidades.",
                        "Balas disparadas por esta arma deixam uma labareda solar ao detonarem.",
                        null)));

    }

    private void insertLegendarys(){

        String randomPerk1 = "Essa arma possui uma vantagem aleatoria";
        String randomPerk2 = "Essa arma possui duas vantagens aleatorias";
        String reforge = "O Armeiro pode reforjar esta arma mudando as vantagens disponiveis";

        weapons.add(new LegendaryWeapon("Admoestador III", lFoguete, "248/365",
                R.drawable.admonisher_iii, Elements.random,
                new WeaponAttributes(18, 96, 30, 53, 57, 1), "O Intendente Hideo da Nova Monarquia às vezes vende este item na Torre. " +
                "Pode ser encontrado em engramas.",
                new Perks(randomPerk2, null, null)));
    }

    private void insertRares(){

        weapons.add(new RareWeapon("Affentheater C/L-A", lFoguete, "224/242",
                R.drawable.affentheater_cla, Elements.random,
                new WeaponAttributes(11, 67, 68, 45, 64, 2)));
    }

    private void insertUncommons(){

        Perks p0 = null;
        Perks p1 = new Perks("Essa arma possui uma vantagem aleatoria", null, null);

        weapons.add(new UncommonWeapon("BTRD-345", metralhadora, "89",
                R.drawable.btrd_345, Elements.kinetic,
                new WeaponAttributes(26, 22, 66, 41, 52, 4), p0));
    }

    private void insertCommons(){

        weapons.add(new CommonWeapon("Barão RS/2a", lFoguete, "31",
                R.drawable.baron_rs1, new WeaponAttributes(9, 76, 44, 41, 54, 1)));
    }
}
