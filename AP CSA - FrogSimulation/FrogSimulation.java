public class FrogSimulation {
    private int goalDistance;
    private int maxHops;

    public FrogSimulation(int dist, int numHops) {
        goalDistance = dist;
        maxHops = numHops;
    }

    private int hopDistance() {
        return (int) (Math.random() * 65) - 32;
    }

    public boolean simulate() {
        int dist = 0;

        for (int i = 0; i < maxHops; i++) {
            dist += hopDistance();

            if (dist >= goalDistance) {
                return true;
            } else if (dist < 0) {
                return false;
            }
        }

        return false;
    }

    public double runSimulations(int num) {
        int numSucess = 0;

        for (int i = 0; i < num; i++) {
            if (simulate()) {
                numSucess++;
            }
        }

        return (double) numSucess / num;
    }
}