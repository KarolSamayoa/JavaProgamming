/**
 * This program demonstrate the startsWith method 
 * to search a partial string.
 */

import java.util.Scanner;

public class PersonSearch 
{
    public static void main (String [] args) 
    {
        String lookUp;
        
        String [] people = {"Angie", "Karol", "Ana",
                            "David", "Edwin", "Mike",
                            "Will", "Rose", "Oscar",
                            "Albert", "Mario", "Link",
                            "Zelda", "Samayoa, Karol"}; 
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter the first few characters of " +
                        "the last name of the look up: ");
        
        lookUp = keyboard.nextLine();
        
        System.out.println("Here are the names that match:");
        for (String person : people) 
        {
            if (person.startsWith(lookUp))
                System.out.println(person);
        }
        
    }
}
