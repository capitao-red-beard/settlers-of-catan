package Construction;

import Game.Player;
import Game.Tile;

/**
 * Created by Jasper on 30/03/15.
 */
public class Robber implements Construction {

    private Player player;
    private String type;
    private Tile[] tile;

    public Robber(Tile[] tile) {
        type = "Robber";
        this.tile = tile;
    }

    @Override
    public String getOwner() {
        return null;
    }

    @Override
    public String getType() {
        return null;
    }
}
