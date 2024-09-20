/**
 * This program demonstrate a method with a parameter. 
 */

public class PassArg 
{
    public static void main(String[]args)
    {
        int x = 10;
        
        System.out.println("I am passing the values to displayValue.");
        displayValue(5);       //Pass 5
        displayValue(x);       //Pass 10
        displayValue(x * 4);   //Pass 40
        System.out.println("That's all!");        
    }
    /**
     * The displayValue method displays the value
     * of its integer parameter.
     */
    
    public static void displayValue(int num)
    {
        System.out.println("The value is " + num);
    }
}
