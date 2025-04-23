import java.util.ArrayList;

public class WordPairList {
    private ArrayList<WordPair> allPairs;

    public WordPairList(String[] words) {
        int len = words.length;
        ArrayList<WordPair> pairs = new ArrayList<WordPair>();

        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                pairs.add(new WordPair(words[i], words[j]));
            }
        }

        allPairs = pairs;
    }

    public int numMatches() {
        int cnt = 0;

        for (WordPair wp : allPairs) {
            if (wp.getFirst().equals(wp.getSecond())) {
                cnt++;
            }
        }

        return cnt;
    }

    public String toString() {
        String str = "";

        for (WordPair wp : allPairs) {
            str += "(" + wp.getFirst() + ", " + wp.getSecond() + ")";
            if (wp.getFirst() == wp.getSecond()) str += " *";
            str += "\n";
        }

        return str;
    }
}