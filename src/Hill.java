/**
 * Created by Jasper on 06/04/15.
 */
public class Hill implements Terrain {

    private String type;

    public Hill() {
        type = "Hill";
    }

    @Override
    public String getType() {
        return type;
    }
}
