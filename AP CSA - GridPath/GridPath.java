public class GridPath {
    private int[][] grid;

    public GridPath (int[][] grid) {
        this.grid = grid;
    }

    public Location getNextLoc(int row, int col) {
        if (row == grid.length - 1) {
            return new Location(row, col + 1);
        } else if (col == grid[0].length - 1) {
            return new Location(row + 1, col);
        }

        return (grid[row][col + 1] > grid[row + 1][col]) ? new Location(row + 1, col) : new Location(row, col + 1);
    }

    public int sumPath(int row, int col) {
        int sum = grid[row][col];

        while (row != grid.length - 1 || col != grid[0].length - 1) {
            Location nextLoc = getNextLoc(row, col);
            
            row = nextLoc.getRow();
            col = nextLoc.getCol();
            
            sum += grid[row][col];
        }
        
        return sum;
    }

    public String toString() {
        String s = "";

        for (int[] row : grid) {
            for (int col : row) {
                s += col + "";
            }
            s += "\n";
        }

        return s;
    }

}