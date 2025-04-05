package Practice1;

/* ********************************************************************
Step 1: Prompt the user to enter numberOfStudents (int).

Step 2: Create an array for scores using new double[numberOfStudents].

Step 3: Declare and initialize variable best to keep the best score.
Set the initial value to 0.

Step 4: Prompt the user to enter the scores in a loop that executes 
numberOfStudents times. 
For each score entered, store it in scores[i]. 
Compare it with best. If it is greater than best, assign it to best.

Step 5: Write a for loop for i from 0 to numberOfStudents - 1, 
compare scores[i] with grade to assign the grade for the student.
 ************************************************************************/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

public class ExcerciseSevenOne {
	public static void main(String[] args) {
		
		//StudentGradingSystemOne();
		StudentGradingSystemTwo();
	}
	
	public static void StudentGradingSystemOne() 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of students: ");
		int numberOfStudents = input.nextInt();
		
		double[] scores = new double[numberOfStudents];
		
		double best = 0;
		
		for(int i= 0; i < numberOfStudents; i++){
		    System.out.print("Enter score for student " + (i+1) + ": ");
		    scores[i] = input.nextDouble();
		    if(scores[i] > best) {
		        best = scores[i];
		    }
		}
		for (int i = 0; i < numberOfStudents; i++){
		    System.out.print("Student " + (i + 1) + " score: " + scores[i] + " - ");
		    
		    if(scores[i] >= best -10){
		        System.out.println("A");
		    } else if (scores[i] >= best -20) {
		        System.out.println("B");
		    } else if(scores[i] >= -30){
		        System.out.println("C");
		    } else {
		        System.out.println("D");
		    }
		}
	}
	
	public static void StudentGradingSystemTwo() {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();
        
        List<Double> scores = new ArrayList<>();
        
        System.out.println("Enter the scores: ");
        for(int i = 0; i < numberOfStudents; i++){
            System.out.print("Score for student " + (i + 1) + ": ");
            scores.add(input.nextDouble());
        }
        
        double best = scores.stream().
                      mapToDouble(Double::doubleValue).
                      max().orElse(0);
                      
        scores.stream().forEach(score -> {
            System.out.print("Score: " + score + " - ");
            
            if(score >= best - 10) {
                System.out.println("A");
            } else if (score >= best -20) {
                System.out.println("B");
            } else if  (score >= - 30){
                System.out.println("C");
            } else {
                System.out.println("D");
            }
        });
	}

}
