
import java.util.HashMap;

/**
 * Created by Jasper on 30/03/15.
 */
public class Player {

    private int points, roadLength, armySize;
    private String name, colour;
    private HashMap<Resource, Integer> resources;

    public Player(String name, String colour) {
        this.name = name;
        this.colour = colour;

        points = 0;
        roadLength = 0;
        armySize = 0;

        resources = new HashMap<Resource, Integer>();
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

    public void setPoints(int value) {
        points = value;
    }

    public void addArmy(int value) {
        armySize += value;
    }

    public void removeArmy(int value) {
        armySize -= value;
    }

    public int getArmyValue() {
        return armySize;
    }

    public void addResource(Resource resource, int value) {
            resources.put(resource, resources.get(resource) + value);
    }

    // removed bank parameter from here as it can be done in the bank class.
    public void removeResource(Resource resource, int value) {
        resources.put(resource, resources.get(resource) - value);
    }

    public String getResources() {
        return resources.entrySet().toString();
    }

    public void addRoadLength(int value) {
        roadLength += value;
    }

    public int getRoadLength() {
        return roadLength;
    }

    public void roll(Game game) {
        int rolled = game.rollDice();
    }

    public void moveRobber(Robber robber, Tile tile) {
        robber.moveRobber(tile);
    }

    public void buildConstruction(String type, int tile) {
        if (type == "Road") {

        }
    }

    public void addSpecialCard(Resource resource, int value) {
        resources.put(resource, value);
    }

    public String toString() {
        return "Name: " + name + "\nColour: " + colour;
    }
}
