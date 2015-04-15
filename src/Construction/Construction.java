package Construction;

import Game.Player;

/**
 * Created by Jasper on 05/04/15.
 */
public interface Construction {

    String getOwner();
    void setOwner(Player player);
    String getType();
    String toString();
}
