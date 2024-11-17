/**
 * This program demonstrate the Character
 * class's method toUpperCase method.
 */

import java.util.*;

public class CircleArea 
{
    public static void main (String[] args) 
    {
        double radius;
        double area; 
        String input;
        char choice;
        
       Scanner keyboard = new Scanner(System.in); 
       
       do 
       {
           System.out.print(" Enter the circle's radius: ");
           radius = keyboard.nextDouble();
           
           keyboard.nextLine();
           
           //Calculate and display the area.
           area = Math.PI * radius * radius;
           System.out.printf("The area is %.2f\n", area);
           
           //Repeat
           System.out.print("Do you want to do this " 
                                + "again? (Y or N) ");
           input = keyboard.nextLine();
           choice = input.charAt(0);           
       } while (Character.toUpperCase(choice) == 'Y');
    }
}
