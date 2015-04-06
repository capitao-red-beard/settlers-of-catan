/**
 * Created by Jasper on 06/04/15.
 */
public class Field implements Terrain {

    private String type;

    public Field() {
        type = "Field";
    }

    @Override
    public String getType() {
        return type;
    }
}
