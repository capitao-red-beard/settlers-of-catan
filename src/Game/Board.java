package Game;

import Terrain.*;

/**
 * Created by Jasper on 30/03/15.
 */
public class Board {

    private Tile[] tiles;

    public Board() {
        tiles = new Tile[37];

        tiles[0] = new Tile(new Harbor());
        tiles[0].setNorthEast(null);
        tiles[0].setEast(tiles[1]);
        tiles[0].setSouthEast(tiles[5]);
        tiles[0].setSouthWest(tiles[4]);
        tiles[0].setWest(null);
        tiles[0].setNorthWest(null);

        tiles[1] = new Tile(new Sea());
        tiles[2] = new Tile(new Harbor());
        tiles[3] = new Tile(new Sea());
        tiles[4] = new Tile(new Sea());
        tiles[5] = new Tile(new Forest(), 11);
        tiles[6] = new Tile(new Pasture(), 12);
        tiles[7] = new Tile(new Field(), 9);
        tiles[8] = new Tile(new Harbor());
        tiles[9] = new Tile(new Harbor());
        tiles[10] = new Tile(new Hill(), 4);
        tiles[11] = new Tile(new Mountain(), 6);
        tiles[12] = new Tile(new Hill(), 5);
        tiles[13] = new Tile(new Pasture(), 10);
        tiles[14] = new Tile(new Sea());
        tiles[15] = new Tile(new Sea());
        tiles[16] = new Tile(new Desert());
        tiles[17] = new Tile(new Forest(), 3);
        tiles[18] = new Tile(new Field(), 11);
        tiles[19] = new Tile(new Forest(), 4);
        tiles[20] = new Tile(new Field(), 8);
        tiles[21] = new Tile(new Harbor());
        tiles[22] = new Tile(new Harbor());
        tiles[23] = new Tile(new Hill(), 8);
        tiles[24] = new Tile(new Pasture(), 10);
        tiles[25] = new Tile(new Pasture(), 9);
        tiles[26] = new Tile(new Mountain(), 3);
        tiles[27] = new Tile(new Sea());
        tiles[28] = new Tile(new Mountain(), 5);
        tiles[29] = new Tile(new Field(), 2);
        tiles[30] = new Tile(new Forest(), 6);
        tiles[31] = new Tile(new Harbor());
        tiles[32] = new Tile(new Harbor());
        tiles[33] = new Tile(new Sea());
        tiles[34] = new Tile(new Sea());
        tiles[35] = new Tile(new Harbor());
        tiles[36] = new Tile(new Sea());
    }

    public String getTile(int number) {
        return tiles[number].toString();
    }
}
