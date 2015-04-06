package Resources;

import Terrain.Mountain;

/**
 * Created by Jasper on 05/04/15.
 */
public class Ore extends Mountain implements Resource {

    private String type;

    public Ore() {
        type = "Ore";
    }

    @Override
    public String getType() {
        return type;
    }
}
