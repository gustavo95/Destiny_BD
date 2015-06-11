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
 * Created by Gustavo on 07/06/2015
 */
public class PrimaryWeaponsList {
    private List<Weapon> weapons;

    public PrimaryWeaponsList(){
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
        String fAutomatico = "Fuzil Automático";
        String fBatedor = "Fuzil de Batedor";
        String fPulso = "Fuzil de Pulso";
        String cMao = "Canhão de Mão";

        weapons.add(new ExoticWeapon("347 Vesta Dynasty", fBatedor,"365",
                R.drawable.vesta_dynasty_347, Elements.cinetic,
                new WeaponAttributes(37, 48, 61, 53 , 69, 19), "?",
                new Perks("Maior precisão enquanto estiver no ar.",
                        "Precision kills temporarily increase Agility stat for 15 seconds.",
                        "Non precision kills temporarily increase Armor stat for 15 seconds.")));
        weapons.add(new ExoticWeapon("Vodu do Jacu", fPulso,"302/365",
                R.drawable.bad_juju, Elements.cinetic,
                new WeaponAttributes(73, 7, 30, 54, 65, 24), "?",
                new Perks("Esta arma tem um bônus de precisão ao efetuar tiro livre.",
                        "Após cada baixa, esta arma recarregará instantaneamente e o dano será aumentado brevemente."
                        + " Baixas ajudarão a carregar a sua super habilidade",null)));
        weapons.add(new ExoticWeapon("Destino de todos os tolos", fBatedor,"331/365",
                R.drawable.fate_of_all_fools, Elements.cinetic,
                new WeaponAttributes(27, 59, 94, 24, 65, 13), "?",
                new Perks("Causar dano com esta arma aumenta a sua estabilidade",
                        "Chain body shots to gain bonus damage on your next precision shot.",null)));

    }

    private void insertLegendarys(){
        String fAutomatico = "Fuzil Automático";
        String fBatedor = "Fuzil de Batedor";
        String fPulso = "Fuzil de Pulso";
        String cMao = "Canhão de Mão";

        String randomPerk1 = "Essa arma possui um aprimoramento aleatorio";
        String randomPerk2 = "Essa arma possui dois aprimoramentos aleatorios";
        String reforge = "O Armeiro pode reforjar esta arma mudando os aprimoramentos disponiveis";

        weapons.add(new LegendaryWeapon("123 SYZYGY", fPulso,"272/365",
                R.drawable.syzygy_123, Elements.cinetic,
                new WeaponAttributes(77, 4, 25, 64, 48, 30), "?",
                new Perks(randomPerk2, null, null)));
        weapons.add(new LegendaryWeapon("todoDESTINO-55A", fPulso,"331/365",
                R.drawable.allfate_55a, Elements.cinetic,
                new WeaponAttributes(66, 14, 47, 65, 62, 27), "?",
                new Perks(randomPerk2, reforge, null)));
    }

    private void insertRares(){
        String fAutomatico = "Fuzil Automático";
        String fBatedor = "Fuzil de Batedor";
        String fPulso = "Fuzil de Pulso";
        String cMao = "Canhão de Mão";

        weapons.add(new RareWeapon("A Little Voice", cMao,"224/242",
                R.drawable.a_little_voice, new WeaponAttributes(15, 94, 34, 26, 26, 7)));
    }

    private void insertUncommons(){
        String fAutomatico = "Fuzil Automático";
        String fBatedor = "Fuzil de Batedor";
        String fPulso = "Fuzil de Pulso";
        String cMao = "Canhão de Mão";

        Perks p0 = null;
        Perks p1 = new Perks("Essa arma possui um aprimoramento aleatorio", null, null);

        weapons.add(new UncommonWeapon("Bandit Mk. 36", cMao,"81/89",
                R.drawable.bandit_mk_36, new WeaponAttributes(22, 81, 17, 38, 26, 8), p1));
    }

    private void insertCommons(){
        String fAutomatico = "Fuzil Automático";
        String fBatedor = "Fuzil de Batedor";
        String fPulso = "Fuzil de Pulso";
        String cMao = "Canhão de Mão";

        Perks p0 = null;
        Perks p1 = new Perks("Essa arma possui um aprimoramento aleatorio", null, null);

        weapons.add(new CommonWeapon("Bandit Mk. 24", cMao,"72",
                R.drawable.bandit_mk_24, new WeaponAttributes(22, 81, 22, 23, 30, 3)));
    }

}
