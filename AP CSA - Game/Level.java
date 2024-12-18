public class Level {
    private int points;
    private boolean goal;

    public Level(int points, boolean goal) {
        this.points = points;
        this.goal = goal;
    }

    public boolean goalReached() {
        return goal;
    }

    public int getPoints() {
        return points;
    }
}