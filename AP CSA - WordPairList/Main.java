public class Main {
    public static void main(String[] args) {
        String[] w1 = {"one", "two", "three"};
        WordPairList ex1 = new WordPairList(w1);
        System.out.println(ex1);

        String[] w2 = {"the", "more", "the", "merrier"};
        WordPairList ex2 = new WordPairList(w2);
        System.out.println(ex2);

        String[] w3 = {"the", "red", "fox", "the", "red"};
        WordPairList ex3 = new WordPairList(w3);
        System.out.println(ex3);
        System.out.println(ex3.numMatches());
    }
}