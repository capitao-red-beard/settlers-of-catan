package Game;

/**
 * Created by Jasper on 30/03/15.
 */
public class Board {

    private Tile[] tiles;

    public Board() {
        tiles = new Tile[49];
    }

    public String getTile(int number) {
        return tiles[number].toString();
    }
}
