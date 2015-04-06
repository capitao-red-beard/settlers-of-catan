/**
 * Created by Jasper on 05/04/15.
 */
public class City implements Construction {

    private Player player;

    public City(Player player) {
        this.player = player;
    }

    @Override
    public String getOwner() {
        return player.toString();
    }
}
