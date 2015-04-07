package Construction;

import Game.Player;
import Game.Tile;

/**
 * Created by Jasper on 05/04/15.
 */
public class Settlement implements Construction {

    private Player player;
    private String type;

    public Settlement(Player player) {
        type = "Settlement";
        this.player = player;
    }

    @Override
    public String getOwner() {
        return player.toString();
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Construct: " + type + " Owner: " + player.toString();
    }
}
