package Construction;

import Game.Player;
import Board.Tile;

/**
 * Created by Jasper on 30/03/15.
 */
public class Robber {

    private Player player;
    private String type;

    public Robber() {
        type = "Robber";
    }

    public String getOwner() {
        return player.toString();
    }

    public String getType() {
        return type;
    }

    public void moveRobber(Tile tile) {
        tile.setRobber(true);
    }
}
