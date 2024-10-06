import java.io.*;
import java.util.Scanner;


public class Sentinel
{
	public static String getGrade (double avg) 
	{
	 if (avg >=90)
	    return "A";
	 else if (avg >=80)
	    return "B";
	 else if (avg >=70)
	    return "C";
	  else if (avg>=60)
	    return "D";
	  else return "F";
	}
	
	public static void main (String[] args)
	{
	    Scanner input = new Scanner(System.in);
	    
	    //Assign an initial data
	    double oneExam = 1;
	    
	    //Keep reading data until the input is 999
	    double sum = 0;
	    double counter = 0;
	    while (oneExam != 999) //999 is the sentinel value that will stop the loop 	
	    {
	        //Read the next oneExam
	        System.out.print("Enter a score (the inputs ends if it is 999): ");
	        oneExam = input.nextDouble();
	        
	        //accumulate the sum of exam read
	        if (oneExam >= 0 && oneExam <=100)  //Check if it is a valid score 0-100
	        {
	            sum += oneExam;
	            counter++;
	        }
	        
	        else if (oneExam != 999)
	        {
	            System.out.println("Enter a VALID score (0-100): ");
	        }
	    }
	    
	    double average = sum/counter;
	    System.out.println("The sum is " + sum);
	    System.out.println("The average is : " + String.format("%.2f", average));
	    System.out.println("Grade is: "+ getGrade(average));
}

}
