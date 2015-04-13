package Game;

import Board.Intersection;
import Board.Tile;
import Construction.*;
import Resources.*;

import java.util.HashMap;

/**
 * Created by Jasper on 30/03/15.
 */
public class Player {

    private int points, roadLength, armySize;
    private String name, colour;
    private HashMap<Resource, Integer> resources;
    private HashMap<Construction, Integer> constructions;

    public Player(String name, String colour) {
        this.name = name;
        this.colour = colour;

        points = 0;
        roadLength = 0;
        armySize = 0;

        resources = new HashMap<Resource, Integer>();
        constructions = new HashMap<Construction, Integer>();

        Brick brick = new Brick();
        Grain grain = new Grain();
        Lumber lumber = new Lumber();
        Ore ore = new Ore();
        Wool wool = new Wool();

        resources.put(brick, 0);
        resources.put(grain, 0);
        resources.put(lumber, 0);
        resources.put(ore, 0);
        resources.put(wool, 0);

        City city = new City(this);
        Road road = new Road(this);
        Settlement settlement = new Settlement(this);

        constructions.put(city, 5);
        constructions.put(road, 15);
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

    public void buildSettlement(Intersection intersection) {
        intersection.setConstruction(new Settlement(this));
        points++;
    }

    public void buildCity(Intersection intersection, Settlement settlement) {
        if (intersection.getConstruction() == settlement) {
            intersection.setConstruction(new City(this));
            points += 2;
        }
    }

    public void buildRoad(Intersection intersection) {
        intersection.setConstruction(new Road(this));
    }

    public String toString() {
        return name + colour;
    }
}
