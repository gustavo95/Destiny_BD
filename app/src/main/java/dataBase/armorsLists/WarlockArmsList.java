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
 * Created by Gustavo on 10/08/2015
 */
public class WarlockArmsList extends ArmorList implements Serializable {
    private List<Armor> armors;

    public WarlockArmsList(){
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
        armors.add(new ExoticArmor("Algemas do Nada", "402", R.drawable.algemas_nada,
                new ArmorAttributes(70, 70, 0),
                "Esse item pode ser encontrado em atividades do Anoitecer, engramas e Prisão dos Anciões." +
                        "Xûr, Agente dos Nove, às vezes vende este item na Torre.",
                new Perks("Permite o rastreamento de granadas de dispersão. Carregue uma carga extra de granada de dispersão.",
                        "Aumenta a distância de arremesso de granada.",
                        "Reduz o tempo de espera de granada toda vez que você pega um Orbe de Luz.")));
    }

    private void insertLegendarys(){
        String randomPerk1 = "Esse item possui uma vantagem aleatoria";
        String randomPerk2 = "Esse item possui duas vantagens aleatorias";

        armors.add(new LegendaryArmor("Ápice Harmônico", "366/402", R.drawable.apice_harmonico_luva,
                new ArmorAttributes(57, 57, 57),
                "Esse item pode ser encontrado em Assaltos." +
                        "Ikore Rey, Vanguarda de Arcanos, às vezes vende este item na Torre.",
                new Perks(randomPerk2,null,null)));
    }

    private void insertRares(){
        armors.add(new RareArmor("AOS#Al-Suhail", "188/202", R.drawable.aos_ai_suhail_luva,
                new ArmorAttributes(87, 87, 87)));
    }

    private void insertUncommons(){
        armors.add(new UncommonArmor("Concílio Axiomático", "110/113", R.drawable.concilio_axiomatico_luva,
                new ArmorAttributes(0, 59, 59)));
    }

    private void insetCommons(){
        armors.add(new CommonArmor("Crestadora Lógica", "32/74", R.drawable.crestadora_logica_luva,
                new ArmorAttributes(0, 0, 0)));
    }
}
