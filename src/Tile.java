/**
 * Created by Jasper on 05/04/15.
 */
public class Tile {

    private Resource resource;
    private int value;

    public Tile() {
    }

    public Resource getResource() {
        return resource;
    }

    public void setResource(Resource resource) {
        this.resource = resource;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String toString () {
        return "Resource: " + resource.getType() + "Value: " + value;
    }
}
