import java.util.Scanner;

/**This program asks the user to enter a numeric test score and 
 * display a letter grade for the score. The program uses 
 * if-else-if statement to determine the letter grade. 
 */

public class TestResults 
{
 public static void main(String[] args)
 {
     //Variable to hold the numeric score
     int testScore;
     
     //Get a Scanner object for keyboard input.
     Scanner keyboard = new Scanner(System.in);
     
     //Get the numeric test score
     System.out.print("Enter your numeric test score: ");
     testScore = keyboard.nextInt();
     
     //Display the grade.
     if (testScore < 60)
         System.out.println("Your grade is F.");
     else if (testScore < 70)
         System.out.println("Your grade is D.");
     else if (testScore < 80)
         System.out.println("Your grade is C.");
     else if (testScore < 90)
         System.out.println("Your grade is B.");
     else 
         System.out.println("Your grade is A.");
 }   
}
