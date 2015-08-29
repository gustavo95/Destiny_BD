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
public class HunterLegsList extends ArmorList implements Serializable {
    private List<Armor> armors;

    public HunterLegsList(){
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
        armors.add(new ExoticArmor("Máquinas de Dança Radiantes", "296/357", R.drawable.maquinas_danca,
                new ArmorAttributes(42, 0, 0, 166),
                "Esse item pode ser encontrado em atividades do Anoitecer, engramas e Prisão dos Anciões." +
                        "Xûr, Agente dos Nove, às vezes vende este item na Torre.",
                new Perks("Aumenta a quantidade de munição de Arma Pesada que você pode carregar.",
                        "Você se move mais rapidamente ao mirar com sua arma.", null)));
    }

    private void insertLegendarys(){
        String randomPerk1 = "Esse item possui uma vantagem aleatoria";
        String randomPerk2 = "Esse item possui duas vantagens aleatorias";

        armors.add(new LegendaryArmor("Andarilho das Areias", "357", R.drawable.andarilho_areias_legs,
                new ArmorAttributes(42, 69, 69, 69),
                "Esse item pode ser encontrado em Assaltos",
                new Perks(randomPerk1,null,null)));
    }

    private void insertRares(){
        armors.add(new RareArmor("Destra", "167", R.drawable.destra_legs,
                new ArmorAttributes(15, 103, 103, 103)));
    }

    private void insertUncommons(){
        armors.add(new UncommonArmor("Pele de Mangala", "99", R.drawable.pele_mangala_leg,
                new ArmorAttributes(0, 0, 80, 80)));
    }

    private void insetCommons(){
        armors.add(new CommonArmor("Ladina", "64", R.drawable.ladina_legs,
                new ArmorAttributes(0, 0, 0, 0)));
    }
}
