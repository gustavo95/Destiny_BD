package domain.quests;

import java.io.Serializable;

/**
 * Created by Gustavo on 17/10/2015
 */
public class Quest implements Serializable{

    private String name;
    private String description;
    private String rewards;
    private String steps;
    private int image;

    public Quest(String name, String description, String rewards, String steps, int image) {
        this.name = name;
        this.description = description;
        this.rewards = rewards;
        this.steps = steps;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getRewards() {
        return rewards;
    }

    public String getSteps() {
        return steps;
    }

    public int getImage() {
        return image;
    }
}
