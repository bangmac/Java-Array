public class MineSweeper {

    public static void main(String[] args) {
        String[][] map = {
                {" * ", " . ", " * ", " . ", " . "},
                {" . ", " * ", " . ", " . ", " . "},
                {" . ", " . ", " * ", " * ", " . "},
                {" . ", " . ", " . ", " . ", " * "},
                {" . ", " * ", " . ", " * ", " . "}
        };

        final int MAP_WIDTH = map[0].length;
        final int MAP_HEIGHT = map.length;

        String[][] mapReport = new String[MAP_HEIGHT][MAP_WIDTH];

        // set value for mapReport cells
        for (int yOrdiante = 0; yOrdiante < MAP_HEIGHT; yOrdiante++) {
            for (int xOrdinate = 0; xOrdinate < MAP_WIDTH; xOrdinate++) {
                String currentCell = map[yOrdiante][xOrdinate];
                if (currentCell.equals(" * "))
                    mapReport[yOrdiante][xOrdinate] = " * ";
                else {
                    final int[][] NEIGHBOURS_ORDINATE = {
                            {yOrdiante - 1, xOrdinate - 1}, {yOrdiante - 1, xOrdinate}, {yOrdiante - 1, xOrdinate + 1},
                            {yOrdiante, xOrdinate - 1}, {yOrdiante, xOrdinate + 1},
                            {yOrdiante + 1, xOrdinate - 1}, {yOrdiante + 1, xOrdinate}, {yOrdiante + 1, xOrdinate + 1}
                    };
                    int minesAround = 0;

                    for (int[] neighbourOrdinate : NEIGHBOURS_ORDINATE) {
                        int xOrdinateOfNeighbour = neighbourOrdinate[1];
                        int yOrdinateOfNeighbour = neighbourOrdinate[0];

                        boolean isOutOfMapNeighbour = xOrdinateOfNeighbour < 0
                                || xOrdinateOfNeighbour == MAP_WIDTH
                                || yOrdinateOfNeighbour < 0
                                || yOrdinateOfNeighbour == MAP_HEIGHT;
                        if (isOutOfMapNeighbour) continue;

                        boolean isMineOwnerNeighbour = map[yOrdinateOfNeighbour][xOrdinateOfNeighbour].equals(" * ");
                        if (isMineOwnerNeighbour) minesAround++;
                    }
                    mapReport[yOrdiante][xOrdinate] = " " + minesAround + " ";
                }
            }
        }

        for (int yOrdiante = 0; yOrdiante < MAP_HEIGHT; yOrdiante++) {
            for (int xOrdinate = 0; xOrdinate < MAP_WIDTH; xOrdinate++) {
                String currentCellReport = mapReport[yOrdiante][xOrdinate];
                System.out.print(currentCellReport);
            }
            System.out.println();
        }

    }
}