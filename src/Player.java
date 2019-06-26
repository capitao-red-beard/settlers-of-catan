import java.util.HashMap;

/**
 * Created by Jasper on 30/03/15.
 */
public class Player extends Thread {

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

    public void removeResource(Resource resource, int value, Bank bank) {
        if (resources.get(resource) >= value) {
            resources.put(resource, resources.get(resource) - value);
            bank.addResource(resource, value);
        } else {
            System.out.println("Unable to remove resource " + resource + " from " + name + " because they do not have " +
                    "enough " + resource + " to remove.");
        }
    }

    public String getResources() {
        return resources.entrySet().toString();
    }

    public void addRoadLength(int value) {
        roadLength += value;
    }

    public void removeRoadLength(int value) { roadLength -= value; }

    public int getRoadLength() {
        return roadLength;
    }

    public void roll(Game game) {
        int rolled = game.rollDice();
    }

    public void moveRobber(Robber robber, Tile tile) {
        robber.moveRobber(tile);
    }

    public void buildConstruction(String type, Tile tile1, Tile tile2, Tile tile3) {
        if (tile1.hasConstruction() || tile2.hasConstruction() || tile3.hasConstruction()) {
            System.out.println("One of the tiles on which you are trying to build already has a construction.");
        } else {
            Construction construction = new Construction(this, type);
            tile1.setConstruction(construction);
            tile2.setConstruction(construction);
            tile3.setConstruction(construction);
        }
    }

    public void addSpecialCard(Resource resource, int value) {
        resources.put(resource, value);
    }

    public String toString() {
        return "Name: " + name + "\nColour: " + colour;
    }
}
