package domain.others;

import java.io.Serializable;

/**
 * Created by Gustavo on 06/06/2015
 */
public class Perks implements Serializable{
    private String perk1;
    private String perk2;
    private String perk3;

    public Perks(String perk1, String perk2, String perk3) {
        this.perk1 = perk1;
        this.perk2 = perk2;
        this.perk3 = perk3;
    }

    public String getPerk1() {
        return perk1;
    }

    public String getPerk2() {
        return perk2;
    }

    public String getPerk3() {
        return perk3;
    }
}
