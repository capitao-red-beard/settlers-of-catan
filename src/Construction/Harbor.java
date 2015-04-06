package Construction;

/**
 * Created by Jasper on 06/04/15.
 */
public class Harbor implements Construction {

    private String type;

    public Harbor() {
        type = "Harbor";
    }

    @Override
    public String getOwner() {
        return null;
    }

    @Override
    public String getType() {
        return type;
    }
}
