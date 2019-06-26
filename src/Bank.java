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
        if (resources.get(resource) >= value) {
            this.removeResource(resource, value);
            player.addResource(resource, value);
        } else {
            System.out.println("Bank has no more resource" + resource + " to give.");
        }
    }

    public void takeResource(Player player, Resource resource, int value) {
        this.addResource(resource, value);
        player.removeResource(resource, value, this);
    }

    public void addResource(Resource resource, int value) {
        resources.put(resource, resources.get(resource) + value);
    }

    public void removeResource(Resource resource, int value) {
        resources.put(resource, resources.get(resource) - value);
    }

    public String toString() {
        return "Resources: " + resources.keySet() + " Value: " + resources.values();
    }
}
