/**
 * This program demonstrates the try-with-resources. 
 */

import java.util.Scanner;
import java.io.*;

public class TryWithResources 
{
    public static void main(String[] args) throws IOException 
    {
        //Open the file.
        try (PrintWriter outputFile = new PrintWriter("Sequence.txt"))
        {
            //Write the numbers 1-10 to the file.
            for (int number = 1; number <=10; number++)
            {
                outputFile.println(number);
            }
        }
    }
}
