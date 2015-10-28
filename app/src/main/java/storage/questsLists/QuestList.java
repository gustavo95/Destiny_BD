package storage.questsLists;

import com.example.gustavo.destinybd.R;

import java.util.ArrayList;
import java.util.List;

import domain.quests.Quest;

/**
 * Created by Gustavo on 17/10/2015
 */
public class QuestList {

    private List<Quest> quests;

    public QuestList() {
        this.quests = new ArrayList<Quest>();
        insertQuests();
    }

    public List<Quest> getQuests() {
        return quests;
    }

    private void insertQuests(){

        //quests.add(new Quest("", ""
        //        ,"", "", R.drawable.));

        quests.add(new Quest("Ascensão Arcana", "Sua ascensão das cinzas de um mundo destruído."
                ,"Experiencia, armadura, nave.", "7", R.drawable.warlock_quest));
        quests.add(new Quest("Ascensão Caçadora", "Sua ascensão das cinzas do Colapso."
                ,"Experiencia, armadura, nave.", "7", R.drawable.hunter_quest));
        quests.add(new Quest("Ascensão Titã", "Sua ascensão das cinzas de um mundo destruído."
                ,"Experiencia, armadura, nave.", "7", R.drawable.titan_quest));
        quests.add(new Quest("Nada restou além da queda", "A história e a batalha dos Decaídos e da Cidade pelo futuro da Terra."
                ,"Experiencia, armaduras.", "11", R.drawable.quest1));
        quests.add(new Quest("Contra a Colmeia", "A Colmeia despertou. Esta é a história da nova guerra da Colmeia contra a Luz."
                ,"Experiencia, armas, armaduras.", "7", R.drawable.quest2));
        quests.add(new Quest("Fruto do Jardim", "A história da estranha misteriosa e seu conto do Jardim Sombrio."
                ,"Experiencia, reputação, armas, armaduras.", "13", R.drawable.quest3));
        quests.add(new Quest("A Escuridão Subterrânea", "A história de Eris Morn e sua luta contra Crota, o deus da Colmeia."
                ,"Experiencia, reputação, armas.", "10", R.drawable.quest4));
        quests.add(new Quest("Casa dos Lobos", "A história dos Despertos e sua campanha contra a Casa dos Lobos."
                ,"Experiencia, reputação, armas, consumíveis.", "19", R.drawable.quest5));
        quests.add(new Quest("O Rei dos Possuídos", "O Rei dos Possuídos tinha vindo. A história que conta como você foi encontrá-lo."
                ,"Experiencia, reputação, armas, armaduras, tonalizadores.", "17", R.drawable.quest6));


    }
}
