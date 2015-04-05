/**
 * Created by Jasper on 05/04/15.
 */
public class Stone implements Resource {

    private String type;

    public Stone(String type) {
        this.type = type;
    }

    @Override
    public String getType() {
        return type;
    }
}
