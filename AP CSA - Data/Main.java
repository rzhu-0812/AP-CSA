public class Main {
    public static void main(String[] args) {
        int[][] n = new int[9][10];
        int[][] n2 = {{10, 50, 40}, {20, 40, 20}, {30, 50, 30}};

        Data d = new Data(n);
        d.repopulate();
        System.out.println(d);

        Data d2 = new Data(n2);
        d2.countIncreasingCols();
        System.out.println(d2);
    }
}
