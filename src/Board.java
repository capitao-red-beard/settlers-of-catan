/**
 * Created by Jasper on 30/03/15.
 */
public class Board {

    private Tile[][] tiles;

    public Board() {
        tiles = new Tile[6][6];

        for (int i = 0; i < tiles.length; ++i) {
            for (int j = 0; j < tiles.length; ++j) {
                tiles[i][j] = new Tile();
            }
        }
    }
}
