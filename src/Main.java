import Construction.Robber;
import Game.*;

/**
 * Created by Jasper on 31/03/15.
 */
public class Main {

    public static void main (String[] args) {
        Board board = new Board();

        Player player = new Player("Jasper", "Orange");

        Robber robber = new Robber();

        Tile tile;

        player.moveRobber(robber, board.getRealTile(0));

        tile = board.getRealTile(0);

        System.out.println(tile.getBorders());
    }
}
