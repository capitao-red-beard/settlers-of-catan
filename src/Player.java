import java.util.ArrayList;

/**
 * Created by Jasper on 30/03/15.
 */
public class Player {

    private int points, roadLength, armySize;
    private String name, colour;

    public Player(String name, String colour) {
        this.name = name;
        this.colour = colour;
        points = 0;
        roadLength = 0;
        armySize = 0;
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

    public void addResource() {

    }

    public void removeResource() {

    }

    public int getResourceValue() {
        return 0;
    }

    public void addRoad(int value) {
        roadLength += value;
    }

    public int getRoadLength() {
        return roadLength;
    }

    public void addCity(City city) {
        addPoints(2);
    }

    public void addSettlement(Settlement settlement) {
        addPoints(1);
    }

    public void addRoad(Road road) {

    }
}
