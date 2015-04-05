import java.util.ArrayList;

/**
 * Created by Jasper on 30/03/15.
 */
public class Game {
    ArrayList<Player> players;
    ArrayList<Resource> resources;

    public Game() {
        players = new ArrayList<Player>();
        resources = new ArrayList<Resource>();
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public void giveResource() {

    }
}
