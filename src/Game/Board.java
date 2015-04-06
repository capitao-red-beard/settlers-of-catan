package Game;

import Terrain.Field;
import Terrain.Sea;

/**
 * Created by Jasper on 30/03/15.
 */
public class Board {

    private Tile[] tiles;

    public Board() {
        tiles = new Tile[49];

        tiles[0] = new Tile(new Sea());
    }

    public String getTile(int number) {
        return tiles[number].toString();
    }
}
