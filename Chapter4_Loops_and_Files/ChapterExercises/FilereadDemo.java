/**
 * This program read data from a file. 
 */

import java.util.Scanner;
import java.io.*;

public class FilereadDemo 
{
    public static void main(String [] args) throws IOException 
    {
        //Create a Scanner object for keyboard input.
        Scanner keyboard = new Scanner(System.in);
        
        //Get the file name.
        System.out.print(" Enter the filename: ");
        String filename = keyboard.nextLine(); 
        
        //Open the file.
        Scanner inputFile = new Scanner (new File(filename));
        
        //Read the lines from the file until no more are left.
        while (inputFile.hasNext()) 
        {
            //Read the next name.
            String friendName = inputFile.nextLine();
            
            //Display the last name read.
            System.out.println(friendName);
        }
        
        //Close the file.
        inputFile.close();
    }
}
