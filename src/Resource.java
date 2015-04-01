/**
 * Created by Jasper on 30/03/15.
 */
public class Resource {

    String type;
    int value;

    public Resource(String type) {
        this.type = type;
    }

    public void setName(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void addValue() {
        value += 1;
    }

    public void setValue(int value) {
        this.value = value;
    }
}