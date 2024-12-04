import java.util.*;
import java.io.*;
import java.math.*;

public class Algorithm {
    public static void main(String[] args) {
        int totalOdd = 0, totalEven = 0;
        int totalTwoDigits = 0, totalGreaterFiveHundred = 0;
        int maxNum = Integer.MIN_VALUE, minNum = Integer.MAX_VALUE, sum = 0;
        double average;
        int maxOccurrences = 0;
        ArrayList<Integer> maxOccurNum = new ArrayList<>();
        HashMap<Integer, Integer> numOccurrences = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("Numbers.txt"))) {
            String line;

            while ((line = reader.readLine()) != null) {
                int currNum = Integer.parseInt(line);

                if (currNum % 2 == 0) totalEven++;
                else totalOdd++;
                if (currNum >= 10 && currNum <= 99) totalTwoDigits++;
                if (currNum > 500) totalGreaterFiveHundred++;

                sum += currNum;
                maxNum = Math.max(maxNum, currNum);
                minNum = Math.min(minNum, currNum);

                numOccurrences.put(currNum, numOccurrences.getOrDefault(currNum, 0) + 1);
            }
        } catch (IOException e) {
            System.out.println("Unable to read the file.");
        }
        
        average = ((new BigDecimal((double) sum / (totalEven + totalOdd))).setScale(3, RoundingMode.HALF_UP)).doubleValue();

        for (Map.Entry<Integer, Integer> entry : numOccurrences.entrySet()) {
            if (entry.getValue() > maxOccurrences) {
                maxOccurrences = entry.getValue();
                maxOccurNum.clear();
                maxOccurNum.add(entry.getKey());
            } else if (entry.getValue() == maxOccurrences) {
                maxOccurNum.add(entry.getKey());
            }
        }

        System.out.println("Total odd numbers: " + totalOdd);
        System.out.println("Total even numbers: " + totalEven);
        System.out.println("Total numbers that have two digits: " + totalTwoDigits);
        System.out.println("Total numbers greater than 500: " + totalGreaterFiveHundred);
        System.out.println("Biggest number: " + maxNum);
        System.out.println("Smallest number: " + minNum);
        System.out.println("Sum of all numbers: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Mode(s): " + maxOccurNum + " (" + maxOccurrences + " occurrences)");

    }
}