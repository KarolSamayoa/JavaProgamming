import java.util.Scanner;

/**This program demonstrate a case insensitive string comparison. */

public class SecretWord 
{
    public static void main (String[] args)
    {
        String input; // To hold the user's input
        
        //Create a Scanner object for tkeyboard inpput
        Scanner keyboard = new Scanner(System.in);
        
        //Prmomt the user to enter the secret word. 
        System.out.print("Enter the secret word: ");
        input = keyboard.nextLine();
        
        //Determine whether the user enter the secret word. 
        if(input.equalsIgnoreCase("PROSPERO"))
        {
            System.out.println("Congratulations! You know the " +
                               "secret word.");
        }
        else
        {
            System.out.println("Sorry, That is NOT the " +
                               "secret word.");
        }
    }
}
