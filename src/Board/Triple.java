package Board;

import Construction.Construction;

import java.util.ArrayList;

/**
 * Created by Jasper on 10/04/15.
 */
public class Triple implements Intersection {

    private ArrayList<Tile> tiles;
    private Construction construction;

    public Triple(Tile tile1, Tile tile2, Tile tile3) {
        tiles.add(tile1);
        tiles.add(tile2);
        tiles.add(tile3);
    }

    @Override
    public void addConstruction(Construction construction) {
        if (this.construction != null) {
            this.construction = construction;
        } else {
            System.out.println("This path already has a construction built on it, please try another one");
        }
    }

    public ArrayList<Tile> getTiles() {
        return tiles;
    }
}
