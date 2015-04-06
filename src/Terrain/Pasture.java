package Terrain;

/**
 * Created by Jasper on 06/04/15.
 */
public class Pasture implements Terrain {

    private String type;

    public Pasture() {
        type = "Pasture";
    }

    @Override
    public String getType() {
        return type;
    }
}
