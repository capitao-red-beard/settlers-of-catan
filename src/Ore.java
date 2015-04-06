/**
 * Created by Jasper on 05/04/15.
 */
public class Ore implements Resource {

    private String type;

    public Ore() {
        type = "Ore";
    }

    @Override
    public String getType() {
        return type;
    }
}
