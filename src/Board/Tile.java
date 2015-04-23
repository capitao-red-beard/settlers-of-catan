package Board;

import Construction.Construction;
import Terrain.*;

/**
 * Created by Jasper on 05/04/15.
 */
public class Tile {

    private Terrain terrain;
    private int value;
    private boolean robber;
    private Construction construction;

    private Tile center, east, northEast, southEast, west, northWest, southWest;

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

    public Tile getEast() {
        return east;
    }

    public void setEast(Tile tile) {
        east = tile;
    }

    public Tile getNorthEast() {
        return northEast;
    }

    public void setNorthEast(Tile tile) {
        northEast = tile;
    }

    public Tile getSouthEast() {
        return southEast;
    }

    public void setSouthEast(Tile tile) {
        southEast = tile;
    }

    public Tile getWest() {
        return west;
    }

    public void setWest(Tile tile) {
        west = tile;
    }

    public Tile getNorthWest() {
        return northWest;
    }

    public void setNorthWest(Tile tile) {
        northWest = tile;
    }

    public Tile getSouthWest() {
        return southWest;
    }

    public void setSouthWest(Tile tile) {
        southWest = tile;
    }

    public Tile getCenter() {
        return center;
    }

    public void setCenter(Tile tile) {
        center = tile;
    }

    public boolean getRobber() {
        return robber;
    }

    public void setRobber(boolean status) {
        robber = status;
    }

    public Construction getConstruction() {
        return construction;
    }

    public void setConstruction(Construction construction) {
        if (construction.getType() == "Settlement") {
            this.construction = construction;
        } else {
            System.out.println("You may only place a city where there is already a settlement");
        }
    }

    public String getBorders() {
        return "East: (" + east + ")\nNorth East: (" + northEast + ")\nSouth East: (" + southEast + ")\nWest: (" + west
                + ")\nNorth West: (" + northWest + ")\nSouth West: (" + southWest + ")\nRobber: (" + robber + ")";
    }

    public String toString () {
        return "Terrain: " + terrain.getType() + " | Value: " + value;
    }
}
