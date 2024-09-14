/**
 * This program demonstrate a user controlled loop.
 */
import java.util.Scanner;

public class TestAverage1 
{
    public static void main (String[] args)
    {
        int score1, score2, score3;   //Three test scores
        double average;               //Average test score
        char repeat;                  //To hold 'Y' or 'N'
        String input;                 //To hold input
        
        System.out.println("This program calculates the " +
                            "average of three test scores.");
        
        //Create a Scanner object for keyboard input.
        Scanner keyboard = new Scanner(System.in);
        
        //Get as many test scres as the user wants
        do 
        {
            //Get the first test score in the set.
            System.out.print("Enter score #1: ");
            score1 = keyboard.nextInt();
            
            //Get the second test score in the set.
            System.out.print("Enter score #2: ");
            score2 = keyboard.nextInt();
            
            //Get the thirs test score in the set.
            System.out.print("Enter score #3: ");
            score3 = keyboard.nextInt();
            
            //Consume the remaining newLine
            keyboard.nextLine();
            
            //Calculate and print the average test score.
            average = (score1 + score2 + score3)/3.0;
            System.out.println("The average is " + average);
            System.out.println(); //prints a blank line
            
            //Does the user want to average another set?
            System.out.println("Would you like to average " + 
                               "another set of test scores?");
            System.out.print("Enter Y for yes or N for no: ");
            input = keyboard.nextLine();     //Read a line
            repeat = input.charAt(0);        //Get the first char                   
                    
        } while (repeat == 'Y' || repeat == 'y');
    }
}
