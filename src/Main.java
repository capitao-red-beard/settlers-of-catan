/**
 * Created by Jasper on 31/03/15.
 */
public class Main {

    public static void main (String[] args) {
        Board board = new Board();

        for (int i = 0; i < 5; ++i) {
            for (int j = 0; j < 5; ++j) {
                System.out.println(board.getTile(i, j));
            }
        }
    }
}
