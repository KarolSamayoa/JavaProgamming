/**
 * This program demonstrate the Contact Class. 
 */

import java.util.Scanner;

public class ContactTest 
{
    public static void main(String[] args) 
    {
        String userName, userEmail;
        
        //Create a Scanner object for keyboard input.
        Scanner keyboard = new Scanner(System.in);
        
        //Create a blank Contact object. 
        Contact contact = new Contact();
        
        //Get a name and email address from the user.
        System.out.print("Enter your name: ");
        userName = keyboard.nextLine();
        System.out.print("Enter your email address: ");
        userEmail = keyboard.nextLine();
        
        //Update the contact object.
        contact.setName(userName);
        contact.setEmail(userEmail);
        
        //Display the object's contents.
        System.out.println("Here is your contact info:");
        System.out.printf("Name: %s\n", contact.getName());
        System.out.printf("Email: %s\n", contact.getEmail());
    }
}

