package Construction;

import Game.Player;
import Game.Tile;

/**
 * Created by Jasper on 05/04/15.
 */
public class City implements Construction {

    private Player player;
    private String type;
    private Tile[] tile;

    public City(Player player, Tile[] tile) {
        type = "City";
        this.player = player;
        this.tile = tile;
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
