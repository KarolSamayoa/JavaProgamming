import java.util.*;

public class TelephoneTester 
{
    public static void main (String[] args)
    {
        String phoneNumber; 
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter an unformatted telephone number: ");
        phoneNumber = keyboard.nextLine();
        
        System.out.println("Formatted: " + Telephone.format(phoneNumber));
        
        System.out.println("Enter a telephone number formatted as");
        System.out.print("(XXX)XXX-XXX: ");
        phoneNumber = keyboard.nextLine();
        
        System.out.println("Unformatted: " + Telephone.unformat(phoneNumber));
    }
}
