import java.util.ArrayList;

/**
 * Created by Jasper on 30/03/15.
 */
public class Player {

    private int points, roadLength, armySize;
    private ArrayList<Resource> resources;
    private Board board;
    private String name, colour;

    public Player(String name, String colour) {
        this.name = name;
        this.colour = colour;
        points = 0;
        roadLength = 1;
        resources = new ArrayList<Resource>();
    }

    public void addPoints(int value) {
        points += value;
    }

    public void removePoints(int value) {
        points -= value;
    }
    public int getPoints() {
        return points;
    }

    public void addResource(Resource resource, int value) {
        for (int i = 0; i < value; ++i) {
            resources.add(resource);
        }
    }

    public void removeResource(Resource resource, int value) {
        for (int i = 0; i < resources.size(); ++i) {
            if (resources.get(i).getType() == resource.getType()) {
                for (int j = 0; j < value; ++j) {
                    resources.remove(resource);
                }
            }
        }
    }

    public int getResourceValue(Resource resource) {
        int value = 0;

        for (int i = 0; i < resources.size(); ++i) {
            if (resources.get(i).getType() == resource.getType()) {
                value++;
            }
        }

        return value;
    }
}
