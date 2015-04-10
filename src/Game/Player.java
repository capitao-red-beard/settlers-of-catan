package Game;

import Board.Intersection;
import Board.Tile;
import Construction.*;
import Resources.Resource;

import java.util.HashMap;

/**
 * Created by Jasper on 30/03/15.
 */
public class Player {

    private int points, roadLength, armySize;
    private String name, colour;
    private HashMap<Resource, Integer> resources;
    private HashMap<Construction, Integer> constructions;
    private Construction road, city, settlement;

    public Player(String name, String colour) {
        this.name = name;
        this.colour = colour;

        points = 0;
        roadLength = 0;
        armySize = 0;

        resources = new HashMap<Resource, Integer>();
        constructions = new HashMap<Construction, Integer>();

        road = new Road(this);
        city = new City(this);
        settlement = new Settlement(this);

        constructions.put(road, 15);
        constructions.put(city, 5);
        constructions.put(settlement, 10);
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

    public String getResources() {
        return resources.entrySet().toString();
    }

    public void addRoadLength(int value) {
        roadLength += value;
    }

    public int getRoadLength() {
        return roadLength;
    }

    public void addConstruction(Construction construction, int value) {
        constructions.put(construction, value);
    }

    public int getConstruction(Construction construction) {
        return constructions.get(construction);
    }

    public void roll(Dice dice) {
        int rolled = dice.roll();
    }

    public void moveRobber(Robber robber, Tile tile) {
        robber.moveRobber(tile);
    }

    // this may not be correct
    public void buildSettlement(Intersection intersection) {
        settlement.setIntersection(intersection);
        constructions.remove(settlement, 1);
    }

    // this may not be correct
    public void buildCity(Intersection intersection) {
        if (intersection.getConstruction() == settlement) {
            city.setIntersection(intersection);
            constructions.remove(city, 1);
            constructions.put(settlement, 1);
        }
    }

    // this may not be correct
    public void buildRoad(Intersection intersection) {
        road.setIntersection(intersection);
        constructions.remove(road, 1);

    }

    public String toString() {
        return name + colour;
    }
}
