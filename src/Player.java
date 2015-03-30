import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Jasper on 30/03/15.
 */
public class Player {

    private int points, roadLength, armySize;
    private HashMap<Resource, Integer> resources;

    public Player() {
        points = 0;
        roadLength = 1;
        resources = new HashMap<Resource, Integer>();
    }

    public void addPoints(int value) {
        points += value;
    }

    public int getPoints() {
        return points;
    }

    public void buildSettlement() {

        addPoints(1);
    }

    public void buildCity() {
        addPoints(2);
    }

    public void buildRoad() {
        roadLength++;
    }
}
