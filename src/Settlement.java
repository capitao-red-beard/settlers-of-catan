/**
 * Created by Jasper on 05/04/15.
 */
public class Settlement implements Construction {

    private Player player;

    public Settlement(Player player) {
        this.player = player;
    }

    @Override
    public String getOwner() {
        return player.toString();
    }
}
