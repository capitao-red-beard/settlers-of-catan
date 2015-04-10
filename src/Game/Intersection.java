package Game;

import java.util.ArrayList;

/**
 * Created by Jasper on 10/04/15.
 */
public class Intersection {
    private ArrayList<Tile> tiles;

    public Intersection() {

    }

    public void addTiles(Tile tileOne, Tile tileTwo, Tile tileThree) {
        tiles.add(tileOne);
        tiles.add(tileTwo);
        tiles.add(tileThree);
    }
}
