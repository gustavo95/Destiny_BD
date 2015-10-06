package domain.armorsLists;

import com.example.gustavo.destinybd.R;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import domain.Perks;
import domain.armors.Armor;
import domain.armors.ArmorAttributes;
import domain.armors.CommonArmor;
import domain.armors.ExoticArmor;
import domain.armors.LegendaryArmor;
import domain.armors.RareArmor;
import domain.armors.UncommonArmor;

/**
 * Created by Gustavo on 08/08/2015
 */
public class WarlockChestsList extends ArmorList implements Serializable {
    private List<Armor> armors;

    public WarlockChestsList(){
        armors = new ArrayList<>();
        insertExotics();
        insertLegendarys();
        insertRares();
        insertUncommons();
        insetCommons();
    }

    public List<Armor> getArmors() {
        return armors;
    }

    private void insertExotics(){
        armors.add(new ExoticArmor("Coração do Fogo Prático", "339/536", R.drawable.heart_praxic_fire,
                new ArmorAttributes(0, 181, 0),
                "Esse item pode ser encontrado em atividades do Anoitecer, engramas, incursões e Prisão dos Anciões." +
                        "Xûr, Agente dos Nove, às vezes vende este item na Torre.",
                new Perks("Diminui mais todos os tempos de espera das habilidades enquanto Resplendor estiver ativo.",
                        "Aumenta a quantidade de munição de Fuzil de Fusão que você pode carregar.",
                        "Aumenta a quantidade de munição de Arma Pesada que você pode carregar.")));
    }

    private void insertLegendarys(){
        String randomPerk1 = "Esse item possui uma vantagem aleatoria";
        String randomPerk2 = "Esse item possui duas vantagens aleatorias";

        armors.add(new LegendaryArmor("Ápice Harmônico", "488/536", R.drawable.apice_harmonico,
                new ArmorAttributes(85, 85, 85),
                "Esse item pode ser encontrado em Assaltos." +
                "Ikore Rey, Vanguarda de Arcanos, às vezes vende este item na Torre.",
                new Perks(randomPerk2,null,null)));
    }

    private void insertRares(){
        armors.add(new RareArmor("Nave Nêmese", "249/270", R.drawable.nave_nemese,
                new ArmorAttributes(113, 113, 113)));
    }

    private void insertUncommons(){
        armors.add(new UncommonArmor("Concílio Axiomático", "147/151", R.drawable.concilio_axiomatico_peito,
                new ArmorAttributes(0, 88, 88)));
    }

    private void insetCommons(){
        armors.add(new CommonArmor("Crestadora Lógica", "95", R.drawable.crestadora_logica_peito,
                new ArmorAttributes(0, 0, 0)));
    }
}
