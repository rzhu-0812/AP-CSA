public class ArrayResizer {
    public static boolean isNonZeroRow(int[][] array2D, int r) {
        for (int n : array2D[r]) {
            if (n == 0) {
                return false;
            }
        }

        return true;
    }

    public static int numNonZeroRows(int[][] array2D) {
        int count = 0;
        for (int i = 0; i < array2D.length; i++) {
            if (isNonZeroRow(array2D, i)) {
                count++;
            }
        }

        return count;
    }

    public static int[][] resize(int[][] array2D) {
        int[][] smallerArr = new int[numNonZeroRows(array2D)][array2D[0].length];
        int smIdx = 0;

        for (int i = 0; i < array2D.length; i++) {
            if (isNonZeroRow(array2D, i)) {
                smallerArr[smIdx] = array2D[i];
                smIdx++;
            }
        }

        return smallerArr;

    }
}