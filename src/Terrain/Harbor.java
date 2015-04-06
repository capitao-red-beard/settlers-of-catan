package Terrain;

/**
 * Created by Jasper on 06/04/15.
 */
public class Harbor implements Terrain {

    private String type;

    public Harbor() {
        type = "Harbor";
    }

    @Override
    public String getType() {
        return type;
    }
}
