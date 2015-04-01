import java.util.ArrayList;

/**
 * Created by Jasper on 30/03/15.
 */
public class Game {
    ArrayList<Player> players;

    public Game() {
        players = new ArrayList<Player>();
    }

    public void addPlayer(Player player) {
        players.add(player);
    }
}
