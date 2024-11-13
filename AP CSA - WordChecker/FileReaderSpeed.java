import java.io.*;

public class FileReaderSpeed {
    public static void main(String[] args) {
        long initialTime = System.currentTimeMillis();

        try (FileReader reader = new FileReader("big.txt")) {
            int i;

            while (true) {
                i = reader.read();

                if (i == -1) {
                    System.out.println(System.currentTimeMillis() - initialTime);
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
