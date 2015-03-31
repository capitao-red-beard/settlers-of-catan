import java.util.Random;

/**
 * Created by Jasper on 30/03/15.
 */
public class Tile {

    private Resource wood, sheep, wheat, stone, iron;
    private int value;
    Random random = new Random();
    int max = 12;
    int min = 2;

    public Tile() {
        value = random.nextInt(max - min) + min;
    }
}
