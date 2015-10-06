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
 * Created by Gustavo on 02/08/2015
 */
public class WarlockHelmetsList extends ArmorList implements Serializable{
    private List<Armor> armors;

    public WarlockHelmetsList(){
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
        armors.add(new ExoticArmor("Áries", "491", R.drawable.the_ram,
                new ArmorAttributes(78, 0, 78),
                "Esse item pode ser encontrado em atividades do Anoitecer, engramas e Prisão dos Anciões." +
                        "Xûr, Agente dos Nove, às vezes vende este item na Torre.",
                new Perks("Restaura vida toda vez que você pega um Orbe de Luz.",
                        "Restaura energia da Super Habilidade quando você mata um inimigo com um ataque corpo a corpo.",
                        "Armadura aumentada. Todos os ataques corpo a corpo de Andarilho do Vácuo utilizam Sugar Vida a cada golpe.")));
    }

    private void insertLegendarys(){
        String randomPerk1 = "Esse item possui uma vantagem aleatoria";
        String randomPerk2 = "Esse item possui duas vantagens aleatorias";

        armors.add(new LegendaryArmor("A Coroa Em Espera", "280/491", R.drawable.waiting_crown,
                new ArmorAttributes(58, 58, 58),
                "Esse item pode ser encontrado em Assaltos",
                new Perks(randomPerk2,null,null)));
    }

    private void insertRares(){
        armors.add(new RareArmor("AOS#Al-Suhail", "228/248", R.drawable.aos_ai_suhail,
                new ArmorAttributes(98, 98, 98)));
    }

    private void insertUncommons(){
        armors.add(new UncommonArmor("Concílio Axiomático", "135/139", R.drawable.concilio_axiomatico_cabeca,
                new ArmorAttributes(0, 67, 67)));
    }

    private void insetCommons(){
        armors.add(new CommonArmor("Crestadora Lógica", "87", R.drawable.crestadora_logica,
                new ArmorAttributes(0, 0, 0)));
    }
}
