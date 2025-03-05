public class SingleTable {
    private int seats;
    private int height;
    private double viewQuality;

    public SingleTable(int seats, int height, double viewQuality) {
        this.seats = seats;
        this.height = height;
        this.viewQuality = viewQuality;
    }

    public int getNumSeats() {
        return seats;
    }

    public int getHeight() {
        return height;
    }

    public double getViewQuality() {
        return viewQuality;
    }

    public void setViewQuality(double value) {
        viewQuality = value;
    }
}