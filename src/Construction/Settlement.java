package Construction;

import Board.Intersection;
import Game.Player;

/**
 * Created by Jasper on 05/04/15.
 */
public class Settlement implements Construction {

    private Player player;
    private String type;
    private Intersection intersection;

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

    @Override
    public Intersection getIntersection() {
        return intersection;
    }

    @Override
    public void setIntersection(Intersection intersection) {
        this.intersection = intersection;
    }
}
