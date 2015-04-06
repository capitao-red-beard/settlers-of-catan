/**
 * Created by Jasper on 05/04/15.
 */
public class Stone implements Resource {

    private String type;

    public Stone() {
        type = "Stone";
    }

    @Override
    public String getType() {
        return type;
    }
}
