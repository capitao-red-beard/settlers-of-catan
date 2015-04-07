package Terrain;

/**
 * Created by Jasper on 06/04/15.
 */
public class Field implements Terrain {

    private String type;
    private boolean robber;

    public Field() {
        type = "Field";
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
