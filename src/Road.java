/**
 * Created by Jasper on 05/04/15.
 */
public class Road implements Construction {

    private Player player;

    public Road(Player player) {
        this.player = player;
    }

    @Override
    public String getOwner() {
        return player.toString();
    }
}
