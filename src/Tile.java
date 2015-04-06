/**
 * Created by Jasper on 05/04/15.
 */
public class Tile {

    private Resource resource;
    private int value;
    private Construction construction;

    public Tile(Resource resource, int value) {
        this.resource = resource;
        this.value = value;
    }

    public Tile(Resource resource, int value, Construction construction) {
        this.resource = resource;
        this.value = value;
        this.construction = construction;
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

    public void setConstruction(Construction construction) {
        this.construction = construction;
    }

    public Construction getConstruction() {
        return construction;
    }

    public String toString () {
        return "Resource: " + resource.getType() + "Value: " + value;
    }
}
