import java.io.*;
import java.util.*;

public class WCBounty {
    public static void main(String[] args) {
        ArrayList<String> validPairs = new ArrayList<String>();

        try (BufferedReader reader = new BufferedReader(new FileReader("WordChecker.txt"))) {
            String line;
            WordChecker wc = new WordChecker(new ArrayList<>());

            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+");
                wc.setWordList(new ArrayList<>(Arrays.asList(words)));

                if (wc.isWordChain()) validPairs.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Output.txt"))) {
            for (String str : validPairs) {
                writer.write(str);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}