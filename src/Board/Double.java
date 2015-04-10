package Board;

import Construction.Construction;

import java.util.ArrayList;

/**
 * Created by Jasper on 10/04/15.
 */
public class Double implements Intersection {

    private ArrayList<Tile> tiles;
    private Construction construction;

    public Double(Tile tile1, Tile tile2) {
        tiles.add(tile1);
        tiles.add(tile2);
    }

    @Override
    public Construction getConstruction() {
        return construction;
    }

    @Override
    public void setConstruction(Construction construction) {
        if (this.construction != null) {
            this.construction = construction;
        } else {
            System.out.println("This path already has a construction built on it, please try another one");
        }
    }
}
