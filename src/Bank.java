
import sun.tools.jconsole.Tab;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Jasper on 06/04/15.
 */
public class Bank {

    private HashMap<Resource, Integer> resources;
    private Resource grain, iron, wood, sheep, stone;

    public Bank() {
        resources = new HashMap<Resource, Integer>();

        grain = new Resource("Grain");
        iron = new Resource("Iron");
        wood = new Resource("Wood");
        sheep = new Resource("Sheep");
        stone = new Resource("Stone");

        resources.put(grain, 50);
        resources.put(iron, 50);
        resources.put(wood, 50);
        resources.put(sheep, 50);
        resources.put(stone, 50);
    }

    public void giveResource(Player player, Resource resource, int value) {
        this.removeResource(resource, value);
        player.addResource(resource, value);
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

    public String toString() {
        String text = "";
        for (HashMap.Entry<String, Tab> entry : hash.entrySet()) {
            String key = entry.getKey();
            Tab tab = entry.getValue();

            text = key + tab.toString();
        }

        return text;
    }
}
