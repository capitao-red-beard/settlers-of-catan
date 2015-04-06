/**
 * Created by Jasper on 05/04/15.
 */
public class Road implements Construction {

    private Player player;
    private String type;

    public Road(Player player) {
        this.player = player;
        type = "Road";
    }

    @Override
    public String getOwner() {
        return player.toString();
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Construct: " + type + " Owner: " + player.toString();
    }
}
