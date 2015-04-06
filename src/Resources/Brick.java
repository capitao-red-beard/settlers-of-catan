package Resources;

import Terrain.Hill;

/**
 * Created by Jasper on 05/04/15.
 */
public class Brick extends Hill implements Resource {

    private String type;

    public Brick() {
        type = "Brick";
    }

    @Override
    public String getType() {
        return type;
    }
}
