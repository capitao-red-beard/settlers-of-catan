import java.util.ArrayList;

/**
 * Created by Jasper on 30/03/15.
 */
public class Game {
    private ArrayList<Player> players;

    public Game() {
        players = new ArrayList<Player>();
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public void giveResource(Player player, Resource resource, int value) {
        player.addResource(resource, value);
    }
}
