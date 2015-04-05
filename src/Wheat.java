/**
 * Created by Jasper on 05/04/15.
 */
public class Wheat implements Resource {

    private String type;

    public Wheat(String type) {
        this.type = type;
    }

    @Override
    public String getType() {
        return type;
    }
}
