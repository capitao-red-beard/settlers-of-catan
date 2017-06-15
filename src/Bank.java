
import java.util.HashMap;

/**
 * Created by Jasper on 06/04/15.
 */
public class Bank {

    private HashMap<Resource, Integer> resources;

    public Bank() {
        resources = new HashMap<Resource, Integer>();
    }

    public void giveResource(Player player, Resource resource, int value) {
        player.addResource(resource, value);
        resources.put(resource, resources.get(resource) - value);
    }

    public void takeResource(Player player, Resource resource, int value) {
        this.addResource(resource, value);
        player.removeResource(resource, value);
    }

    public void addResource(Resource resource, int value) {
        resources.put(resource, resources.get(resource) + value);
    }

    public void removeResource(Resource resource, int value) {
        resources.put(resource, resources.get(resource) - value);
    }
}
