/**
 * Created by Jasper on 05/04/15.
 */
public class Tile {

    private Resource resource;
    private int value;
    private Construction construction;
    private Robber robber;

    public Tile() {

    }

    public Tile(Resource resource) {

    }

    public Tile(Resource resource, int value) {
        this.resource = resource;
        this.value = value;
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

    public String getConstruction() {
        return construction.getType();
    }

    public void setConstruction(Construction construction) {
        this.construction = construction;
    }

    public String toString () {
        return "Resource: " + resource.getType() + " | Value: " + value;
    }
}
