import java.util.HashMap;
import java.util.Set;

/**
 * Created by Jasper on 30/03/15.
 */
public class Player {

    private int points, roadLength, armySize;
    private String name, colour;
    private HashMap<Resource, Integer> resources;
    private HashMap<Construction, Integer> constructions;
    private City city;
    private Settlement settlement;
    private Road road;

    public Player(String name, String colour) {
        this.name = name;
        this.colour = colour;

        points = 0;
        roadLength = 0;
        armySize = 0;

        resources = new HashMap<Resource, Integer>();
        constructions = new HashMap<Construction, Integer>();

        city = new City(this);
        settlement = new Settlement(this);
        road = new Road(this);

        constructions.put(city, 5);
        constructions.put(settlement, 5);
        constructions.put(road, 15);
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
        for (int i = 0; i < value; ++i) {
            resources.remove(resource);
        }
    }

    public void removeResource(Resource resource, int value) {
        resources.put(resource, value);
    }

    public Set getResources() {
        return resources.entrySet();
    }

    public void addRoadLength(int value) {
        roadLength += value;
    }

    public int getRoadLength() {
        return roadLength;
    }

    public void addSettlements(Construction construction, int value) {
        constructions.put(construction, value);
    }

    public int getSettlements(Construction construction) {
        return constructions.get(construction);
    }

    public String toString() {
        return name + colour;
    }
}
