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
public class HunterArmsList extends ArmorList implements Serializable {
    private List<Armor> armors;

    public HunterArmsList(){
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
        armors.add(new ExoticArmor("Espinha do Jovem Ahamkara", "254/402", R.drawable.espinha_jovem_ahamkara,
                new ArmorAttributes(0, 121, 0),
                "Esse item pode ser encontrado em atividades do Anoitecer, engramas e Prisão dos Anciões." +
                        "Xûr, Agente dos Nove, às vezes vende este item na Torre.",
                new Perks("Granadas de Mina duram mais quando posicionadas.",
                        "Aumenta a velocidade de recarga de todas as Armas Especiais.",
                        "Restaura energia da Super Habilidade quando você mata um inimigo com uma granada.")));
    }

    private void insertLegendarys(){
        String randomPerk1 = "Esse item possui uma vantagem aleatoria";
        String randomPerk2 = "Esse item possui duas vantagens aleatorias";

        armors.add(new LegendaryArmor("Andarilho das Areias", "229/402", R.drawable.andarilho_areias_chest,
                new ArmorAttributes(51, 51, 51),
                "Esse item pode ser encontrado em Assaltos",
                new Perks(randomPerk2,null,null)));
    }

    private void insertRares(){
        armors.add(new RareArmor("Argus Deimático", "192/202", R.drawable.argus_deimatico_arms,
                new ArmorAttributes(87, 87, 87)));
    }

    private void insertUncommons(){
        armors.add(new UncommonArmor("Pele de Mangala", "110/113", R.drawable.pele_mangala_arms,
                new ArmorAttributes(0, 59, 59)));
    }

    private void insetCommons(){
        armors.add(new CommonArmor("Ladina", "41", R.drawable.ladina_arms,
                new ArmorAttributes(0, 0, 0)));
    }
}
