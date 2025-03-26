public class StepTracker {
    private int totalSteps;
    private int totalDays;
    private int minSteps;
    private int daysActive;

    public StepTracker(int minSteps) {
        this.minSteps = minSteps;
    }

    public int activeDays() {
        return daysActive;
    }

    public double averageSteps() {
        if (totalDays == 0) return 0.0;
        return (double) totalSteps / totalDays;
    }

    public void addDailySteps(int steps) {
        if (steps >= minSteps) daysActive++;
        totalSteps += steps;
        totalDays++;
    }
}