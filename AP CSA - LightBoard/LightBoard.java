public class LightBoard {
    private boolean[][] lights;

    public LightBoard(int numRows, int numCols) {
        lights = new boolean[numRows][numCols];

        for (int r = 0; r < numRows; r++) {
            for (int c = 0; c < numCols; c++) {
                if (Math.random() <= 0.4) {
                    lights[r][c] = true;
                }
            }
        }
    }

    public boolean evaluateLight(int row, int col) {
        int colLights = 0;

        for (int r = 0; r < lights.length; r++) {
            if (lights[r][col]) {
                colLights++;
            }
        }

        if (lights[row][col]) {
            if (colLights % 2 == 0) {
                return false;
            }
        } else {
            if (colLights % 3 == 0) {
                return true;
            }
        }

        return lights[row][col];
    }

    @Override
    public String toString() {
        String result = "";

        for (int r = 0; r < lights.length; r++) {
            for (int c = 0; c < lights[r].length; c++) {
                result += (lights[r][c] ? "1 " : "0 ");
            }
            result += "\n";
        }

        return result;
    }
}