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

    public void addCity(Player player, int row, int col) {

    }

    public void addSettlement(Player player, int row, int col) {

    }

    public void addRoad(Player player, int row, int col) {

    }
}
