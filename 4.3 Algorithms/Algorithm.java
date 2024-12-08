import java.io.*;
import java.util.*;

public class Algorithm{
    public static void main(String[] args) {
        int twoLetterWords = 0, palindromes = 0;
        ArrayList<String> longestWords = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("words.txt"))) {
            String word;
            while((word = reader.readLine()) != null) {
                if (word.length() == 2) twoLetterWords++;

                if (longestWords.size() == 0) {
                    longestWords.add(word);
                } else if (word.length() > longestWords.get(0).length()) {
                    longestWords.clear();
                    longestWords.add(word);
                } else if (word.length() == longestWords.get(0).length()) {
                    longestWords.add(word);
                }

                StringBuilder s = new StringBuilder(word);
                s.reverse();

                if (word.equals(s.toString())) palindromes++;
            }
        } catch (IOException e) {
            System.out.println("Unable to read the file.");
        }

        System.out.println("Total number of two letter words: " + twoLetterWords);
        System.out.println("Longest word(s): " + longestWords.toString() + " (" + longestWords.get(0).length() + " chars)");
        System.out.println("Total number of palindromes: " + palindromes);
    }
}