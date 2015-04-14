package Game;

import Resources.*;

import java.util.HashMap;

/**
 * Created by Jasper on 06/04/15.
 */
public class Bank {

    private HashMap<Resource, Integer> resources;
    private Brick brick;
    private Grain grain;
    private Lumber lumber;
    private Ore ore;
    private Wool wool;

    public Bank() {
        resources = new HashMap<Resource, Integer>();
        resources.put(brick, 50);
        resources.put(grain, 50);
        resources.put(lumber, 50);
        resources.put(ore, 50);
        resources.put(wool, 50);
    }

    public void giveResource(Player player, Resource resource, int value) {
        player.addResource(resource, value);
        resources.put(resource, resources.get(resource) - value);
    }

    public void addResource(Resource resource, int value) {
        resources.put(resource, resources.get(resource) + value);
    }
}
