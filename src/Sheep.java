/**
 * Created by Jasper on 05/04/15.
 */
public class Sheep implements Resource {

    private String type;

    public Sheep() {
        type = "Sheep";
    }

    @Override
    public String getType() {
        return type;
    }
}
