/**
 * Created by Jasper on 05/04/15.
 */
public class Wheat implements Resource {

    private String type;

    public Wheat() {
        type = "Wheat";
    }

    @Override
    public String getType() {
        return type;
    }
}
