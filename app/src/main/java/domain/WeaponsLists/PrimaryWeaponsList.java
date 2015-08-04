package domain.WeaponsLists;

import com.example.gustavo.destinybd.R;

import java.io.Serializable;
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
    private static final String fAutomatico = "Fuzil Automático";
    private static final String fBatedor = "Fuzil de Batedor";
    private static final String fPulso = "Fuzil de Pulso";
    private static final String cMao = "Canhão de Mão";

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

        weapons.add(new ExoticWeapon("Vodu do Jacu", fPulso, "302/365",
                R.drawable.bad_juju, Elements.kinetic,
                new WeaponAttributes(73, 7, 30, 54, 65, 24), "Obtida ao completar o contrato exótico Legado de Toland.",
                new Perks("Esta arma tem um bônus de precisão ao efetuar tiro livre.",
                        "Após cada baixa, esta arma recarregará instantaneamente e o dano será aumentado brevemente."
                        + " Baixas ajudarão a carregar a sua super habilidade.",null)));
        weapons.add(new ExoticWeapon("Destino dos Tolos", fBatedor, "331/365",
                R.drawable.fate_of_all_fools, Elements.kinetic,
                new WeaponAttributes(27, 59, 94, 24, 65, 13), "Desconhecido.",
                new Perks("Causar dano com esta arma aumenta a sua estabilidade",
                        "Encadeie tiros corporais para ganhar bônus de dano no seu próximo tiro de precisão.",null)));

    }

    private void insertLegendarys(){

        String randomPerk1 = "Essa arma possui uma vantagem aleatoria";
        String randomPerk2 = "Essa arma possui duas vantagens aleatorias";
        String reforge = "O Armeiro pode reforjar esta arma mudando as vantagens disponiveis";

        weapons.add(new LegendaryWeapon("Sizígia 123", fPulso, "272/365",
                R.drawable.syzygy_123, Elements.kinetic,
                new WeaponAttributes(77, 4, 25, 64, 48, 30), "Arcite 99-40, quartel-mestre do Crisol, às vezes vende este item na Torre. " +
                "Pode ser encontrado em engramas.",
                new Perks(randomPerk2, null, null)));
        weapons.add(new LegendaryWeapon("todoDESTINO-55A", fPulso, "331/365",
                R.drawable.allfate_55a, Elements.kinetic,
                new WeaponAttributes(66, 14, 47, 65, 62, 27), "Roni 55-30, quartel-mestre da Vanguarda, às vezes vende este item na Torre. " +
                "Pode ser encontrado em atividades do Anoitecer e em engramas.",
                new Perks(randomPerk2, reforge, null)));
    }

    private void insertRares(){

        weapons.add(new RareWeapon("Uma Vozinha", cMao, "224/242",
                R.drawable.a_little_voice, Elements.kinetic,
                new WeaponAttributes(15, 94, 34, 26, 26, 7)));
    }

    private void insertUncommons(){

        Perks p0 = null;
        Perks p1 = new Perks("Essa arma possui uma vantagem aleatoria", null, null);

        weapons.add(new UncommonWeapon("Gatuno Vermelho Mk. 36", cMao, "81/89",
                R.drawable.bandit_mk_36, Elements.kinetic,
                new WeaponAttributes(22, 81, 17, 38, 26, 8), p1));
    }

    private void insertCommons(){

        weapons.add(new CommonWeapon("Gatuno Mk. 24", cMao, "72",
                R.drawable.bandit_mk_24, new WeaponAttributes(22, 81, 22, 23, 30, 3)));
    }

}
