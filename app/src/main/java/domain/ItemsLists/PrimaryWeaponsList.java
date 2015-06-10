package domain.ItemsLists;

import com.example.gustavo.destinybd.R;

import java.util.ArrayList;
import java.util.List;

import domain.Elements;
import domain.Perks;
import domain.weapons.ExoticWeapon;
import domain.weapons.LegendaryWeapon;
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
        insertLegendary();
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

    private void insertLegendary(){
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

}
