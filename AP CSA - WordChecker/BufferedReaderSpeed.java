import java.io.*;

public class BufferedReaderSpeed {
    public static void main(String[] args) {
        long initialTime = System.currentTimeMillis();

        try (BufferedReader reader = new BufferedReader(new FileReader("big.txt"))) {
            String line;

            while (true) {
                line = reader.readLine();

                if (line == null) {
                    System.out.println(System.currentTimeMillis() - initialTime);
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
