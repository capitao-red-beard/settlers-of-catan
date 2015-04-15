package Game;

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

    public Player(String name, String colour) {
        this.name = name;
        this.colour = colour;

        points = 0;
        roadLength = 0;
        armySize = 0;

        resources = new HashMap<Resource, Integer>();

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
            resources.put(resource, resources.get(resource) + value);
    }

    public void removeResource(Bank bank, Resource resource, int value) {
        bank.addResource(resource, value);
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

    public void roll(Dice dice) {
        int rolled = dice.roll();
    }

    public void moveRobber(Robber robber, Tile tile) {
        robber.moveRobber(tile);
    }

    public String toString() {
        return "Name: " + name + "\nColour: " + colour;
    }
}
