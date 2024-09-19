public class Main {
    public static void main(String[] args) {
        Feeder f = new Feeder(2000);
        Feeder g = new Feeder(1200);
        g.simulateOneDay(12);
        System.out.println(g.getCurrentFood());
        System.out.println(f.simulateManyDays(9,4));
    }
}
