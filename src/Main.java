import Game.*;

/**
 * Created by Jasper on 31/03/15.
 */
public class Main {

    public static void main (String[] args) {
        Board board = new Board();

        Tile tile;

        tile = board.getRealTile(0);

        System.out.println(tile.getBorders());
    }
}
