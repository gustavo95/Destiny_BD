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
 * Created by Gustavo on 22/08/2015
 */
public class TitanLegsList extends ArmorList implements Serializable {
    private List<Armor> armors;

    public TitanLegsList(){
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
        armors.add(new ExoticArmor("Chega Pra Lá Mk. 44", "296/357", R.drawable.chega_pra_la,
                new ArmorAttributes(42, 0, 0, 166),
                "Esse item pode ser encontrado em atividades do Anoitecer, engramas e Prisão dos Anciões." +
                        "Xûr, Agente dos Nove, às vezes vende este item na Torre.",
                new Perks("Aumenta a quantidade de munição de Arma Pesada que você pode carregar.",
                        "Aumenta a duração da Ombrada.", null)));
    }

    private void insertLegendarys(){
        String randomPerk1 = "Esse item possui uma vantagem aleatoria";
        String randomPerk2 = "Esse item possui duas vantagens aleatorias";

        armors.add(new LegendaryArmor("Armada Tipo 3", "357", R.drawable.armada_tipo3_leg,
                new ArmorAttributes(42, 53, 53, 53),
                "Esse item pode ser encontrado em Assaltos",
                new Perks(randomPerk1,null,null)));
    }

    private void insertRares(){
        armors.add(new RareArmor("Cavaleiro Tipo x", "167", R.drawable.cavaleiro_tipo_legs,
                new ArmorAttributes(15, 103, 103, 103)));
    }

    private void insertUncommons(){
        armors.add(new UncommonArmor("Highlander Tipo x", "99", R.drawable.highlander_legs,
                new ArmorAttributes(0, 0, 80, 80)));
    }

    private void insetCommons(){
        armors.add(new CommonArmor("Anti-incêndio", "64", R.drawable.anti_incendio_legs,
                new ArmorAttributes(0, 0, 0, 0)));
    }
}
