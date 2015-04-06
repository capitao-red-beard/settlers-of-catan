package Game;

/**
 * Created by Jasper on 30/03/15.
 */
public class Board {

    private Tile[][] tiles;

    public Board() {
        tiles = new Tile[7][7];
    }

    public String getTile(int row, int col) {
        return tiles[row][col].toString();
    }
}
