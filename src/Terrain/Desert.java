package Terrain;

/**
 * Created by Jasper on 06/04/15.
 */
public class Desert implements Terrain {

    private String type;

    public Desert() {
        type = "Desert";
    }

    @Override
    public String getType() {
        return type;
    }
}
