/**
 * Created by jaspervandervalk on 30/06/15.
 */
public class Terrain {
    private String type;
    private boolean robber;

    public Terrain(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean getRobber() {
        if (robber == true) {
            return true;
        } else {
            return false;
        }
    }
}
