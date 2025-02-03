public class Main {
    public static void main(String[] args) {
        Review[] reviews = {
            new Review(4, "Good! Thx"),
            new Review(3, "Ok site"),
            new Review(5, "Great!"),
            new Review(2, "Poor! Bad."),
            new Review(3, "")
        };

        ReviewAnalysis analysis = new ReviewAnalysis(reviews);

        System.out.println(analysis.getAverageRating());
        System.out.println(analysis.collectComments());
    }
}
