/**
 * Created by Jasper on 30/03/15.
 */
public class Player {

    private int points, roadLength, armySize;
    private Board board;
    private String name, colour;

    public Player(String name, String colour) {
        this.name = name;
        this.colour = colour;
        points = 0;
        roadLength = 1;
    }

    public void addPoints(int value) {
        points += value;
    }

    public void removePoints(int value) {
        points -= value;
    }

    public int getPoints() {
        return points;
    }

    public void addResource() {

    }

    public void removeResource() {

    }

    public int getResourceValue() {
        return 0;
    }
}
