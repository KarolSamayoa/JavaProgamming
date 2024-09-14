/**
 * This program calculates the total number of points a 
 * soccer team has earned over a series of games. The users
 * enters a series of points values, then -1 when finished. 
 */
import java.util.Scanner;

public class SoccerPoints 
{
    public static void main(String[] args) 
    {
        int points;           //Game points
        int totalPoints = 0;  //Accumulator initialized
        
        //Create a Scanner object for keyboard input.
        Scanner keyboard = new Scanner(System.in);
        
        //Display the instructions.
        System.out.println("Enter the number of points your team");
        System.out.println("has earned for each game this season.");
        System.out.println("Enter -1 when finished.");
        System.out.println();
        
        //Get the first number of points.
        System.out.print("Enter game points or -1 to end: ");
        points = keyboard.nextInt();
        
        //Acumulate the points until -1 is entered.
        while (points != -1)
        {
            //Add points to totalPoints.
            totalPoints +=points;
            
            //Get the next number of points.
            System.out.print("Enter game points or -1 to end: ");
            points = keyboard.nextInt();
        }
        
        //Display tje total number of points.
        System.out.println("The total points are " + totalPoints);
    }
}

