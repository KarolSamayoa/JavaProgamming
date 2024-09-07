import java.util.Scanner;


public class AverageScores
{ 
    public static void main(String[] args)
    {
        double score1; // score #1
        double score2; // score #2
        double score3; // score #3
        double average; // Average score
               
         //Create a scanner object to read input.
         Scanner keyboard = new Scanner(System.in);
         
         System.out.println("The program averages 3 test scores. ");
         
         //Get the first score
         System.out.print("Enter score #1: ");
         score1 = keyboard.nextDouble();
         
         //Get the second score
         System.out.print("Enter score #2: ");
         score2 = keyboard.nextDouble();
         
         //Get the third score.
         System.out.print("Enter score #3: ");
         score3 = keyboard.nextDouble();
         
         //Calculate and discplay the average score
         
         average = (score1+ score2 + score3)/3.0;
         System.out.println("The average score is " + average);
         
         if(average > 95)
             System.out.println("That's a great score!"); 
        
        
        
    }
    
}

