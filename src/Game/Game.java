package Game;

import java.util.ArrayList;

/**
 * Created by Jasper on 30/03/15.
 */
public class Game {
    private ArrayList<Player> players;
    private Bank bank;
    private Dice dice;

    public Game() {
        players = new ArrayList<Player>();
        bank = new Bank();
    }

    public void addPlayer(Player player) {
        players.add(player);
    }
}
