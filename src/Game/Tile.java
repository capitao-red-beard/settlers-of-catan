package Game;

import Terrain.*;
import Construction.*;

/**
 * Created by Jasper on 05/04/15.
 */
public class Tile {

    private Terrain terrain;
    private int value;
    private Construction construction;
    private Robber robber;

    private Tile north, northEast, northWest, south, southEast, southWest;

    public Tile() {
    }

    public Tile (Terrain terrain) {
        this.terrain = terrain;
    }

    public Tile(Terrain terrain, int value) {
        this.terrain = terrain;
        this.value = value;
    }

    public Terrain getTerrain() {
        return terrain;
    }

    public void setTerrain(Terrain terrain) {
        this.terrain = terrain;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getConstruction() {
        return construction.getType();
    }

    public void setConstruction(Construction construction) {
        this.construction = construction;
    }

    public Tile getNorth() {
        return north;
    }

    public void setNorth(Tile tile) {
        north = tile;
    }

    public Tile getNorthEast() {
        return northEast;
    }

    public void setNorthEast(Tile tile) {
        northEast = tile;
    }

    public Tile getNorthWest() {
        return northWest;
    }

    public void setNorthWest(Tile tile) {
        northWest = tile;
    }

    public Tile getSouth() {
        return south;
    }

    public void setSouth(Tile tile) {
        south = tile;
    }

    public Tile getSouthEast() {
        return southEast;
    }

    public void setSouthEast(Tile tile) {
        southEast = tile;
    }

    public Tile getSouthWest() {
        return southWest;
    }

    public void setSouthWest(Tile tile) {
        southWest = tile;
    }

    public String toString () {
        return "Terrain: " + terrain.getType() + " | Value: " + value;
    }
}
