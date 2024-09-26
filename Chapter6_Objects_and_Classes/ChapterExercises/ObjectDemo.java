/**
 * This program writes random numbers to a file.
 */

import java.util.Scanner;
import java.util.Random;
import java.io.*;

public class ObjectDemo 
{
    public static void main (String[] args) throws IOException 
    {
        int maxNumbers;   //Max number of random numbers. 
        int number;      //To hold a random number.
        
        //Create a Scanner object for keyboard input.
        Scanner keyboard = new Scanner(System.in);
        
        //Create a random object to generate random numbers.
        Random rand = new Random();
        
        //Get the number of random numbers to write. 
        System.out.print("How many random numbers should I write? ");
        maxNumbers = keyboard.nextInt();
        
        //Write the random numbers to the file.
        try (PrintWriter outputFile = new PrintWriter("numbers.txt"))
        {
            for (int count = 0; count <maxNumbers; count++)
            {
                //Generate a random integer.
                number = rand.nextInt(1000);
                
                //Write the random integer to the file.
                outputFile.println(number);
            }
        }
        System.out.println("Done");
    }
}
