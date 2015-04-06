package Resources;

import Terrain.Pasture;

/**
 * Created by Jasper on 05/04/15.
 */
public class Wool extends Pasture implements Resource {

    private String type;

    public Wool() {
        type = "Wool";
    }

    @Override
    public String getType() {
        return type;
    }
}
