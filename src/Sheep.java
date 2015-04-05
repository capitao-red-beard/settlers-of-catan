/**
 * Created by Jasper on 05/04/15.
 */
public class Sheep implements Resource {

    private String type;

    public Sheep(String type) {
        this.type = type;
    }

    @Override
    public String getType() {
        return type;
    }
}
