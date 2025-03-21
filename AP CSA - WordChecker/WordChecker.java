import java.util.ArrayList;

public class WordChecker {
    private ArrayList<String> wordList;

    public WordChecker(ArrayList<String> wordList) {
        this.wordList = wordList;
    }

    public void setWordList(ArrayList<String> newList) {
        wordList = newList;
    }

    public boolean isWordChain() {
        for (int i = 0; i < wordList.size() - 1; i++) {
            if (!(wordList.get(i + 1).contains(wordList.get(i)))) {
                return false;
            }
        }
        return true;
    }

    public ArrayList<String> createList(String target) {
        ArrayList<String> newStrList = new ArrayList<>();

        for (String str : wordList) {
            if (str.startsWith(target)) {
                newStrList.add(str.substring(target.length()));
            }
        }

        return newStrList;
    }
}