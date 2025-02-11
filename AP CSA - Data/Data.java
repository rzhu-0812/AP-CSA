public class Data {
    public static final int MAX = 500;
    private int[][] grid;

    public Data(int[][] grid) {
        this.grid = grid;
    }

    public void repopulate() {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                while (true) {
                    int randNum = (int) (Math.random() * MAX) + 1;

                    if (randNum % 10 == 0 && randNum % 100 != 0) {
                        grid[i][j] = randNum;
                        break;
                    }
                }
            }
        }
    }

    public int countIncreasingCols() {
        int count = 0;
    
        for (int col = 0; col < grid[0].length; col++) {
            boolean isIncreasing = true;
    
            for (int row = 0; row < grid.length - 1; row++) {
                if (grid[row][col] >= grid[row + 1][col]) {
                    isIncreasing = false;
                    break;
                }
            }
    
            if (isIncreasing) {
                count++;
            }
        }
    
        return count;
    }
    
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int[] row : grid) {
            for (int num : row) {
                sb.append(num).append("\t");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}