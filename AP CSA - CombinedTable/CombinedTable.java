public class CombinedTable {
    SingleTable tableOne;
    SingleTable tableTwo;

    public CombinedTable(SingleTable t1, SingleTable t2) {
        tableOne = t1;
        tableTwo = t2;
    }

    public boolean canSeat(int people) {
        return (tableOne.getNumSeats() + tableTwo.getNumSeats() - 2) >= people;
    }

    public double getDesirability() {
        double viewQualityAvg = (tableOne.getViewQuality() + tableTwo.getViewQuality()) / 2;

        if (tableOne.getHeight() == tableTwo.getHeight()) {
            return viewQualityAvg;
        }
        return viewQualityAvg - 10;
    }
}
