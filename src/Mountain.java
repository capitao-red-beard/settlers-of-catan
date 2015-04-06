/**
 * Created by Jasper on 06/04/15.
 */
public class Mountain implements Terrain {

    private String type;

    public Mountain() {
        type = "Mountain";
    }

    @Override
    public String getType() {
        return type;
    }
}
