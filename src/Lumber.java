/**
 * Created by Jasper on 05/04/15.
 */
public class Lumber implements Resource {

    private String type;

    public Lumber() {
        type = "Lumber";
    }

    @Override
    public String getType() {
        return type;
    }
}
