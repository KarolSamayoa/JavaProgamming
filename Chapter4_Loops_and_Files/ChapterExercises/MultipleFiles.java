/**
 * This program uses the try-with-resources to open two files
 */

import java.util.Scanner;
import java.io.*;

public class MultipleFiles 
{
    public static void main(String [] args) throws IOException 
    {
        //Open the file
        try (Scanner inputFile = new Scanner(new File("Sequence.txt"));
              PrintWriter outputFile = new PrintWriter("Copy.txt"))
        {
            //Read lines form the input file until no more are left.
            while (inputFile.hasNext())
            {
                //Read a line form the input file.
                String line = inputFile.nextLine();
                
                //write the line to the output file.
                outputFile.println(line);
            }
        }
    }
}
