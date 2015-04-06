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

    public Tile() {

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

    public String toString () {
        return "Terrain.Terrain: " + terrain.getType() + " | Value: " + value;
    }
}
