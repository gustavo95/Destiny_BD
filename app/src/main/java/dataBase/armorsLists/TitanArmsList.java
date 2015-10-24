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
 * Created by Gustavo on 22/08/2015
 */
public class TitanArmsList extends ArmorList implements Serializable {
    private List<Armor> armors;

    public TitanArmsList(){
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
        armors.add(new ExoticArmor("Asas da Ruína", "333/402", R.drawable.asas_ruina,
                new ArmorAttributes(0, 0, 121),
                "Esse item pode ser encontrado em atividades do Anoitecer, engramas e Prisão dos Anciões." +
                        "Xûr, Agente dos Nove, às vezes vende este item na Torre.",
                new Perks("Munição pesada aparece com mais frequência e contém mais balas em cada aparição.",
                        "Causar dano com um ataque corpo a corpo reduz o tempo de espera de granada.",
                        "Aumenta a velocidade de recarga de todas as Armas Especiais.")));
    }

    private void insertLegendarys(){
        String randomPerk1 = "Esse item possui uma vantagem aleatoria";
        String randomPerk2 = "Esse item possui duas vantagens aleatorias";

        armors.add(new LegendaryArmor("Armada Tipo 3", "229/402", R.drawable.armada_tipo3_leg,
                new ArmorAttributes(69, 69, 69),
                "Esse item pode ser encontrado em Assaltos",
                new Perks(randomPerk2,null,null)));
    }

    private void insertRares(){
        armors.add(new RareArmor("Fulcro Raku Tipo x", "188/202", R.drawable.fulcro_raku_luva,
                new ArmorAttributes(87, 87, 87)));
    }

    private void insertUncommons(){
        armors.add(new UncommonArmor("Highlander Tipo x", "110/113", R.drawable.highlander_luva,
                new ArmorAttributes(0, 59, 59)));
    }

    private void insetCommons(){
        armors.add(new CommonArmor("Anti-incêndio", "35", R.drawable.anti_incendio_arm,
                new ArmorAttributes(0, 0, 0)));
    }
}
