public class Feeder {
    private int currentFood;

    public Feeder (int c) {
        currentFood = c;
    }

    public int getCurrentFood() {
        return currentFood;
    } 

    public void simulateOneDay(int numBirds) { 
        if (Math.random() < 0.95) {
            int foodAmount = (int) (Math.random() * 41 + 10);

            currentFood -= foodAmount * numBirds;

            if (currentFood < 0) {
                currentFood = 0;
            }
        } else {
            currentFood = 0;
        }
    }

    public int simulateManyDays(int numBirds, int numDays) {
        for (int i = 0; i < numDays; i++) {
            simulateOneDay(numBirds);

            if (currentFood == 0) {
                return 0;
            }
        }
        
        return currentFood;
    }

}