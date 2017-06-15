/**
 * Created by Jasper on 31/03/15.
 */
public class Main {

    public static void main (String[] args) {
        Board board = new Board();

        Player player = new Player("Jasper", "Orange");

        Robber robber = new Robber();

        Bank bank = new Bank();

        System.out.println(bank.toString());

        Tile tile;

        player.moveRobber(robber, board.getTile(0));

        tile = board.getTile(18);

        System.out.println(tile.getBorders());
        System.out.println(player.toString());
    }
}
