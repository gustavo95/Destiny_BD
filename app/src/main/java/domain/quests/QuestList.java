package domain.quests;

import com.example.gustavo.destinybd.R;

import java.util.ArrayList;
import java.util.List;

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
        quests.add(new Quest("Contra a Colmeia","A Colmeia despertou. Esta é a história da nova guerra da Colmeia contra a Luz."
                ,"Experiencia, armas, armaduras.", "7", R.drawable.quest2));
        quests.add(new Quest("Fruto do Jardim","A história da estranha misteriosa e seu conto do Jardim Sombrio."
                ,"Experiencia, reputação, armas, armaduras.", "13", R.drawable.quest3));
    }
}
