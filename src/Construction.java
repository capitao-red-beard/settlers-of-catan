/**
 * Created by jaspervandervalk on 30/06/15.
 */
public class Construction {
    private Player owner;

    public Construction(Player owner) {
        this.owner = owner;
    }

    public String getOwner() {
        return owner.toString();
    }
}
