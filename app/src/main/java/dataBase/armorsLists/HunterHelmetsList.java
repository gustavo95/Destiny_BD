package dataBase.armorsLists;

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
 * Created by Gustavo on 24/08/2015
 */
public class HunterHelmetsList extends ArmorList implements Serializable {
    private List<Armor> armors;

    public HunterHelmetsList(){
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
        armors.add(new ExoticArmor("ARACNÍDEO ATS/8", "407/491", R.drawable.aracnideo_ats8,
                new ArmorAttributes(0, 78, 78),
                "Esse item pode ser encontrado em atividades do Anoitecer, engramas e Prisão dos Anciões." +
                        "Xûr, Agente dos Nove, às vezes vende este item na Torre.",
                new Perks("Causar dano com uma granada reduz o tempo de espera do ataque corpo a corpo.",
                        "Restaura energia da Super Habilidade quando você mata um inimigo com uma granada.",
                        "Sua Arma Dourada aproxima o zoom ao mirar para maior precisão.")));
    }

    private void insertLegendarys(){
        String randomPerk1 = "Esse item possui uma vantagem aleatoria";
        String randomPerk2 = "Esse item possui duas vantagens aleatorias";

        armors.add(new LegendaryArmor("A Coroa Em Espera", "280/491", R.drawable.waiting_crown_hunter,
                new ArmorAttributes(58, 58, 58),
                "Esse item pode ser encontrado em Assaltos",
                new Perks(randomPerk2,null,null)));
    }

    private void insertRares(){
        armors.add(new RareArmor("Argus Deimático", "230/248", R.drawable.argus_deimatico,
                new ArmorAttributes(98, 98, 98)));
    }

    private void insertUncommons(){
        armors.add(new UncommonArmor("Pele de Mangala", "135/139", R.drawable.pele_mangala,
                new ArmorAttributes(0, 67, 67)));
    }

    private void insetCommons(){
        armors.add(new CommonArmor("Ladina", "87/90", R.drawable.ladina,
                new ArmorAttributes(0, 0, 0)));
    }
}
