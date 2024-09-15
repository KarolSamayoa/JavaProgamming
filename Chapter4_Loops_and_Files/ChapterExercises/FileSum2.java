/**
 * This program reads a series of numbers from a file
 * and calculates their sum. 
 */

import java.util.Scanner;
import java.io.*;

public class FileSum2 
{
    public static void main (String[] args) throws IOException 
    {
        double sum = 0.0;  //Accumulator, initialized to 0
        
        //Create a file object.
        File file = new File("Numbers1.txt");
        
        //If the file exists. read its contents.
        if (file.exists())
        {
            //open file for reading.
            Scanner inputFile = (new Scanner(file));
        
        
        //Read all values from the file and calculate the total.
        while (inputFile.hasNext())
        {
            //Read a value from the file.
            double number = inputFile.nextDouble();
            
            //Add the number to sum.
            sum = sum + number;
        }
        
        //Close the file.
        inputFile.close();
        
        //Display the sum of the numbers.
        System.out.println("The sum of the numbers in " + 
                            "Numbers.txt is "+ sum);} 
        else 
        {
            System.out.println("The file Numbers1.txt is not found.");
        }
    }
}
