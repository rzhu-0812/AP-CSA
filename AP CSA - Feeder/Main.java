public class Main {
    public static void main(String[] args) {
        // Test cases for simulateOneDay function
        Feeder feederOne = new Feeder(500);
        Feeder feederTwo = new Feeder(1000);
        Feeder feederThree = new Feeder(100);

        feederOne.simulateOneDay(12);
        System.out.println(feederOne.getCurrentFood());
        feederTwo.simulateOneDay(22);
        System.out.println(feederTwo.getCurrentFood());
        feederThree.simulateOneDay(5);
        System.out.println(feederThree.getCurrentFood());

        // Test cases for simulateManyDays function
        Feeder feederFour = new Feeder(2400);
        Feeder feederFive = new Feeder(250);
        Feeder feederSix = new Feeder(0);
        
        System.out.println(feederFour.simulateManyDays(10,4));
        System.out.println(feederFive.simulateManyDays(10,5));
        System.out.println(feederSix.simulateManyDays(5,10));
    }
}