/**
 * Created by Jasper on 05/04/15.
 */
public class Wood implements Resource {

    private String type;

    public Wood(String type) {
        this.type = type;
    }

    @Override
    public String getType() {
        return type;
    }
}
