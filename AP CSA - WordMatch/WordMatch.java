public class WordMatch {
    private String secret;

    public WordMatch(String word) {
        secret = word;
    }

    public int scoreGuess(String guess){
        int count = 0;

        for (int i = 0; i < secret.length() - guess.length() + 1; i++) {
            if (secret.substring(i, i + guess.length()).equals(guess)) {
                count++;
            }
        }

        return count * guess.length() * guess.length();
    }

    public String findBetterGuess(String guess1, String guess2){
        int guessOneScore = scoreGuess(guess1);
        int guessTwoScore = scoreGuess(guess2);

        return (guessOneScore > guessTwoScore) ? guess1 : 
               (guessTwoScore > guessOneScore) ? guess2 :
               (guess1.compareTo(guess2) > 0) ? guess1 : guess2;
    }
}