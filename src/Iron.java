/**
 * Created by Jasper on 05/04/15.
 */
public class Iron implements Resource {

    private String type;

    public Iron(String type) {
        this.type = type;
    }

    @Override
    public String getType() {
        return type;
    }
}
