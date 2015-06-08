package domain.weapons;

/**
 * Created by Gustavo on 06/06/2015
 */
public class WeaponAttributes {
    private int rateFire;
    private int impact;
    private int range;
    private int stability;
    private int reload;
    private int mag;

    public WeaponAttributes(int rateFire, int impact, int stability, int range, int reload, int mag) {
        this.rateFire = rateFire;
        this.impact = impact;
        this.stability = stability;
        this.range = range;
        this.reload = reload;
        this.mag = mag;
    }

    public int getRateFire() {
        return rateFire;
    }

    public int getImpact() {
        return impact;
    }

    public int getRange() {
        return range;
    }

    public int getStability() {
        return stability;
    }

    public int getReload() {
        return reload;
    }

    public int getMag() {
        return mag;
    }
}
