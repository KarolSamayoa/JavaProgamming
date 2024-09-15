import java.io.PrintWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) {
        PrintWriter writer = null;

        try {
            writer = new PrintWriter("numbers.txt");

            for (int i = 1; i <= 49; i++) {
                writer.println(i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                writer.close();
            }
        }
    }
}
 
