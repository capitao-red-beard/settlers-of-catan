package Game;

/**
 * Created by Jasper on 06/04/15.
 */
public class Dice {

    public Dice() {

    }

    public int roll() {
        return 2 + (int)(Math.random() * ((12 - 2) + 1));
    }
}
