import java.io.*;

public class Algorithm{
    public static void main(String[] args) {
        int twoLetterWords = 0, palindromes = 0;
        String longestWord = "";

        try (BufferedReader reader = new BufferedReader(new FileReader("words.txt"))) {
            String word;
            while((word = reader.readLine()) != null) {
                if (word.length() == 2) twoLetterWords++;
                if (word.length() > longestWord.length()) longestWord = word;

                StringBuilder s = new StringBuilder(word);
                s.reverse();

                if (word.equals(s.toString())) palindromes++;
            }
        } catch (IOException e) {
            System.out.println("Unable to read the file.");
        }

        System.out.println("Total number of two letter words: " + twoLetterWords);
        System.out.println("Longest word: " + longestWord);
        System.out.println("Total number of palindromes: " + palindromes);
    }
}