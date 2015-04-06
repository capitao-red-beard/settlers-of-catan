package Resources;

import Terrain.Field;

/**
 * Created by Jasper on 05/04/15.
 */
public class Grain extends Field implements Resource {

    private String type;

    public Grain() {
        type = "Grain";
    }

    @Override
    public String getType() {
        return type;
    }
}
