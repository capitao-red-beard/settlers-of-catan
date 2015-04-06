/**
 * Created by Jasper on 05/04/15.
 */
public class Wood implements Resource {

    private String type;

    public Wood() {
        type = "Wood";
    }

    @Override
    public String getType() {
        return type;
    }
}
