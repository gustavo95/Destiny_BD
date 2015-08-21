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
 * Created by Gustavo on 21/08/2015
 */
public class TitanChestsList extends ArmorList implements Serializable {
    private List<Armor> armors;

    public TitanChestsList(){
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
        armors.add(new ExoticArmor("Brasão da Alpha Lupi", "339/536", R.drawable.alpha_lupi_titan,
                new ArmorAttributes(42, 181, 0, 0),
                "Esse item pode ser encontrado em atividades do Anoitecer, engramas e Prisão dos Anciões." +
                        "Xûr, Agente dos Nove, às vezes vende este item na Torre.",
                new Perks("Você ressuscita companheiros caídos mais rápido, e eles te ressuscitam mais rápido. A sua super habilidade gera orbes adicionais..",
                        "Aumenta a quantidade de munição de Arma Especial que você pode carregar.",
                        "Aumenta a quantidade de munição de Fuzil Automático que você pode carregar.")));
    }

    private void insertLegendarys(){
        String randomPerk1 = "Essa arma possui uma vantagem aleatoria";
        String randomPerk2 = "Essa arma possui duas vantagens aleatorias";

        armors.add(new LegendaryArmor("Armada Tipo 3", "306/536", R.drawable.armada_tipo3,
                new ArmorAttributes(42, 76, 76, 76),
                "Esse item pode ser encontrado em Assaltos",
                new Perks(randomPerk2,null,null)));
    }

    private void insertRares(){
        armors.add(new RareArmor("Cavaleiro Tipo x", "249/270", R.drawable.cavaleiro_tipo,
                new ArmorAttributes(15, 113, 113, 113)));
    }

    private void insertUncommons(){
        armors.add(new UncommonArmor("Highlander Tipo x", "147/151", R.drawable.highlander_chest,
                new ArmorAttributes(0, 0, 88, 88)));
    }

    private void insetCommons(){
        armors.add(new CommonArmor("Anti-incêndio", "48", R.drawable.anti_incendio_chest,
                new ArmorAttributes(0, 0, 0, 0)));
    }
}
