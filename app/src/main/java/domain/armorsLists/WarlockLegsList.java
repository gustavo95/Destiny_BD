package domain.armorsLists;

import com.example.gustavo.destinybd.R;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import domain.Perks;
import domain.armors.Armor;
import domain.armors.ArmorAttributes;
import domain.armors.CommonArmor;
import domain.armors.LegendaryArmor;
import domain.armors.RareArmor;
import domain.armors.UncommonArmor;

/**
 * Created by Gustavo on 12/08/2015
 */
public class WarlockLegsList extends ArmorList implements Serializable {
    private List<Armor> armors;

    public WarlockLegsList(){
        armors = new ArrayList<>();;
        insertLegendarys();
        insertRares();
        insertUncommons();
        insetCommons();
    }

    public List<Armor> getArmors() {
        return armors;
    }

    private void insertLegendarys(){
        String randomPerk1 = "Essa arma possui uma vantagem aleatoria";
        String randomPerk2 = "Essa arma possui duas vantagens aleatorias";

        armors.add(new LegendaryArmor("Ápice Harmônico", "204/357", R.drawable.apice_harmonico_perna,
                new ArmorAttributes(42, 78, 78, 78),
                "Esse item pode ser encontrado em Assaltos." +
                        "Ikore Rey, Vanguarda de Arcanos, às vezes vende este item na Torre.",
                new Perks(randomPerk2,null,null)));
    }

    private void insertRares(){
        armors.add(new RareArmor("Nave Nêmese", "167/181", R.drawable.nave_nemese_perna,
                new ArmorAttributes(15, 106, 106, 106)));
    }

    private void insertUncommons(){
        armors.add(new UncommonArmor("Concílio Axiomático", "56/101", R.drawable.concilio_axiomatico_perna,
                new ArmorAttributes(0, 0, 80, 80)));
    }

    private void insetCommons(){
        armors.add(new CommonArmor("Crestadora Lógica", "60/65", R.drawable.crestadora_logica_perna,
                new ArmorAttributes(0, 0, 0, 0)));
    }
}
