package Terrain;

import Resources.Resource;

/**
 * Created by Jasper on 06/04/15.
 */
public class Harbor implements Terrain {

    private String type;
    private Resource resource;
    private int value;
    private boolean robber;

    public Harbor(Resource resource, int value) {
        type = "Harbor";
        this.resource = resource;
        this.value = value;
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

    public String getTradeInfo() {
        return "You must trade: " + value + " " + resource + " in order to get another one from the bank";
    }
}
