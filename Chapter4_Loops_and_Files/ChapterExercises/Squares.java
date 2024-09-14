/** 
 * This program demonstrate the for loop.
 */

public class Squares 
{
    public static void main (String [] args)
    {
        int number;  // loop control variable
        
        System.out.println("Number Number Square");
        System.out.println("-----------------------");
        
        for (number = 1; number <=10; number++)
        {
            System.out.println(number + "\t\t" + 
                               number * number);
        }
    }
}