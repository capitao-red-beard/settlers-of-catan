/**
 * Created by Jasper on 30/03/15.
 */
public class Board {

    private Tile[][] tiles;

    public Board() {
        tiles = new Tile[5][5];

        for (int i = 0; i < tiles.length; ++i) {
            for (int j = 0; j < tiles.length; ++j) {
                tiles[i][j] = new Tile();
            }
        }
    }

    public String getTile(int row, int col) {
        return tiles[row][col].toString();
    }
}
