package Terrain;

/**
 * Created by Jasper on 06/04/15.
 */
public class Forest implements Terrain {

    private String type;

    public Forest() {
        type = "Forest";
    }

    @Override
    public String getType() {
        return type;
    }
}
