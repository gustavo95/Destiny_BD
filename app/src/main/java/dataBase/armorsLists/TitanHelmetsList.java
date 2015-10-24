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
 * Created by Gustavo on 14/08/2015
 */
public class TitanHelmetsList extends ArmorList implements Serializable {
    private List<Armor> armors;

    public TitanHelmetsList(){
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
        armors.add(new ExoticArmor("A Casa de Vidro", "407/491", R.drawable.casa_vidro,
                new ArmorAttributes(137, 0, 0),
                "Esse item pode ser encontrado em atividades do Anoitecer, engramas e Prisão dos Anciões." +
                        "Xûr, Agente dos Nove, às vezes vende este item na Torre.",
                new Perks("Aumenta a velocidade de ataque corpo a corpo.",
                        "Restaura energia da Super Habilidade quando você mata um inimigo com uma granada.",
                        "Bênção da Luz e Armas da Luz duram mais.")));
    }

    private void insertLegendarys(){
        String randomPerk1 = "Esse item possui uma vantagem aleatoria";
        String randomPerk2 = "Esse item possui duas vantagens aleatorias";

        armors.add(new LegendaryArmor("A Coroa Em Espera", "280/491", R.drawable.waiting_crown_titan,
                new ArmorAttributes(58, 58, 58),
                "Esse item pode ser encontrado em Assaltos",
                new Perks(randomPerk2,null,null)));
    }

    private void insertRares(){
        armors.add(new RareArmor("Fulcro Raku Tipo x", "228/248", R.drawable.fulcro_raku,
                new ArmorAttributes(98, 98, 98)));
    }

    private void insertUncommons(){
        armors.add(new UncommonArmor("Highlander Tipo x", "135/139", R.drawable.highlander,
                new ArmorAttributes(0, 67, 67)));
    }

    private void insetCommons(){
        armors.add(new CommonArmor("Anti-incêndio", "87/90", R.drawable.anti_incendio,
                new ArmorAttributes(0, 0, 0)));
    }
}
