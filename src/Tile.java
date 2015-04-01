import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Jasper on 30/03/15.
 */
public class Tile {

    private ArrayList<Resource> resources;
    private Resource wood, sheep, wheat, stone, iron, resource;
    private int value, resourceValue;
    private Random random;

    public Tile() {
        this.randomValue(2, 12);
        this.randomResource();
    }

    public int randomValue(int min, int max) {
        random = new Random();
        value = random.nextInt(max - min) + min;
        return value;
    }

    public Resource randomResource() {
        resources = new ArrayList<Resource>();

        wood = new Resource("Wood");
        sheep = new Resource("Sheep");
        wheat = new Resource("Wheat");
        stone = new Resource("Stone");
        iron = new Resource("Iron");

        resources.add(wood);
        resources.add(sheep);
        resources.add(wheat);
        resources.add(stone);
        resources.add(iron);

        resourceValue = random.nextInt(resources.size());
        resource = resources.get(resourceValue);

        return resource;
    }

    public String toString() {
        return "Resource: " + resource.getType() + " | Value: " + value;
    }
}
