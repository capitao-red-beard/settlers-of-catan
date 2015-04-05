import java.util.ArrayList;

/**
 * Created by Jasper on 30/03/15.
 */
public class Game {
    private ArrayList<Player> players;
    private ArrayList<Wood> wood;
    private ArrayList<Wheat> wheat;
    private ArrayList<Sheep> sheep;
    private ArrayList<Stone> stone;
    private ArrayList<Iron> iron;

    public Game() {
        players = new ArrayList<Player>();
        wood = new ArrayList<Wood>();
        wheat = new ArrayList<Wheat>();
        sheep = new ArrayList<Sheep>();
        stone = new ArrayList<Stone>();
        iron = new ArrayList<Iron>();
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public void giveResource(Player player, Wood wood) {

    }

    public void giveResource(Player player, Wheat wheat) {

    }

    public void giveResource(Player player, Sheep sheep) {

    }

    public void giveResource(Player player, Stone stone) {

    }

    public void giveResource(Player player, Iron iron) {

    }
}
