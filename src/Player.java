import java.util.ArrayList;

/**
 * Created by Jasper on 30/03/15.
 */
public class Player {

    private int points, roadLength, armySize;
    private Tile[][] grid;
    private ArrayList<Resource> resources;

    public Player() {
        points = 0;
        roadLength = 1;
        grid = new Tile[6][6];
        resources = new ArrayList<Resource>();
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
