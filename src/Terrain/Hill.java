package Terrain;

/**
 * Created by Jasper on 06/04/15.
 */
public class Hill implements Terrain {

    private String type;
    private boolean robber;

    public Hill() {
        type = "Hill";
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
