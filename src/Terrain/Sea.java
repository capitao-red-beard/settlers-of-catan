package Terrain;

/**
 * Created by Jasper on 06/04/15.
 */
public class Sea implements Terrain {

    private String type;

    public Sea() {
        type = "Sea";
    }

    @Override
    public String getType() {
        return type;
    }
}