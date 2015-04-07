package Terrain;

import Construction.Robber;

/**
 * Created by Jasper on 06/04/15.
 */
public class Desert implements Terrain {

    private String type;
    private boolean robber;

    public Desert(Robber robber) {
        type = "Desert";

    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public boolean getRobber() {
        if (robber == true) {
            return true;
        } else {
            return false;
        }
    }
}
