/** 
 * This program demonstrate the Random class.
 */

import java.util.Scanner;    //Needed for the scanner class.
import java.util.Random;     //Needed for the Random class.

public class MathTutor 
{
    public static void main (String[] args)
    {
        int number1;       //A number
        int number2;       //Another number
        int sum;           //The sum of the numbers
        int userAnswer;    //The user's answer
        
        //Create a Scanner object for keyboard input. 
        Scanner keyboard = new Scanner(System.in);
        
        //Create a Random class object.
        Random randomNumbers = new Random();
        
        //Get two random numbers.
        number1 = randomNumbers.nextInt(100);
        number2 = randomNumbers.nextInt(100);
        
        //Display an additional problem.
        System.out.println("What is the answer to the " + 
                            "following problem?");
        System.out.print(number1 + " + " + number2 + " =? ");
        
        //calculate the answer
        sum = number1 + number2;
        
        //Get the user's answer
        userAnswer = keyboard.nextInt();
        
        //Displays the results.
        if(userAnswer == sum)
            System.out.println("Correct!");
        else 
        {
            System.out.println("Sorry. wrong answer." + 
                                "The correct answer is " + 
                                 sum);
        }
    }
}
