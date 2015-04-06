package Construction;

import Game.Player;

/**
 * Created by Jasper on 30/03/15.
 */
public class Robber implements Construction {

    private Player player;
    private String type;

    public Robber() {
        type = "Robber";
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
