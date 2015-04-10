package Construction;

import Game.Player;

/**
 * Created by Jasper on 05/04/15.
 */
public class City implements Construction {

    private Player player;
    private String type;

    public City(Player player) {
        type = "City";
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
