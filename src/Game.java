import java.util.ArrayList;

/**
 * Created by Jasper on 30/03/15.
 */
public class Game extends Thread {
    private ArrayList<Player> players;
    private Bank bank;

    public Game() {
        players = new ArrayList<Player>();
        bank = new Bank();
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public void getPlayPoints() {
        for (Player player : players) {
            System.out.println(player.getPoints());
        }
    }

    public int rollDice() {
        return 2 + (int)(Math.random() * ((12 - 2) + 1));
    }
}
