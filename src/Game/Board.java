package Game;

import Construction.Construction;
import Construction.Robber;
import Resources.*;
import Terrain.*;

/**
 * Created by Jasper on 30/03/15.
 */
public class Board {

    private Resource resource;
    private Brick brick;
    private Grain grain;
    private Lumber lumber;
    private Ore ore;
    private Wool wool;

    private Tile[] tiles;

    public Board() {
        tiles = new Tile[37];

        tiles[0] = new Tile(new Harbor(resource, 3));
        tiles[1] = new Tile(new Sea());
        tiles[2] = new Tile(new Harbor(wool, 2));
        tiles[3] = new Tile(new Sea());
        tiles[4] = new Tile(new Sea());
        tiles[5] = new Tile(new Forest(), 11);
        tiles[6] = new Tile(new Pasture(), 12);
        tiles[7] = new Tile(new Field(), 9);
        tiles[8] = new Tile(new Harbor(resource, 3));
        tiles[9] = new Tile(new Harbor(ore, 2));
        tiles[10] = new Tile(new Hill(), 4);
        tiles[11] = new Tile(new Mountain(), 6);
        tiles[12] = new Tile(new Hill(), 5);
        tiles[13] = new Tile(new Pasture(), 10);
        tiles[14] = new Tile(new Sea());
        tiles[15] = new Tile(new Sea());
        tiles[16] = new Tile(new Desert(new Robber()));
        tiles[17] = new Tile(new Forest(), 3);
        tiles[18] = new Tile(new Field(), 11);
        tiles[19] = new Tile(new Forest(), 4);
        tiles[20] = new Tile(new Field(), 8);
        tiles[21] = new Tile(new Harbor(resource, 3));
        tiles[22] = new Tile(new Harbor(grain, 2));
        tiles[23] = new Tile(new Hill(), 8);
        tiles[24] = new Tile(new Pasture(), 10);
        tiles[25] = new Tile(new Pasture(), 9);
        tiles[26] = new Tile(new Mountain(), 3);
        tiles[27] = new Tile(new Sea());
        tiles[28] = new Tile(new Mountain(), 5);
        tiles[29] = new Tile(new Field(), 2);
        tiles[30] = new Tile(new Forest(), 6);
        tiles[31] = new Tile(new Harbor(brick, 2));
        tiles[32] = new Tile(new Harbor(resource, 3));
        tiles[33] = new Tile(new Sea());
        tiles[34] = new Tile(new Sea());
        tiles[35] = new Tile(new Harbor(lumber, 2));
        tiles[36] = new Tile(new Sea());

        tiles[0].setCenter(tiles[0]);
        tiles[0].setNorthEast(null);
        tiles[0].setNorthWest(null);
        tiles[0].setSouthEast(tiles[5]);
        tiles[0].setSouthWest(tiles[4]);
        tiles[0].setEast(tiles[1]);
        tiles[0].setWest(null);

        tiles[1] = new Tile(new Sea());
        tiles[1].setCenter(tiles[1]);
        tiles[1].setNorthEast(null);
        tiles[1].setNorthWest(null);
        tiles[1].setSouthEast(tiles[6]);
        tiles[1].setSouthWest(tiles[5]);
        tiles[1].setEast(tiles[2]);
        tiles[1].setWest(tiles[1]);

        tiles[2].setCenter(tiles[2]);
        tiles[2].setNorthEast(null);
        tiles[2].setNorthWest(null);
        tiles[2].setSouthEast(tiles[7]);
        tiles[2].setSouthWest(tiles[6]);
        tiles[2].setEast(tiles[3]);
        tiles[2].setWest(tiles[2]);

        tiles[3].setCenter(tiles[3]);
        tiles[3].setNorthEast(null);
        tiles[3].setNorthWest(null);
        tiles[3].setSouthEast(tiles[8]);
        tiles[3].setSouthWest(tiles[7]);
        tiles[3].setEast(null);
        tiles[3].setWest(tiles[3]);

        tiles[4].setCenter(tiles[4]);
        tiles[4].setNorthEast(tiles[0]);
        tiles[4].setNorthWest(null);
        tiles[4].setSouthEast(tiles[10]);
        tiles[4].setSouthWest(tiles[9]);
        tiles[4].setEast(tiles[5]);
        tiles[4].setWest(null);

        tiles[5].setCenter(tiles[5]);
        tiles[5].setNorthEast(tiles[1]);
        tiles[5].setNorthWest(tiles[0]);
        tiles[5].setSouthEast(tiles[11]);
        tiles[5].setSouthWest(tiles[10]);
        tiles[5].setEast(tiles[6]);
        tiles[5].setWest(tiles[4]);

        tiles[6].setCenter(tiles[6]);
        tiles[6].setNorthEast(tiles[2]);
        tiles[6].setNorthWest(tiles[1]);
        tiles[6].setSouthEast(tiles[12]);
        tiles[6].setSouthWest(tiles[11]);
        tiles[6].setEast(tiles[7]);
        tiles[6].setWest(tiles[5]);

        tiles[7].setCenter(tiles[7]);
        tiles[7].setNorthEast(tiles[3]);
        tiles[7].setNorthWest(tiles[2]);
        tiles[7].setSouthEast(tiles[13]);
        tiles[7].setSouthWest(tiles[12]);
        tiles[7].setEast(tiles[8]);
        tiles[7].setWest(tiles[6]);

        tiles[8].setCenter(tiles[8]);
        tiles[8].setNorthEast(null);
        tiles[8].setNorthWest(tiles[3]);
        tiles[8].setSouthEast(tiles[14]);
        tiles[8].setSouthWest(tiles[13]);
        tiles[8].setEast(null);
        tiles[8].setWest(tiles[7]);

        tiles[9].setCenter(tiles[9]);
        tiles[9].setNorthEast(tiles[4]);
        tiles[9].setNorthWest(null);
        tiles[9].setSouthEast(tiles[16]);
        tiles[9].setSouthWest(tiles[15]);
        tiles[9].setEast(tiles[10]);
        tiles[9].setWest(null);

        tiles[10].setCenter(tiles[10]);
        tiles[10].setNorthEast(tiles[5]);
        tiles[10].setNorthWest(tiles[4]);
        tiles[10].setSouthEast(tiles[17]);
        tiles[10].setSouthWest(tiles[16]);
        tiles[10].setEast(tiles[11]);
        tiles[10].setWest(tiles[9]);

        tiles[11].setCenter(tiles[11]);
        tiles[11].setNorthEast(tiles[6]);
        tiles[11].setNorthWest(tiles[5]);
        tiles[11].setSouthEast(tiles[18]);
        tiles[11].setSouthWest(tiles[17]);
        tiles[11].setEast(tiles[12]);
        tiles[11].setWest(tiles[10]);

        tiles[12].setCenter(tiles[12]);
        tiles[12].setNorthEast(tiles[7]);
        tiles[12].setNorthWest(tiles[6]);
        tiles[12].setSouthEast(tiles[19]);
        tiles[12].setSouthWest(tiles[18]);
        tiles[12].setEast(tiles[13]);
        tiles[12].setWest(tiles[11]);

        tiles[13].setCenter(tiles[13]);
        tiles[13].setNorthEast(tiles[8]);
        tiles[13].setNorthWest(tiles[7]);
        tiles[13].setSouthEast(tiles[20]);
        tiles[13].setSouthWest(tiles[19]);
        tiles[13].setEast(tiles[14]);
        tiles[13].setWest(tiles[12]);

        tiles[14].setCenter(tiles[14]);
        tiles[14].setNorthEast(null);
        tiles[14].setNorthWest(tiles[8]);
        tiles[14].setSouthEast(tiles[21]);
        tiles[14].setSouthWest(tiles[20]);
        tiles[14].setEast(null);
        tiles[14].setWest(tiles[13]);

        tiles[15].setCenter(tiles[15]);
        tiles[15].setNorthEast(tiles[9]);
        tiles[15].setNorthWest(null);
        tiles[15].setSouthEast(tiles[22]);
        tiles[15].setSouthWest(null);
        tiles[15].setEast(tiles[16]);
        tiles[15].setWest(null);

        tiles[16].setCenter(tiles[16]);
        tiles[16].setNorthEast(tiles[10]);
        tiles[16].setNorthWest(tiles[9]);
        tiles[16].setSouthEast(tiles[23]);
        tiles[16].setSouthWest(tiles[22]);
        tiles[16].setEast(tiles[17]);
        tiles[16].setWest(tiles[15]);

        tiles[17].setCenter(tiles[17]);
        tiles[17].setNorthEast(tiles[11]);
        tiles[17].setNorthWest(tiles[10]);
        tiles[17].setSouthEast(tiles[24]);
        tiles[17].setSouthWest(tiles[23]);
        tiles[17].setEast(tiles[18]);
        tiles[17].setWest(tiles[16]);

        tiles[18].setCenter(tiles[18]);
        tiles[18].setNorthEast(tiles[12]);
        tiles[18].setNorthWest(tiles[11]);
        tiles[18].setSouthEast(tiles[25]);
        tiles[18].setSouthWest(tiles[24]);
        tiles[18].setEast(tiles[19]);
        tiles[18].setWest(tiles[17]);

        tiles[19].setCenter(tiles[19]);
        tiles[19].setNorthEast(tiles[13]);
        tiles[19].setNorthWest(tiles[12]);
        tiles[19].setSouthEast(tiles[26]);
        tiles[19].setSouthWest(tiles[25]);
        tiles[19].setEast(tiles[20]);
        tiles[19].setWest(tiles[18]);

        tiles[20].setCenter(tiles[20]);
        tiles[20].setNorthEast(tiles[14]);
        tiles[20].setNorthWest(tiles[13]);
        tiles[20].setSouthEast(tiles[27]);
        tiles[20].setSouthWest(tiles[26]);
        tiles[20].setEast(tiles[21]);
        tiles[20].setWest(tiles[19]);

        tiles[21].setCenter(tiles[21]);
        tiles[21].setNorthEast(null);
        tiles[21].setNorthWest(tiles[14]);
        tiles[21].setSouthEast(null);
        tiles[21].setSouthWest(tiles[27]);
        tiles[21].setEast(null);
        tiles[21].setWest(tiles[20]);

        tiles[22].setCenter(tiles[22]);
        tiles[22].setNorthEast(tiles[16]);
        tiles[22].setNorthWest(tiles[15]);
        tiles[22].setSouthEast(tiles[28]);
        tiles[22].setSouthWest(null);
        tiles[22].setEast(tiles[23]);
        tiles[22].setWest(null);

        tiles[23].setCenter(tiles[23]);
        tiles[23].setNorthEast(tiles[17]);
        tiles[23].setNorthWest(tiles[16]);
        tiles[23].setSouthEast(tiles[29]);
        tiles[23].setSouthWest(tiles[28]);
        tiles[23].setEast(tiles[24]);
        tiles[23].setWest(tiles[22]);

        tiles[24].setCenter(tiles[24]);
        tiles[24].setNorthEast(tiles[18]);
        tiles[24].setNorthWest(tiles[17]);
        tiles[24].setSouthEast(tiles[30]);
        tiles[24].setSouthWest(tiles[29]);
        tiles[24].setEast(tiles[25]);
        tiles[24].setWest(tiles[23]);

        tiles[25].setCenter(tiles[25]);
        tiles[25].setNorthEast(tiles[19]);
        tiles[25].setNorthWest(tiles[18]);
        tiles[25].setSouthEast(tiles[31]);
        tiles[25].setSouthWest(tiles[30]);
        tiles[25].setEast(tiles[26]);
        tiles[25].setWest(tiles[24]);

        tiles[26].setCenter(tiles[26]);
        tiles[26].setNorthEast(tiles[20]);
        tiles[26].setNorthWest(tiles[19]);
        tiles[26].setSouthEast(tiles[32]);
        tiles[26].setSouthWest(tiles[31]);
        tiles[26].setEast(tiles[27]);
        tiles[26].setWest(tiles[25]);

        tiles[27].setCenter(tiles[27]);
        tiles[27].setNorthEast(tiles[21]);
        tiles[27].setNorthWest(tiles[20]);
        tiles[27].setSouthEast(null);
        tiles[27].setSouthWest(tiles[32]);
        tiles[27].setEast(null);
        tiles[27].setWest(tiles[26]);

        tiles[28].setCenter(tiles[28]);
        tiles[28].setNorthEast(tiles[23]);
        tiles[28].setNorthWest(tiles[22]);
        tiles[28].setSouthEast(tiles[33]);
        tiles[28].setSouthWest(null);
        tiles[28].setEast(tiles[29]);
        tiles[28].setWest(null);

        tiles[29].setCenter(tiles[29]);
        tiles[29].setNorthEast(tiles[24]);
        tiles[29].setNorthWest(tiles[23]);
        tiles[29].setSouthEast(tiles[34]);
        tiles[29].setSouthWest(tiles[33]);
        tiles[29].setEast(tiles[30]);
        tiles[29].setWest(tiles[28]);

        tiles[30].setCenter(tiles[30]);
        tiles[30].setNorthEast(tiles[25]);
        tiles[30].setNorthWest(tiles[24]);
        tiles[30].setSouthEast(tiles[35]);
        tiles[30].setSouthWest(tiles[34]);
        tiles[30].setEast(tiles[31]);
        tiles[30].setWest(tiles[29]);

        tiles[31].setCenter(tiles[31]);
        tiles[31].setNorthEast(tiles[26]);
        tiles[31].setNorthWest(tiles[25]);
        tiles[31].setSouthEast(tiles[36]);
        tiles[31].setSouthWest(tiles[35]);
        tiles[31].setEast(tiles[32]);
        tiles[31].setWest(tiles[30]);

        tiles[32].setCenter(tiles[32]);
        tiles[32].setNorthEast(tiles[27]);
        tiles[32].setNorthWest(tiles[26]);
        tiles[32].setSouthEast(null);
        tiles[32].setSouthWest(tiles[36]);
        tiles[32].setEast(null);
        tiles[32].setWest(tiles[31]);

        tiles[33].setCenter(tiles[33]);
        tiles[33].setNorthEast(tiles[29]);
        tiles[33].setNorthWest(tiles[28]);
        tiles[33].setSouthEast(null);
        tiles[33].setSouthWest(null);
        tiles[33].setEast(tiles[34]);
        tiles[33].setWest(null);

        tiles[34].setCenter(tiles[34]);
        tiles[34].setNorthEast(tiles[30]);
        tiles[34].setNorthWest(tiles[29]);
        tiles[34].setSouthEast(null);
        tiles[34].setSouthWest(null);
        tiles[34].setEast(tiles[35]);
        tiles[34].setWest(tiles[33]);

        tiles[35].setCenter(tiles[35]);
        tiles[35].setNorthEast(tiles[31]);
        tiles[35].setNorthWest(tiles[30]);
        tiles[35].setSouthEast(null);
        tiles[35].setSouthWest(null);
        tiles[35].setEast(tiles[36]);
        tiles[35].setWest(tiles[34]);

        tiles[36].setCenter(tiles[36]);
        tiles[36].setNorthEast(tiles[32]);
        tiles[36].setNorthWest(tiles[31]);
        tiles[36].setSouthEast(null);
        tiles[36].setSouthWest(null);
        tiles[36].setEast(null);
        tiles[36].setWest(tiles[35]);
    }

    public Tile getRealTile(int number) {
        return tiles[number];
    }

    public String getTile(int number) {
        return tiles[number].toString();
    }
}
