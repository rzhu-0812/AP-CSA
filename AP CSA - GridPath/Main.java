public class Main {
    public static void main(String[] args) {
        int[][] gridOne = {
            {12, 3, 4, 13, 5},
            {11, 21, 2, 14, 16},
            {7, 8, 9, 15, 0},
            {10, 17, 20, 19, 1},
            {18, 22, 30, 25, 6}
        };

        GridPath gpOne = new GridPath(gridOne);

        System.out.println(gpOne.getNextLoc(0, 0));
        System.out.println(gpOne.getNextLoc(1, 3));
        System.out.println(gpOne.getNextLoc(2, 4));
        System.out.println(gpOne.getNextLoc(4, 3));

        int[][] gridTwo = {
            {12, 30, 40, 25, 5},
            {11, 3, 22, 15, 43},
            {7, 2, 9, 4, 0},
            {8, 33, 18, 6, 1}
        };

        GridPath gpTwo = new GridPath(gridTwo);

        System.out.println(gpTwo.sumPath(1, 1));

    }
}
