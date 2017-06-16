import java.util.ArrayList;

/**
 * Created by Jasper on 30/03/15.
 */
public class Game extends Thread {
    private ArrayList<Player> players;
    private Bank bank;
    private Board board;

    public Game() {
        players = new ArrayList<Player>();
        bank = new Bank();
        board = new Board();
    }

    public void addPlayer(Player player) {
        if(players.size() < 5) {
            players.add(player);
        } else {
            System.out.println("Maximum players has been reached, unable to add another.");
        }

        System.out.println("You currently have " + players.size() + " in-game.");
    }

    public void removePlayer(Player player) {
        if(players.size() > 0) {
            players.remove(player);
        } else {
            System.out.println("You may not remove a player if you have less than 1 in game.");
        }

        System.out.println("You currently have " + players.size() + " in-game.");
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
