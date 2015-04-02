import java.util.ArrayList;

/**
 * Created by Jasper on 30/03/15.
 */
public class Game {
    ArrayList<Player> players;
    ArrayList<Resource> resources;
    Resource wood = new Resource("Wood");
    Resource sheep = new Resource("Sheep");
    Resource wheat = new Resource("Wheat");
    Resource stone = new Resource("Stone");
    Resource iron = new Resource("Iron");

    public Game() {
        players = new ArrayList<Player>();
        resources = new ArrayList<Resource>();
        loadResources();
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public void loadResources() {
        for (int i = 0; i < 50; ++i) {

            resources.add(wood);
            resources.add(sheep);
            resources.add(wheat);
            resources.add(stone);
            resources.add(iron);
        }
    }

    public void giveWood(Player player, int value) {
            player.addResource(wood, value);
    }

    public void giveSheep(Player player, int value) {
        player.addResource(sheep, value);
    }
}
