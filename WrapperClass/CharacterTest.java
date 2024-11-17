/**
 * This program demonstrate some of the Characters
 * class's character testing method. 
 */

import java.util.Scanner;

public class CharacterTest 
{
    public static void main(String[] args) 
    {
        char ch;
        
       Scanner keyboard = new Scanner(System.in);
       
       System.out.print("Enter any single character: ");
       ch = keyboard.nextLine().charAt(0);
       
       //Test the character
       if (Character.isLetter(ch))
           System.out.println("This is a letter.");
       
       if (Character.isDigit(ch))
           System.out.println("This is a digit.");
       
       if (Character.isLowerCase(ch))
           System.out.println("This is a lowercase letter.");
       
       if(Character.isUpperCase(ch))
           System.out.println("This is a uppercase letter.");
       
       if(Character.isSpaceChar(ch))
           System.out.println("This is a space.");
       
       if (Character.isWhitespace(ch))
           System.out.println("This is a whitespace character.");
    }
}



