/** 
 * This program writes data to a file
 */

import java.util.Scanner;  //Needed for Scanner class
import java.io.*;          //Needed for file I/O classes

public class FileWriteDemo 
{
    public static void main (String[] args) throws IOException 
    {
        String filename;     //File name
        String friendName;   //Friend's name
        int numFriends;      //Number of friends
        
        //Create a Scanner object for keyboard input.
        Scanner keyboard = new Scanner(System.in);
        
        //Get the number of friends.
        System.out.print("How many friends do you have? ");
        numFriends= keyboard.nextInt();
        
        //Consume the remaining newline character.
        keyboard.nextLine();
        
        //Get the file name.
        System.out.print("Enter the filename: ");
        filename = keyboard.nextLine();
        
        //Open the file.
        PrintWriter outputFile = new PrintWriter(filename);
        
        //Get data and write it to the file.
        for (int i = 1; i <=numFriends; i++)
        {
            //Get the name of a friend.
            System.out.print("Enter the name of friend " +
                             "number " + i +": ");
            friendName = keyboard.nextLine();
            
            //write the name to the file.
            outputFile.println(friendName);
        }
        //Close the file.
        outputFile.close();
        System.out.println("Data Written to the file.");
    }
}
