import java.util.HashMap;

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

    /** Try to return a string version of the HashMap
    public String toString() {
        String words = "";
        for(int i = 0; i == resources.size(); ++i) {
            // get individual value and add to string words with a space.
        }
    } **/
}
