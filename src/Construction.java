/**
 * Created by jaspervandervalk on 30/06/15.
 */
public class Construction {
    private Player owner;
    private String type;

    public Construction(Player owner, String type) {
        this.owner = owner;
        this.type = type;
    }

    public String getOwner() {
        return owner.toString();
    }

    public String getType() {
        return type;
    }
}
