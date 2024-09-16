import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileLetterCounter {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Enter file name: ");
        String fileName = inputScanner.nextLine();

        System.out.print("Enter character to count: ");
        char charToCount = inputScanner.nextLine().charAt(0);

        int count = 0;

        try {
            File file = new File(fileName);
            Scanner fileScanner = new Scanner(file);

            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();

                for (char c : line.toCharArray()) {
                    if (c == charToCount) {
                        count++;
                    }
                }
            }

            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            return;
        }

        System.out.printf("The character '%c' appears in the file %s %d times.%n", charToCount, fileName, count);

        inputScanner.close();
    }
}
