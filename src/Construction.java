/**
 * Created by jaspervandervalk on 30/06/15.
 */
public class Construction {
    private Player owner;
    private Tile[] tiles;

    public Construction(Player owner, Tile[] tiles) {
        this.owner = owner;
        this.tiles = tiles;

    }

    public String getOwner() {
        return owner.toString();
    }

    public Tile[] getTiles() {
        return tiles;
    }

    public String toString() {
        return "Owner: " + owner + "\nTiles: " + tiles;
    }
}
