import java.util.Scanner;

/**This program demonstrates how variables may may be declared
 * in various locations throughout a program.
 */

public class VariableScope 
{
    public static void main (String[] args)
    {
        //Create a Scanner object for keyboard input.
        Scanner keyboard = new Scanner(System.in);
        
        //get the user's first name.
        System.out.print("Enter your first name: ");
        String firstName;
        firstName = keyboard.nextLine();
        
        //get the user's last name.
        System.out.print("Enter your last name: ");
        String lastName;
        lastName = keyboard.nextLine();
        
        //Display message
        System.out.println("Hello "+ firstName + " "+ lastName);
    }
}
