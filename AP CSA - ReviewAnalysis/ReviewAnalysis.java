import java.util.*;

public class ReviewAnalysis {
    private Review[] allReviews;

    public ReviewAnalysis(Review[] allReviews) {
        this.allReviews = allReviews;
    }

    public double getAverageRating() {
        double sum = 0.0;

        for (Review r : allReviews) {
            sum += r.getRating();
        }

        return sum / allReviews.length;
    }

    public ArrayList<String> collectComments() {
        ArrayList<String> arr = new ArrayList<>();

        for (int i = 0; i < allReviews.length; i++) {
            if (allReviews[i].getComment().indexOf("!") != -1) {
                arr.add(i + "-" + allReviews[i].getComment());
            }
        }

        return arr;
    }
}