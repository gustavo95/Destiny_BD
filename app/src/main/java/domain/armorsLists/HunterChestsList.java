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
 * Created by Gustavo on 29/08/2015
 */
public class HunterChestsList extends ArmorList implements Serializable {
    private List<Armor> armors;

    public HunterChestsList(){
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
        armors.add(new ExoticArmor("Brasão da Alpha Lupi", "339/536", R.drawable.alpha_lupi_hunter,
                new ArmorAttributes(42, 0, 0, 181),
                "Esse item pode ser encontrado em atividades do Anoitecer, engramas e Prisão dos Anciões." +
                        "Xûr, Agente dos Nove, às vezes vende este item na Torre.",
                new Perks("Você ressuscita companheiros caídos mais rápido, e eles te ressuscitam mais rápido. A sua super habilidade gera orbes adicionais.",
                        "Aumenta a quantidade de munição de Arma Especial que você pode carregar.",
                        "Aumenta a quantidade de munição de Canhão de Mão que você pode carregar.")));
    }

    private void insertLegendarys(){
        String randomPerk1 = "Esse item possui uma vantagem aleatoria";
        String randomPerk2 = "Esse item possui duas vantagens aleatorias";

        armors.add(new LegendaryArmor("Andarilho das Areias", "306/536", R.drawable.andarilho_areias,
                new ArmorAttributes(42, 76, 76, 76),
                "Esse item pode ser encontrado em Assaltos",
                new Perks(randomPerk2,null,null)));
    }

    private void insertRares(){
        armors.add(new RareArmor("Destra", "249/270", R.drawable.destra,
                new ArmorAttributes(15, 113, 113, 113)));
    }

    private void insertUncommons(){
        armors.add(new UncommonArmor("Pele de Mangala", "147/151", R.drawable.pele_mangala_chest,
                new ArmorAttributes(0, 0, 88, 88)));
    }

    private void insetCommons(){
        armors.add(new CommonArmor("Ladina", "47", R.drawable.ladina_chest,
                new ArmorAttributes(0, 0, 0, 0)));
    }
}
